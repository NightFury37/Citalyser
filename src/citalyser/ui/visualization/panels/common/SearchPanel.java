
package citalyser.ui.visualization.panels.common;

import citalyser.ui.control.DisplayMaster;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

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
    
    public int getNumResults(){
        return Integer.parseInt(numResults.getText());
    }
    
    public String getMinYear(){
        String min_year="";
        try{
             min_year = min_year_box.getText();
        }
        catch(Exception e){
            min_year = "";
            //min_year_box.setText(Integer.toString(min_year));
            
        }
        
        return min_year;
    }

    public String getMaxYear(){
        String max_year;
        try{
            max_year = max_year_box.getText();
        }
        catch(Exception e){
            max_year = "";
            //max_year_box.setText(Integer.toString(max_year));
        }
        return max_year;
        
    }
    
    public void setMinYear(int val){
        String val_str="";
        try{
            val_str = Integer.toString(val);
            min_year_box.setText(val_str);
        }
        catch(Exception e){
            min_year_box.setText("");
            
        }
    }
    
    public void setMaxYear(int val){
         String val_str="";
        try{
            val_str = Integer.toString(val);
            max_year_box.setText(val_str);
        }
        catch(Exception e){
            max_year_box.setText("");
            
        }
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
        ButtonPanel = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        numResults = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        min_year_box = new javax.swing.JTextField();
        max_year_box = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        basicSearchPanel = new citalyser.ui.visualization.panels.common.searchpanel.BasicSearchPanel();

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

        ButtonPanel.setVisible(false);
        ButtonPanel.setPreferredSize(new java.awt.Dimension(1000, 25));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jPanel5.setPreferredSize(new java.awt.Dimension(105, 30));
        jPanel5.setLayout(new java.awt.CardLayout());

        jPanel6.setMinimumSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, "card3");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sort By Year", "Sort By Citations" }));
        jComboBox1.setSelectedIndex(1);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox1, "card2");

        numResults.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        numResults.setText("100");

        jLabel2.setText("Number of Results");

        min_year_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                min_year_boxActionPerformed(evt);
            }
        });

        jLabel1.setText("dated between");

        numResults.getDocument().addDocumentListener( new DocumentListener()
            {
                @Override
                public void changedUpdate(DocumentEvent e) { textChanged(e); }
                @Override
                public void insertUpdate(DocumentEvent e) { textChanged(e); }
                @Override
                public void removeUpdate(DocumentEvent e) { textChanged(e); }
                private void textChanged(DocumentEvent e)
                {
                    try {
                        displayMaster.setNumberOfResults(Integer.parseInt(numResults.getText()));
                        displayMaster.displayStatusMessage(" ");
                    } catch (NumberFormatException ex) {
                        displayMaster.setNumberOfResults(100);
                        displayMaster.displayStatusMessage("Please enter a valid integer");
                    }
                }
            } );

            javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
            ButtonPanel.setLayout(ButtonPanelLayout);
            ButtonPanelLayout.setHorizontalGroup(
                ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ButtonPanelLayout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(min_year_box, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(max_year_box, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(122, 122, 122)
                    .addComponent(jRadioButton1)
                    .addGap(126, 126, 126)
                    .addComponent(jRadioButton2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(numResults, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            );
            ButtonPanelLayout.setVerticalGroup(
                ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(ButtonPanelLayout.createSequentialGroup()
                    .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addGroup(ButtonPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                    .addComponent(numResults, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(jRadioButton2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(min_year_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(max_year_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addContainerGap())
            );

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
            gridBagConstraints.weighty = 1.0;
            add(ButtonPanel, gridBagConstraints);

            basicSearchPanel.setPreferredSize(new java.awt.Dimension(600, 31));
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            add(basicSearchPanel, gridBagConstraints);
        }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (jRadioButton1.isSelected()) {
            ((CardLayout) jPanel5.getLayout()).last(jPanel5);
        } else {
            ((CardLayout) jPanel5.getLayout()).first(jPanel5);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if (jRadioButton1.isSelected()) {
            ((CardLayout) jPanel5.getLayout()).last(jPanel5);
        } else {
            ((CardLayout) jPanel5.getLayout()).first(jPanel5);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void min_year_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min_year_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_min_year_boxActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    public boolean getComboSelection(){
        if(jComboBox1.getSelectedIndex() == 0) {
            return true;
            
        } else {
            return false;
        } 
    }

    public void setButtonEnabled(boolean value) {
        basicSearchPanel.setButtonEnabled(value);
    }    
    
    public void setDisplayMaster(DisplayMaster displayMaster) {
        this.displayMaster = displayMaster;
        basicSearchPanel.setDisplayMaster(displayMaster);
    }

    public void requestSearchFieldFocus() {
        basicSearchPanel.requestSearchFieldFocus();
    }
    
    public JRadioButton getRadioButton1(){
        return jRadioButton1;
    }
    
    public JRadioButton getRadioButton2(){
        return jRadioButton2;
    }
    
    public boolean getRadioButtonInfo(){
        return jRadioButton2.isSelected();
    }
    
    public JPanel getButtonPanel(){
        return ButtonPanel;
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
    private javax.swing.JPanel ButtonPanel;
    private citalyser.ui.visualization.panels.common.searchpanel.BasicSearchPanel basicSearchPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField max_year_box;
    private javax.swing.JTextField min_year_box;
    private javax.swing.JTextField numResults;
    // End of variables declaration//GEN-END:variables
}
