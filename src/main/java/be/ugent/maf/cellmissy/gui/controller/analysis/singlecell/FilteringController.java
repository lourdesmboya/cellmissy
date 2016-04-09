/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.gui.controller.analysis.singlecell;

import be.ugent.maf.cellmissy.entity.PlateCondition;
import be.ugent.maf.cellmissy.entity.result.singlecell.SingleCellConditionDataHolder;
import be.ugent.maf.cellmissy.entity.result.singlecell.SingleCellWellDataHolder;
import be.ugent.maf.cellmissy.entity.result.singlecell.TrackDataHolder;
import be.ugent.maf.cellmissy.gui.experiment.analysis.singlecell.FilteringInfoDialog;
import be.ugent.maf.cellmissy.gui.experiment.analysis.singlecell.MinTranslocationFilteringPanel;
import be.ugent.maf.cellmissy.gui.view.renderer.table.AlignedTableRenderer;
import be.ugent.maf.cellmissy.gui.view.renderer.table.TableHeaderRenderer;
import be.ugent.maf.cellmissy.gui.view.table.model.FilterTrackTableModel;
import be.ugent.maf.cellmissy.utils.AnalysisUtils;
import be.ugent.maf.cellmissy.utils.GuiUtils;
import be.ugent.maf.cellmissy.utils.JFreeChartUtils;
import java.awt.Cursor;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * A controller to take care of filtering/quality control - on single cell
 * trajectories.
 *
 * @author Paola
 */
@Component("filteringController")
class FilteringController {

    private static final org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(FilteringController.class);
    // model
    private List<Double> motileSteps;
    private double percentageMotile;
    private Map<SingleCellConditionDataHolder, Map<SingleCellWellDataHolder, Map<TrackDataHolder, boolean[]>>> filterMap;
    // view
    private MinTranslocationFilteringPanel minTranslFilteringPanel;
    private FilteringInfoDialog filteringInfoDialog;
    private ChartPanel rawKdeChartPanel;
    private ChartPanel filteredKdeChartPanel;
    // parent controller
    @Autowired
    private SingleCellPreProcessingController singleCellPreProcessingController;
    // child controllers
    // parent controller
    // services
    private GridBagConstraints gridBagConstraints;

    /**
     * Initialize controller
     */
    public void init() {
        gridBagConstraints = GuiUtils.getDefaultGridBagConstraints();
        filterMap = new LinkedHashMap<>();
        // init views
        filteringInfoDialog = new FilteringInfoDialog(singleCellPreProcessingController.getMainFrame(), true);
        // int main view
        initFilteringPanel();
        initOtherViews();
    }

    /**
     * Plot the raw KDE for track displacements.
     */
    public void plotRawKde(PlateCondition plateCondition) {
        SingleCellConditionDataHolder conditionDataHolder = singleCellPreProcessingController.getConditionDataHolder(plateCondition);
        List<List<double[]>> estimateRawDensityFunction = estimateRawDensityFunction(conditionDataHolder);
        XYSeriesCollection densityFunction = generateDensityFunction(conditionDataHolder, estimateRawDensityFunction);
        JFreeChart densityChart = JFreeChartUtils.generateDensityFunctionChart(conditionDataHolder, densityFunction, "raw KDE track displ", "track displ", true);
        rawKdeChartPanel.setChart(densityChart);
    }

