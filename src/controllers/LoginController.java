
package controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import models.UserMoldel;
import services.MysqlConnection;

/**
 *
 * @author Hai
 */
public class LoginController {
    
    public static UserMoldel currentUser = new UserMoldel();
    
    public int login(String userName, String passwod) throws SQLException, ClassNotFoundException{
        Connection connection = MysqlConnection.getMysqlConnection();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM users WHERE userName = '" + userName +"'");
        if (rs == null) {
            return 0;
        }
        while (rs.next()) {                
            if (rs.getString("passwd") == null ? passwod == null : rs.getString("passwd").equals(passwod)) {
                System.out.println(rs.getString("passwd"));
                System.out.println(rs.getString("userName"));
                LoginController.currentUser.setID(rs.getInt("ID"));
                LoginController.currentUser.setUserName(rs.getString("userName"));
                LoginController.currentUser.setRoles(rs.getInt("role"));
                return LoginController.currentUser.getRoles();
            }
        }
        connection.close();
        return 0;
    }
}
