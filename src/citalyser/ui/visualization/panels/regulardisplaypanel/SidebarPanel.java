/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SidebarPanel.java
 *
 * Created on Mar 27, 2013, 3:06:18 AM
 */
package citalyser.ui.visualization.panels.regulardisplaypanel;

import citalyser.model.PaperCollection;
import citalyser.ui.control.DisplayMaster;
import citalyser.ui.visualization.panels.regulardisplaypanel.sidebarpanel.AdvancedSearchPanel;
import citalyser.ui.visualization.panels.regulardisplaypanel.sidebarpanel.AuthorListPanel;
import java.awt.CardLayout;
import java.util.ArrayList;

/**
 *
 * @author Tanmay Patil
 */
public class SidebarPanel extends javax.swing.JPanel {

    /** Creates new form SidebarPanel */
    public SidebarPanel() {
        initComponents();
    }

    public AdvancedSearchPanel getAdvancedSearchPanel() {
        return advancedSearchPanel;
    }

    public AuthorListPanel getAuthorListPanel() {
        return authorListPanel;
    }

    public void setDisplayMaster(DisplayMaster displayMaster) {
        this.displayMaster = displayMaster;
        authorListPanel.setDisplayMaster(displayMaster);
        advancedSearchPanel.setDisplayMaster(displayMaster);
    }

    public void showArticleSearch(boolean value) {
        if (value) {
            advancedSearchPanel.show();
            jSplitPane1.setDividerLocation(278);
        } else {
            advancedSearchPanel.hide();
            jSplitPane1.setDividerLocation(23);
        }
    }

    public void showAuthorListPanel(boolean value) {
        if (value) {
            ((CardLayout) jPanel1.getLayout()).last(jPanel1);
        } else {
            ((CardLayout) jPanel1.getLayout()).first(jPanel1);
        }
    }

    public void displayAuthorList(ArrayList<String> strings, PaperCollection paperCollection) {
        authorListPanel.setPaperCollection(paperCollection);
        authorListPanel.setList(strings);
        showAuthorListPanel(true);
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

        jSplitPane1 = new javax.swing.JSplitPane();
        advancedSearchPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.sidebarpanel.AdvancedSearchPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        authorListPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.sidebarpanel.AuthorListPanel();

        setBackground(new java.awt.Color(-6710785,true));
        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerSize(0);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setOpaque(false);
        jSplitPane1.setTopComponent(advancedSearchPanel);

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, "card3");
        jPanel1.add(authorListPanel, "card2");

        jSplitPane1.setRightComponent(jPanel1);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private citalyser.ui.visualization.panels.regulardisplaypanel.sidebarpanel.AdvancedSearchPanel advancedSearchPanel;
    private citalyser.ui.visualization.panels.regulardisplaypanel.sidebarpanel.AuthorListPanel authorListPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
 
    public void clearAll() {
        authorListPanel.clear();
        showArticleSearch(false);
        showAuthorListPanel(false);
        displayMaster.clearCitationHistory();
        System.gc();
    }
}
