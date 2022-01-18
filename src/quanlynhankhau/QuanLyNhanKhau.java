package quanlynhankhau;

import java.util.Calendar;
import javax.swing.UIManager;
import views.LoginUI;
import views.themes.MyTheme;

        
/**
 *
 * @author Hai
 */
public class QuanLyNhanKhau {

    public static Calendar calendar = Calendar.getInstance();
    
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(new MyTheme());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        LoginUI loginUI = new LoginUI();
        loginUI.setVisible(true); 
        
    }
    
}
