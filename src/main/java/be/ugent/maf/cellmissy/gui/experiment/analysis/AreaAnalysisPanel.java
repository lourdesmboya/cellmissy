/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AreaAnalysisPanel.java
 *
 * Created on Nov 22, 2012, 10:57:22 AM
 */
package be.ugent.maf.cellmissy.gui.experiment.analysis;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;

/**
 *
 * @author Paola Masuzzo
 */
public class AreaAnalysisPanel extends javax.swing.JPanel {

    /**
     * Creates new form AreaAnalysisPanel
     */
    public AreaAnalysisPanel() {
        initComponents();
    }

    public JTable getTimeStepsTable() {
        return timeStepsTable;
    }

    public JRadioButton getDeltaAreaButton() {
        return deltaAreaButton;
    }

    public JRadioButton getNormalizeAreaButton() {
        return normalizeAreaButton;
    }

    public JPanel getDataTablePanel() {
        return dataTablePanel;
    }

    public JRadioButton getPercentageAreaIncreaseButton() {
        return percentageAreaIncreaseButton;
    }

    public JRadioButton getCorrectedAreaButton() {
        return correctedAreaButton;
    }

    public JPanel getGraphicsParentPanel() {
        return graphicsParentPanel;
    }

    public JLabel getTableInfoLabel() {
        return tableInfoLabel;
    }

    public JScrollPane getTimeStepsTableScrollPane() {
        return timeStepsTableScrollPane;
    }

    public JPanel getGlobalAreaPanel() {
        return globalAreaPanel;
    }

    public JCheckBox getPlotErrorBarsCheckBox() {
        return plotErrorBarsCheckBox;
    }

    public JList getConditionsList() {
        return conditionsList;
    }

    public JButton getPlotSelectedConditionsButton() {
        return plotSelectedConditionsButton;
    }

    public JButton getPlotAllConditionsButton() {
        return plotAllConditionsButton;
    }

    public JPanel getLinearModelParentPanel() {
        return linearModelParentPanel;
    }

    public JTextPane getInfoTextPane() {
        return infoTextPane;
    }

    public JCheckBox getUseCorrectedDataCheckBox() {
        return useCorrectedDataCheckBox;
    }

    public JRadioButton getCellCoveredAreaRadioButton() {
        return cellCoveredAreaRadioButton;
    }

    public JPanel getBottomPanel() {
        return bottomPanel;
    }

    public JLabel getGlobalViewLabel() {
        return globalViewLabel;
    }

    public JLabel getLinearRegressionModelLabel() {
        return linearRegressionModelLabel;
    }

    public JLabel getPreProcessingLabel() {
        return preProcessingLabel;
    }