    /**
     * Private classes and methods.
     */
    /**
     * Initialize the main view
     */
    private void initFilteringPanel() {
        // make a new view
        minTranslFilteringPanel = new MinTranslocationFilteringPanel();
        // make a new radio button group for the radio buttons
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(minTranslFilteringPanel.getPixelRadioButton());
        radioButtonGroup.add(minTranslFilteringPanel.getMicroMeterRadioButton());

        // set icon for question button
        Icon questionIcon = UIManager.getIcon("OptionPane.questionIcon");
        ImageIcon scaledQuestionIcon = GuiUtils.getScaledIcon(questionIcon);
        minTranslFilteringPanel.getQuestionButton().setIcon(scaledQuestionIcon);
        // action listeners
        // info button
        minTranslFilteringPanel.getQuestionButton().addActionListener((ActionEvent e) -> {
            // pack and show info dialog
            GuiUtils.centerDialogOnFrame(singleCellPreProcessingController.getMainFrame(), filteringInfoDialog);
            filteringInfoDialog.setVisible(true);
        });

        // pixels or µm?
        minTranslFilteringPanel.getPixelRadioButton().addActionListener((ActionEvent e) -> {
            // pixel: we need a conversion factor
            minTranslFilteringPanel.getConversionFactorTextField().setEnabled(true);
        });

        minTranslFilteringPanel.getMicroMeterRadioButton().addActionListener((ActionEvent e) -> {
            // µm: we do not need a conversion factor
            minTranslFilteringPanel.getConversionFactorTextField().setEnabled(false);
        });

        // actually do the filtering
        minTranslFilteringPanel.getFilterButton().addActionListener((ActionEvent e) -> {

            // try to read the user-inserted values for up and down limit
            // check for number format exception
            try {
                if (minTranslFilteringPanel.getPixelRadioButton().isSelected()) {
                    double conversionFactor = Double.parseDouble(minTranslFilteringPanel.getConversionFactorTextField().getText());
                    minTranslFilteringPanel.getBottomLimTextField().setText(""
                            + AnalysisUtils.roundTwoDecimals(Double.parseDouble(minTranslFilteringPanel.getBottomLimTextField().getText()) / conversionFactor));
                    minTranslFilteringPanel.getTopLimTextField().setText(""
                            + AnalysisUtils.roundTwoDecimals(Double.parseDouble(minTranslFilteringPanel.getTopLimTextField().getText()) / conversionFactor));
                }

                int topLimit = (int) (Double.parseDouble(minTranslFilteringPanel.getTopLimTextField().getText()) * 10);
                int bottomLimit = (int) (Double.parseDouble(minTranslFilteringPanel.getBottomLimTextField().getText()) * 10);
                double step = Double.parseDouble(minTranslFilteringPanel.getTranslocationStepTextField().getText());
                percentageMotile = Double.parseDouble(minTranslFilteringPanel.getPercentageMotileStepsTextField().getText());

                int numberSteps = (int) ((topLimit - bottomLimit) / (10 * step)) + 1;
                motileSteps = new ArrayList<>();

                for (int i = 0; i < numberSteps; i++) {
                    motileSteps.add(((double) bottomLimit / 10) + (step * i));
                }

            } catch (NumberFormatException ex) {
                // warn the user and log the error for info
                singleCellPreProcessingController.showMessage("Please insert valid numbers!" + "\n " + ex.getMessage(),
                        "number format exception", JOptionPane.ERROR_MESSAGE);
                LOG.error(ex.getMessage());
            }
            FilterSwingWorker filterSwingWorker = new FilterSwingWorker();
            filterSwingWorker.execute();
        });

        // set default to micrometer
        minTranslFilteringPanel.getMicroMeterRadioButton().setSelected(true);
        // and therefore no need for the conversion factor
        minTranslFilteringPanel.getConversionFactorTextField().setEnabled(false);
        // set some default values for the top and bottom translocaton limits
        minTranslFilteringPanel.getBottomLimTextField().setText("0.4");
        minTranslFilteringPanel.getTopLimTextField().setText("2.8");
        minTranslFilteringPanel.getTranslocationStepTextField().setText("0.8");
        minTranslFilteringPanel.getPercentageMotileStepsTextField().setText("30");
        percentageMotile = 30;

        // add view to parent component
        singleCellPreProcessingController.getSingleCellAnalysisPanel().getMinTranslParentPanel().add(minTranslFilteringPanel, gridBagConstraints);
    }

    /**
     * Initialize the other views of the controller.
     */
    private void initOtherViews() {
        rawKdeChartPanel = new ChartPanel(null);
        rawKdeChartPanel.setOpaque(false);
        filteredKdeChartPanel = new ChartPanel(null);
        filteredKdeChartPanel.setOpaque(false);

        // add chart panels to parent containers
        minTranslFilteringPanel.getRawPlotParentPanel().add(rawKdeChartPanel, gridBagConstraints);
        minTranslFilteringPanel.getFilteredPlotParentPanel().add(filteredKdeChartPanel, gridBagConstraints);
    }

    /**
     * Estimate the raw density functions for the replicates of a single cell
     * condition data holder.
     *
     * @param singleCellConditionDataHolder
     * @return a list of a list of double containing the estimated density
     * functions.
     */
    private List<List<double[]>> estimateRawDensityFunction(SingleCellConditionDataHolder singleCellConditionDataHolder) {
        String kernelDensityEstimatorBeanName = singleCellPreProcessingController.getKernelDensityEstimatorBeanName();
        List<List<double[]>> densityFunction = new ArrayList<>();
        singleCellConditionDataHolder.getSingleCellWellDataHolders().stream().map((singleCellWellDataHolder)
                -> singleCellPreProcessingController.estimateDensityFunction(singleCellWellDataHolder.getTrackDisplacementsVector(),
                        kernelDensityEstimatorBeanName)).forEach((oneReplicateTrackDisplDensityFunction) -> {
                    densityFunction.add(oneReplicateTrackDisplDensityFunction);
                });

        return densityFunction;
    }

