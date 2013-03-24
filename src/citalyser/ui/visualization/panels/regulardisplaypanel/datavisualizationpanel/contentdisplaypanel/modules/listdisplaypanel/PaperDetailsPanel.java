/*****************************************************************
 * @author Abhishek Choudhary
 * @Email-id : abhishek@codeblues.in
 *****************************************************************/

package citalyser.ui.visualization.panels.regulardisplaypanel.datavisualizationpanel.contentdisplaypanel.modules.listdisplaypanel;

import citalyser.model.Paper;
import citalyser.ui.control.DisplayMaster;
import java.awt.Cursor;
import org.apache.log4j.Logger;

public class PaperDetailsPanel extends javax.swing.JPanel {
    
    static Logger logger = Logger.getLogger(PaperDetailsPanel.class);
    /**
     * Creates new form PaperDetailsPanel
     */
    private DisplayMaster displayMaster;
    private Paper paper;
    public PaperDetailsPanel(Paper p) {
        this.paper = p;
        initComponents();
        this.viewCitationsLbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.viewCitationsLbl.setText("<html><a>View Citations</a></html>");
        this.viewCitationsLbl.setVisible(false);
    }
    
    public void render()
    {
        this.paperTitleLbl.setText("<html>"+paper.getTitle()+"</html>");
        this.paperinfolbl.setText("<html>"+paper.getInfo()+"<html>");
        if(paper.getAbstract() != null)
            this.paperAbstractLbl.setText("<html>"+paper.getAbstract()+"<html>");
        this.paperCitedByLbl.setText("Cited By : " + paper.getNumCites());
        logger.debug("Citations : " + paper.getNumCites());
        if(paper.getNumCites() > 0)
        {
            this.viewCitationsLbl.setVisible(true);
        }
    }
    public void setDisplayMaster(DisplayMaster displayMaster)
    {
        this.displayMaster = displayMaster;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paperTitleLbl = new org.jdesktop.swingx.JXLabel();
        paperinfolbl = new org.jdesktop.swingx.JXLabel();
        paperAbstractLbl = new org.jdesktop.swingx.JXLabel();
        paperCitedByLbl = new org.jdesktop.swingx.JXLabel();
        viewCitationsLbl = new org.jdesktop.swingx.JXLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        paperTitleLbl.setForeground(new java.awt.Color(0, 0, 204));
        paperTitleLbl.setText("jXLabel1");

        paperinfolbl.setForeground(new java.awt.Color(51, 153, 0));
        paperinfolbl.setText("jXLabel1");
        paperinfolbl.setToolTipText("");
        paperinfolbl.setFont(new java.awt.Font("DejaVu Sans", 0, 9)); // NOI18N

        paperAbstractLbl.setText("jXLabel1");
        paperAbstractLbl.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N

        paperCitedByLbl.setText("jXLabel1");
        paperCitedByLbl.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N

        viewCitationsLbl.setForeground(new java.awt.Color(51, 0, 255));
        viewCitationsLbl.setText("View Citations");
        viewCitationsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewCitationsLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paperAbstractLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paperinfolbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paperTitleLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paperCitedByLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(viewCitationsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(paperTitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(paperinfolbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paperAbstractLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paperCitedByLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewCitationsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewCitationsLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCitationsLblMouseClicked
        displayMaster.citationListClicked(paper);
    }//GEN-LAST:event_viewCitationsLblMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXLabel paperAbstractLbl;
    private org.jdesktop.swingx.JXLabel paperCitedByLbl;
    private org.jdesktop.swingx.JXLabel paperTitleLbl;
    private org.jdesktop.swingx.JXLabel paperinfolbl;
    private org.jdesktop.swingx.JXLabel viewCitationsLbl;
    // End of variables declaration//GEN-END:variables
}
