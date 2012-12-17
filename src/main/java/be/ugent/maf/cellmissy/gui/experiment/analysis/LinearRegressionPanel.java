/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LinearRegressionPanel.java
 *
 * Created on Dec 4, 2012, 2:10:47 PM
 */
package be.ugent.maf.cellmissy.gui.experiment.analysis;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Paola Masuzzo
 */
public class LinearRegressionPanel extends javax.swing.JPanel {

    /** Creates new form LinearRegressionPanel */
    public LinearRegressionPanel() {
        initComponents();
    }

    public JPanel getChartParentPanel() {
        return chartParentPanel;
    }

    public JTable getSlopesTable() {
        return slopesTable;
    }

    public JScrollPane getSlopesTableScrollPane() {
        return slopesTableScrollPane;
    }

    public JButton getStatisticsButton() {
        return statisticsButton;
    }

    public JList getGroupsList() {
        return groupsList;
    }

    public JButton getAddGroupButton() {
        return addGroupButton;
    }

    public JButton getRemoveGroupButton() {
        return removeGroupButton;
    }

    public JTextField getGroupNameTextField() {
        return groupNameTextField;
    }

    public JButton getCreateReportButton() {
        return createReportButton;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        linearRegressionTablePanel = new javax.swing.JPanel();
        slopesTableScrollPane = new javax.swing.JScrollPane();
        slopesTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        chartParentPanel = new javax.swing.JPanel();
        testPanel = new javax.swing.JPanel();
        statisticsButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        groupsList = new javax.swing.JList();
        addGroupButton = new javax.swing.JButton();
        removeGroupButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        groupNameTextField = new javax.swing.JTextField();
        createReportButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        linearRegressionTablePanel.setOpaque(false);
        linearRegressionTablePanel.setPreferredSize(new java.awt.Dimension(20, 20));

        slopesTable.setModel(new javax.swing.table.DefaultTableModel(
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
        slopesTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slopesTableScrollPane.setViewportView(slopesTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 12));
        jLabel1.setText("This table contains slopes together with goodness of fit coefficients for each replicate and each condition.");

        javax.swing.GroupLayout linearRegressionTablePanelLayout = new javax.swing.GroupLayout(linearRegressionTablePanel);
        linearRegressionTablePanel.setLayout(linearRegressionTablePanelLayout);
        linearRegressionTablePanelLayout.setHorizontalGroup(
            linearRegressionTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(linearRegressionTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(linearRegressionTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slopesTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        linearRegressionTablePanelLayout.setVerticalGroup(
            linearRegressionTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(linearRegressionTablePanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slopesTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.3;
        add(linearRegressionTablePanel, gridBagConstraints);

        chartParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        chartParentPanel.setOpaque(false);
        chartParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        chartParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.4;
        add(chartParentPanel, gridBagConstraints);

        testPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        testPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        testPanel.setOpaque(false);
        testPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        statisticsButton.setText("Perform Statistical Analysis...");

        jScrollPane3.setBorder(null);
        jScrollPane3.setOpaque(false);

        groupsList.setBorder(javax.swing.BorderFactory.createTitledBorder("Analysis Groups"));
        groupsList.setMinimumSize(new java.awt.Dimension(20, 20));
        groupsList.setPreferredSize(new java.awt.Dimension(20, 20));
        groupsList.setSelectedIndex(0);
        jScrollPane3.setViewportView(groupsList);

        addGroupButton.setText("Add Group to Analysis");

        removeGroupButton.setText("Remove Group");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setText("Name for the Analysis Group");

        createReportButton.setText("Create & Save Report");

        javax.swing.GroupLayout testPanelLayout = new javax.swing.GroupLayout(testPanel);
        testPanel.setLayout(testPanelLayout);
        testPanelLayout.setHorizontalGroup(
            testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeGroupButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addGroupButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(groupNameTextField)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(testPanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(statisticsButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, testPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                        .addComponent(createReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        testPanelLayout.setVerticalGroup(
            testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(statisticsButton)
                .addGap(71, 71, 71)
                .addComponent(createReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(testPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addGroup(testPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(groupNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(addGroupButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeGroupButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );

        testPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {createReportButton, statisticsButton});

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        add(testPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGroupButton;
    private javax.swing.JPanel chartParentPanel;
    private javax.swing.JButton createReportButton;
    private javax.swing.JTextField groupNameTextField;
    private javax.swing.JList groupsList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel linearRegressionTablePanel;
    private javax.swing.JButton removeGroupButton;
    private javax.swing.JTable slopesTable;
    private javax.swing.JScrollPane slopesTableScrollPane;
    private javax.swing.JButton statisticsButton;
    private javax.swing.JPanel testPanel;
    // End of variables declaration//GEN-END:variables
}
