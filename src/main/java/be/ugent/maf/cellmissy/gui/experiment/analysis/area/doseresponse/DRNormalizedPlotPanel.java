/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.gui.experiment.analysis.area.doseresponse;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Gwendolien
 */
public class DRNormalizedPlotPanel extends javax.swing.JPanel {

    /**
     * Creates new form DRNormalizedPlotPanel
     */
    public DRNormalizedPlotPanel() {
        initComponents();
    }

    public JPanel getDoseResponseChartParentPanel() {
        return doseResponseChartParentPanel;
    }

    public JComboBox getBottomComboBox() {
        return bottomComboBox;
    }

    public JTextField getBottomTextField() {
        return bottomTextField;
    }

    public JCheckBox getBottomConstrainCheckBox() {
        return bottomConstrainCheckBox;
    }

    public JComboBox getTopComboBox() {
        return topComboBox;
    }

    public JTextField getTopTextField() {
        return topTextField;
    }

    public JCheckBox getTopConstrainCheckBox() {
        return topConstrainCheckBox;
    }

    public JButton getPlotGraphButton() {
        return plotGraphButton;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        leftPanel = new javax.swing.JPanel();
        plotGraphButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bottomComboBox = new javax.swing.JComboBox();
        topComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bottomConstrainCheckBox = new javax.swing.JCheckBox();
        topConstrainCheckBox = new javax.swing.JCheckBox();
        bottomTextField = new javax.swing.JTextField();
        topTextField = new javax.swing.JTextField();
        doseResponseChartParentPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));
        leftPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        leftPanel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        leftPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        leftPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        plotGraphButton.setText("Renormalize and Plot New Graph");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Normalization");

        bottomComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Smallest Mean Value", "Smallest Median Value", "Other Value" }));

        topComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Largest Mean Value", "Largest Median Value", "Other Value" }));

        jLabel2.setText("0 %");

        jLabel3.setText("100 %");

        bottomConstrainCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        bottomConstrainCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bottomConstrainCheckBox.setLabel("Constrain Bottom to 0");

        topConstrainCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        topConstrainCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        topConstrainCheckBox.setLabel("Constrain Top to 100");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(bottomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bottomTextField))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(plotGraphButton)
                            .addComponent(jLabel3)
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(topConstrainCheckBox)
                                    .addComponent(bottomConstrainCheckBox))))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(topComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(topTextField)))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bottomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bottomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomConstrainCheckBox)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topConstrainCheckBox)
                .addGap(18, 18, 18)
                .addComponent(plotGraphButton)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 1.0;
        add(leftPanel, gridBagConstraints);

        doseResponseChartParentPanel.setBackground(new java.awt.Color(255, 255, 255));
        doseResponseChartParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        doseResponseChartParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        doseResponseChartParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.weighty = 1.0;
        add(doseResponseChartParentPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bottomComboBox;
    private javax.swing.JCheckBox bottomConstrainCheckBox;
    private javax.swing.JTextField bottomTextField;
    private javax.swing.JPanel doseResponseChartParentPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton plotGraphButton;
    private javax.swing.JComboBox topComboBox;
    private javax.swing.JCheckBox topConstrainCheckBox;
    private javax.swing.JTextField topTextField;
    // End of variables declaration//GEN-END:variables
}
