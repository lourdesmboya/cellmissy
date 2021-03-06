/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DataAnalysisPanel.java
 *
 * Created on Jul 7, 2012, 10:19:18 PM
 */
package be.ugent.maf.cellmissy.gui.experiment.analysis;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Paola Masuzzo
 */
public class DataAnalysisPanel extends javax.swing.JPanel {

    /**
     * Creates new form DataAnalysisPanel
     */
    public DataAnalysisPanel() {
        initComponents();
    }

    public JList getConditionsList() {
        return conditionsList;
    }

    public JPanel getAnalysisPlateParentPanel() {
        return analysisPlateParentPanel;
    }

    public JPanel getAreaAnalysisParentPanel() {
        return areaAnalysisParentPanel;
    }

    public JTextField getDatasetTextField() {
        return datasetTextField;
    }

    public JTextField getExperimentNumberTextField() {
        return experimentNumberTextField;
    }

    public JTextField getImagingTypeTextField() {
        return imagingTypeTextField;
    }

    public JTextField getTimeFramesNumberTextField() {
        return timeFramesNumberTextField;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        dataAnalysisSplitPane = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        experimentDataPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        experimentNumberTextField = new javax.swing.JTextField();
        datasetTextField = new javax.swing.JTextField();
        imagingTypeTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        timeFramesNumberTextField = new javax.swing.JTextField();
        analysisPlateParentPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        conditionsList = new javax.swing.JList();
        areaAnalysisParentPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 700));

        dataAnalysisSplitPane.setBackground(new java.awt.Color(255, 255, 255));
        dataAnalysisSplitPane.setDividerLocation(450);

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));
        leftPanel.setLayout(new java.awt.GridBagLayout());

        experimentDataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Analysis Details"));
        experimentDataPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        experimentDataPanel.setOpaque(false);
        experimentDataPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Experiment nr");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Dataset");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Imaging type");

        experimentNumberTextField.setEditable(false);
        experimentNumberTextField.setBorder(null);
        experimentNumberTextField.setFocusable(false);
        experimentNumberTextField.setOpaque(false);

        datasetTextField.setEditable(false);
        datasetTextField.setBackground(new java.awt.Color(255, 255, 255));
        datasetTextField.setBorder(null);
        datasetTextField.setFocusable(false);

        imagingTypeTextField.setEditable(false);
        imagingTypeTextField.setBackground(new java.awt.Color(255, 255, 255));
        imagingTypeTextField.setBorder(null);
        imagingTypeTextField.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Time frames nr");

        timeFramesNumberTextField.setEditable(false);
        timeFramesNumberTextField.setBorder(null);
        timeFramesNumberTextField.setFocusable(false);
        timeFramesNumberTextField.setOpaque(false);

        javax.swing.GroupLayout experimentDataPanelLayout = new javax.swing.GroupLayout(experimentDataPanel);
        experimentDataPanel.setLayout(experimentDataPanelLayout);
        experimentDataPanelLayout.setHorizontalGroup(
            experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(experimentDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeFramesNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagingTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datasetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(experimentNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        experimentDataPanelLayout.setVerticalGroup(
            experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(experimentDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(experimentNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(timeFramesNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(datasetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(imagingTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.25;
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
        gridBagConstraints.weighty = 0.55;
        leftPanel.add(analysisPlateParentPanel, gridBagConstraints);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Select a Condition"));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(20, 20));

        conditionsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(conditionsList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        leftPanel.add(jScrollPane1, gridBagConstraints);

        dataAnalysisSplitPane.setLeftComponent(leftPanel);

        areaAnalysisParentPanel.setBackground(new java.awt.Color(255, 255, 255));
        areaAnalysisParentPanel.setLayout(new java.awt.GridBagLayout());
        dataAnalysisSplitPane.setRightComponent(areaAnalysisParentPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dataAnalysisSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dataAnalysisSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel analysisPlateParentPanel;
    private javax.swing.JPanel areaAnalysisParentPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JList conditionsList;
    private javax.swing.JSplitPane dataAnalysisSplitPane;
    private javax.swing.JTextField datasetTextField;
    private javax.swing.JPanel experimentDataPanel;
    private javax.swing.JTextField experimentNumberTextField;
    private javax.swing.JTextField imagingTypeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JTextField timeFramesNumberTextField;
    // End of variables declaration//GEN-END:variables
}
