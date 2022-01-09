package services;

import Bean.XetNghiemBean;
import controllers.LoginController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.XetNghiemModel;

public class XetNghiemService {
    // them moi nguoi xet nghiem
    public boolean addNew(XetNghiemBean xetNghiemBean) throws ClassNotFoundException, SQLException{
        Connection connection = MysqlConnection.getMysqlConnection();
        String query = "INSERT INTO xet_nghiem(xetNghiemID, nhanKhauID, ngayXetNghiem, noiXetNghiem, hinhThucXetNghiem, ketQuaXetNghiem)" 
                    + " values (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1, xetNghiemBean.getXetNghiemModel().getXetNghiemID());
        preparedStatement.setInt(2, xetNghiemBean.getXetNghiemModel().getNhanKhauID());
        preparedStatement.setString(3, xetNghiemBean.getXetNghiemModel().getNgayXetNghiem().toString());
        preparedStatement.setString(4, xetNghiemBean.getXetNghiemModel().getNoiXetNghiem());
        preparedStatement.setString(5, xetNghiemBean.getXetNghiemModel().getHinhThucXetNghiem());
        preparedStatement.setString(6, xetNghiemBean.getXetNghiemModel().getKetQuaXetNghiem());

        preparedStatement.executeUpdate();
        
        preparedStatement.close();
        connection.close();
        return true;
    }
    
     
    // lay ra 10 nguoi xet nghiem
    public List<XetNghiemBean> getListXetNghiem() {
        List<XetNghiemBean> list = new ArrayList<>();
        
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT * FROM xet_nghiem INNER JOIN nhan_khau ON xet_nghiem.nhanKhauID = nhan_khau.ID  LIMIT 0, 10";
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                XetNghiemBean temp = new XetNghiemBean();
                XetNghiemModel xetNghiemModel = temp.getXetNghiemModel();
                xetNghiemModel.setXetNghiemID(rs.getInt("xetNghiemID"));
                xetNghiemModel.setNhanKhauID(rs.getInt("nhanKhauID"));
                xetNghiemModel.setNgayXetNghiem(rs.getDate("ngayXetNghiem"));
                xetNghiemModel.setNoiXetNghiem(rs.getString("noiXetNghiem"));
                xetNghiemModel.setHinhThucXetNghiem(rs.getString("hinhthucXetNghiem"));
                xetNghiemModel.setKetQuaXetNghiem(rs.getString("ketquaXetNghiem"));
                
                list.add(temp);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    // tim kiem 
    public List<XetNghiemBean> search(String key) {
        List<XetNghiemBean> list = new ArrayList<>();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT * "
                        + "FROM xet_nghiem "
                        + "WHERE MATCH(nhanKhauID) AGAINST ('"
                        + key
                        + "' IN NATURAL LANGUAGE MODE);";
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                XetNghiemBean temp = new XetNghiemBean();
                XetNghiemModel xetNghiemModel = temp.getXetNghiemModel();
                xetNghiemModel.setXetNghiemID(rs.getInt("xetNghiemID"));
                xetNghiemModel.setNhanKhauID(rs.getInt("nhanKhauID"));
                xetNghiemModel.setNgayXetNghiem(rs.getDate("ngayXetNghiem"));
                xetNghiemModel.setNoiXetNghiem(rs.getString("noiXetNghiem"));
                xetNghiemModel.setHinhThucXetNghiem(rs.getString("hinhthucXetNghiem"));
                xetNghiemModel.setKetQuaXetNghiem(rs.getString("ketquaXetNghiem"));
                
                list.add(temp);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    
    
    
    
}
