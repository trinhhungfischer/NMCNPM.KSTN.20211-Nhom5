/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.CachLyManagerPanelController;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import views.CachLyManagerFrame.AddNewCachLyJFrame;

/**
 *
 * @author Bang
 */
public class CachLyManagePanel extends javax.swing.JPanel {

    /**
     * Creates new form CachLyManagePanel
     */
    private String field="nhanKhauID";
    private Map<String,String> map;
    private CachLyManagerPanelController controller;
    private JFrame parentJFrame;
    public CachLyManagePanel(JFrame parentFrame) {
        map= new HashMap<String,String>();
        map.put("Nhân khẩu ID", "nhanKhauID");
        map.put("Ngày bắt đầu cách ly", "ngayBatDauCachLy");
        map.put("Tên nhân khẩu", "hoTen");
        map.put("Nơi cách ly", "noiCachLy");
        map.put("Mức độ cách ly", "mucDoCachLy");
        map.put( "Lý do cách ly", "lyDoCachLy");
        this.parentJFrame = parentFrame;
        initComponents();
        controller = new CachLyManagerPanelController(this.tablePanel,this.jtfsoLuong);
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

        jTextFieldValue = new javax.swing.JTextField();
        tablePanel = new javax.swing.JPanel();
        themMoiBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Ngay1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        Ngay2 = new com.toedter.calendar.JDateChooser();
        jtfsoLuong = new javax.swing.JTextField();
        thongKeBtn = new javax.swing.JButton();
        jComboBoxField = new javax.swing.JComboBox<>();
        timiBtn = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Ngay3 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        Ngay4 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jCheckBoxmucdo = new javax.swing.JCheckBox();
        jCheckBoxmucdo1 = new javax.swing.JCheckBox();
        jCheckBoxmucdo2 = new javax.swing.JCheckBox();
        jCheckBoxmucdo3 = new javax.swing.JCheckBox();
        jCheckBoxlydo = new javax.swing.JCheckBox();
        jCheckBoxlydo1 = new javax.swing.JCheckBox();
        jCheckBoxlydo2 = new javax.swing.JCheckBox();
        resetBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(855, 570));

