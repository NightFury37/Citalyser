/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CentralContentDisplayPanel.java
 *
 * Created on Mar 17, 2013, 2:46:13 AM
 */
package citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel;

import citalyser.ui.control.DisplayMaster;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.GridDisplayPanel;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.ListDisplayPanel;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.ProfileDisplayPanel;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.TableDisplayPanel;

/**
 *
 * @author Tanmay Patil
 */
public class CentralContentDisplayPanel extends javax.swing.JPanel {

    /** Creates new form CentralContentDisplayPanel */
    public CentralContentDisplayPanel() {
        initComponents();
    }

    public void setDisplayMaster(DisplayMaster displayMaster) {
        this.displayMaster = displayMaster;
        gridDisplayPanel.setDisplayMaster(displayMaster);
        listDisplayPanel.setDisplayMaster(displayMaster);
        profileDisplayPanel.setDisplayMaster(displayMaster);
        tableDisplayPanel.setDisplayMaster(displayMaster);
    }

    public DisplayMaster getDisplayMaster() {
        return displayMaster;
    }

    public GridDisplayPanel getGridDisplayPanel() {
        return gridDisplayPanel;
    }

    public ListDisplayPanel getListDisplayPanel() {
        return listDisplayPanel;
    }

    public ProfileDisplayPanel getProfileDisplayPanel() {
        return profileDisplayPanel;
    }

    public TableDisplayPanel getTableDisplayPanel() {
        return tableDisplayPanel;
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

        gridDisplayPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.GridDisplayPanel();
        listDisplayPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.ListDisplayPanel();
        profileDisplayPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.ProfileDisplayPanel();
        tableDisplayPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.TableDisplayPanel();

        setLayout(new java.awt.CardLayout());
        add(gridDisplayPanel, "card2");

        javax.swing.GroupLayout listDisplayPanelLayout = new javax.swing.GroupLayout(listDisplayPanel);
        listDisplayPanel.setLayout(listDisplayPanelLayout);
        listDisplayPanelLayout.setHorizontalGroup(
            listDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        listDisplayPanelLayout.setVerticalGroup(
            listDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        add(listDisplayPanel, "card3");

        javax.swing.GroupLayout profileDisplayPanelLayout = new javax.swing.GroupLayout(profileDisplayPanel);
        profileDisplayPanel.setLayout(profileDisplayPanelLayout);
        profileDisplayPanelLayout.setHorizontalGroup(
            profileDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        profileDisplayPanelLayout.setVerticalGroup(
            profileDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        add(profileDisplayPanel, "card4");
        add(tableDisplayPanel, "card5");
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.GridDisplayPanel gridDisplayPanel;
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.ListDisplayPanel listDisplayPanel;
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.ProfileDisplayPanel profileDisplayPanel;
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.TableDisplayPanel tableDisplayPanel;
    // End of variables declaration//GEN-END:variables
}
