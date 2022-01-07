package quanlynhankhau;

import controllers.CachLyManagerController.AddNewCachLyController;
import java.sql.SQLException;
import java.util.Date;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import models.CachLyModel;
import views.CachLyManagerFrame.AddNewCachLyJFrame;
import views.LoginUI;
import views.MainFrame;

/**
 *
 * @author Hai
 */
public class QuanLyNhanKhau {

    public static Calendar calendar = Calendar.getInstance();
    
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
//        JFrame frame=new JFrame();
//        frame.setVisible(true);
//        AddNewCachLyJFrame addnew =new AddNewCachLyJFrame(frame);
//        addnew.setVisible(true);
//        AddNewCachLyController controller=new AddNewCachLyController();
//        CachLyModel cachLyModel=new CachLyModel();
//        cachLyModel.setNhanKhauID(32);
//        cachLyModel.setHinhThucCachLy("Cách ly tập trung");
//        cachLyModel.setMucDoCachLy("F2");
//        cachLyModel.setNoiCachLy("Khu cách ly B");
//        cachLyModel.setSoNgayCachLy(18);
//        cachLyModel.setNgayBatDauCachLy(new Date());


//        System.out.println(cachLyModel.getNgayBatDauCachLy());
//        MainFrame mainFrame = new MainFrame();
//        mainFrame.setLocationRelativeTo(null);
//        mainFrame.setResizable(false);
//        mainFrame.setVisible(true);
//        LoginUI loginUI = new LoginUI();
//        loginUI.setVisible(true); 
        
    }
    
}
