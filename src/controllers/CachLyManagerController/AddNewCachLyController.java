package controllers.CachLyManagerController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import models.CachLyModel;
import services.MysqlConnection;

/**
 *
 * @author Hai
 */

// lop thuc hien cac chuc nang trong giao dien them moi nhan khau

public class AddNewCachLyController {
    public boolean addNewCachLy(CachLyModel cachLyModel) throws SQLException, ClassNotFoundException{
        
        Connection connection = MysqlConnection.getMysqlConnection();
        String query = "INSERT INTO "
                    + "cach_ly(nhanKhauID, ngayBatDauCachLy, noiCachLy," 
                    + "soNgayCachLy, mucDoCachLy, hinhThucCachLy, nguoiChamSoc, lyDoCachLy) "
                    + " values (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1, cachLyModel.getNhanKhauID());
        java.sql.Date ngaybatdau = new java.sql.Date(cachLyModel.getNgayBatDauCachLy().getTime());
        preparedStatement.setDate(2, ngaybatdau);
        preparedStatement.setString(3, cachLyModel.getNoiCachLy());
        preparedStatement.setInt(4, cachLyModel.getSoNgayCachLy());
        preparedStatement.setString(5, cachLyModel.getMucDoCachLy());
        preparedStatement.setString(6, cachLyModel.getHinhThucCachLy());
        preparedStatement.setString(7, cachLyModel.getNguoiChamSoc());
        preparedStatement.setString(8, cachLyModel.getLyDoCachLy());   
        
        preparedStatement.executeUpdate();
            
            
        ResultSet rs = preparedStatement.getGeneratedKeys();
            
//        if (rs.next()){
//            System.out.println(rs.getString(1));
//        }
            



        
        
        preparedStatement.close();
        
        return true;
    }
}
