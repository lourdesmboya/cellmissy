/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.gui.controller;

import be.ugent.maf.cellmissy.entity.CellLine;
import be.ugent.maf.cellmissy.entity.Ecm;
import be.ugent.maf.cellmissy.entity.PlateCondition;
import be.ugent.maf.cellmissy.entity.Treatment;
import be.ugent.maf.cellmissy.entity.TreatmentType;
import be.ugent.maf.cellmissy.entity.Well;
import be.ugent.maf.cellmissy.gui.GuiUtils;
import be.ugent.maf.cellmissy.gui.experiment.ConditionsPanel;
import be.ugent.maf.cellmissy.gui.experiment.SetupConditionsPanel;
import be.ugent.maf.cellmissy.service.CellLineService;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JList;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.JListBinding;
import org.jdesktop.swingbinding.SwingBindings;

/**
 *
 * @author Paola
 */
public class ConditionsPanelController {

    //model
    private ObservableList<CellLine> cellLineBindingList;
    private ObservableList<PlateCondition> plateConditionBindingList;
    private BindingGroup bindingGroup;
    private List<Well> selectedWellsList;
    //view
    private ConditionsPanel conditionsPanel;
    private SetupConditionsPanel setupConditionsPanel;
    //parent controller
    private SetupExperimentPanelController setupExperimentPanelController;
    //child controllers
    private AssayEcmPanelController assayEcmPanelController;
    private TreatmentPanelController treatmentPanelController;
    //services
    private CellLineService cellLineService;
    private GridBagConstraints gridBagConstraints;
    private Integer conditionIndex;
    private Integer previousConditionIndex;

    public ConditionsPanelController(SetupExperimentPanelController setupExperimentPanelController) {

        this.setupExperimentPanelController = setupExperimentPanelController;

        //init services
        cellLineService = (CellLineService) setupExperimentPanelController.getCellMissyController().getBeanByName("cellLineService");

        bindingGroup = new BindingGroup();
        gridBagConstraints = GuiUtils.getDefaultGridBagConstraints();

        //init views
        conditionsPanel = new ConditionsPanel();
        setupConditionsPanel = new SetupConditionsPanel();

        //init child controllers
        assayEcmPanelController = new AssayEcmPanelController(this);
        treatmentPanelController = new TreatmentPanelController(this);

        initCellLinePanel();
        initConditionsPanel();
        initPanel();
    }

    public SetupExperimentPanelController getSetupExperimentPanelController() {
        return setupExperimentPanelController;
    }

    public ConditionsPanel getConditionsPanel() {
        return conditionsPanel;
    }

    public SetupConditionsPanel getSetupConditionsPanel() {
        return setupConditionsPanel;
    }

    public ObservableList<PlateCondition> getPlateConditionBindingList() {
        return plateConditionBindingList;
    }

    public PlateCondition getCurrentCondition() {
        return ((PlateCondition) (conditionsPanel.getConditionsJList().getSelectedValue()));
    }

