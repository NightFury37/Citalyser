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
import citalyser.model.PaperCollection;
import citalyser.ui.control.DisplayMaster;
import citalyser.ui.model.TableModelHandler;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.JournalTableDisplayPanel;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.PaperTableDisplayPanel;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.PaperTableFromMetricDisplayPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/**
 *
 * @author Tanmay Patil
 */
public class TableDisplayPanel extends javax.swing.JPanel {

    private static Logger logger = Logger.getLogger(TableDisplayPanel.class.getName());

    /** Creates new form TableDisplayPanel */
    public TableDisplayPanel() {
        initComponents();
    }

    public void setDisplayMaster(DisplayMaster displayMaster) {
        this.displayMaster = displayMaster;
        paperTableDisplayPanel.setDisplayMaster(displayMaster);
        journalTableDisplayPanel.setDisplayMaster(displayMaster);
        paperTableFromMetricDisplayPanel.setDisplayMaster(displayMaster);
    }

    public PaperTableDisplayPanel getPaperTableDisplayPanel() {
        return paperTableDisplayPanel;
    }

    public JournalTableDisplayPanel getJournalTableDisplayPanel() {
        return journalTableDisplayPanel;
    }

    public PaperTableFromMetricDisplayPanel getPaperTableFromMetricDisplayPanel() {
        return paperTableFromMetricDisplayPanel;
    }

    public void flipToPaperTableDisplayPanel() {
        ((CardLayout) jPanel1.getLayout()).first(jPanel1);
    }

    public void flipToPaperTableFromMetricDisplayPanel() {
        ((CardLayout) jPanel1.getLayout()).show(jPanel1, "paperTableFromMetricDisplayPanelCard");
    }

    public void flipToJournalTableDisplayPanel() {
        ((CardLayout) jPanel1.getLayout()).last(jPanel1);
    }

    public DisplayMaster getDisplayMaster() {
        return displayMaster;
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

        jPanel1 = new javax.swing.JPanel();
        paperTableDisplayPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.PaperTableDisplayPanel();
        paperTableFromMetricDisplayPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.PaperTableFromMetricDisplayPanel();
        journalTableDisplayPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.JournalTableDisplayPanel();

        jPanel1.setLayout(new java.awt.CardLayout());
        jPanel1.add(paperTableDisplayPanel, "paperTableDisplayPanelCard");
        jPanel1.add(paperTableFromMetricDisplayPanel, "paperTableFromMetricDisplayPanelCard");
        jPanel1.add(journalTableDisplayPanel, "journalTableDisplayPanelCard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.JournalTableDisplayPanel journalTableDisplayPanel;
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.PaperTableDisplayPanel paperTableDisplayPanel;
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.PaperTableFromMetricDisplayPanel paperTableFromMetricDisplayPanel;
    // End of variables declaration//GEN-END:variables

    public void clear() {
        paperTableDisplayPanel.clear();
        journalTableDisplayPanel.clear();
    }

    public void setJournalTable(ArrayList<Journal> arrayList) {
        journalTableDisplayPanel.setTable(arrayList, TableModelHandler.getTableModel(arrayList));
        flipToJournalTableDisplayPanel();
    }

    public void setTable(PaperCollection paperCollection) {
        paperTableDisplayPanel.setTable(paperCollection, TableModelHandler.getTableModel(paperCollection));
        flipToPaperTableDisplayPanel();
    }

    public void setTable(PaperCollection paperCollection, boolean b) {
        paperTableFromMetricDisplayPanel.setTable(paperCollection, TableModelHandler.getTableModel(paperCollection));
        flipToPaperTableFromMetricDisplayPanel();
    }
}
