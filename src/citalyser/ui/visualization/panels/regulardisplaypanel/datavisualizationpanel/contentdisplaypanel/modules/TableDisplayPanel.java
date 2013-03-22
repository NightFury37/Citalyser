/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TableDisplayPanel.java
 *
 * Created on Mar 15, 2013, 1:44:48 AM
 */
package citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules;

import citalyser.model.Journal;
import citalyser.model.Paper;
import citalyser.model.PaperCollection;
import citalyser.ui.control.DisplayMaster;
import citalyser.util.CommonUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Tanmay Patil
 */
public class TableDisplayPanel extends javax.swing.JPanel {

    /** Creates new form TableDisplayPanel */
    public TableDisplayPanel() {
        initComponents();        
    }

    public void setDisplayMaster(DisplayMaster displayMaster) {
        this.displayMaster = displayMaster;
    }

    public DisplayMaster getDisplayMaster() {
        return displayMaster;
    }
    
    public void setTable(PaperCollection paperCollection, TableModel tm)
    {
        
        tableModel=tm;

        this.paperCollection = paperCollection;
        jTable1.setModel(tm);
        jTable1.repaint();
        displayMaster.renderJournal(displayMaster.getMainFrame().getRegularDisplayPanel().getDataVisualizationPanel().getContentDisplayPanel().getDetailsDisplayPanel().getUpperDetailsDisplayPanel(), this.paperCollection);
    }
    
    public void setJournalMetricsTable(ArrayList<Journal> journal,TableModel tm){
        tableModel=tm;
        jTable1.setModel(tm);
        jTable1.repaint();
        journals=journal;
    }
    
    private DisplayMaster displayMaster;
    private PaperCollection paperCollection;
    private ArrayList<Journal> journals;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setRowSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jButton1.setText("Export To CSV");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        JFileChooser chooser=new JFileChooser();
        chooser.showSaveDialog(this);
        //System.out.println("chooser:"+chooser.getSelectedFile().getName());
        try{
            File results=chooser.getSelectedFile();
            CommonUtils.exportToCsv(tableModel, results);
        }catch(NullPointerException npe){
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
              displayMaster.tableClicked(paperCollection.getPapers().get(jTable1.rowAtPoint(evt.getPoint())));
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private TableModel tableModel;

    public void clear() {
        while (jTable1.getModel().getRowCount() > 0) {
            ((DefaultTableModel) jTable1.getModel()).removeRow(0);
        }
        tableModel = jTable1.getModel();
    }
}
