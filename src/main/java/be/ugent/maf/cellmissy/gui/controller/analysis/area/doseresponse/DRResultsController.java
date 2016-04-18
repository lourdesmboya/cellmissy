/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.gui.controller.analysis.area.doseresponse;

import be.ugent.maf.cellmissy.entity.result.area.doseresponse.DoseResponseAnalysisGroup;
import be.ugent.maf.cellmissy.entity.result.area.doseresponse.DoseResponseAnalysisResults;
import be.ugent.maf.cellmissy.entity.result.area.doseresponse.SigmoidFittingResultsHolder;
import be.ugent.maf.cellmissy.gui.experiment.analysis.area.doseresponse.DRResultsPanel;
import be.ugent.maf.cellmissy.gui.view.table.model.NonEditableTableModel;
import be.ugent.maf.cellmissy.utils.AnalysisUtils;
import be.ugent.maf.cellmissy.utils.GuiUtils;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.jfree.chart.ChartPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Gwendolien
 */
@Controller("dRResultsController")
public class DRResultsController {

    private static final org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(DRResultsController.class);

    //model
    private NonEditableTableModel tableModel;
    //view
    private DRResultsPanel dRResultsPanel;
    private ChartPanel resultsChartPanel;
    // parent controller
    @Autowired
    private DoseResponseController doseResponseController;
    // services
    private GridBagConstraints gridBagConstraints;

    /**
     * Initialize controller
     */
    public void init() {
        gridBagConstraints = GuiUtils.getDefaultGridBagConstraints();
        //init view
        initDRResultsPanel();
    }

    /**
     * Getters and setters
     *
     * @return
     */
    public DRResultsPanel getdRResultsPanel() {
        return dRResultsPanel;
    }

    public NonEditableTableModel getTableModel() {
        return tableModel;
    }

    public void setTableModel(NonEditableTableModel tableModel) {
        this.tableModel = tableModel;
    }

    public ChartPanel getResultsChartPanel() {
        return resultsChartPanel;
    }

    /**
     * When changing view to results panel, calculate statistics and re-plot
     * fittings.
     */
    public void initDRResultsData() {
        calculateStatistics(doseResponseController.getdRAnalysisGroup());
    }

    /**
     * Initialize view
     */
    private void initDRResultsPanel() {
        dRResultsPanel = new DRResultsPanel();
        resultsChartPanel = new ChartPanel(null);
        resultsChartPanel.setOpaque(false);

        /**
         * Action listener for button. Copies the table with statistical values
         * and the plots and puts them in a PDF report.
         */
        dRResultsPanel.getCreateReportButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    /**
     * Create the table model for the top panel table. Table contains icon,
     * log-transformed concentration and normalized slopes per condition
     *
     * @param dataToFit
     * @return the model
     */
    private NonEditableTableModel createTableModel() {
        return null;
    }

    /**
     * Calculate statictics and set corresponding fields in analysisResults
     * class
     */
    private void calculateStatistics(DoseResponseAnalysisGroup analysisGroup) {
        DoseResponseAnalysisResults analysisResults = analysisGroup.getDoseResponseAnalysisResults();
        SigmoidFittingResultsHolder initialFittingResults = analysisResults.getInitialFittingResults();
        SigmoidFittingResultsHolder normalizedFittingResults = analysisResults.getNormalizedFittingResults();
        //calculate and set R²
        analysisResults.setGoodnessOfFitInitial(AnalysisUtils.computeRSquared(doseResponseController.getDataToFit(false), initialFittingResults));
        analysisResults.setGoodnessOfFitNormalized(AnalysisUtils.computeRSquared(doseResponseController.getDataToFit(true), normalizedFittingResults));
        
        
    }
}
