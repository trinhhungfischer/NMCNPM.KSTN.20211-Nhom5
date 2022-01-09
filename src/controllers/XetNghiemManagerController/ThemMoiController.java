package controllers.XetNghiemManagerController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import models.XetNghiemModel;
import services.MysqlConnection;

/**
 *
 * @author Dat
 */

// lop thuc hien cac chuc nang trong giao dien them moi nhan khau

public class ThemMoiController {
    public boolean addNewXetNghiem(XetNghiemModel xetNghiemModel) throws SQLException, ClassNotFoundException{
        
        Connection connection = MysqlConnection.getMysqlConnection();
        String query = "INSERT INTO "
                    + "cach_ly(nhanKhauID, ngayXetNghiem, noiXetNghiem," 
                    + "hinhThucXetNghiem, ketQuaXetNghiem) "
                    + " values (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1, xetNghiemModel.getNhanKhauID());
        java.sql.Date ngayxn = new java.sql.Date(xetNghiemModel.getNgayXetNghiem().getTime());
        preparedStatement.setDate(2, ngayxn);
        preparedStatement.setString(3, xetNghiemModel.getNoiXetNghiem());
        preparedStatement.setString(4, xetNghiemModel.getHinhThucXetNghiem());
        preparedStatement.setString(5, xetNghiemModel.getKetQuaXetNghiem());
     
        
        preparedStatement.executeUpdate();
            
            
        ResultSet rs = preparedStatement.getGeneratedKeys();
            
//        if (rs.next()){
//            System.out.println(rs.getString(1));
//        }
            



        
        
        preparedStatement.close();
        
        return true;
    }
}
