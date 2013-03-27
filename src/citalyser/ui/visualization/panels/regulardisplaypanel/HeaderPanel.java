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

        jPanel4 = new javax.swing.JPanel();
        modeSelector = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        sourceSelector = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        searchPanel = new citalyser.ui.visualization.panels.common.SearchPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        settingsButton = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(270, 111));
        jPanel4.setMinimumSize(new java.awt.Dimension(270, 111));
        jPanel4.setPreferredSize(new java.awt.Dimension(270, 111));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
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

        add(jPanel4);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150)));
        jPanel7.setLayout(new java.awt.BorderLayout());

        sourceSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/2nd_toggle buttons_2a.png"))); // NOI18N
        sourceSelector.setBorder(null);
        sourceSelector.setBorderPainted(false);
        sourceSelector.setContentAreaFilled(false);
        sourceSelector.setFocusPainted(false);
        sourceSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceSelectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sourceSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sourceSelector, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.add(jPanel2, java.awt.BorderLayout.WEST);

        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(searchPanel, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel9.setMaximumSize(new java.awt.Dimension(20, 20));
        jPanel9.setMinimumSize(new java.awt.Dimension(20, 20));
        jPanel9.setPreferredSize(new java.awt.Dimension(50, 111));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setMaximumSize(new java.awt.Dimension(35, 35));
        jButton1.setOpaque(true);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 2);
        jPanel9.add(jButton1, gridBagConstraints);

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setMaximumSize(new java.awt.Dimension(35, 35));
        jButton2.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 11, 2);
        jPanel9.add(jButton2, gridBagConstraints);

        jPanel3.add(jPanel9, java.awt.BorderLayout.WEST);

        jPanel8.setPreferredSize(new java.awt.Dimension(111, 109));

        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/settingButton.png"))); // NOI18N
        settingsButton.setBorder(null);
        settingsButton.setBorderPainted(false);
        settingsButton.setContentAreaFilled(false);
        settingsButton.setFocusPainted(false);
        settingsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel3, java.awt.BorderLayout.EAST);

        add(jPanel7);
    }// </editor-fold>//GEN-END:initComponents

    private void modeSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeSelectorActionPerformed
        if (authorSearchMode) {
            modeSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/toggle button_2.png")));
            if (metric) {
                sourceSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/2nd_toggle buttons_1a.png")));
            } else {
                sourceSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/2nd_toggle buttons_1b.png")));
            }
            this.searchPanel.showAdvancedSearchPanel();
            authorSearchMode = false;
        } else {
            modeSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/toggle button_1.png")));
            
            if (metric) {
                sourceSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/2nd_toggle buttons_2a.png")));
            } else {
                sourceSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/2nd_toggle buttons_2b.png")));
            }
            this.searchPanel.showAdvancedSearchPanel();
            authorSearchMode = true;
        }
    }//GEN-LAST:event_modeSelectorActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        displayMaster.settingsButtonPressed();
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void sourceSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceSelectorActionPerformed
        if (authorSearchMode) {
            if (metric) {
                sourceSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/2nd_toggle buttons_2b.png")));
                metric = false;
            } else {
                sourceSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/2nd_toggle buttons_2a.png")));
                metric = true;
            }
        } else {
            if (metric) {
                sourceSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/2nd_toggle buttons_1b.png")));
                metric = false;
            } else {
                sourceSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/2nd_toggle buttons_1a.png")));
                metric = true;
            }
        }
        searchPanel.showComboBox(!metric);
        searchPanel.showYearRangePanel(!metric);
    }//GEN-LAST:event_sourceSelectorActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        displayMaster.showHistoryPanel();
    }//GEN-LAST:event_jButton1MouseClicked

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
            if (metric) {
                sourceSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/2nd_toggle buttons_2a.png")));
            } else {
                sourceSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/2nd_toggle buttons_2b.png")));
            }
            this.searchPanel.showAdvancedSearchPanel();
            authorSearchMode = false;
        } else {
            modeSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/toggle button_2.png")));
            if (metric) {
                sourceSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/2nd_toggle buttons_1a.png")));
            } else {
                sourceSelector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/2nd_toggle buttons_1b.png")));
            }
            this.searchPanel.showAdvancedSearchPanel();
            authorSearchMode = true;
        }
    }

    public void setMetric(boolean metric) {
        this.metric = metric;
    }

    public boolean isMetric() {
        return metric;
    }

    public boolean isAuthorSearchMode() {
        return authorSearchMode;
    }
            
    private DisplayMaster displayMaster;
    private boolean metric = true;
    private boolean authorSearchMode = true;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton modeSelector;
    private citalyser.ui.visualization.panels.common.SearchPanel searchPanel;
    private javax.swing.JButton settingsButton;
    private javax.swing.JButton sourceSelector;
    // End of variables declaration//GEN-END:variables
}