        jTextFieldValue.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        themMoiBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        themMoiBtn.setText("Thêm mới");
        themMoiBtn.setPreferredSize(new java.awt.Dimension(95, 30));
        themMoiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themMoiBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Ngày bắt đầu:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Từ: ");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Số lượng");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Đến: ");

        jtfsoLuong.setEditable(false);
        jtfsoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfsoLuongActionPerformed(evt);
            }
        });

        thongKeBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        thongKeBtn.setText("Thống kê");
        thongKeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongKeBtnActionPerformed(evt);
            }
        });

        jComboBoxField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân khẩu ID", "Tên nhân khẩu", "Ngày bắt đầu cách ly", "Nơi cách ly", "Mức độ cách ly", "Lý do cách ly" }));
        jComboBoxField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFieldActionPerformed(evt);
            }
        });

        timiBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        timiBtn.setText("Tìm kiếm");
        timiBtn.setPreferredSize(new java.awt.Dimension(53, 30));
        timiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timiBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Ngày kết thúc:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Từ: ");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Đến: ");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Mức độ cách ly:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Lý do cách ly:");

        jCheckBoxmucdo.setText("Chưa rõ");
        jCheckBoxmucdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxmucdoActionPerformed(evt);
            }
        });

        jCheckBoxmucdo1.setText("F0");
        jCheckBoxmucdo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxmucdo1ActionPerformed(evt);
            }
        });

        jCheckBoxmucdo2.setText("F1");
        jCheckBoxmucdo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxmucdo2ActionPerformed(evt);
            }
        });

        jCheckBoxmucdo3.setText("F2");
        jCheckBoxmucdo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxmucdo3ActionPerformed(evt);
            }
        });

        jCheckBoxlydo.setText("Khác");
        jCheckBoxlydo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxlydoActionPerformed(evt);
            }
        });

        jCheckBoxlydo1.setText("Xét nghiệm dương tính");
        jCheckBoxlydo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxlydo1ActionPerformed(evt);
            }
        });

        jCheckBoxlydo2.setText("Tiếp xúc với F0,1,2");
        jCheckBoxlydo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxlydo2ActionPerformed(evt);
            }
        });

        resetBtn1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        resetBtn1.setText("Làm lại");
        resetBtn1.setPreferredSize(new java.awt.Dimension(65, 30));
        resetBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(themMoiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxlydo2)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxlydo1)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxlydo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ngay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ngay2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Ngay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBoxmucdo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCheckBoxmucdo1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBoxmucdo2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCheckBoxmucdo3))
                                    .addComponent(Ngay4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtfsoLuong, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(thongKeBtn)
                                .addGap(26, 26, 26)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxField)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(timiBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(themMoiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ngay1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Ngay2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Ngay3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Ngay4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBoxmucdo)
                                .addComponent(jCheckBoxmucdo2)
                                .addComponent(jCheckBoxmucdo3))
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxmucdo1))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBoxlydo)
                                .addComponent(jCheckBoxlydo1)
                                .addComponent(jCheckBoxlydo2))
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfsoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(thongKeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValueActionPerformed

    private void jtfsoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfsoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfsoLuongActionPerformed

    private void themMoiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themMoiBtnActionPerformed
        // TODO add your handling code here:
        AddNewCachLyJFrame addNewCachLyJFrame = new AddNewCachLyJFrame(this.parentJFrame);
        addNewCachLyJFrame.setLocationRelativeTo(null);
        addNewCachLyJFrame.setResizable(false);
        addNewCachLyJFrame.setVisible(true);
    }//GEN-LAST:event_themMoiBtnActionPerformed

    private void thongKeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongKeBtnActionPerformed
        // TODO add your handling code here:
        List<Boolean> listbool= new ArrayList<>();
        listbool.add(jCheckBox1.isSelected());
        listbool.add(jCheckBox2.isSelected());
        listbool.add(jCheckBox3.isSelected());
        listbool.add(jCheckBox4.isSelected());
        List<Date> listdate= new ArrayList<>();
        listdate.add(Ngay1.getDate());
        listdate.add(Ngay2.getDate());
        listdate.add(Ngay3.getDate());
        listdate.add(Ngay4.getDate());
        List<String> listmucdo= new ArrayList<>();
        if(jCheckBoxmucdo.isSelected())listmucdo.add(jCheckBoxmucdo.getText());
        if(jCheckBoxmucdo1.isSelected())listmucdo.add(jCheckBoxmucdo1.getText());
        if(jCheckBoxmucdo2.isSelected())listmucdo.add(jCheckBoxmucdo2.getText());
        if(jCheckBoxmucdo3.isSelected())listmucdo.add(jCheckBoxmucdo3.getText());
        List<String> listlydo= new ArrayList<>();
        if(jCheckBoxlydo.isSelected())listlydo.add(jCheckBoxlydo.getText());
        if(jCheckBoxlydo1.isSelected())listlydo.add(jCheckBoxlydo1.getText());
        if(jCheckBoxlydo2.isSelected())listlydo.add("Tiếp xúc với");
        controller.thongke(listbool, listdate, listmucdo, listlydo);
        
    }//GEN-LAST:event_thongKeBtnActionPerformed

    private void jComboBoxFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFieldActionPerformed
        // TODO add your handling code here:
        field=map.get((String)jComboBoxField.getSelectedItem());
        
    }//GEN-LAST:event_jComboBoxFieldActionPerformed

    private void timiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timiBtnActionPerformed
        // TODO add your handling code here:
        controller.timkiem(field, jTextFieldValue.getText());
        
    }//GEN-LAST:event_timiBtnActionPerformed

    private void jCheckBoxmucdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxmucdoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxmucdoActionPerformed

    private void jCheckBoxmucdo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxmucdo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxmucdo1ActionPerformed

    private void jCheckBoxmucdo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxmucdo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxmucdo2ActionPerformed

    private void jCheckBoxmucdo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxmucdo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxmucdo3ActionPerformed

    private void jCheckBoxlydoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxlydoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxlydoActionPerformed

    private void jCheckBoxlydo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxlydo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxlydo1ActionPerformed

    private void jCheckBoxlydo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxlydo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxlydo2ActionPerformed

    private void resetBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtn1ActionPerformed
        // TODO add your handling code here:
        controller.reset();
    }//GEN-LAST:event_resetBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Ngay1;
    private com.toedter.calendar.JDateChooser Ngay2;
    private com.toedter.calendar.JDateChooser Ngay3;
    private com.toedter.calendar.JDateChooser Ngay4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBoxlydo;
    private javax.swing.JCheckBox jCheckBoxlydo1;
    private javax.swing.JCheckBox jCheckBoxlydo2;
    private javax.swing.JCheckBox jCheckBoxmucdo;
    private javax.swing.JCheckBox jCheckBoxmucdo1;
    private javax.swing.JCheckBox jCheckBoxmucdo2;
    private javax.swing.JCheckBox jCheckBoxmucdo3;
    private javax.swing.JComboBox<String> jComboBoxField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldValue;
    private javax.swing.JTextField jtfsoLuong;
    private javax.swing.JButton resetBtn1;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JButton themMoiBtn;
    private javax.swing.JButton thongKeBtn;
    private javax.swing.JButton timiBtn;
    // End of variables declaration//GEN-END:variables
}
