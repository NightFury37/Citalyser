/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citalyser.ui.visualization.panels.regulardisplaypanel.sidebarpanel;

import citalyser.model.PaperCollection;
import citalyser.ui.control.DisplayMaster;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author kaushik
 */
public class AuthorListPanel extends javax.swing.JPanel {

    /**
     * Creates new form AuthorListPanel
     */
    public AuthorListPanel() {
        initComponents();
    }
    
    public void setList(ArrayList<String>authors){
        
        
        int i=0;
        DefaultListModel list = new DefaultListModel();
        for(i=0;i<authors.size();i++){
            JCheckBox jCheckBox = new JCheckBox();
            jCheckBox.setText(authors.get(i));
            jCheckBox.setSelected(true);
            jCheckBox.setPreferredSize(new Dimension(100, 20));
            jCheckBox.setBackground(new Color(255, 255, 255, 128));
            jCheckBox.setBorder(new LineBorder(new Color(0, 0, 0, 0), 2));
            list.add(i, jCheckBox);
            //list.addElement(authors.get(i));          

        }
        jList1.setModel(list);
    }


    public void setDisplayMaster(DisplayMaster displayMaster) {
        this.displayMaster = displayMaster;
    }
    
    private DisplayMaster displayMaster;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<javax.swing.JCheckBox>();

        setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(null);

        jList1.setBackground(new java.awt.Color(157, 157, 255));
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.setCellRenderer(new citalyser.ui.visualization.panels.regulardisplaypanel.sidebarpanel.authorlistpanel.AuthorListCellRenderer());
        jScrollPane1.setViewportView(jList1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if (jList1.getModel().getElementAt(jList1.locationToIndex(evt.getPoint())).isSelected()) {
            jList1.getModel().getElementAt(jList1.locationToIndex(evt.getPoint())).setSelected(false);
        } else {
            jList1.getModel().getElementAt(jList1.locationToIndex(evt.getPoint())).setSelected(true);
        }
    }//GEN-LAST:event_jList1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<javax.swing.JCheckBox> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void displayAuthors(PaperCollection paperCollection) {
        setList(paperCollection.extractAuthors());
    }

    public void clear() {
    //    jList1.removeAll();
    }
}
