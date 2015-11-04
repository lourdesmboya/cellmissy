/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.gui.experiment.analysis.area.doseresponse;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Gwendolien
 */
public class DRInitialPlotPanel extends javax.swing.JPanel {

    /**
     * Creates new form DRInitialPlotPanel
     */
    public DRInitialPlotPanel() {
        initComponents();
    }
    
    public JRadioButton getStandardHillslopeRadioButton() {
        return standardHillslopeRadioButton;
    }
    
    public JTextField getStandardHillslopeTextField() {
        return standardHillslopeTextField;
    }
    
    public JRadioButton getVariableHillslopeRadioButton() {
        return variableHillslopeRadioButton;
    }
    
    public JCheckBox getBottomCheckBox() {
        return bottomCheckBox;
    }
    
    public JTextField getBottomTextField() {
        return bottomTextField;
    }
    
    public JCheckBox getTopCheckBox() {
        return topCheckBox;
    }
    
    public JTextField getTopTextField() {
        return topTextField;
    }
    
    public JButton getPlotCurveButton() {
        return plotCurveButton;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        leftPanel = new javax.swing.JPanel();
        hillslopeLabel = new javax.swing.JLabel();
        standardHillslopeRadioButton = new javax.swing.JRadioButton();
        variableHillslopeRadioButton = new javax.swing.JRadioButton();
        standardHillslopeTextField = new javax.swing.JTextField();
        plotCurveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bottomCheckBox = new javax.swing.JCheckBox();
        topCheckBox = new javax.swing.JCheckBox();
        bottomTextField = new javax.swing.JTextField();
        topTextField = new javax.swing.JTextField();
        doseResponseChartParentPanel = new javax.swing.JPanel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(255, 255, 255));

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));
        leftPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        leftPanel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        hillslopeLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        hillslopeLabel.setText("Hillslope");

        standardHillslopeRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        standardHillslopeRadioButton.setText("Standard:");

        variableHillslopeRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        variableHillslopeRadioButton.setText("Variable");

        standardHillslopeTextField.setBorder(null);

        plotCurveButton.setText("Plot Curve");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Constrain");

        bottomCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        bottomCheckBox.setText("Bottom");

        topCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        topCheckBox.setText("Top");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topCheckBox)
                    .addComponent(bottomCheckBox)
                    .addComponent(hillslopeLabel)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(standardHillslopeRadioButton)
                            .addComponent(variableHillslopeRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(standardHillslopeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(plotCurveButton)
                    .addComponent(jLabel1)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(topTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(bottomTextField))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(hillslopeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(standardHillslopeRadioButton)
                    .addComponent(standardHillslopeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(variableHillslopeRadioButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bottomCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(topCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(plotCurveButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        doseResponseChartParentPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout doseResponseChartParentPanelLayout = new javax.swing.GroupLayout(doseResponseChartParentPanel);
        doseResponseChartParentPanel.setLayout(doseResponseChartParentPanelLayout);
        doseResponseChartParentPanelLayout.setHorizontalGroup(
            doseResponseChartParentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );
        doseResponseChartParentPanelLayout.setVerticalGroup(
            doseResponseChartParentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doseResponseChartParentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(doseResponseChartParentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bottomCheckBox;
    private javax.swing.JTextField bottomTextField;
    private javax.swing.JPanel doseResponseChartParentPanel;
    private javax.swing.JLabel hillslopeLabel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton plotCurveButton;
    private javax.swing.JRadioButton standardHillslopeRadioButton;
    private javax.swing.JTextField standardHillslopeTextField;
    private javax.swing.JCheckBox topCheckBox;
    private javax.swing.JTextField topTextField;
    private javax.swing.JRadioButton variableHillslopeRadioButton;
    // End of variables declaration//GEN-END:variables
}
