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
import citalyser.model.query.Query;
import citalyser.ui.control.DisplayMaster;
import citalyser.ui.model.TableModelHandler;
import citalyser.ui.utils.UiUtils;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.JournalTableDisplayPanel;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.AuthorPaperTableDisplayPanel;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.PaperTableFromMetricDisplayPanel;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.TableDisplayPanelInterface;
import java.awt.CardLayout;
import java.awt.Point;
import java.awt.PopupMenu;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import org.apache.log4j.Logger;

/**
 *
 * @author Tanmay Patil
 */
public class TableDisplayPanel extends javax.swing.JPanel {

    private static Logger logger = Logger.getLogger(TableDisplayPanel.class.getName());
    private Point point;

    /** Creates new form TableDisplayPanel */
    public TableDisplayPanel() {
        initComponents();
    }

    public void setDisplayMaster(DisplayMaster displayMaster) {
        this.displayMaster = displayMaster;
        authorPaperTableDisplayPanel.setDisplayMaster(displayMaster);
        journalTableDisplayPanel.setDisplayMaster(displayMaster);
        paperTableFromMetricDisplayPanel.setDisplayMaster(displayMaster);
    }

    public AuthorPaperTableDisplayPanel getPaperTableDisplayPanel() {
        return authorPaperTableDisplayPanel;
    }

    public JournalTableDisplayPanel getJournalTableDisplayPanel() {
        return journalTableDisplayPanel;
    }

    public PaperTableFromMetricDisplayPanel getPaperTableFromMetricDisplayPanel() {
        return paperTableFromMetricDisplayPanel;
    }

    public void flipToAuthorPaperTableDisplayPanel() {
        ((CardLayout) jPanel1.getLayout()).first(jPanel1);
    }

    public void flipToJournalPaperTableDisplayPanel() {
        ((CardLayout) jPanel1.getLayout()).show(jPanel1, "journalPaperTableDisplayPanelCard");
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

    public JPopupMenu getTableRightClickedPopupMenu() {
        return tableRightClickedPopupMenu;
    }

    public void setSelectedPaper(TableDisplayPanelInterface tableDisplayPanelInterface, Paper selectedPaper) {
        this.tableDisplayPanelInterface = tableDisplayPanelInterface;
        this.isPaperClicked = true;
        this.selectedPaper = selectedPaper;
    }

    public void setSelactedJournal(Journal selactedJournal) {
        this.isPaperClicked = false;
        this.selactedJournal = selactedJournal;
    }
    
    private boolean isPaperClicked;
    TableDisplayPanelInterface tableDisplayPanelInterface;
    private Journal selactedJournal;
    private Paper selectedPaper;
    private DisplayMaster displayMaster;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableRightClickedPopupMenu = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        authorPaperTableDisplayPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.AuthorPaperTableDisplayPanel();
        journalPaperTableDisplayPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.JournalPaperTableDisplayPanel();
        paperTableFromMetricDisplayPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.PaperTableFromMetricDisplayPanel();
        journalTableDisplayPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.JournalTableDisplayPanel();

        jMenuItem1.setText("View Citations");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        tableRightClickedPopupMenu.add(jMenuItem1);

        jMenuItem2.setText("Open In Browser");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        tableRightClickedPopupMenu.add(jMenuItem2);

        jPanel1.setLayout(new java.awt.CardLayout());
        jPanel1.add(authorPaperTableDisplayPanel, "authorPaperTableDisplayPanelCard");
        jPanel1.add(journalPaperTableDisplayPanel, "journalPaperTableDisplayPanelCard");
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

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (isPaperClicked) {
            UiUtils.openInBrowser(selectedPaper.getUrl());
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        tableDisplayPanelInterface.callLeftClickedEvent(point);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.AuthorPaperTableDisplayPanel authorPaperTableDisplayPanel;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.JournalPaperTableDisplayPanel journalPaperTableDisplayPanel;
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.JournalTableDisplayPanel journalTableDisplayPanel;
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.tabledisplaypanel.PaperTableFromMetricDisplayPanel paperTableFromMetricDisplayPanel;
    private javax.swing.JPopupMenu tableRightClickedPopupMenu;
    // End of variables declaration//GEN-END:variables

    public void clear() {
        authorPaperTableDisplayPanel.clear();
        journalTableDisplayPanel.clear();
        journalPaperTableDisplayPanel.clear();  
        paperTableFromMetricDisplayPanel.clear();
    }

    public void setJournalTable(ArrayList<Journal> arrayList) {
        journalTableDisplayPanel.setTable(arrayList, TableModelHandler.getTableModel(arrayList));
        flipToJournalTableDisplayPanel();
    }

    public void setTable(Query query,PaperCollection paperCollection) {
        authorPaperTableDisplayPanel.setTable(query,paperCollection, TableModelHandler.getTableModel(paperCollection));
        flipToAuthorPaperTableDisplayPanel();
    }

    public void setTable(Query q,PaperCollection paperCollection, boolean b) {
        paperTableFromMetricDisplayPanel.setTable(q,paperCollection, TableModelHandler.getTableModel(paperCollection));
        flipToPaperTableFromMetricDisplayPanel();
    }

    public void setPopUpLocation(Point point) {
        this.point = point;
    }

}
