/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.gui.experiment.analysis;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author Paola Masuzzo
 */
public class TimeFramesSelectionDialog extends javax.swing.JDialog {

    /**
     * Creates new form TimeFramesSelectionDialog
     * @param parent
     * @param modal  
     */
    public TimeFramesSelectionDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public JComboBox getCutOffTimeFrameComboBox() {
        return cutOffTimeFrameComboBox;
    }

    public JTextField getDefaultCutOffTextField() {
        return defaultCutOffTextField;
    }

    public JComboBox getFirstTimeFrameComboBox() {
        return firstTimeFrameComboBox;
    }

    public JTextPane getInfoTextPane() {
        return infoTextPane;
    }

    public JButton getResetCutOffButton() {
        return resetCutOffButton;
    }

    public JLabel getWarningLabel() {
        return warningLabel;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        timeFramesSelectionPanel = new javax.swing.JPanel();
        infoPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTextPane = new javax.swing.JTextPane();
        userInteractionPanel = new javax.swing.JPanel();
        cutOffTimeFrameComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        resetCutOffButton = new javax.swing.JButton();
        firstTimeFrameComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        defaultCutOffTextField = new javax.swing.JTextField();
        warningPanel = new javax.swing.JPanel();
        warningLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Select time frames");
        setAlwaysOnTop(true);
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        timeFramesSelectionPanel.setBackground(new java.awt.Color(255, 255, 255));
        timeFramesSelectionPanel.setMinimumSize(new java.awt.Dimension(600, 300));
        timeFramesSelectionPanel.setPreferredSize(new java.awt.Dimension(600, 300));
        timeFramesSelectionPanel.setLayout(new java.awt.GridBagLayout());

        infoPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        infoPanel.setOpaque(false);
        infoPanel.setPreferredSize(new java.awt.Dimension(600, 150));

        jScrollPane1.setBorder(null);

        infoTextPane.setEditable(false);
        infoTextPane.setBorder(null);
        infoTextPane.setText("The cut off is defined as the time frame starting from which all replicates only have not null values, it is then determined by the shortest replicate. If you want to change this value, choose a time frame from the drop down list and see how this is reflected in the plot. If you want to reset the cut off value to the default one, click on the Reset button. You can also choose a starting time frame different from zero selecting a value from the other drop down list. ");
        infoTextPane.setFocusable(false);
        infoTextPane.setMinimumSize(new java.awt.Dimension(20, 20));
        infoTextPane.setPreferredSize(new java.awt.Dimension(20, 20));
        jScrollPane1.setViewportView(infoTextPane);

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
            .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        timeFramesSelectionPanel.add(infoPanel, gridBagConstraints);

        userInteractionPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        userInteractionPanel.setOpaque(false);
        userInteractionPanel.setPreferredSize(new java.awt.Dimension(600, 150));

        cutOffTimeFrameComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Cut off time frame");

        resetCutOffButton.setText("Reset cut off");

        firstTimeFrameComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Starting time frame");

        jLabel3.setText("Default cut off:");

        defaultCutOffTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        defaultCutOffTextField.setFocusable(false);
        defaultCutOffTextField.setMinimumSize(new java.awt.Dimension(20, 20));
        defaultCutOffTextField.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout userInteractionPanelLayout = new javax.swing.GroupLayout(userInteractionPanel);
        userInteractionPanel.setLayout(userInteractionPanelLayout);
        userInteractionPanelLayout.setHorizontalGroup(
            userInteractionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInteractionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userInteractionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userInteractionPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(firstTimeFrameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userInteractionPanelLayout.createSequentialGroup()
                        .addGroup(userInteractionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addComponent(cutOffTimeFrameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(resetCutOffButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(269, 269, 269))
            .addGroup(userInteractionPanelLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(defaultCutOffTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(391, 391, 391))
        );
        userInteractionPanelLayout.setVerticalGroup(
            userInteractionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInteractionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userInteractionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(firstTimeFrameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(userInteractionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(defaultCutOffTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(userInteractionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cutOffTimeFrameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetCutOffButton)
                    .addComponent(jLabel1))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.6;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        timeFramesSelectionPanel.add(userInteractionPanel, gridBagConstraints);

        warningPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        warningPanel.setOpaque(false);

        warningLabel.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(255, 0, 0));
        warningLabel.setText("The chosen value is greater than default cut off, so default cut off will be used in analysis!");

        javax.swing.GroupLayout warningPanelLayout = new javax.swing.GroupLayout(warningPanel);
        warningPanel.setLayout(warningPanelLayout);
        warningPanelLayout.setHorizontalGroup(
            warningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warningPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );
        warningPanelLayout.setVerticalGroup(
            warningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warningPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        timeFramesSelectionPanel.add(warningPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(timeFramesSelectionPanel, gridBagConstraints);

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TimeFramesSelectionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimeFramesSelectionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimeFramesSelectionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimeFramesSelectionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TimeFramesSelectionDialog dialog = new TimeFramesSelectionDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox cutOffTimeFrameComboBox;
    private javax.swing.JTextField defaultCutOffTextField;
    private javax.swing.JComboBox firstTimeFrameComboBox;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JTextPane infoTextPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetCutOffButton;
    private javax.swing.JPanel timeFramesSelectionPanel;
    private javax.swing.JPanel userInteractionPanel;
    private javax.swing.JLabel warningLabel;
    private javax.swing.JPanel warningPanel;
    // End of variables declaration//GEN-END:variables
}