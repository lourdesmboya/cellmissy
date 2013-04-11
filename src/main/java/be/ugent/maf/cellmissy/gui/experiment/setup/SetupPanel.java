/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SetupPanel.java
 *
 * Created on May 11, 2012, 3:26:08 PM
 */
package be.ugent.maf.cellmissy.gui.experiment.setup;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Paola Masuzzo
 */
public class SetupPanel extends javax.swing.JPanel {

    /**
     * Creates new form SetupPanel
     */
    public SetupPanel() {
        initComponents();
    }

    public JPanel getSetupPlateParentPanel() {
        return setupPlateParentPanel;
    }

    public JPanel getSetupConditionsParentPanel() {
        return setupConditionsParentPanel;
    }

    public JPanel getConditionsParentPanel() {
        return conditionsParentPanel;
    }

    public JButton getClearAllButton() {
        return clearAllButton;
    }

    public JButton getClearLastButton() {
        return clearLastButton;
    }

    public JLabel getExpNumberLabel() {
        return expNumberLabel;
    }

    public JLabel getExpPurposeLabel() {
        return expPurposeLabel;
    }

    public JLabel getProjNumberLabel() {
        return projNumberLabel;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        experimentMetadataPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        projNumberLabel = new javax.swing.JLabel();
        expNumberLabel = new javax.swing.JLabel();
        expPurposeLabel = new javax.swing.JLabel();
        conditionsParentPanel = new javax.swing.JPanel();
        setupConditionsParentPanel = new javax.swing.JPanel();
        platePanel = new javax.swing.JPanel();
        buttonsPanel = new javax.swing.JPanel();
        clearLastButton = new javax.swing.JButton();
        clearAllButton = new javax.swing.JButton();
        setupPlateParentPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        experimentMetadataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Experiment metadata", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        experimentMetadataPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        experimentMetadataPanel.setOpaque(false);
        experimentMetadataPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Number:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Project:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Purpose:");

        projNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        expNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        expPurposeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout experimentMetadataPanelLayout = new javax.swing.GroupLayout(experimentMetadataPanel);
        experimentMetadataPanel.setLayout(experimentMetadataPanelLayout);
        experimentMetadataPanelLayout.setHorizontalGroup(
            experimentMetadataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(experimentMetadataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(experimentMetadataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(experimentMetadataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(experimentMetadataPanelLayout.createSequentialGroup()
                        .addGroup(experimentMetadataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(projNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(expNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addComponent(expPurposeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        experimentMetadataPanelLayout.setVerticalGroup(
            experimentMetadataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(experimentMetadataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(experimentMetadataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(projNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(experimentMetadataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(expNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(experimentMetadataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(expPurposeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        add(experimentMetadataPanel, gridBagConstraints);

        conditionsParentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conditions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        conditionsParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        conditionsParentPanel.setName(""); // NOI18N
        conditionsParentPanel.setOpaque(false);
        conditionsParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        conditionsParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(conditionsParentPanel, gridBagConstraints);

        setupConditionsParentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conditions Setup", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        setupConditionsParentPanel.setMinimumSize(new java.awt.Dimension(10, 10));
        setupConditionsParentPanel.setOpaque(false);
        setupConditionsParentPanel.setPreferredSize(new java.awt.Dimension(10, 10));
        setupConditionsParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        add(setupConditionsParentPanel, gridBagConstraints);

        platePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Plate", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        platePanel.setMinimumSize(new java.awt.Dimension(20, 20));
        platePanel.setName(""); // NOI18N
        platePanel.setOpaque(false);
        platePanel.setPreferredSize(new java.awt.Dimension(20, 20));
        platePanel.setLayout(new java.awt.GridBagLayout());

        buttonsPanel.setMaximumSize(new java.awt.Dimension(20, 20));
        buttonsPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        buttonsPanel.setOpaque(false);
        buttonsPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        clearLastButton.setText("Clear last selection");

        clearAllButton.setText("Clear all");

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearAllButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clearLastButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        buttonsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {clearAllButton, clearLastButton});

        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                .addContainerGap(346, Short.MAX_VALUE)
                .addComponent(clearLastButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearAllButton)
                .addGap(22, 22, 22))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 1.0;
        platePanel.add(buttonsPanel, gridBagConstraints);

        setupPlateParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        setupPlateParentPanel.setOpaque(false);
        setupPlateParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        setupPlateParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.weighty = 1.0;
        platePanel.add(setupPlateParentPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.6;
        gridBagConstraints.weighty = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        add(platePanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton clearAllButton;
    private javax.swing.JButton clearLastButton;
    private javax.swing.JPanel conditionsParentPanel;
    private javax.swing.JLabel expNumberLabel;
    private javax.swing.JLabel expPurposeLabel;
    private javax.swing.JPanel experimentMetadataPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel platePanel;
    private javax.swing.JLabel projNumberLabel;
    private javax.swing.JPanel setupConditionsParentPanel;
    private javax.swing.JPanel setupPlateParentPanel;
    // End of variables declaration//GEN-END:variables
}
