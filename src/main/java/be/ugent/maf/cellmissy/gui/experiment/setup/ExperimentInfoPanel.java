/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ExperimentInfoPanel.java
 *
 * Created on Mar 29, 2012, 9:15:54 AM
 */
package be.ugent.maf.cellmissy.gui.experiment.setup;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Paola
 */
public class ExperimentInfoPanel extends javax.swing.JPanel {

    /**
     * Creates new form ExperimentInfoPanel
     */
    public ExperimentInfoPanel() {
        initComponents();
    }

    public JDateChooser getDateChooser() {
        return dateChooser;
    }

    public JTextField getNumberTextField() {
        return numberTextField;
    }

    public JTextArea getPurposeTextArea() {
        return purposeTextArea;
    }

    public JComboBox getInstrumentComboBox() {
        return instrumentComboBox;
    }

    public JComboBox getMagnificationComboBox() {
        return magnificationComboBox;
    }

    public JLabel getInfoLabel1() {
        return infoLabel1;
    }

    public JTextArea getProjectDescriptionTextArea() {
        return projectDescriptionTextArea;
    }

    public JLabel getInfoLabel() {
        return infoLabel;
    }

    public JRadioButton getCellMiaRadioButton() {
        return cellMiaRadioButton;
    }

    public JRadioButton getGenericRadioButton() {
        return genericRadioButton;
    }

    public JButton getNewProjectButton() {
        return newProjectButton;
    }

    public JList getExperimentsList() {
        return experimentsList;
    }

    public JList getProjectsList() {
        return projectsList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        overviewPanel = new javax.swing.JPanel();
        infoLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        projectDescriptionTextArea = new javax.swing.JTextArea();
        newProjectButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectsList = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        experimentsList = new javax.swing.JList();
        experimentDataPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        purposeTextArea = new javax.swing.JTextArea();
        numberLabel = new javax.swing.JLabel();
        numberTextField = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        infoLabel = new javax.swing.JLabel();
        microscopeDataPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        magnificationComboBox = new javax.swing.JComboBox();
        instrumentComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        imageAnalysisDataPanel = new javax.swing.JPanel();
        imageAnalysisLabel = new javax.swing.JLabel();
        cellMiaRadioButton = new javax.swing.JRadioButton();
        genericRadioButton = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(20, 20));
        setPreferredSize(new java.awt.Dimension(900, 800));

        overviewPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Overview"));
        overviewPanel.setMinimumSize(new java.awt.Dimension(40, 40));
        overviewPanel.setOpaque(false);
        overviewPanel.setPreferredSize(new java.awt.Dimension(40, 40));

        infoLabel1.setText("Click on a project to see the relative experiments and their status.");

        jScrollPane4.setBorder(null);

        projectDescriptionTextArea.setEditable(false);
        projectDescriptionTextArea.setColumns(20);
        projectDescriptionTextArea.setRows(5);
        projectDescriptionTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Project Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        projectDescriptionTextArea.setFocusable(false);
        jScrollPane4.setViewportView(projectDescriptionTextArea);

        newProjectButton.setText("New Project...");

        jLabel6.setText("If you want to create a new project, click the \"new project\" button.");

        jScrollPane1.setBorder(null);

        projectsList.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Projects", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        projectsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(projectsList);

        jScrollPane3.setBorder(null);

        experimentsList.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Experiments (status)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        experimentsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(experimentsList);

