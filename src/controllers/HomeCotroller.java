package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import services.MysqlConnection;

/**
 *
 * @author Hai
 */
public class HomeCotroller {
    private JLabel tongNhanKhauLb;
    private JLabel tongHoKhauLb;
    private JLabel nhanKhauTamTruLb;
    private JLabel nhanKhauTamVangLb;

    public HomeCotroller(JLabel tongNhanKhauLb, JLabel tongHoKhau, JLabel nhanKhauTamTruLb, JLabel nhanKhauTamVangLb) {
        this.tongNhanKhauLb = tongNhanKhauLb;
        this.tongHoKhauLb = tongHoKhau;
        this.nhanKhauTamTruLb = nhanKhauTamTruLb;
        this.nhanKhauTamVangLb = nhanKhauTamVangLb;
    }
    
    public void setData() {
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
//            String query = "SELECT COUNT(*) AS tong FROM nhan_khau";
            String query = "SELECT COUNT(*) tong FROM nhan_khau WHERE nhan_khau.ngayChuyenDi is null and nhan_khau.ID not in (SELECT khai_tu.idNguoiChet ID from khai_tu)" 
                     + "and nhan_khau.ID not in (SELECT tam_vang.idNhanKhau ID FROM tam_vang WHERE tam_vang.denNgay > CURRENT_DATE) "
                    + "and nhan_khau.ID not in (SELECT tam_tru.idNhanKhau ID FROM tam_tru WHERE tam_tru.denNgay < CURRENT_DATE)";
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                this.tongNhanKhauLb.setText(String.valueOf(rs.getInt("tong")));
            }
            preparedStatement.close();
            
//            query = "SELECT COUNT(*) AS tong FROM ho_khau WHERE ";
            query = "SELECT COUNT(*) as tong FROM ho_khau WHERE ho_khau.ngayChuyenDi is null";
            preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            rs = preparedStatement.executeQuery();
            while (rs.next()){
                this.tongHoKhauLb.setText(String.valueOf(rs.getInt("tong")));
            }
            preparedStatement.close();
            
            query = "SELECT COUNT(*) AS tong FROM tam_tru WHERE denNgay < NOW()";
            preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            rs = preparedStatement.executeQuery();
            while (rs.next()){
                this.nhanKhauTamTruLb.setText(String.valueOf(rs.getInt("tong")));
            }
            preparedStatement.close();
            
            query = "SELECT COUNT(*) AS tong FROM tam_vang WHERE denNgay < NOW()";
            preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            rs = preparedStatement.executeQuery();
            while (rs.next()){
                this.nhanKhauTamVangLb.setText(String.valueOf(rs.getInt("tong")));
            }
            preparedStatement.close();
            
            connection.close();
        } catch (Exception e) {
        }
    }

    public JLabel getTongNhanKhauLb() {
        return tongNhanKhauLb;
    }

    public void setTongNhanKhauLb(JLabel tongNhanKhauLb) {
        this.tongNhanKhauLb = tongNhanKhauLb;
    }

    public JLabel getTongHoKhauLb() {
        return tongHoKhauLb;
    }

    public void setTongHoKhau(JLabel tongHoKhauLb) {
        this.tongHoKhauLb = tongHoKhauLb;
    }

    public JLabel getNhanKhauTamTruLb() {
        return nhanKhauTamTruLb;
    }

    public void setNhanKhauTamTruLb(JLabel nhanKhauTamTruLb) {
        this.nhanKhauTamTruLb = nhanKhauTamTruLb;
    }

    public JLabel getNhanKhauTamVangLb() {
        return nhanKhauTamVangLb;
    }

    public void setNhanKhauTamVangLb(JLabel nhanKhauTamVangLb) {
        this.nhanKhauTamVangLb = nhanKhauTamVangLb;
    }
    
    
}