    /**
     * Estimate the filtered density functions for the replicates of a single
     * cell condition data holder and given a motile step.
     *
     * @param singleCellConditionDataHolder
     * @param motileStepIndex
     * @return
     */
    private List<List<double[]>> estimateFilteredDensityFunction(SingleCellConditionDataHolder singleCellConditionDataHolder, int motileStepIndex) {
        String kernelDensityEstimatorBeanName = singleCellPreProcessingController.getKernelDensityEstimatorBeanName();
        List<List<double[]>> densityFunction = new ArrayList<>();
        Map<SingleCellWellDataHolder, List<TrackDataHolder>> retainedTrackMap = getRetainedTracks(singleCellConditionDataHolder, motileStepIndex);

        for (SingleCellWellDataHolder singleCellWellDataHolder : retainedTrackMap.keySet()) {
            Double[] retainedDisplacements = getRetainedDisplacements(retainedTrackMap, singleCellWellDataHolder);
            List<double[]> oneReplicateTrackDisplDensityFunction
                    = singleCellPreProcessingController.estimateDensityFunction(retainedDisplacements, kernelDensityEstimatorBeanName);
            densityFunction.add(oneReplicateTrackDisplDensityFunction);
        }
        return densityFunction;
    }

    /**
     * Get the tracks that are retained after applying a filter motile step. The
     * method returns a map with key-single cell well data holder and value-the
     * list of retained tracks. This makes sure that the relationship -
     * replicate data/track is maintained in place.
     *
     * @param singleCellConditionDataHolder
     * @param motileStepIndex
     * @return
     */
    private Map<SingleCellWellDataHolder, List<TrackDataHolder>> getRetainedTracks(SingleCellConditionDataHolder singleCellConditionDataHolder, int motileStepIndex) {
        Map<SingleCellWellDataHolder, List<TrackDataHolder>> map = new LinkedHashMap<>();
        Map<SingleCellWellDataHolder, Map<TrackDataHolder, boolean[]>> tempMap = filterMap.get(singleCellConditionDataHolder);
        tempMap.keySet().stream().forEach((singleCellWellDataHolder) -> {
            List<TrackDataHolder> retainedTracks = new ArrayList<>();

            Map<TrackDataHolder, boolean[]> tempMap2 = tempMap.get(singleCellWellDataHolder);
            tempMap2.keySet().stream().forEach((trackDataHolder) -> {
                boolean isRetained = tempMap2.get(trackDataHolder)[motileStepIndex];
                if (isRetained) {
                    retainedTracks.add(trackDataHolder);
                }
            });
            map.put(singleCellWellDataHolder, retainedTracks);
        });
        return map;
    }

    /**
     * Having the retained tracks, take the displacements.
     *
     * @param retainedTrackMap
     * @param singleCellWellDataHolder
     * @return
     */
    private Double[] getRetainedDisplacements(Map<SingleCellWellDataHolder, List<TrackDataHolder>> retainedTrackMap, SingleCellWellDataHolder singleCellWellDataHolder) {
        List<TrackDataHolder> retainedTracks = retainedTrackMap.get(singleCellWellDataHolder);
        Double[] trackDisplacementsVector = new Double[retainedTracks.size()];
        for (int i = 0; i < trackDisplacementsVector.length; i++) {
            TrackDataHolder retainedTrack = retainedTracks.get(i);
            double trackMeanDisplacement = retainedTrack.getCellCentricDataHolder().getMedianDisplacement();
            trackDisplacementsVector[i] = trackMeanDisplacement;
        }
        return trackDisplacementsVector;
    }

    /**
     * Create the datasets for the filtered KDE.
     *
     * @param plateCondition
     */
    private List<XYSeriesCollection> getRetainedKdeDatasets(PlateCondition plateCondition) {
        SingleCellConditionDataHolder conditionDataHolder = singleCellPreProcessingController.getConditionDataHolder(plateCondition);
        List<XYSeriesCollection> xYSeriesCollections = new ArrayList<>();
        for (int i = 0; i < motileSteps.size(); i++) {
            List<List<double[]>> estimateFilteredDensityFunction = estimateFilteredDensityFunction(conditionDataHolder, i);
            XYSeriesCollection densityFunction = generateDensityFunction(conditionDataHolder, estimateFilteredDensityFunction);
            xYSeriesCollections.add(densityFunction);
        }
        return xYSeriesCollections;
    }

