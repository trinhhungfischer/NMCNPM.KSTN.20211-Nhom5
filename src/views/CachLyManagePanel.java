/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.CachLyPanelController;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class CachLyManagePanel extends javax.swing.JPanel {
    private JFrame parentFrame;
    private CachLyPanelController controller;

    public CachLyManagePanel(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
        controller = new CachLyPanelController(jtfSearch, tableJpn);
        controller.setParentJFrame(parentFrame);
    }
    
   // TODO: Ở đây thêm mới cách ly sẽ được gọi tới

// End of variables declaration          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableJpn = new javax.swing.JPanel();
        jtfSearch = new javax.swing.JTextField();
        themMoiBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(827, 544));

        javax.swing.GroupLayout tableJpnLayout = new javax.swing.GroupLayout(tableJpn);
        tableJpn.setLayout(tableJpnLayout);
        tableJpnLayout.setHorizontalGroup(
            tableJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        tableJpnLayout.setVerticalGroup(
            tableJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );

        jtfSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        themMoiBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        themMoiBtn.setText("Thêm mới");
        themMoiBtn.setToolTipText("");
        themMoiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themMoiBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tableJpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(themMoiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableJpn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(themMoiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void themMoiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themMoiBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_themMoiBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jtfSearch;
    private javax.swing.JPanel tableJpn;
    private javax.swing.JButton themMoiBtn;
    // End of variables declaration//GEN-END:variables
}
