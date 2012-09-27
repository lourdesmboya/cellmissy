/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DataAnalysisPanel.java
 *
 * Created on Jul 7, 2012, 10:19:18 PM
 */
package be.ugent.maf.cellmissy.gui.experiment;

import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;

/**
 *
 * @author Paola Masuzzo
 */
public class DataAnalysisPanel extends javax.swing.JPanel {

    /** Creates new form DataAnalysisPanel */
    public DataAnalysisPanel() {
        initComponents();
    }

    public JList getExperimentJList() {
        return experimentJList;
    }

    public JList getProjectJList() {
        return projectJList;
    }

    public JComboBox getAlgorithmComboBox() {
        return algorithmComboBox;
    }

    public JComboBox getImagingTypeComboBox() {
        return imagingTypeComboBox;
    }

    public JList getConditionsList() {
        return conditionsList;
    }

    public JPanel getAnalysisPlateParentPanel() {
        return analysisPlateParentPanel;
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

    public JPanel getCorrectedDensityChartParentPanel() {
        return correctedDensityChartParentPanel;
    }

    public JPanel getDensityChartParentPanel() {
        return densityChartParentPanel;
    }

    public JPanel getAreaChartPanelParentPanel() {
        return areaChartPanelParentPanel;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        rightPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        bulkCellAnalysisPanel = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        resultsImporterPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        timeStepsTable = new javax.swing.JTable();
        analysisPanel = new javax.swing.JPanel();
        radioButtonsPanel = new javax.swing.JPanel();
        normalizeAreaButton = new javax.swing.JRadioButton();
        deltaAreaButton = new javax.swing.JRadioButton();
        percentageAreaIncreaseButton = new javax.swing.JRadioButton();
        correctedAreaButton = new javax.swing.JRadioButton();
        dataTablePanel = new javax.swing.JPanel();
        graphicsParentPanel = new javax.swing.JPanel();
        densityChartParentPanel = new javax.swing.JPanel();
        correctedDensityChartParentPanel = new javax.swing.JPanel();
        areaChartPanelParentPanel = new javax.swing.JPanel();
        singleCellAnalysisPanel = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        experimentDataPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectJList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        experimentJList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        algorithmComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        imagingTypeComboBox = new javax.swing.JComboBox();
        analysisPlateParentPanel = new javax.swing.JPanel();
        conditionsPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        conditionsList = new javax.swing.JList();
        bottomPanel = new javax.swing.JPanel();
        infolabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        rightPanel.setEnabled(false);
        rightPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        rightPanel.setOpaque(false);
        rightPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        bulkCellAnalysisPanel.setBackground(new java.awt.Color(255, 255, 255));
        bulkCellAnalysisPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        bulkCellAnalysisPanel.setName(""); // NOI18N
        bulkCellAnalysisPanel.setOpaque(false);

        resultsImporterPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        resultsImporterPanel.setOpaque(false);
        resultsImporterPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setMinimumSize(new java.awt.Dimension(20, 20));
        jScrollPane5.setPreferredSize(new java.awt.Dimension(20, 20));

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
        timeStepsTable.setOpaque(false);
        jScrollPane5.setViewportView(timeStepsTable);

        javax.swing.GroupLayout resultsImporterPanelLayout = new javax.swing.GroupLayout(resultsImporterPanel);
        resultsImporterPanel.setLayout(resultsImporterPanelLayout);
        resultsImporterPanelLayout.setHorizontalGroup(
            resultsImporterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
        );
        resultsImporterPanelLayout.setVerticalGroup(
            resultsImporterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsImporterPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Results Importer", resultsImporterPanel);

        analysisPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        analysisPanel.setOpaque(false);
        analysisPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        analysisPanel.setLayout(new java.awt.GridBagLayout());

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

        javax.swing.GroupLayout radioButtonsPanelLayout = new javax.swing.GroupLayout(radioButtonsPanel);
        radioButtonsPanel.setLayout(radioButtonsPanelLayout);
        radioButtonsPanelLayout.setHorizontalGroup(
            radioButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radioButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(normalizeAreaButton)
                .addGap(18, 18, 18)
                .addComponent(deltaAreaButton)
                .addGap(18, 18, 18)
                .addComponent(percentageAreaIncreaseButton)
                .addGap(18, 18, 18)
                .addComponent(correctedAreaButton)
                .addContainerGap(387, Short.MAX_VALUE))
        );
        radioButtonsPanelLayout.setVerticalGroup(
            radioButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radioButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(radioButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(normalizeAreaButton)
                    .addComponent(deltaAreaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentageAreaIncreaseButton)
                    .addComponent(correctedAreaButton))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.05;
        analysisPanel.add(radioButtonsPanel, gridBagConstraints);

        dataTablePanel.setMinimumSize(new java.awt.Dimension(20, 20));
        dataTablePanel.setOpaque(false);
        dataTablePanel.setPreferredSize(new java.awt.Dimension(20, 20));
        dataTablePanel.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.3;
        analysisPanel.add(dataTablePanel, gridBagConstraints);

        graphicsParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        graphicsParentPanel.setOpaque(false);
        graphicsParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        graphicsParentPanel.setLayout(new java.awt.GridBagLayout());

        densityChartParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        densityChartParentPanel.setOpaque(false);
        densityChartParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        densityChartParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        graphicsParentPanel.add(densityChartParentPanel, gridBagConstraints);

        correctedDensityChartParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        correctedDensityChartParentPanel.setOpaque(false);
        correctedDensityChartParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        correctedDensityChartParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        graphicsParentPanel.add(correctedDensityChartParentPanel, gridBagConstraints);

        areaChartPanelParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        areaChartPanelParentPanel.setOpaque(false);
        areaChartPanelParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        areaChartPanelParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        graphicsParentPanel.add(areaChartPanelParentPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.65;
        analysisPanel.add(graphicsParentPanel, gridBagConstraints);

        jTabbedPane2.addTab("Analysis", analysisPanel);

        javax.swing.GroupLayout bulkCellAnalysisPanelLayout = new javax.swing.GroupLayout(bulkCellAnalysisPanel);
        bulkCellAnalysisPanel.setLayout(bulkCellAnalysisPanelLayout);
        bulkCellAnalysisPanelLayout.setHorizontalGroup(
            bulkCellAnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
        );
        bulkCellAnalysisPanelLayout.setVerticalGroup(
            bulkCellAnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Bulk Cell", bulkCellAnalysisPanel);

        singleCellAnalysisPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        singleCellAnalysisPanel.setOpaque(false);

        javax.swing.GroupLayout singleCellAnalysisPanelLayout = new javax.swing.GroupLayout(singleCellAnalysisPanel);
        singleCellAnalysisPanel.setLayout(singleCellAnalysisPanelLayout);
        singleCellAnalysisPanelLayout.setHorizontalGroup(
            singleCellAnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 836, Short.MAX_VALUE)
        );
        singleCellAnalysisPanelLayout.setVerticalGroup(
            singleCellAnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Single Cell", singleCellAnalysisPanel);

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.9;
        add(rightPanel, gridBagConstraints);

        leftPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        leftPanel.setOpaque(false);
        leftPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        leftPanel.setLayout(new java.awt.GridBagLayout());

        experimentDataPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        experimentDataPanel.setOpaque(false);
        experimentDataPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Projects", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jScrollPane1.setOpaque(false);

        projectJList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(projectJList);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Experiments Performed", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jScrollPane2.setOpaque(false);

        experimentJList.setToolTipText("");
        jScrollPane2.setViewportView(experimentJList);

        jLabel1.setText("Algorithm");

        jLabel2.setText("Imaging Type");

        javax.swing.GroupLayout experimentDataPanelLayout = new javax.swing.GroupLayout(experimentDataPanel);
        experimentDataPanel.setLayout(experimentDataPanelLayout);
        experimentDataPanelLayout.setHorizontalGroup(
            experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(experimentDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(algorithmComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagingTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        experimentDataPanelLayout.setVerticalGroup(
            experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(experimentDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(algorithmComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imagingTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.3;
        leftPanel.add(experimentDataPanel, gridBagConstraints);

        analysisPlateParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        analysisPlateParentPanel.setOpaque(false);
        analysisPlateParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        analysisPlateParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.45;
        leftPanel.add(analysisPlateParentPanel, gridBagConstraints);

        conditionsPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        conditionsPanel.setOpaque(false);
        conditionsPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Select Condition"));
        jScrollPane3.setOpaque(false);

        conditionsList.setSelectedIndex(0);
        jScrollPane3.setViewportView(conditionsList);

        javax.swing.GroupLayout conditionsPanelLayout = new javax.swing.GroupLayout(conditionsPanel);
        conditionsPanel.setLayout(conditionsPanelLayout);
        conditionsPanelLayout.setHorizontalGroup(
            conditionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );
        conditionsPanelLayout.setVerticalGroup(
            conditionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.25;
        leftPanel.add(conditionsPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.9;
        add(leftPanel, gridBagConstraints);

        bottomPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Info"));
        bottomPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        bottomPanel.setOpaque(false);
        bottomPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(infolabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1402, 1402, 1402))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        add(bottomPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox algorithmComboBox;
    private javax.swing.JPanel analysisPanel;
    private javax.swing.JPanel analysisPlateParentPanel;
    private javax.swing.JPanel areaChartPanelParentPanel;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JPanel bulkCellAnalysisPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JList conditionsList;
    private javax.swing.JPanel conditionsPanel;
    private javax.swing.JRadioButton correctedAreaButton;
    private javax.swing.JPanel correctedDensityChartParentPanel;
    private javax.swing.JPanel dataTablePanel;
    private javax.swing.JRadioButton deltaAreaButton;
    private javax.swing.JPanel densityChartParentPanel;
    private javax.swing.JPanel experimentDataPanel;
    private javax.swing.JList experimentJList;
    private javax.swing.JPanel graphicsParentPanel;
    private javax.swing.JComboBox imagingTypeComboBox;
    private javax.swing.JLabel infolabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JRadioButton normalizeAreaButton;
    private javax.swing.JRadioButton percentageAreaIncreaseButton;
    private javax.swing.JList projectJList;
    private javax.swing.JPanel radioButtonsPanel;
    private javax.swing.JPanel resultsImporterPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel singleCellAnalysisPanel;
    private javax.swing.JTable timeStepsTable;
    // End of variables declaration//GEN-END:variables
}