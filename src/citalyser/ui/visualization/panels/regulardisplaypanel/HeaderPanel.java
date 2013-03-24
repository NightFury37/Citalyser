/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HeaderPanel.java
 *
 * Created on Mar 9, 2013, 3:14:13 AM
 */
package citalyser.ui.visualization.panels.regulardisplaypanel;

import citalyser.ui.control.DisplayMaster;
import citalyser.ui.visualization.panels.common.SearchPanel;

/**
 *
 * @author Tanmay Patil
 */
public class HeaderPanel extends javax.swing.JPanel {

    /** Creates new form HeaderPanel */
    public HeaderPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        settingsButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        searchPanel = new citalyser.ui.visualization.panels.common.SearchPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        modeSelector = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/settingButton.png"))); // NOI18N
        settingsButton.setBorderPainted(false);
        settingsButton.setContentAreaFilled(false);
        settingsButton.setFocusPainted(false);
        settingsButton.setFocusable(false);
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(0, 53));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jPanel2, gridBagConstraints);
        jPanel1.add(searchPanel, new java.awt.GridBagConstraints());

        jPanel3.setPreferredSize(new java.awt.Dimension(0, 53));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jPanel3, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        modeSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/toggle button_1.png"))); // NOI18N
        modeSelector.setBorder(null);
        modeSelector.setBorderPainted(false);
        modeSelector.setContentAreaFilled(false);
        modeSelector.setFocusPainted(false);
        modeSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeSelectorActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(modeSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modeSelector, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void modeSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeSelectorActionPerformed
        // TODO add your handling code here:
        if (authorSearchMode) {
            modeSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/toggle button_2.png")));
            this.searchPanel.getRadioButton1().setText("Google Scholar");
            this.searchPanel.getRadioButton2().setText("Google Metrics");
            authorSearchMode = false;
        } else {
            modeSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/toggle button_1.png")));
            this.searchPanel.getRadioButton1().setText("Author Papers");
            this.searchPanel.getRadioButton2().setText("Author List");
            authorSearchMode = true;
        }
    }//GEN-LAST:event_modeSelectorActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        displayMaster.settingsButtonPressed();
    }//GEN-LAST:event_settingsButtonActionPerformed

    public SearchPanel getSearchPanel() {
        return searchPanel;
    }    
    
    public void setDisplayMaster(DisplayMaster displayMaster) {
        this.displayMaster = displayMaster;
        this.searchPanel.setDisplayMaster(displayMaster);
    }

    public void setAuthorSearchMode(boolean authorSearchMode) {
        this.authorSearchMode = authorSearchMode;
        if (authorSearchMode) {
            modeSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/toggle button_1.png")));
            this.searchPanel.getRadioButton1().setText("Author Papers");
            this.searchPanel.getRadioButton2().setText("Author List");
            this.searchPanel.getButtonPanel().setVisible(true);
            
            authorSearchMode = false;
        } else {
            modeSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/toggle button_2.png")));
            this.searchPanel.getRadioButton1().setText("Google Scholar");
            this.searchPanel.getRadioButton2().setText("Google Metrics");
            this.searchPanel.getButtonPanel().setVisible(true);
            authorSearchMode = true;
        }
    }

    public boolean isAuthorSearchMode() {
        return authorSearchMode;
    }
            
    private DisplayMaster displayMaster;
    private boolean authorSearchMode = true;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton modeSelector;
    private citalyser.ui.visualization.panels.common.SearchPanel searchPanel;
    private javax.swing.JButton settingsButton;
    // End of variables declaration//GEN-END:variables
}
