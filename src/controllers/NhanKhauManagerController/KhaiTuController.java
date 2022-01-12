package controllers.NhanKhauManagerController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import javax.swing.JOptionPane;
import models.KhaiTuModel;
import services.MysqlConnection;

/**
 *
 * @author Hai
 */
public class KhaiTuController {
    public int checkCMT(String cmt) {
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT * FROM nhan_khau LEFT JOIN chung_minh_thu ON nhan_khau.ID = chung_minh_thu.idNhanKhau WHERE soCMT = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, cmt);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return rs.getInt("ID");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra! vui lòng kiểm tra lại.", "Warning!!", JOptionPane.WARNING_MESSAGE);
        }
        return -1;
    }
    
    public boolean addNew(KhaiTuModel khaiTuModel) {
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "INSERT INTO khai_tu(soGiayKhaiTu, idNguoiKhai, idNguoiChet, ngayKhai, ngayChet, lyDoChet) VALUE (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setInt(1, tamTruModel.getIdNhanKhau());
//            preparedStatement.setString(2, tamTruModel.getMaGiayTamTru());
//            preparedStatement.setString(3, tamTruModel.getSoDienThoaiNguoiDangKy());
//            Date tuNgay = new Date(tamTruModel.getTuNgay().getTime());
//            preparedStatement.setDate(4, tuNgay);
//            Date denNgay = new Date(tamTruModel.getDenNgay().getTime());
//            preparedStatement.setDate(5, denNgay);
//            preparedStatement.setString(6, tamTruModel.getLyDo());
            preparedStatement.setString(1, khaiTuModel.getSoGiayKhaiTu());
            preparedStatement.setInt(2, khaiTuModel.getIdNguoiKhai());
            preparedStatement.setInt(3, khaiTuModel.getIdNguoiChet());
            Date ngayKhai = new Date(khaiTuModel.getNgayKhai().getTime());
            preparedStatement.setDate(4, ngayKhai);
            Date ngayChet = new Date(khaiTuModel.getNgayChet().getTime());
            preparedStatement.setDate(5, ngayChet);
            preparedStatement.setString(6, khaiTuModel.getLyDoChet().trim());
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra! vui lòng kiểm tra lại.", "Warning!!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
}
