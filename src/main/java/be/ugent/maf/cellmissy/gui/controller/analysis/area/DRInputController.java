/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.gui.controller.analysis.area;

import be.ugent.maf.cellmissy.entity.PlateCondition;
import be.ugent.maf.cellmissy.gui.experiment.analysis.area.doseresponse.DRInputPanel;
import be.ugent.maf.cellmissy.gui.view.renderer.list.RectIconListRenderer;
import be.ugent.maf.cellmissy.gui.view.renderer.table.TableHeaderRenderer;
import be.ugent.maf.cellmissy.utils.GuiUtils;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;
import org.jdesktop.swingbinding.JListBinding;
import org.jdesktop.swingbinding.SwingBindings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Controller for input panel of dose-response analysis
 *
 * @author Gwendolien
 */
@Controller("dRInputController")
public class DRInputController {

    private static final org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(DRInputController.class);
    //model
    BindingGroup bindingGroup;
    //view
    private DRInputPanel dRInputPanel;
    // parent controller
    @Autowired
    private DoseResponseController doseResponseController;
    // services
    private GridBagConstraints gridBagConstraints;

    /**
     * Initialize controller
     */
    public void init() {
        bindingGroup = new BindingGroup();
        gridBagConstraints = GuiUtils.getDefaultGridBagConstraints();
        //init view
        initDRInputPanel();
    }

    /**
     * getters and setters
     *
     * @return
     */
    public DRInputPanel getdRInputPanel() {
        return dRInputPanel;
    }

    /**
     * Initialize view
     */
    private void initDRInputPanel() {
        dRInputPanel = new DRInputPanel();
        List<PlateCondition> processedConditions = getProcessedConditions();
        List<PlateCondition> selectedConditions = getSelectedConditions();
        List<Integer> numberOfReplicates = getNumberOfReplicates();
        
        // control opaque property of table
        dRInputPanel.getSlopesTableScrollPane().getViewport().setBackground(Color.white);
        JTable slopesTable = dRInputPanel.getSlopesTable();
        slopesTable.getTableHeader().setDefaultRenderer(new TableHeaderRenderer(SwingConstants.LEFT));
        slopesTable.getTableHeader().setReorderingAllowed(false);
        slopesTable.setFillsViewportHeight(true);
        
        // put conditions in selectable list
        ObservableList<PlateCondition> plateConditionBindingList = ObservableCollections.observableList(processedConditions);
        JListBinding jListBinding = SwingBindings.createJListBinding(AutoBinding.UpdateStrategy.READ_WRITE, plateConditionBindingList, dRInputPanel.getConditionsList());
        bindingGroup.addBinding(jListBinding);
        bindingGroup.bind();
        dRInputPanel.getConditionsList().setCellRenderer(new RectIconListRenderer(processedConditions, numberOfReplicates));
        
        //create a ButtonGroup for the radioButtons used for analysis
        ButtonGroup experimentTypeRadioButtonGroup = new ButtonGroup();
        //adding buttons to a ButtonGroup automatically deselect one when another one gets selected
        experimentTypeRadioButtonGroup.add(dRInputPanel.getStimulationRadioButton());
        experimentTypeRadioButtonGroup.add(dRInputPanel.getInhibitionRadioButton());
        //select as default first button (Stimulation)
        dRInputPanel.getStimulationRadioButton().setSelected(true);
        
        
        /*
        * Action listeners for buttons
        */
        dRInputPanel.getAddConditionButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //add selected condition to analysis
                addToDRAnalysis();
            }
        });
        
        dRInputPanel.getRemoveConditionButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // remove condition from analysis
                removeFromDRAnalysis();
            }
        });
        
        dRInputPanel.getStimulationRadioButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        dRInputPanel.getInhibitionRadioButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        //add view to parent panel
        doseResponseController.getDRPanel().getGraphicsDRParentPanel().add(dRInputPanel, gridBagConstraints);
    }
    
    
    
    /**
     * Add selected conditions to the dose-response analysis group
     */
    private void addToDRAnalysis() {
        List<PlateCondition> selectedConditions = getSelectedConditions();
        
    }
    
    /**
     * Remove selected condition from the dose-response analysis group
     */
    private void removeFromDRAnalysis() {
        List<PlateCondition> selectedConditions = getSelectedConditions();
        
    }
    
    /**
     * Get drug IDs for all conditions
     */
    private List<String> getDrugIDs() {
        List<String> drugIDs = new ArrayList<>();
        
        return drugIDs;
    }
        
    
    /**
     * Get List of Selected conditions from RectIcon List
     *
     * @return List of Plate Conditions to be added to the DR analysis group
     */
    private List<PlateCondition> getSelectedConditions() {
        // get selected indices from rect icon list
        int[] selectedIndices = dRInputPanel.getConditionsList().getSelectedIndices();
        List<PlateCondition> selectedConditions = new ArrayList<>();
        for (int selectedIndex : selectedIndices) {
            PlateCondition selectedCondition = areaMainController.getPlateConditionList().get(selectedIndex);
            selectedConditions.add(selectedCondition);
        }
        return selectedConditions;
    }
}
