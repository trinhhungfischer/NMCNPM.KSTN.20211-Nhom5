/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.SucKhoeManagerPanelController;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.StringJoiner;
import javax.swing.JFrame;
import services.StringService;
import views.SucKhoeManagerFrame.ThemMoiSucKhoeFrame;

/**
 *
 * @author Hoang
 */
public class SucKhoeManagePanel extends javax.swing.JPanel {

    /**
     * Creates new form SucKhoeManagePanel
     */
    private SucKhoeManagerPanelController controller = null;
    private JFrame parentJFrame;
    public SucKhoeManagePanel(JFrame parentFrame) {
        this.parentJFrame = parentFrame;
        initComponents();
        controller = new SucKhoeManagerPanelController(this.tablePanel, this.jtfSearch, this.jtfsoLuong, this.fieldCBB);
        controller.setParentJFrame(this.parentJFrame);
        controller.setDataTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfSearch = new javax.swing.JTextField();
        tablePanel = new javax.swing.JPanel();
        themMoiBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tuNgayJDC = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        denNgayJDC = new com.toedter.calendar.JDateChooser();
        jtfsoLuong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        trieuChungCBB = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        binhThuongCB = new javax.swing.JCheckBox();
        hoCB = new javax.swing.JCheckBox();
        sotCB = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jtfKhac = new javax.swing.JTextField();
        thongKeBtn = new javax.swing.JButton();
        fieldCBB = new javax.swing.JComboBox<>();
        resetBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        timeCB = new javax.swing.JCheckBox();
        trieuChungCB = new javax.swing.JCheckBox();
        tinhTrangCB = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(855, 570));

        jtfSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfSearch.setPreferredSize(new java.awt.Dimension(258, 30));
        jtfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSearchActionPerformed(evt);
            }
        });

        tablePanel.setPreferredSize(new java.awt.Dimension(817, 330));
        tablePanel.setRequestFocusEnabled(false);
        tablePanel.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );

        themMoiBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        themMoiBtn.setText("Thêm mới");
        themMoiBtn.setMaximumSize(new java.awt.Dimension(89, 30));
        themMoiBtn.setPreferredSize(new java.awt.Dimension(89, 30));
        themMoiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themMoiBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Thời gian ");
        jLabel1.setPreferredSize(new java.awt.Dimension(64, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Từ: ");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Số lượng");

        tuNgayJDC.setPreferredSize(new java.awt.Dimension(124, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Đến: ");
        jLabel3.setPreferredSize(new java.awt.Dimension(34, 30));

        denNgayJDC.setPreferredSize(new java.awt.Dimension(124, 30));

        jtfsoLuong.setEditable(false);
        jtfsoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfsoLuongActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Triệu chứng");
        jLabel4.setPreferredSize(new java.awt.Dimension(77, 30));

        trieuChungCBB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        trieuChungCBB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toàn bộ", "Không", "Có" }));
        trieuChungCBB.setToolTipText("");
        trieuChungCBB.setPreferredSize(new java.awt.Dimension(82, 30));
        trieuChungCBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trieuChungCBBActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Tình trạng");
        jLabel5.setPreferredSize(new java.awt.Dimension(65, 30));

        binhThuongCB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        binhThuongCB.setText("Bình thường");
        binhThuongCB.setPreferredSize(new java.awt.Dimension(103, 30));

        hoCB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        hoCB.setText("Ho");
        hoCB.setPreferredSize(new java.awt.Dimension(43, 30));
        hoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoCBActionPerformed(evt);
            }
        });

        sotCB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sotCB.setText("Sốt");
        sotCB.setPreferredSize(new java.awt.Dimension(47, 30));
        sotCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sotCBActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Khác");

        jtfKhac.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfKhac.setPreferredSize(new java.awt.Dimension(400, 23));
        jtfKhac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfKhacActionPerformed(evt);
            }
        });

        thongKeBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        thongKeBtn.setText("Thống kê");
        thongKeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongKeBtnActionPerformed(evt);
            }
        });

        fieldCBB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fieldCBB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Họ tên", "Số CCCD" }));
        fieldCBB.setPreferredSize(new java.awt.Dimension(90, 30));

        resetBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        resetBtn.setText("Làm lại");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Tìm kiếm");

        timeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeCBActionPerformed(evt);
            }
        });

        trieuChungCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trieuChungCBActionPerformed(evt);
            }
        });

        tinhTrangCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinhTrangCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(timeCB)
                            .addComponent(trieuChungCB)
                            .addComponent(tinhTrangCB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfKhac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(trieuChungCBB, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(binhThuongCB, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(tuNgayJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(denNgayJDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sotCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(thongKeBtn)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jtfsoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldCBB, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(28, 28, 28)
                                .addComponent(resetBtn)
                                .addGap(106, 106, 106)
                                .addComponent(themMoiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(themMoiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fieldCBB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(timeCB)
                                .addGap(10, 10, 10)))
                        .addComponent(jtfsoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(thongKeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addComponent(tuNgayJDC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(denNgayJDC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(trieuChungCB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(tinhTrangCB))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                    .addComponent(trieuChungCBB, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(binhThuongCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sotCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtfKhac, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSearchActionPerformed

    private void trieuChungCBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trieuChungCBBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trieuChungCBBActionPerformed

    private void jtfsoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfsoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfsoLuongActionPerformed

    private void themMoiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themMoiBtnActionPerformed
        // TODO add your handling code here:
        ThemMoiSucKhoeFrame themMoiSucKhoeFrame = new ThemMoiSucKhoeFrame(this.parentJFrame, this);
        themMoiSucKhoeFrame.setLocationRelativeTo(null);
        themMoiSucKhoeFrame.setResizable(false);
        themMoiSucKhoeFrame.setVisible(true);
    }//GEN-LAST:event_themMoiBtnActionPerformed

    private void hoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoCBActionPerformed

    private void sotCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sotCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sotCBActionPerformed

    private void jtfKhacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfKhacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfKhacActionPerformed

    private void thongKeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongKeBtnActionPerformed
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tuNgay = dateFormat.format(tuNgayJDC.getDate());
        String denNgay = dateFormat.format(denNgayJDC.getDate());
        StringJoiner tinhTrangSucKhoe = new StringJoiner(", ");
        if(binhThuongCB.isSelected()){
            tinhTrangSucKhoe.add(binhThuongCB.getText());
        }
        if(hoCB.isSelected()){
            tinhTrangSucKhoe.add(hoCB.getText());
        }
        if(sotCB.isSelected()){
            tinhTrangSucKhoe.add(sotCB.getText());
        }
        if(!jtfKhac.getText().trim().isEmpty()){
            tinhTrangSucKhoe.add(jtfKhac.getText().trim());
        }
        String tinhTrang = tinhTrangSucKhoe.toString();
        String trieuChungcb = (String)trieuChungCBB.getSelectedItem();
        String trieuChung = StringService.covertToString(trieuChungcb);
        if(!timeCB.isSelected()){
            tuNgay = null;
            denNgay = null;
        }
        if(!trieuChungCB.isSelected()){
            trieuChung = null;
        }
        if(!tinhTrangCB.isSelected()) {
            tinhTrang = null;
        }
        controller.statistic(tuNgay, denNgay, trieuChung, tinhTrang);
    }//GEN-LAST:event_thongKeBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        controller.reset();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void timeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeCBActionPerformed

    private void trieuChungCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trieuChungCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trieuChungCBActionPerformed

    private void tinhTrangCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinhTrangCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tinhTrangCBActionPerformed

    public SucKhoeManagerPanelController getController() {
        return controller;
    }

    public void setController(SucKhoeManagerPanelController controller) {
        this.controller = controller;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox binhThuongCB;
    private com.toedter.calendar.JDateChooser denNgayJDC;
    private javax.swing.JComboBox<String> fieldCBB;
    private javax.swing.JCheckBox hoCB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jtfKhac;
    private javax.swing.JTextField jtfSearch;
    private javax.swing.JTextField jtfsoLuong;
    private javax.swing.JButton resetBtn;
    private javax.swing.JCheckBox sotCB;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JButton themMoiBtn;
    private javax.swing.JButton thongKeBtn;
    private javax.swing.JCheckBox timeCB;
    private javax.swing.JCheckBox tinhTrangCB;
    private javax.swing.JCheckBox trieuChungCB;
    private javax.swing.JComboBox<String> trieuChungCBB;
    private com.toedter.calendar.JDateChooser tuNgayJDC;
    // End of variables declaration//GEN-END:variables
}
