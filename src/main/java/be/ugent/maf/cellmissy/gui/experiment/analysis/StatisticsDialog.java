/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.gui.experiment.analysis;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextPane;

/**
 *
 * @author paola
 */
public class StatisticsDialog extends javax.swing.JDialog {

    public JComboBox getCorrectionMethodsComboBox() {
        return correctionMethodsComboBox;
    }

    public JComboBox getStatisticalTestComboBox() {
        return statisticalTestComboBox;
    }

    public JLabel getGroupNameLabel() {
        return groupNameLabel;
    }

    public JTable getpValuesTable() {
        return pValuesTable;
    }

    public JTable getStatisticalSummaryTable() {
        return statisticalSummaryTable;
    }

    public JButton getSaveAnalysisButton() {
        return saveAnalysisButton;
    }

    public JComboBox getSignificanceLevelComboBox() {
        return significanceLevelComboBox;
    }

    public JTextPane getTestDescriptionTextPane() {
        return testDescriptionTextPane;
    }

    /**
     * Creates new form StatisticsDialog2
     */
    public StatisticsDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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

        infoPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        groupNameLabel = new javax.swing.JLabel();
        summaryScrollPane = new javax.swing.JScrollPane();
        statisticalSummaryTable = new javax.swing.JTable();
        pValuesScrollPane = new javax.swing.JScrollPane();
        pValuesTable = new javax.swing.JTable();
        correctionPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        significanceLevelComboBox = new javax.swing.JComboBox();
        label = new javax.swing.JLabel();
        correctionMethodsComboBox = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        testDescriptionTextPane = new javax.swing.JTextPane();
        saveAnalysisButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        statisticalTestComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Statistics");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(20, 20));
        setModal(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        infoPanel.setOpaque(false);
        infoPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Current analyzed group:");

        groupNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        groupNameLabel.setForeground(new java.awt.Color(255, 0, 0));
        groupNameLabel.setMaximumSize(new java.awt.Dimension(20, 20));
        groupNameLabel.setMinimumSize(new java.awt.Dimension(20, 20));
        groupNameLabel.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(groupNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(605, Short.MAX_VALUE))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3))
                    .addComponent(groupNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.05;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        getContentPane().add(infoPanel, gridBagConstraints);

        summaryScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Statistics Summary"));

        statisticalSummaryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        summaryScrollPane.setViewportView(statisticalSummaryTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(summaryScrollPane, gridBagConstraints);

        pValuesScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Mann-Whitney U test"));

        pValuesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        pValuesScrollPane.setViewportView(pValuesTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(pValuesScrollPane, gridBagConstraints);

        correctionPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        correctionPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        jLabel2.setText("Significance Level*");

        label.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        label.setText("*p values smaller than significance level are shown in green");
        label.setMaximumSize(new java.awt.Dimension(20, 20));
        label.setMinimumSize(new java.awt.Dimension(20, 20));
        label.setPreferredSize(new java.awt.Dimension(20, 20));

        jScrollPane3.setBorder(null);

        testDescriptionTextPane.setEditable(false);
        testDescriptionTextPane.setBorder(javax.swing.BorderFactory.createTitledBorder("correction algorithm description"));
        testDescriptionTextPane.setFocusable(false);
        jScrollPane3.setViewportView(testDescriptionTextPane);

        saveAnalysisButton.setText("Save Analysis");
        saveAnalysisButton.setToolTipText("Click here to assign the chosen correction method to current analysis and save computed statistics");

        jLabel4.setText("Statistical Test");

        javax.swing.GroupLayout correctionPanelLayout = new javax.swing.GroupLayout(correctionPanel);
        correctionPanel.setLayout(correctionPanelLayout);
        correctionPanelLayout.setHorizontalGroup(
            correctionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correctionPanelLayout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(saveAnalysisButton)
                .addGap(560, 560, 560))
            .addGroup(correctionPanelLayout.createSequentialGroup()
                .addGroup(correctionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(correctionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(correctionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(correctionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(statisticalTestComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(significanceLevelComboBox, 0, 100, Short.MAX_VALUE)))
                    .addGroup(correctionPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(correctionPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(correctionPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(correctionMethodsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        correctionPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel4});

        correctionPanelLayout.setVerticalGroup(
            correctionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correctionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(correctionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(statisticalTestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(correctionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(significanceLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(correctionMethodsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveAnalysisButton)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.55;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(correctionPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatisticsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                StatisticsDialog dialog = new StatisticsDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox correctionMethodsComboBox;
    private javax.swing.JPanel correctionPanel;
    private javax.swing.JLabel groupNameLabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label;
    private javax.swing.JScrollPane pValuesScrollPane;
    private javax.swing.JTable pValuesTable;
    private javax.swing.JButton saveAnalysisButton;
    private javax.swing.JComboBox significanceLevelComboBox;
    private javax.swing.JTable statisticalSummaryTable;
    private javax.swing.JComboBox statisticalTestComboBox;
    private javax.swing.JScrollPane summaryScrollPane;
    private javax.swing.JTextPane testDescriptionTextPane;
    // End of variables declaration//GEN-END:variables
}
