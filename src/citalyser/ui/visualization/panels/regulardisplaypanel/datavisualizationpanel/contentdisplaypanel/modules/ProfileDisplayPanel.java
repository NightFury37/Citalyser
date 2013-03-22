/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules;

import citalyser.model.Author;
import citalyser.model.Journal;
import citalyser.model.PaperCollection;
import citalyser.ui.control.DisplayMaster;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.profiledisplaypanel.AuthorProfileDisplayPanel;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.profiledisplaypanel.JournalProfileDisplayPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author kaushik
 */
public class ProfileDisplayPanel extends javax.swing.JPanel {
    private static Logger logger = Logger.getLogger(ProfileDisplayPanel.class.getName());

    /**
     * Creates new form ProfileDisplayPanel
     */
    public ProfileDisplayPanel() {
        initComponents();
    }

    public void setDisplayMaster(DisplayMaster displayMaster) {
        this.displayMaster = displayMaster;
        authorProfileDisplayPanel.setDisplayMaster(displayMaster);
        journalProfileDisplayPanel.setDisplayMaster(displayMaster);
    }

    public DisplayMaster getDisplayMaster() {
        return displayMaster;
    }
      public JournalProfileDisplayPanel getJournalProfileDisplayPanel() {
        return journalProfileDisplayPanel;
    }

    public AuthorProfileDisplayPanel getAuthorProfileDisplayPanel() {
        return authorProfileDisplayPanel;
    }

    public void displayAuthorProfile(Author author) {
        authorProfileDisplayPanel.displayAuthor(author);
        ((java.awt.CardLayout) jPanel1.getLayout()).first(jPanel1);
    }

    public void displayJournalProfile(PaperCollection papercollection) {
        journalProfileDisplayPanel.displayJournal(papercollection);
        ((java.awt.CardLayout) jPanel1.getLayout()).last(jPanel1);
    }

    
    private DisplayMaster displayMaster;

 private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        logger.error(evt.getPropertyName() + ", " + evt.getNewValue() + ", " + evt.getSource());
    }//GEN-LAST:event_formPropertyChange

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        authorProfileDisplayPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.profiledisplaypanel.AuthorProfileDisplayPanel();
        journalProfileDisplayPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.profiledisplaypanel.JournalProfileDisplayPanel();

        jPanel1.setLayout(new java.awt.CardLayout());
        jPanel1.add(authorProfileDisplayPanel, "card2");
        jPanel1.add(journalProfileDisplayPanel, "card3");

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.profiledisplaypanel.AuthorProfileDisplayPanel authorProfileDisplayPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.profiledisplaypanel.JournalProfileDisplayPanel journalProfileDisplayPanel;
    // End of variables declaration//GEN-END:variables

    public void clear() {
        authorProfileDisplayPanel.clear();
        journalProfileDisplayPanel.clear();
    }
}