    private void initCellLinePanel() {

        //init cellLineJCombo
        cellLineBindingList = ObservableCollections.observableList(cellLineService.findAll());
        JComboBoxBinding jComboBoxBinding = SwingBindings.createJComboBoxBinding(AutoBinding.UpdateStrategy.READ_WRITE, cellLineBindingList, setupConditionsPanel.getCellLineComboBox());
        bindingGroup.addBinding(jComboBoxBinding);
        bindingGroup.bind();

        //add action listeners
        setupConditionsPanel.getInsertCellLineButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!setupConditionsPanel.getCellLineNameTextField().getText().isEmpty()) {
                    CellLine newCellLine = new CellLine();
                    newCellLine.setName(setupConditionsPanel.getCellLineNameTextField().getText());
                    //insert cell line to DB
                    cellLineService.save(newCellLine);
                    //add the new cell line to the list
                    cellLineBindingList.add(newCellLine);
                }
            }
        });
    }

    private void initConditionsPanel() {

        conditionIndex = 0;
        previousConditionIndex = 0;

        //init conditionJList (create new empty list) (conditions are NOT retrieved from DB)
        plateConditionBindingList = ObservableCollections.observableList(new ArrayList<PlateCondition>());

        //autobind cell line and matrix dimension
        Binding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, conditionsPanel.getConditionsJList(), BeanProperty.create("selectedElement.cellLine"), setupConditionsPanel.getCellLineComboBox(), BeanProperty.create("selectedItem"), "celllinebinding");
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, conditionsPanel.getConditionsJList(), BeanProperty.create("selectedElement.matrixDimension"), setupConditionsPanel.getEcmDimensionComboBox(), BeanProperty.create("selectedItem"), "matrixdimensionbinding");
        bindingGroup.addBinding(binding);
        bindingGroup.bind();

        //autobind treatment
        //treatment type and name are bound manually in the treatment panel controller

        //treatment description
        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, conditionsPanel.getConditionsJList(), BeanProperty.create("selectedElement.treatment.description"), setupConditionsPanel.getAdditionalInfoTextField(), BeanProperty.create("text"), "treatmentdescriptionbinding");
        bindingGroup.addBinding(binding);
        //treatment timing
        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, conditionsPanel.getConditionsJList(), BeanProperty.create("selectedElement.treatment.timing"), setupConditionsPanel.getTimingTextField(), BeanProperty.create("text"), "treatmenttimingbinding");
        bindingGroup.addBinding(binding);
        //treatment concentration
        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, conditionsPanel.getConditionsJList(), BeanProperty.create("selectedElement.treatment.concentration"), setupConditionsPanel.getConcentrationTextField(), BeanProperty.create("text"), "treatmentconcentrationbinding");
        bindingGroup.addBinding(binding);

        bindingGroup.bind();

        //init conditionListBinding
        JListBinding conditionListBinding = SwingBindings.createJListBinding(AutoBinding.UpdateStrategy.READ_WRITE, plateConditionBindingList, conditionsPanel.getConditionsJList());
        bindingGroup.addBinding(conditionListBinding);
        bindingGroup.bind();

        //create and init Condition 1
        PlateCondition firstCondition = new PlateCondition();
        initCondition(firstCondition);
        //add Condition 1 to the list
        plateConditionBindingList.add(firstCondition);

        //set cell renderer for conditionJList
        conditionsPanel.getConditionsJList().setCellRenderer(new ConditionsRenderer());

        //add mouse listener
        conditionsPanel.getConditionsJList().addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int locationToIndex = conditionsPanel.getConditionsJList().locationToIndex(e.getPoint());
                assayEcmPanelController.updateAssayEcmConditionFields(plateConditionBindingList.get(previousConditionIndex));
                assayEcmPanelController.updateAssayEcmInputFields(plateConditionBindingList.get(locationToIndex));
                assayEcmPanelController.resetAssayEcmInputFields(plateConditionBindingList.get(locationToIndex));
                treatmentPanelController.updateTreatmentConditionFields(plateConditionBindingList.get(previousConditionIndex));
                treatmentPanelController.updateTreatmentInputFields(plateConditionBindingList.get(locationToIndex));
                previousConditionIndex = locationToIndex;
            }
        });

        conditionsPanel.getConditionsJList().setSelectedIndex(0);
        setupExperimentPanelController.onNewConditionAdded(firstCondition);

        //add action listeners
        //add a new firstCondition to the List
        conditionsPanel.getAddButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //create and init a new firstCondition
                PlateCondition newPlateCondition = new PlateCondition();
                initCondition(newPlateCondition);
                //add the new firstCondition to the list
                plateConditionBindingList.add(newPlateCondition);
                setupExperimentPanelController.onNewConditionAdded(newPlateCondition);
            }
        });

        //remove a firstCondition from the list (if the user makes mistakes)
        conditionsPanel.getRemoveButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (conditionsPanel.getConditionsJList().getSelectedValue() != null) {
                    setupExperimentPanelController.onConditionToRemove((PlateCondition) (conditionsPanel.getConditionsJList().getSelectedValue()));
                    plateConditionBindingList.remove(conditionsPanel.getConditionsJList().getSelectedIndex());
                }
            }
        });
    }

    private void initCondition(PlateCondition plateCondition) {

        //assign defaults fields to a new firstCondition
        plateCondition.setName("Condition " + ++conditionIndex);
        //MDA MB 231 cell line
        plateCondition.setCellLine(cellLineBindingList.get(0));
        //2D matrix dimension
        plateCondition.setMatrixDimension(assayEcmPanelController.getMatrixDimensionBindingList().get(0));
        //Oris platform
        plateCondition.setAssay(assayEcmPanelController.getAssay2DBindingList().get(0));
        //default values for ECM
        Ecm ecm = new Ecm();
        ecm.setEcmComposition(assayEcmPanelController.getEcm2DCompositionBindingList().get(0));
        ecm.setEcmCoating(assayEcmPanelController.getEcmCoatingBindingList().get(0));
        ecm.setCoatingTemperature("");
        ecm.setCoatingTime("");
        ecm.setConcentration(0);
        ecm.setVolume(0);
        plateCondition.setEcm(ecm);
        //default treatment, drug: ROCK inhibitor
        Treatment treatment = new Treatment();
        treatment.setType(TreatmentType.DRUG.getDatabaseValue());
        treatment.setName(treatmentPanelController.getDrugBindingList().get(0).getName());
        plateCondition.setTreatment(treatment);
        //set an empty collection of wells
        selectedWellsList = new ArrayList<>();
        plateCondition.setWellCollection(selectedWellsList);

    }

    private class ConditionsRenderer extends DefaultListCellRenderer {

        public ConditionsRenderer() {
            setOpaque(true);
            setIconTextGap(10);
        }

        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            PlateCondition newPlateCondition = (PlateCondition) value;
            setText(newPlateCondition.getName());
            setIcon(new rectIcon(GuiUtils.getAvailableColors()[((PlateCondition) value).getConditionIndex() - 1]));
            if (isSelected) {
                setBackground(Color.lightGray);
                setBorder(BorderFactory.createLineBorder(Color.black, 2));
                setFont(new Font("Roman", Font.BOLD, 14));
            } else {
                setFont(new Font("Roman", Font.BOLD, 12));
            }
            return this;
        }
    }

    private class rectIcon implements Icon {

        private final Integer rectSize = 10;
        private Color color;

        public rectIcon(Color color) {
            this.color = color;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            Graphics2D g2d = (Graphics2D) g;
            setupExperimentPanelController.getSetupPlatePanel().setGraphics(g2d);
            g2d.setColor(color);
            g2d.fillRect(x, y, rectSize, rectSize);
        }

        @Override
        public int getIconWidth() {
            return rectSize;
        }

        @Override
        public int getIconHeight() {
            return rectSize;
        }
    }

    private void initPanel() {
        setupExperimentPanelController.getSetupExperimentPanel().getConditionsParentPanel().add(conditionsPanel, gridBagConstraints);
        setupExperimentPanelController.getSetupExperimentPanel().getSetupConditionsParentPanel().add(setupConditionsPanel, gridBagConstraints);
    }
}
