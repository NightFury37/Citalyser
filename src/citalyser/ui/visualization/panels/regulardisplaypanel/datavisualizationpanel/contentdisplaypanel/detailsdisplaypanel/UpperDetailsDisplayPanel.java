/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpperDetailsDisplayPanel.java
 *
 * Created on Mar 17, 2013, 2:21:32 AM
 */
package citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.detailsdisplaypanel;

import citalyser.ui.control.DisplayMaster;
import citalyser.ui.model.ContentRenderer;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.GridDisplayPanel;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.ListDisplayPanel;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.ProfileDisplayPanel;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.TableDisplayPanel;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.CollapsibleListDisplayPanel;
import java.awt.BorderLayout;
import java.awt.Component;

/**
 *
 * @author Tanmay Patil
 */
public class UpperDetailsDisplayPanel extends javax.swing.JPanel implements ContentRenderer {

    /** Creates new form UpperDetailsDisplayPanel */
    public UpperDetailsDisplayPanel() {
        initComponents();
    }

    public void setDisplayMaster(DisplayMaster displayMaster) {
        this.displayMaster = displayMaster;
        gridDisplayPanel.setDisplayMaster(displayMaster);
        listDisplayPanel.setDisplayMaster(displayMaster);
        profileDisplayPanel.setDisplayMaster(displayMaster);
        tableDisplayPanel.setDisplayMaster(displayMaster);
        collapsibleListDisplayPanel.setDisplayMaster(displayMaster);
    }

    @Override
    public GridDisplayPanel getGridDisplayPanel() {
        return gridDisplayPanel;
    }

    @Override
    public ListDisplayPanel getListDisplayPanel() {
        return listDisplayPanel;
    }

    @Override
    public ProfileDisplayPanel getProfileDisplayPanel() {
        return profileDisplayPanel;
    }

    @Override
    public TableDisplayPanel getTableDisplayPanel() {
        return tableDisplayPanel;
    }
    
    @Override
    public CollapsibleListDisplayPanel getCollapsibleListDisplayPanel() {
        return collapsibleListDisplayPanel;
    }

    @Override
    public void flipToCollapsibleListDisplayPanel() {
        ((java.awt.CardLayout) this.getLayout()).show(this, "collapsibleListDisplayPanelCard");
    }
    
    @Override
    public void flipToGridDisplayPanel() {
        ((java.awt.CardLayout) this.getLayout()).first(this);
    }
    
    @Override
    public void flipToListDisplayPanel() {
        ((java.awt.CardLayout) this.getLayout()).show(this, "listDisplayPanelCard");
    }
    
    @Override
    public void flipToProfileDisplayPanel() {
        ((java.awt.CardLayout) this.getLayout()).show(this, "profileDisplayPanelCard");
    }
    
    @Override
    public void flipToTableDisplayPanel() {
        ((java.awt.CardLayout) this.getLayout()).last(this);
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
        collapsibleListDisplayPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.CollapsibleListDisplayPanel();
        loadingDisplayPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.LoadingDisplayPanel();
        messageDisplayPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.MessageDisplayPanel();
        tableDisplayPanel = new citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.TableDisplayPanel();

        setLayout(new java.awt.CardLayout());
        add(gridDisplayPanel, "gridDisplayPanelCard");

        javax.swing.GroupLayout listDisplayPanelLayout = new javax.swing.GroupLayout(listDisplayPanel);
        listDisplayPanel.setLayout(listDisplayPanelLayout);
        listDisplayPanelLayout.setHorizontalGroup(
            listDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        listDisplayPanelLayout.setVerticalGroup(
            listDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        add(listDisplayPanel, "listDisplayPanelCard");
        add(profileDisplayPanel, "profileDisplayPanelCard");
        add(collapsibleListDisplayPanel, "collapsibleListDisplayPanelCard");

        javax.swing.GroupLayout loadingDisplayPanelLayout = new javax.swing.GroupLayout(loadingDisplayPanel);
        loadingDisplayPanel.setLayout(loadingDisplayPanelLayout);
        loadingDisplayPanelLayout.setHorizontalGroup(
            loadingDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        loadingDisplayPanelLayout.setVerticalGroup(
            loadingDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        add(loadingDisplayPanel, "loadingDisplayPanelCard");

        javax.swing.GroupLayout messageDisplayPanelLayout = new javax.swing.GroupLayout(messageDisplayPanel);
        messageDisplayPanel.setLayout(messageDisplayPanelLayout);
        messageDisplayPanelLayout.setHorizontalGroup(
            messageDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        messageDisplayPanelLayout.setVerticalGroup(
            messageDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        add(messageDisplayPanel, "messageDisplayPanelCard");
        add(tableDisplayPanel, "tableDisplayPanelCard");
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.CollapsibleListDisplayPanel collapsibleListDisplayPanel;
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.GridDisplayPanel gridDisplayPanel;
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.ListDisplayPanel listDisplayPanel;
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.LoadingDisplayPanel loadingDisplayPanel;
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.MessageDisplayPanel messageDisplayPanel;
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.ProfileDisplayPanel profileDisplayPanel;
    private citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.TableDisplayPanel tableDisplayPanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void showLoading() {
        ((java.awt.CardLayout) this.getLayout()).show(this, "loadingDisplayPanelCard");
        loadingDisplayPanel.reload();
    }
   
    @Override
    public void stopLoading() {
        loadingDisplayPanel.stopLoading();
    }
    @Override
    public void clearAll() {
        gridDisplayPanel.clear();
        tableDisplayPanel.clear();
        listDisplayPanel.clear();
        collapsibleListDisplayPanel.clear();
        profileDisplayPanel.clear();
    }

    @Override
    public void displayMessage(String message) {
        ((java.awt.CardLayout) this.getLayout()).show(this, "messageDisplayPanelCard");
        messageDisplayPanel.setMessage(message);
    }
}