    /**
     * Plot KDE after filtering -- retained track displacements.
     *
     * @param nCols
     */
    private void plotRetainedKde(PlateCondition plateCondition, int nCols) {
        // reset the logic first
        minTranslFilteringPanel.getFilteredPlotParentPanel().removeAll();
        minTranslFilteringPanel.getFilteredPlotParentPanel().revalidate();
        minTranslFilteringPanel.getFilteredPlotParentPanel().repaint();

        SingleCellConditionDataHolder conditionDataHolder = singleCellPreProcessingController.getConditionDataHolder(plateCondition);
        // create the datasets for the plot logic
        List<XYSeriesCollection> filteredKdeDatasets = getRetainedKdeDatasets(plateCondition);
        // the number of plots needed
        int nPlots = filteredKdeDatasets.size();
        for (int i = 0; i < nPlots; i++) {
            XYSeriesCollection collection = filteredKdeDatasets.get(i);
            JFreeChart densityChart = JFreeChartUtils.generateDensityFunctionChart(conditionDataHolder, collection,
                    "step: " + AnalysisUtils.roundTwoDecimals(motileSteps.get(i)) + " filtered KDE track displ", "track displ", false);

            ChartPanel filteredChartPanel = new ChartPanel(densityChart);
            GridBagConstraints tempBagConstraints = GuiUtils.getTempBagConstraints(nPlots, i, nCols);
            minTranslFilteringPanel.getFilteredPlotParentPanel().add(filteredChartPanel, tempBagConstraints);

            minTranslFilteringPanel.getFilteredPlotParentPanel().revalidate();
            minTranslFilteringPanel.getFilteredPlotParentPanel().repaint();
        }
    }

    /**
     *
     * @param singleCellConditionDataHolder
     * @return
     */
    private XYSeriesCollection generateDensityFunction(SingleCellConditionDataHolder singleCellConditionDataHolder, List<List<double[]>> densityFunctions) {
        XYSeriesCollection collection = new XYSeriesCollection();
        int counter = 0;
        for (SingleCellWellDataHolder singleCellWellDataHolder : singleCellConditionDataHolder.getSingleCellWellDataHolders()) {
            int numberOfSamplesPerWell = AnalysisUtils.getNumberOfSingleCellAnalyzedSamplesPerWell(singleCellWellDataHolder.getWell());
            if (numberOfSamplesPerWell == 1) {
                for (int i = counter; i < counter + numberOfSamplesPerWell; i++) {
                    // x values
                    double[] xValues = densityFunctions.get(i).get(0);
                    // y values
                    double[] yValues = densityFunctions.get(i).get(1);
                    XYSeries series = new XYSeries("" + singleCellWellDataHolder.getWell(), false);
                    for (int j = 0; j < xValues.length; j++) {
                        double x = xValues[j];
                        double y = yValues[j];
                        series.add(x, y);
                    }
                    collection.addSeries(series);
                }
                counter += numberOfSamplesPerWell;
            } else {
                int label = 0;
                for (int i = counter; i < counter + numberOfSamplesPerWell; i++) {
                    // x values
                    double[] xValues = densityFunctions.get(i).get(0);
                    // y values
                    double[] yValues = densityFunctions.get(i).get(1);
                    XYSeries series = new XYSeries("" + (singleCellWellDataHolder.getWell()) + ", " + (label + 1), false);
                    for (int j = 0; j < xValues.length; j++) {
                        double x = xValues[j];
                        double y = yValues[j];
                        series.add(x, y);
                    }
                    collection.addSeries(series);
                    label++;
                }
                counter += numberOfSamplesPerWell;
            }
        }
        return collection;
    }

    /**
     * Filter motile steps for a given track and a motile step threshold: if a
     * displacement is equal or greater than the motile step--mark the
     * displacement with a true. Else, the default is false.
     *
     * @param trackDataHolder
     * @param motileStep
     * @return
     */
    private boolean[] filterMotileSteps(TrackDataHolder trackDataHolder, double motileStep) {
        Double[] displacements = trackDataHolder.getStepCentricDataHolder().getInstantaneousDisplacements();
        boolean[] results = new boolean[displacements.length];

        for (int j = 0; j < displacements.length; j++) {
            if (displacements[j] >= motileStep) {
                results[j] = true;
            }
        }
        return results;
    }

