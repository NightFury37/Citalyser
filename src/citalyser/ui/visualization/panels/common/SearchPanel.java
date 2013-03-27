
package citalyser.ui.visualization.panels.common;

import citalyser.ui.control.DisplayMaster;
import java.util.Vector;

/**
 *
 * @author Tanmay Patil
 */
public class SearchPanel extends javax.swing.JPanel {

    /** Creates new form SearchPanel */
    public SearchPanel() {
        autoCompleteSuggestions = new Vector<>();
        initComponents();
        basicSearchPanel.setSearchPanel(this);
    }
    
    public String getMinYear() {
        return advancedSearchPanel.getMinYear();
    }

    public String getMaxYear() {
        return advancedSearchPanel.getMaxYear();
    }
    
    public void setMinYear(int minYear) {
        advancedSearchPanel.setMinYear(Integer.toString(minYear));
    }
    
    public void setMaxYear(int maxYear) {
        advancedSearchPanel.setMaxYear(Integer.toString(maxYear));
    }

    public void showAdvancedSearchPanel() {
        advancedSearchPanel.show();
    }

    public void hideAdvancedSearchPanel() {
        advancedSearchPanel.hide();
    }

    public void showComboBox(boolean value) {
        advancedSearchPanel.showComboBox(value);
    }

    public void showYearRangePanel(boolean value) {
        advancedSearchPanel.showYearRangePanel(value);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        basicSearchPanel = new citalyser.ui.visualization.panels.common.searchpanel.BasicSearchPanel();
        jPanel2 = new javax.swing.JPanel();
        advancedSearchPanel = new citalyser.ui.visualization.panels.common.searchpanel.AdvancedSearchPanel();
        jPanel3 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setLayout(new java.awt.GridBagLayout());

        jPanel4.setPreferredSize(new java.awt.Dimension(100, 5));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weighty = 1.0;
        add(jPanel4, gridBagConstraints);

        basicSearchPanel.setMinimumSize(new java.awt.Dimension(600, 31));
        basicSearchPanel.setPreferredSize(new java.awt.Dimension(600, 31));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        add(basicSearchPanel, gridBagConstraints);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));
        jPanel2.add(advancedSearchPanel);

        jPanel3.setPreferredSize(new java.awt.Dimension(129, 25));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        add(jPanel2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    public void setButtonEnabled(boolean value) {
        basicSearchPanel.setButtonEnabled(value);
    }    
    
    public void setDisplayMaster(DisplayMaster displayMaster) {
        this.displayMaster = displayMaster;
        basicSearchPanel.setDisplayMaster(displayMaster);
        advancedSearchPanel.setDisplayMaster(displayMaster);
    }

    public void requestSearchFieldFocus() {
        basicSearchPanel.requestSearchFieldFocus();
    }
    
    public void setSearchString(String searchString) {
        basicSearchPanel.setSearchString(searchString);
    }

    public String getSearchString() {
        return basicSearchPanel.getSearchString();
    }

    public Vector<String> getAutoCompleteSuggestions() {
        return autoCompleteSuggestions;
    }
    
    public void updateProgressBar(int value) {
        basicSearchPanel.updateProgressBar(value);
    }
    
    private boolean empty = true;
    private DisplayMaster displayMaster;
    private Vector<String> autoCompleteSuggestions;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private citalyser.ui.visualization.panels.common.searchpanel.AdvancedSearchPanel advancedSearchPanel;
    private citalyser.ui.visualization.panels.common.searchpanel.BasicSearchPanel basicSearchPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    public boolean isSortByYear() {
        return advancedSearchPanel.isSortByYear();
    }
}
