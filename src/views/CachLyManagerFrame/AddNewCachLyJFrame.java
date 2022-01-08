/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.CachLyManagerFrame;

import Bean.NhanKhauBean;
import controllers.CachLyManagerController.AddNewCachLyController;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import models.CachLyModel;


/**
 *
 * @author Bang
 */
public class AddNewCachLyJFrame extends javax.swing.JFrame {

    private JFrame parentFrame;
//    private DangKyTamTruController controller;
//    private TamTruModel tamTruModel;
    private CachLyModel cachLyModel;
    private NhanKhauBean nhanKhauBean;
    private AddNewCachLyController controller;
    /**
     * Creates new form DangKyTamTruJFrame
     */
    public AddNewCachLyJFrame() {
        initComponents();
    }

    public AddNewCachLyJFrame(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
//        this.controller = new DangKyTamTruController();
        this.cachLyModel=new CachLyModel();
        this.nhanKhauBean=new NhanKhauBean();
        this.controller=new AddNewCachLyController();
        cachLyModel.setHinhThucCachLy("Cách ly tập trung");
        cachLyModel.setMucDoCachLy("Chưa rõ");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("Thêm ca cách ly mới");
        this.parentFrame.setEnabled(false);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                close();
            }
            
        });
    }
    
    void close() {
        if (JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(null, "Are you sure to close?", "Warning!!", JOptionPane.YES_NO_OPTION)) {
            this.parentFrame.setEnabled(true);
            dispose();
        }
    }

    private boolean checkNhanKhauID(String id) {
        if (id.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập nhân khẩu ID", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            try {
                long temp = Long.parseLong(id);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng nhân khẩu ID!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        return true;
    }
    
    public void setDataNhanKhau(){
        jTextFieldTenNhanKhau.setText(nhanKhauBean.getNhanKhauModel().getHoTen());
        jTextFieldTenNhanKhau.setEditable(false);
        jTextFieldNhanKhauID.setText(String.valueOf(nhanKhauBean.getNhanKhauModel().getID()));
        jTextFieldNhanKhauID.setEditable(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldNhanKhauID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        selectBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNoiCachLy = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ngaybatdau = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaLyDo = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        acceptBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldTenNhanKhau = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldSoNgay = new javax.swing.JTextField();
        jComboBoxHinhThucCachLy = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxMucDo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldNguoiChamSoc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldNhanKhauID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNhanKhauID.setEnabled(false);
        jTextFieldNhanKhauID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNhanKhauIDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nhân khẩu ID:");

        selectBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        selectBtn.setText("Select");
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("(*)");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nơi cách ly");

        jTextFieldNoiCachLy.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNoiCachLy.setEnabled(true);
        jTextFieldNoiCachLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNoiCachLyActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("(*)");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("(*)");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Số ngày cách ly:");

        ngaybatdau.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Ngày bắt đầu:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("(*)");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("(*)");

        jTextAreaLyDo.setColumns(20);
        jTextAreaLyDo.setRows(5);
        jTextAreaLyDo.setEnabled(true);
        jScrollPane1.setViewportView(jTextAreaLyDo);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Lý do:");

        acceptBtn.setText("Xác nhận");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Hủy");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Tên nhân khẩu:");

        jTextFieldTenNhanKhau.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldTenNhanKhau.setEnabled(false);
        jTextFieldTenNhanKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTenNhanKhauActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Mức độ cách ly:");

        jTextFieldSoNgay.setText("14");
        jTextFieldSoNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSoNgayActionPerformed(evt);
            }
        });

        jComboBoxHinhThucCachLy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cách ly tập trung", "Cách ly tại nhà" }));
        jComboBoxHinhThucCachLy.setFont(new java.awt.Font("Arial", 0, 14));
        jComboBoxHinhThucCachLy.setBackground(Color.WHITE);
        jComboBoxHinhThucCachLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHinhThucCachLyActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Hình thức cách ly:");

        jComboBoxMucDo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chưa rõ", "F0", "F1", "F2" }));
        jComboBoxMucDo.setFont(new java.awt.Font("Arial", 0, 14));
        jComboBoxMucDo.setBackground(Color.WHITE);
        jComboBoxMucDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMucDoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("(*)");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("Người chăm sóc:");

        jTextFieldNguoiChamSoc.setFont(new java.awt.Font("Arial", 0, 14));
        jTextFieldNguoiChamSoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNguoiChamSocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(jLabel1)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldNoiCachLy, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(44, 44, 44))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextFieldNhanKhauID, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(selectBtn)
                                            .addGap(37, 37, 37))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(ngaybatdau, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                                                .addComponent(jTextFieldSoNgay, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jComboBoxMucDo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(29, 29, 29)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))))
                                    .addComponent(jTextFieldTenNhanKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel7)
                            .addComponent(jLabel15))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxHinhThucCachLy, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNguoiChamSoc))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel10)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNhanKhauID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTenNhanKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldNoiCachLy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ngaybatdau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldSoNgay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMucDo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxHinhThucCachLy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNguoiChamSoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptBtn)
                    .addComponent(cancelBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTenNhanKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTenNhanKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTenNhanKhauActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        close();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        if (validateForm()) {
            try {
                this.cachLyModel.setNhanKhauID(Integer.valueOf(jTextFieldNhanKhauID.getText()));
                this.cachLyModel.setNgayBatDauCachLy(ngaybatdau.getDate());
                this.cachLyModel.setLyDoCachLy(jTextAreaLyDo.getText());
                this.cachLyModel.setNoiCachLy(jTextFieldNoiCachLy.getText());
                this.cachLyModel.setNguoiChamSoc(jTextFieldNguoiChamSoc.getText());
                this.cachLyModel.setSoNgayCachLy(Integer.valueOf(jTextFieldSoNgay.getText()));
                
                if (this.controller.addNewCachLy(this.cachLyModel)) {
                    this.parentFrame.setEnabled(true);
                    dispose();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddNewCachLyJFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddNewCachLyJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng các trường bắt buộc!", "Warning!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_acceptBtnActionPerformed

    private void jTextFieldNoiCachLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNoiCachLyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNoiCachLyActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        ChoosePeopleCachLy choosePeopleCachLy = new ChoosePeopleCachLy(this.nhanKhauBean, this);
        choosePeopleCachLy.setResizable(false);
        choosePeopleCachLy.setLocationRelativeTo(null);
        choosePeopleCachLy.setVisible(true);
    }//GEN-LAST:event_selectBtnActionPerformed

    private void jTextFieldSoNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSoNgayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSoNgayActionPerformed

    private void jComboBoxHinhThucCachLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHinhThucCachLyActionPerformed
        // TODO add your handling code here:
        cachLyModel.setHinhThucCachLy((String)jComboBoxHinhThucCachLy.getSelectedItem());
    }//GEN-LAST:event_jComboBoxHinhThucCachLyActionPerformed

    private void jComboBoxMucDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMucDoActionPerformed
        cachLyModel.setMucDoCachLy((String)jComboBoxMucDo.getSelectedItem());
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMucDoActionPerformed

    private void jTextFieldNguoiChamSocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNguoiChamSocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNguoiChamSocActionPerformed

    private void jTextFieldNhanKhauIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNhanKhauIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNhanKhauIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<String> jComboBoxHinhThucCachLy;
    private javax.swing.JComboBox<String> jComboBoxMucDo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaLyDo;
    private javax.swing.JTextField jTextFieldNguoiChamSoc;
    private javax.swing.JTextField jTextFieldNhanKhauID;
    private javax.swing.JTextField jTextFieldNoiCachLy;
    private javax.swing.JTextField jTextFieldSoNgay;
    private javax.swing.JTextField jTextFieldTenNhanKhau;
    private com.toedter.calendar.JDateChooser ngaybatdau;
    private javax.swing.JButton selectBtn;
    // End of variables declaration//GEN-END:variables

    private boolean validateForm() {
        return (!jTextFieldNoiCachLy.getText().trim().isEmpty())
                && checkSoNgay()
                && checknhanKhauID()
                ;
    }
    
    private boolean checkSoNgay() {
    try {
        long l=Long.valueOf(jTextFieldSoNgay.getText());
        if(l<0)return false;
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
    private boolean checknhanKhauID() {
    try {
        long l=Long.valueOf(jTextFieldNhanKhauID.getText());
        if(l<0)return false;
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}   
}