        javax.swing.GroupLayout overviewPanelLayout = new javax.swing.GroupLayout(overviewPanel);
        overviewPanel.setLayout(overviewPanelLayout);
        overviewPanelLayout.setHorizontalGroup(
            overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overviewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addGroup(overviewPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(newProjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(overviewPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );

        overviewPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, infoLabel1, jLabel6);

        overviewPanelLayout.setVerticalGroup(
            overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overviewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(infoLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(newProjectButton)
                .addContainerGap())
        );

        experimentDataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Experiment Data"));
        experimentDataPanel.setOpaque(false);
        experimentDataPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        jScrollPane2.setBorder(null);

        purposeTextArea.setColumns(20);
        purposeTextArea.setRows(5);
        purposeTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Insert Experiment Purpose:*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jScrollPane2.setViewportView(purposeTextArea);

        numberLabel.setText("Number*");

        dateLabel.setText("Date*");

        infoLabel.setText("Enter a significant experiment purpose (e.g.2D-3D comparison - ROCK inhibitor)");

        javax.swing.GroupLayout experimentDataPanelLayout = new javax.swing.GroupLayout(experimentDataPanel);
        experimentDataPanel.setLayout(experimentDataPanelLayout);
        experimentDataPanelLayout.setHorizontalGroup(
            experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(experimentDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(experimentDataPanelLayout.createSequentialGroup()
                        .addGroup(experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateLabel)
                            .addComponent(numberLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(experimentDataPanelLayout.createSequentialGroup()
                                .addComponent(numberTextField)
                                .addGap(17, 17, 17))
                            .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(217, 217, 217))
                    .addGroup(experimentDataPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );

        experimentDataPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, dateLabel, numberLabel);

        experimentDataPanelLayout.setVerticalGroup(
            experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(experimentDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberLabel)
                    .addComponent(numberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(experimentDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateLabel)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infoLabel)
                .addContainerGap())
        );

        microscopeDataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Microscope Data"));
        microscopeDataPanel.setMinimumSize(new java.awt.Dimension(20, 20));
        microscopeDataPanel.setOpaque(false);
        microscopeDataPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        jLabel2.setText("Select Magnification");

        jLabel1.setText("Select Instrument");

        javax.swing.GroupLayout microscopeDataPanelLayout = new javax.swing.GroupLayout(microscopeDataPanel);
        microscopeDataPanel.setLayout(microscopeDataPanelLayout);
        microscopeDataPanelLayout.setHorizontalGroup(
            microscopeDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(microscopeDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(microscopeDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(microscopeDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instrumentComboBox, 0, 317, Short.MAX_VALUE)
                    .addComponent(magnificationComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        microscopeDataPanelLayout.setVerticalGroup(
            microscopeDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, microscopeDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(microscopeDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(instrumentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(microscopeDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(magnificationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        imageAnalysisDataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Image Analysis Data"));
        imageAnalysisDataPanel.setOpaque(false);

        imageAnalysisLabel.setText("You will analyze your images with");

        cellMiaRadioButton.setText("CELLMIA");
        cellMiaRadioButton.setContentAreaFilled(false);

        genericRadioButton.setText("another image software");
        genericRadioButton.setContentAreaFilled(false);

        javax.swing.GroupLayout imageAnalysisDataPanelLayout = new javax.swing.GroupLayout(imageAnalysisDataPanel);
        imageAnalysisDataPanel.setLayout(imageAnalysisDataPanelLayout);
        imageAnalysisDataPanelLayout.setHorizontalGroup(
            imageAnalysisDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imageAnalysisDataPanelLayout.createSequentialGroup()
                .addComponent(imageAnalysisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(imageAnalysisDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genericRadioButton)
                    .addComponent(cellMiaRadioButton))
                .addGap(0, 144, Short.MAX_VALUE))
        );
        imageAnalysisDataPanelLayout.setVerticalGroup(
            imageAnalysisDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imageAnalysisDataPanelLayout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(imageAnalysisDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imageAnalysisLabel)
                    .addComponent(cellMiaRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(genericRadioButton))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(overviewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(experimentDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(microscopeDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageAnalysisDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, experimentDataPanel, imageAnalysisDataPanel, microscopeDataPanel);

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(experimentDataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addComponent(microscopeDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imageAnalysisDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(overviewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE))
                .addGap(4, 4, 4))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton cellMiaRadioButton;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JPanel experimentDataPanel;
    private javax.swing.JList experimentsList;
    private javax.swing.JRadioButton genericRadioButton;
    private javax.swing.JPanel imageAnalysisDataPanel;
    private javax.swing.JLabel imageAnalysisLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel infoLabel1;
    private javax.swing.JComboBox instrumentComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox magnificationComboBox;
    private javax.swing.JPanel microscopeDataPanel;
    private javax.swing.JButton newProjectButton;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JTextField numberTextField;
    private javax.swing.JPanel overviewPanel;
    private javax.swing.JTextArea projectDescriptionTextArea;
    private javax.swing.JList projectsList;
    private javax.swing.JTextArea purposeTextArea;
    // End of variables declaration//GEN-END:variables
}