    /**
     * Filter a single track. First mark motile steps as True (if >= threshold)
     * or False (otherwise). Then compute the percentage of True motile steps.
     * If this percentage is >= than percentageMotile, return true (and
     * therefore mark track as True), else default to false.
     *
     * @param trackDataHolder
     * @param motileStep
     * @return
     */
    private boolean filterSingleTrack(TrackDataHolder trackDataHolder, double motileStep) {
        boolean[] filterMotileSteps = filterMotileSteps(trackDataHolder, motileStep);
        int count = 0;
        for (int j = 0; j < filterMotileSteps.length; j++) {
            if (filterMotileSteps[j] == true) {
                count++;
            }
        }
        return (count / filterMotileSteps.length) * 100 >= percentageMotile;
    }

    /**
     * Filter motile tracks for a condition: update the filter map.
     */
    private void updateFilterMap(SingleCellConditionDataHolder conditionDataHolder) {

        Map<SingleCellWellDataHolder, Map<TrackDataHolder, boolean[]>> tempMap2 = new LinkedHashMap<>();

        conditionDataHolder.getSingleCellWellDataHolders().stream().forEach((singleCellWellDataHolder) -> {
            Map<TrackDataHolder, boolean[]> tempMap = new LinkedHashMap<>();
            singleCellWellDataHolder.getTrackDataHolders().stream().forEach((trackDataHolder) -> {
                // an empty default to false array of boolean
                boolean[] filter = new boolean[motileSteps.size()];
                for (int j = 0; j < motileSteps.size(); j++) {
                    filter[j] = filterSingleTrack(trackDataHolder, motileSteps.get(j));
                }
                tempMap.put(trackDataHolder, filter);
            });
            tempMap2.put(singleCellWellDataHolder, tempMap);
        });
        filterMap.put(conditionDataHolder, tempMap2);
    }

    /**
     * Update the table with the right elements.
     */
    private void updateFilterTable(SingleCellConditionDataHolder singleCellConditionDataHolder) {
        Map<SingleCellWellDataHolder, Map<TrackDataHolder, boolean[]>> map = filterMap.get(singleCellConditionDataHolder);
        minTranslFilteringPanel.getFilterTrackTable().setModel(new FilterTrackTableModel(map, motileSteps));

        AlignedTableRenderer alignedTableRenderer = new AlignedTableRenderer(SwingConstants.CENTER);
        for (int i = 0; i < minTranslFilteringPanel.getFilterTrackTable().getColumnModel().getColumnCount(); i++) {
            minTranslFilteringPanel.getFilterTrackTable().getColumnModel().getColumn(i).setCellRenderer(alignedTableRenderer);
        }
        minTranslFilteringPanel.getFilterTrackTable().getTableHeader().setDefaultRenderer(new TableHeaderRenderer(SwingConstants.CENTER));
    }

    /**
     * A swing worker that filters cell tracks based on a set of motile step
     * values and a percentage of motility for a cell trajectory.
     */
    private class FilterSwingWorker extends SwingWorker<Void, Void> {

        @Override
        protected Void doInBackground() throws Exception {
            // show waiting dialog
            singleCellPreProcessingController.showWaitingDialog("Filtering: " + singleCellPreProcessingController.getCurrentCondition());
            // show a waiting cursor, disable GUI components
            singleCellPreProcessingController.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            singleCellPreProcessingController.controlGuiComponents(false);
            updateFilterMap(singleCellPreProcessingController.getConditionDataHolder(singleCellPreProcessingController.getCurrentCondition()));
            return null;
        }

        @Override
        protected void done() {
            try {
                get();
                // update the table
                updateFilterTable(singleCellPreProcessingController.getConditionDataHolder(singleCellPreProcessingController.getCurrentCondition()));
                // plot the filtered KDE plots
                plotRetainedKde(singleCellPreProcessingController.getCurrentCondition(), 2);
                // recontrol GUI
                singleCellPreProcessingController.hideWaitingDialog();
                singleCellPreProcessingController.controlGuiComponents(true);
                singleCellPreProcessingController.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            } catch (InterruptedException | ExecutionException ex) {
                LOG.error(ex.getMessage(), ex);
                singleCellPreProcessingController.handleUnexpectedError(ex);
            }
        }

    }
}
