/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.gui.experiment.analysis.singlecell;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Paola Masuzzo <paola.masuzzo@ugent.be>
 */
public class ExploreTrackPanel extends javax.swing.JPanel {

    public JPanel getGraphicsParentPanel() {
        return graphicsParentPanel;
    }

    public JPanel getShiftedParentPanel() {
        return shiftedParentPanel;
    }

    public JSlider getTimeSlider() {
        return timeSlider;
    }

    public JList getTracksList() {
        return tracksList;
    }

    public JPanel getxTCoordinatesParentPanel() {
        return xTCoordinatesParentPanel;
    }

    public JTextField getxTextField() {
        return xTextField;
    }

    public JPanel getyTCoordinatesParentPanel() {
        return yTCoordinatesParentPanel;
    }

    public JTextField getyTextField() {
        return yTextField;
    }

    public JTable getTrackDataTable() {
        return trackDataTable;
    }

    /**
     * Creates new form ExploreTrackPanel
     */
    public ExploreTrackPanel() {
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

        graphicsParentPanel = new javax.swing.JPanel();
        xTCoordinatesParentPanel = new javax.swing.JPanel();
        shiftedParentPanel = new javax.swing.JPanel();
        yTCoordinatesParentPanel = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();
        tablePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        trackDataTable = new javax.swing.JTable();
        timeEvolutionPanel = new javax.swing.JPanel();
        yTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        timeSlider = new javax.swing.JSlider();
        xTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tracksList = new javax.swing.JList();

        setLayout(new java.awt.GridBagLayout());

        graphicsParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        graphicsParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        graphicsParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.4;
        add(graphicsParentPanel, gridBagConstraints);

        xTCoordinatesParentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("x(t)"));
        xTCoordinatesParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        xTCoordinatesParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        xTCoordinatesParentPanel.setRequestFocusEnabled(false);
        xTCoordinatesParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.3;
        add(xTCoordinatesParentPanel, gridBagConstraints);

        shiftedParentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("shifted (x, y)"));
        shiftedParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        shiftedParentPanel.setOpaque(false);
        shiftedParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        shiftedParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 0.6;
        gridBagConstraints.weighty = 0.3;
        add(shiftedParentPanel, gridBagConstraints);

        yTCoordinatesParentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("y(t)"));
        yTCoordinatesParentPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        yTCoordinatesParentPanel.setPreferredSize(new java.awt.Dimension(20, 20));
        yTCoordinatesParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.3;
        add(yTCoordinatesParentPanel, gridBagConstraints);

        rightPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        rightPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        tablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Selected Track Data"));
        tablePanel.setMinimumSize(new java.awt.Dimension(20, 20));

        trackDataTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(trackDataTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        timeEvolutionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Temporal Evolution"));

        yTextField.setEditable(false);
        yTextField.setFocusable(false);

        jLabel5.setText("x (µm) =");

        xTextField.setEditable(false);
        xTextField.setFocusable(false);

        jLabel6.setText("y (µm) =");

        jLabel7.setText("Time Frames for Selected Track");

        javax.swing.GroupLayout timeEvolutionPanelLayout = new javax.swing.GroupLayout(timeEvolutionPanel);
        timeEvolutionPanel.setLayout(timeEvolutionPanelLayout);
        timeEvolutionPanelLayout.setHorizontalGroup(
            timeEvolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timeEvolutionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(timeEvolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timeEvolutionPanelLayout.createSequentialGroup()
                        .addGroup(timeEvolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(timeEvolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(timeSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timeEvolutionPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(24, 24, 24)))
                .addContainerGap())
        );
        timeEvolutionPanelLayout.setVerticalGroup(
            timeEvolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timeEvolutionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(timeEvolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(xTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(timeEvolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(yTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Plotted Tracks"));

        jScrollPane1.setBorder(null);

        tracksList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tracksList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timeEvolutionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeEvolutionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.6;
        gridBagConstraints.weighty = 0.6;
        add(rightPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel graphicsParentPanel;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel shiftedParentPanel;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JPanel timeEvolutionPanel;
    private javax.swing.JSlider timeSlider;
    private javax.swing.JTable trackDataTable;
    private javax.swing.JList tracksList;
    private javax.swing.JPanel xTCoordinatesParentPanel;
    private javax.swing.JTextField xTextField;
    private javax.swing.JPanel yTCoordinatesParentPanel;
    private javax.swing.JTextField yTextField;
    // End of variables declaration//GEN-END:variables
}
