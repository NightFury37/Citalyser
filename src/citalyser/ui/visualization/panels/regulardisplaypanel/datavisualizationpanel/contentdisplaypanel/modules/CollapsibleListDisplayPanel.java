package citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules;

import citalyser.ui.control.DisplayMaster;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.listdisplaypanel.CollapsibleListEntityPanel;
import citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.listdisplaypanel.ListEntityPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.util.Vector;
import javax.swing.SwingConstants;
import javax.swing.plaf.DimensionUIResource;

/**
 *
 * @author kaushik
 */
public class CollapsibleListDisplayPanel extends javax.swing.JPanel {

    private int entityCount;

    /**
     * Creates new form CollapsibleListDisplayPanel
     */
    public CollapsibleListDisplayPanel() {
        entityCount = 0;
        collapsibleListEntityPanels = new Vector<>();
        initComponents();
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousButtonClicked(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonClicked(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moreButtonClicked(evt);
            }
        });
    }

    public void addListTitle(int number, String title) {
        jLabel1.setText("<html><b> [List:" + number + "] " + title);
        jLabel1.setBackground(Color.white);
        jLabel1.setOpaque(true);
        jLabel4.setText("<html> HI ");
    }

    public void hidePreviousButton() {
        jLabel2.setVisible(false);
    }

    public void hideNextButton() {
        jLabel3.setVisible(false);
    }

    public void showPreviousButton() {
        jLabel2.setVisible(true);
    }

    public void showNextButton() {
        jLabel3.setVisible(true);
    }

    public void previousButtonClicked(java.awt.event.MouseEvent evt) {
        displayMaster.citationListPrevious();
    }

    public void nextButtonClicked(java.awt.event.MouseEvent evt) {
        displayMaster.citationListNext();
    }

    public void moreButtonClicked(java.awt.event.MouseEvent evt) {
        displayMaster.displayStatusMessage("More Button Pressed");
        displayMaster.citationListMoreButtonClicked(entityCount, jLabel5);
    }

    public void addCollapsibleListEntityPanel(CollapsibleListEntityPanel collapsibleListEntityPanel) {
        collapsibleListEntityPanel.setDisplayMaster(displayMaster);
        collapsibleListEntityPanels.add(collapsibleListEntityPanel);
        //jPanel1.add(collapsibleListEntityPanel);
        // jXTaskPaneContainer.add(collapsibleListEntityPanel);
        jXTaskPaneContainer1.add(collapsibleListEntityPanel);
        jXTaskPaneContainer1.setMinimumSize(new DimensionUIResource(40, 1540));
        //entityCount++;
    }

    public Vector<CollapsibleListEntityPanel> getListEntityPanels() {
        return collapsibleListEntityPanels;
    }

    public void setDisplayMaster(DisplayMaster displayMaster) {
        this.displayMaster = displayMaster;
        for (CollapsibleListEntityPanel collapsiblelistEntityPanel : collapsibleListEntityPanels) {
            collapsiblelistEntityPanel.setDisplayMaster(displayMaster);
        }
    }

    public DisplayMaster getDisplayMaster() {
        return displayMaster;
    }
    private DisplayMaster displayMaster;
    private Vector<CollapsibleListEntityPanel> collapsibleListEntityPanels;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jXTaskPaneContainer1 = new org.jdesktop.swingx.JXTaskPaneContainer();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());
        jXTaskPaneContainer1.setBackground(new java.awt.Color(153, 153, 255));


        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Title");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)));

        jLabel2.setText(" < Previous ");
        jLabel2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText(" Next > ");
        jLabel3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        jLabel4.setText(" List ");
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);

        jPanel5.setLayout(new BorderLayout());
        jPanel5.add(jLabel2, BorderLayout.WEST);
        jPanel5.add(jLabel3, BorderLayout.EAST);
        jPanel5.add(jLabel4, BorderLayout.CENTER);

        /*
         javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
         jPanel5.setLayout(jPanel5Layout);
         jPanel5Layout.setHorizontalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel5Layout.createSequentialGroup()
         .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
         .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
         .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)));
         jPanel5Layout.setVerticalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
         .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
         */
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap()));

        add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setViewportView(jXTaskPaneContainer1);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("More");
        jLabel5.setPreferredSize(new DimensionUIResource((int) jLabel5.getPreferredSize().getWidth(), 20));
        jLabel5.setBackground(new Color(240, 240, 240));
        jLabel5.setOpaque(true);
        jLabel5.setCursor(new Cursor(Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE));

        //  add(jPanel3, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXTaskPaneContainer jXTaskPaneContainer1;
    // End of variables declaration//GEN-END:variables

    public void clear() {
        //jPanel1.removeAll();
        while (!collapsibleListEntityPanels.isEmpty()) {
            collapsibleListEntityPanels.remove(0);
        }
        jXTaskPaneContainer1.removeAll();
    }

    public void addMoreButton() {
        jXTaskPaneContainer1.add(jLabel5);
    }

    public void removeMoreButton() {
        jXTaskPaneContainer1.remove(jLabel5);
    }

    public void addEntityCount(int num) {
        entityCount = +num;
    }
    
    public void showLoadingMoreButton()
    {
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/citalyser/ui/visualization/resources/ajax-loader.gif")));
        jLabel5.setText("");
    }
    public void showNormalMoreButton()
    {
        jLabel5.setText("More");
        jLabel5.setIcon(null);
    }
}
