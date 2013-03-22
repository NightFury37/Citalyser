/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * StatusDisplayPanel.java
 *
 * Created on Mar 17, 2013, 3:12:45 AM
 */
package citalyser.ui.visualization.panels.regulardisplaypanel;

import citalyser.ui.control.DisplayMaster;

/**
 *
 * @author Tanmay Patil
 */
public class StatusDisplayPanel extends javax.swing.JPanel {

    /** Creates new form StatusDisplayPanel */
    public StatusDisplayPanel() {
        initComponents();
    }

    public void setDisplayMaster(DisplayMaster displayMaster) {
        this.displayMaster = displayMaster;
    }

    public DisplayMaster getDisplayMaster() {
        return displayMaster;
    }

    public void displayStatus(String status) {
        System.out.println(status);
        jLabel2.setText("<html>" + status);
    }

    public void displayError(String error) {
        jLabel1.setText("<html>" + error);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        setLayout(new java.awt.GridLayout());

        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        add(jLabel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 5));
        add(jLabel2);
    }// </editor-fold>//GEN-END:initComponents

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        if (evt.getNewValue() instanceof javax.swing.JSplitPane) {
            removeAll();
            setLayout(new java.awt.GridLayout());
            add(jLabel1);

            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
            add(jLabel2);
        }
    }//GEN-LAST:event_formPropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
