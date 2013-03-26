/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * YearRangePanel.java
 *
 * Created on Mar 26, 2013, 4:01:09 AM
 */
package citalyser.ui.visualization.panels.common.searchpanel.advancedsearchpanel;

import citalyser.ui.control.DisplayMaster;

/**
 *
 * @author Tanmay Patil
 */
public class YearRangePanel extends javax.swing.JPanel {

    /** Creates new form YearRangePanel */
    public YearRangePanel() {
        initComponents();
    }

    public void setDisplayMaster(DisplayMaster displayMaster) {
        this.displayMaster = displayMaster;
    }

    public String getMinYear() {
        return minYearTextField.getText();
    }

    public String getMaxYear() {
        return maxYearTextField.getText();
    }

    public void setMinYear(String minYear) {
        minYearTextField.setText(minYear);
    }

    public void setMaxYear(String maxYear) {
        maxYearTextField.setText(maxYear);
    }
    
    private DisplayMaster displayMaster;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minYearTextField = new javax.swing.JTextField();
        maxYearTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(59, 89, 152));

        minYearTextField.setColumns(4);
        minYearTextField.setMinimumSize(new java.awt.Dimension(6, 15));
        minYearTextField.setPreferredSize(new java.awt.Dimension(38, 15));

        maxYearTextField.setColumns(4);
        maxYearTextField.setMinimumSize(new java.awt.Dimension(6, 15));
        maxYearTextField.setPreferredSize(new java.awt.Dimension(38, 15));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Year Range");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maxYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(minYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(maxYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField maxYearTextField;
    private javax.swing.JTextField minYearTextField;
    // End of variables declaration//GEN-END:variables
}