    public JLabel getResultsImportingLabel() {
        return resultsImportingLabel;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        topPanel = new javax.swing.JPanel();
        resultsImportingLabel = new javax.swing.JLabel();
        linearRegressionModelLabel = new javax.swing.JLabel();
        preProcessingLabel = new javax.swing.JLabel();
        globalViewLabel = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        resultsImporterPanel = new javax.swing.JPanel();
        timeStepsTableScrollPane = new javax.swing.JScrollPane();
        timeStepsTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        preprocessingPanel = new javax.swing.JPanel();
        radioButtonsPanel = new javax.swing.JPanel();
        normalizeAreaButton = new javax.swing.JRadioButton();
        deltaAreaButton = new javax.swing.JRadioButton();
        percentageAreaIncreaseButton = new javax.swing.JRadioButton();
        correctedAreaButton = new javax.swing.JRadioButton();
        tableInfoLabel = new javax.swing.JLabel();
        cellCoveredAreaRadioButton = new javax.swing.JRadioButton();
        dataTablePanel = new javax.swing.JPanel();
        graphicsParentPanel = new javax.swing.JPanel();
        globalViewPanel = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        plotErrorBarsCheckBox = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        conditionsList = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        plotSelectedConditionsButton = new javax.swing.JButton();
        plotAllConditionsButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        useCorrectedDataCheckBox = new javax.swing.JCheckBox();
        globalAreaPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTextPane = new javax.swing.JTextPane();
        linearModelParentPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setName(""); // NOI18N
        setLayout(new java.awt.GridBagLayout());

        topPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        topPanel.setOpaque(false);
        topPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        resultsImportingLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        resultsImportingLabel.setText("1. Data Importing");

        linearRegressionModelLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        linearRegressionModelLabel.setText("4. Linear Regression Model");

        preProcessingLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        preProcessingLabel.setText("2. Pre-processing");

        globalViewLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        globalViewLabel.setText("3. Global View");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(resultsImportingLabel)
                .addGap(18, 18, 18)
                .addComponent(preProcessingLabel)
                .addGap(18, 18, 18)
                .addComponent(globalViewLabel)
                .addGap(18, 18, 18)
                .addComponent(linearRegressionModelLabel)
                .addContainerGap(510, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultsImportingLabel)
                    .addComponent(linearRegressionModelLabel)
                    .addComponent(globalViewLabel)
                    .addComponent(preProcessingLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.03;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        add(topPanel, gridBagConstraints);

        bottomPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        bottomPanel.setOpaque(false);
        bottomPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        bottomPanel.setLayout(new java.awt.CardLayout());

        resultsImporterPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        resultsImporterPanel.setName("resultsImporterPanel"); // NOI18N
        resultsImporterPanel.setOpaque(false);

        timeStepsTableScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        timeStepsTableScrollPane.setMinimumSize(new java.awt.Dimension(20, 20));
        timeStepsTableScrollPane.setPreferredSize(new java.awt.Dimension(20, 20));

        timeStepsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        timeStepsTable.setMinimumSize(new java.awt.Dimension(20, 20));
        timeStepsTableScrollPane.setViewportView(timeStepsTable);

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setText("Area values from database");

        javax.swing.GroupLayout resultsImporterPanelLayout = new javax.swing.GroupLayout(resultsImporterPanel);
        resultsImporterPanel.setLayout(resultsImporterPanelLayout);
        resultsImporterPanelLayout.setHorizontalGroup(
            resultsImporterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(timeStepsTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
            .addGroup(resultsImporterPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resultsImporterPanelLayout.setVerticalGroup(
            resultsImporterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsImporterPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeStepsTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
        );

        bottomPanel.add(resultsImporterPanel, "resultsImporterPanel");
        resultsImporterPanel.getAccessibleContext().setAccessibleName("");

        preprocessingPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        preprocessingPanel.setName("preprocessingPanel"); // NOI18N
        preprocessingPanel.setOpaque(false);
        preprocessingPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        preprocessingPanel.setLayout(new java.awt.GridBagLayout());

        radioButtonsPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        radioButtonsPanel.setOpaque(false);
        radioButtonsPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        normalizeAreaButton.setText("Normalized Area");
        normalizeAreaButton.setOpaque(false);

        deltaAreaButton.setText("Delta Area");
        deltaAreaButton.setOpaque(false);

        percentageAreaIncreaseButton.setText("%Area Increase");
        percentageAreaIncreaseButton.setOpaque(false);

        correctedAreaButton.setText("Corrected Area");
        correctedAreaButton.setOpaque(false);

        tableInfoLabel.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        tableInfoLabel.setMinimumSize(new java.awt.Dimension(20, 20));
        tableInfoLabel.setPreferredSize(new java.awt.Dimension(20, 20));

        cellCoveredAreaRadioButton.setText("Cell Covered Area");
        cellCoveredAreaRadioButton.setOpaque(false);

        javax.swing.GroupLayout radioButtonsPanelLayout = new javax.swing.GroupLayout(radioButtonsPanel);
        radioButtonsPanel.setLayout(radioButtonsPanelLayout);
        radioButtonsPanelLayout.setHorizontalGroup(
            radioButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radioButtonsPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(radioButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tableInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, radioButtonsPanelLayout.createSequentialGroup()
                        .addComponent(normalizeAreaButton)
                        .addGap(18, 18, 18)
                        .addComponent(cellCoveredAreaRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(deltaAreaButton)
                        .addGap(18, 18, 18)
                        .addComponent(percentageAreaIncreaseButton)
                        .addGap(18, 18, 18)
                        .addComponent(correctedAreaButton)))
                .addContainerGap(404, Short.MAX_VALUE))
        );
        radioButtonsPanelLayout.setVerticalGroup(
            radioButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radioButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(radioButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deltaAreaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentageAreaIncreaseButton)
                    .addComponent(correctedAreaButton)
                    .addComponent(cellCoveredAreaRadioButton)
                    .addComponent(normalizeAreaButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.08;
        preprocessingPanel.add(radioButtonsPanel, gridBagConstraints);

        dataTablePanel.setMinimumSize(new java.awt.Dimension(20, 20));
        dataTablePanel.setOpaque(false);
        dataTablePanel.setPreferredSize(new java.awt.Dimension(20, 20));
        dataTablePanel.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.3;
        preprocessingPanel.add(dataTablePanel, gridBagConstraints);

        graphicsParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        graphicsParentPanel.setOpaque(false);
        graphicsParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        graphicsParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.62;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        preprocessingPanel.add(graphicsParentPanel, gridBagConstraints);

        bottomPanel.add(preprocessingPanel, "preprocessingPanel");

        globalViewPanel.setName("globalViewPanel"); // NOI18N
        globalViewPanel.setOpaque(false);
        globalViewPanel.setLayout(new java.awt.GridBagLayout());

        leftPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        leftPanel.setOpaque(false);
        leftPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel1.setText("Show Error Bars");

        plotErrorBarsCheckBox.setText("Plot SEM");
        plotErrorBarsCheckBox.setOpaque(false);

        jScrollPane3.setBorder(null);
        jScrollPane3.setOpaque(false);

        conditionsList.setSelectedIndex(0);
        jScrollPane3.setViewportView(conditionsList);

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setText("Select Conditions to plot");

        plotSelectedConditionsButton.setText("Plot selected conditions");

        plotAllConditionsButton.setText("Plot all conditions");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setText("N: number of Replicates");

        useCorrectedDataCheckBox.setText("Use corrected data");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(useCorrectedDataCheckBox)
                        .addGap(0, 85, Short.MAX_VALUE))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(59, 59, 59))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plotErrorBarsCheckBox)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plotSelectedConditionsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(plotAllConditionsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        leftPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {plotAllConditionsButton, plotSelectedConditionsButton});

        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(useCorrectedDataCheckBox)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plotErrorBarsCheckBox)
                .addGap(24, 24, 24)
                .addComponent(plotSelectedConditionsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plotAllConditionsButton)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.9;
        globalViewPanel.add(leftPanel, gridBagConstraints);

        globalAreaPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        globalAreaPanel.setOpaque(false);
        globalAreaPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        globalAreaPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.weighty = 0.9;
        globalViewPanel.add(globalAreaPanel, gridBagConstraints);

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(20, 20));

        jScrollPane1.setBorder(null);
        jScrollPane1.setFocusable(false);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(600, 100));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 100));

        infoTextPane.setBorder(null);
        infoTextPane.setText("By default, all conditions are used for the global visualization; samples within a condition are considered as replicates and, for each condition, the average area across replicates is used. You can also select a subset of conditions to be included in the plot and use the \"Plot selected conditions\" button. This grouping is only used for visualization: you can still group conditions you want to statistically compare in next step.");
        infoTextPane.setFocusable(false);
        infoTextPane.setMinimumSize(new java.awt.Dimension(600, 150));
        infoTextPane.setPreferredSize(new java.awt.Dimension(600, 150));
        jScrollPane1.setViewportView(infoTextPane);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1003, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        globalViewPanel.add(jPanel1, gridBagConstraints);

        bottomPanel.add(globalViewPanel, "globalViewPanel");

        linearModelParentPanel.setName("linearModelPanel"); // NOI18N
        linearModelParentPanel.setOpaque(false);
        linearModelParentPanel.setLayout(new java.awt.GridBagLayout());
        bottomPanel.add(linearModelParentPanel, "linearModelPanel");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.97;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        add(bottomPanel, gridBagConstraints);

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JRadioButton cellCoveredAreaRadioButton;
    private javax.swing.JList conditionsList;
    private javax.swing.JRadioButton correctedAreaButton;
    private javax.swing.JPanel dataTablePanel;
    private javax.swing.JRadioButton deltaAreaButton;
    private javax.swing.JPanel globalAreaPanel;
    private javax.swing.JLabel globalViewLabel;
    private javax.swing.JPanel globalViewPanel;
    private javax.swing.JPanel graphicsParentPanel;
    private javax.swing.JTextPane infoTextPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel linearModelParentPanel;
    private javax.swing.JLabel linearRegressionModelLabel;
    private javax.swing.JRadioButton normalizeAreaButton;
    private javax.swing.JRadioButton percentageAreaIncreaseButton;
    private javax.swing.JButton plotAllConditionsButton;
    private javax.swing.JCheckBox plotErrorBarsCheckBox;
    private javax.swing.JButton plotSelectedConditionsButton;
    private javax.swing.JLabel preProcessingLabel;
    private javax.swing.JPanel preprocessingPanel;
    private javax.swing.JPanel radioButtonsPanel;
    private javax.swing.JPanel resultsImporterPanel;
    private javax.swing.JLabel resultsImportingLabel;
    private javax.swing.JLabel tableInfoLabel;
    private javax.swing.JTable timeStepsTable;
    private javax.swing.JScrollPane timeStepsTableScrollPane;
    private javax.swing.JPanel topPanel;
    private javax.swing.JCheckBox useCorrectedDataCheckBox;
    // End of variables declaration//GEN-END:variables
}
