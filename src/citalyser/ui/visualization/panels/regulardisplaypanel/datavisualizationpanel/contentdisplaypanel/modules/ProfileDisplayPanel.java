/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules;

import citalyser.model.Author;
import citalyser.ui.control.DisplayMaster;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.profiledisplaypanel.AuthorProfileDisplayPanel;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.profiledisplaypanel.JournalProfileDisplayPanel;

/**
 *
 * @author kaushik
 */
public class ProfileDisplayPanel extends javax.swing.JPanel {

    private Author author;
    /**
     * Creates new form ProfileDisplayPanel
     */
    public ProfileDisplayPanel() {
        initComponents();
    }

    public void setDisplayMaster(DisplayMaster displayMaster) {
        this.displayMaster = displayMaster;
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
        this.author=author;
        authorProfileDisplayPanel.setAuthorName(author.getName());
        authorProfileDisplayPanel.setAuthorDetails(author.getUniversity());
        authorProfileDisplayPanel.setAuthorStats(author.getCitesPerYear(),author.getCitesPerPaper());
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

        authorProfileDisplayPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.profiledisplaypanel.AuthorProfileDisplayPanel();
        journalProfileDisplayPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.profiledisplaypanel.JournalProfileDisplayPanel();

        setLayout(new java.awt.CardLayout());
        add(authorProfileDisplayPanel, "card2");
        add(journalProfileDisplayPanel, "card3");
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.profiledisplaypanel.AuthorProfileDisplayPanel authorProfileDisplayPanel;
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.profiledisplaypanel.JournalProfileDisplayPanel journalProfileDisplayPanel;
    // End of variables declaration//GEN-END:variables
}
