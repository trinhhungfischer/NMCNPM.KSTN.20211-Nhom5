package services;

import Bean.CachLyBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import models.CachLyModel;
import models.ChungMinhThuModel;
import models.NhanKhauModel;
import utility.DateString;


/**
 *
 * @author Hai
 */
public class CachLyService {
    
    /* 
     * 
     * 
     */
    public CachLyBean getCachLy(int nhanKhauID){
        CachLyBean cachLyBean= new CachLyBean();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT nk.hoTen,nk.namSinh,nk.noiThuongTru,nk.gioiTinh,\n" +
                           "cmt.ID cmtID,cmt.soCMT,cmt.ngayCap,cmt.noiCap\n" +
                           "FROM nhan_khau nk JOIN chung_minh_thu cmt ON cmt.idNhanKhau=nk.ID\n"+
                           "WHERE nk.ID = '"+String.valueOf(nhanKhauID)
                           + "';"
                    ;
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                NhanKhauModel nhanKhau = cachLyBean.getNhanKhauModel();
                nhanKhau.setID(nhanKhauID);
                nhanKhau.setHoTen(rs.getString("hoTen"));
                nhanKhau.setGioiTinh(rs.getString("gioiTinh"));
                nhanKhau.setNamSinh(rs.getDate("namSinh"));
                nhanKhau.setNoiThuongTru(rs.getString("noiThuongTru"));
                ChungMinhThuModel chungMinhThuModel = cachLyBean.getChungMinhThuModel();
                chungMinhThuModel.setID(rs.getInt("cmtID"));
                chungMinhThuModel.setIdNhanKhau(nhanKhauID);
                chungMinhThuModel.setSoCMT(rs.getString("soCMT"));
                chungMinhThuModel.setNgayCap(rs.getDate("ngayCap"));
                chungMinhThuModel.setNoiCap(rs.getString("noiCap"));

            }
            preparedStatement.close();
            query = "SELECT cachLyID,nhanKhauID,ngayBatDauCachLy,noiCachLy,soNgayCachLy,"
                + "mucDoCachLy, hinhThucCachLy, nguoiChamSoc, lyDoCachLy \n" +
                "FROM cach_ly\n" +
                "WHERE nhanKhauID= " +String.valueOf(nhanKhauID)+
                ";";
            preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            rs = preparedStatement.executeQuery();
            while (rs.next()){
                CachLyModel cachLyModel= new CachLyModel();
                cachLyModel.setCachLyID(rs.getInt("cachLyID"));
                cachLyModel.setNhanKhauID(rs.getInt("nhanKhauID"));
                cachLyModel.setNgayBatDauCachLy(rs.getDate("ngayBatDauCachLy"));
                cachLyModel.setNoiCachLy(rs.getString("noiCachLy"));
                cachLyModel.setSoNgayCachLy(rs.getInt("soNgayCachLy"));
                cachLyModel.setMucDoCachLy(rs.getString("mucDoCachLy"));
                cachLyModel.setHinhThucCachLy(rs.getString("hinhThucCachLy"));
                cachLyModel.setNguoiChamSoc(rs.getString("nguoiChamSoc"));
                cachLyModel.setLyDoCachLy(rs.getString("lyDoCachLy"));
                cachLyBean.getListCachLyModels().add(cachLyModel);
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }




        return cachLyBean;
    }
    
    public List<CachLyBean> getListCachLy(){
        List<CachLyBean> list = new ArrayList<>();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT cl.cachLyID,cl.nhanKhauID,cl.ngayBatDauCachLy, cl.noiCachLy, cl.soNgayCachLy, "
                    + "cl.mucDoCachLy, cl.hinhThucCachLy,cl.nguoiChamSoc, cl.lyDoCachLy,nk.hoTen,nk.namSinh,"
                    + "nk.noiThuongTru,nk.gioiTinh, cmt.ID cmtID, "
                    + "cmt.soCMT,cmt.ngayCap,cmt.noiCap \n" 
                    + "FROM cach_ly cl JOIN nhan_khau nk ON cl.nhanKhauID=nk.ID \n" 
                    + "JOIN chung_minh_thu cmt ON nk.ID= cmt.idNhanKhau \n" 
                    + "JOIN (SELECT cachLyID, max(ngayBatDauCachLy) FROM cach_ly GROUP BY nhanKhauID) maxcl ON cl.cachLyID=maxcl.cachLyID\n" 
                    +";";
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                CachLyBean cachLyBean =new CachLyBean();
                CachLyModel cachLyModel= new CachLyModel();
                cachLyModel.setCachLyID(rs.getInt("cachLyID"));
                cachLyModel.setNhanKhauID(rs.getInt("nhanKhauID"));
                cachLyModel.setNgayBatDauCachLy(rs.getDate("ngayBatDauCachLy"));
                cachLyModel.setNoiCachLy(rs.getString("noiCachLy"));
                cachLyModel.setSoNgayCachLy(rs.getInt("soNgayCachLy"));
                cachLyModel.setMucDoCachLy(rs.getString("mucDoCachLy"));
                cachLyModel.setHinhThucCachLy(rs.getString("hinhThucCachLy"));
                cachLyModel.setNguoiChamSoc(rs.getString("nguoiChamSoc"));
                cachLyModel.setLyDoCachLy(rs.getString("lyDoCachLy"));
                cachLyBean.getListCachLyModels().add(cachLyModel);
                
                NhanKhauModel nhanKhau = cachLyBean.getNhanKhauModel();
                nhanKhau.setID(rs.getInt("nhanKhauID"));
                nhanKhau.setHoTen(rs.getString("hoTen"));
                nhanKhau.setGioiTinh(rs.getString("gioiTinh"));
                nhanKhau.setNamSinh(rs.getDate("namSinh"));
                nhanKhau.setNoiThuongTru(rs.getString("noiThuongTru"));
                ChungMinhThuModel chungMinhThuModel = cachLyBean.getChungMinhThuModel();
                chungMinhThuModel.setID(rs.getInt("cmtID"));
                chungMinhThuModel.setIdNhanKhau(rs.getInt("nhanKhauID"));
                chungMinhThuModel.setSoCMT(rs.getString("soCMT"));
                chungMinhThuModel.setNgayCap(rs.getDate("ngayCap"));
                chungMinhThuModel.setNoiCap(rs.getString("noiCap"));
                list.add(cachLyBean);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Loi tai dong 135 Cach Ly Service");
        }
        return list;
    }
    
    public List<CachLyBean> findListCachLy(String field,String value){
        List<CachLyBean> list = new ArrayList<>();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT cl.cachLyID,cl.nhanKhauID,cl.ngayBatDauCachLy, cl.noiCachLy, cl.soNgayCachLy, "
                    + "cl.mucDoCachLy, cl.hinhThucCachLy,cl.nguoiChamSoc, cl.lyDoCachLy,nk.hoTen,nk.namSinh,"
                    + "nk.noiThuongTru,nk.gioiTinh, cmt.ID cmtID, "
                    + "cmt.soCMT,cmt.ngayCap,cmt.noiCap \n" 
                    + "FROM cach_ly cl JOIN nhan_khau nk ON cl.nhanKhauID=nk.ID \n" 
                    + "JOIN chung_minh_thu cmt ON nk.ID= cmt.idNhanKhau \n" 
                    + "JOIN (SELECT cachLyID, max(ngayBatDauCachLy) FROM cach_ly GROUP BY nhanKhauID) maxcl ON cl.cachLyID=maxcl.cachLyID\n" 
                    + "WHERE "+field +" LIKE '%"+value+"%' "
                    +"\n;";
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                CachLyBean cachLyBean =new CachLyBean();
                CachLyModel cachLyModel= new CachLyModel();
                cachLyModel.setCachLyID(rs.getInt("cachLyID"));
                cachLyModel.setNhanKhauID(rs.getInt("nhanKhauID"));
                cachLyModel.setNgayBatDauCachLy(rs.getDate("ngayBatDauCachLy"));
                cachLyModel.setNoiCachLy(rs.getString("noiCachLy"));
                cachLyModel.setSoNgayCachLy(rs.getInt("soNgayCachLy"));
                cachLyModel.setMucDoCachLy(rs.getString("mucDoCachLy"));
                cachLyModel.setHinhThucCachLy(rs.getString("hinhThucCachLy"));
                cachLyModel.setNguoiChamSoc(rs.getString("nguoiChamSoc"));
                cachLyModel.setLyDoCachLy(rs.getString("lyDoCachLy"));
                cachLyBean.getListCachLyModels().add(cachLyModel);
                
                NhanKhauModel nhanKhau = cachLyBean.getNhanKhauModel();
                nhanKhau.setID(rs.getInt("nhanKhauID"));
                nhanKhau.setHoTen(rs.getString("hoTen"));
                nhanKhau.setGioiTinh(rs.getString("gioiTinh"));
                nhanKhau.setNamSinh(rs.getDate("namSinh"));
                nhanKhau.setNoiThuongTru(rs.getString("noiThuongTru"));
                ChungMinhThuModel chungMinhThuModel = cachLyBean.getChungMinhThuModel();
                chungMinhThuModel.setID(rs.getInt("cmtID"));
                chungMinhThuModel.setIdNhanKhau(rs.getInt("nhanKhauID"));
                chungMinhThuModel.setSoCMT(rs.getString("soCMT"));
                chungMinhThuModel.setNgayCap(rs.getDate("ngayCap"));
                chungMinhThuModel.setNoiCap(rs.getString("noiCap"));
                
                list.add(cachLyBean);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Loi tai dong 187 Cach Ly Service");
        }
        return list;
        
    }
    
    /*
        Hàm thống kê trong đó có cách tham số truyền vào:
        boolCheckbox là list gồm 4 phần tử trả về của 4 lựa chọn là ngày bất đầu,ngày kết thúc,mức độ, hình thức
        date là list gồm 4 phần tử kiểu Date tương ứng với 2 ngày bắt đầu và 2 ngày kết thức
        mucdo la list các string dc chon trong {"Chưa rõ","F0","F1","F2"}
        lydo là list các string đc chọn trong {"tiếp xúc","dương tính","khác"}
    */
    public List<CachLyBean> thongKeListCachLy(List<Boolean> boolCheckbox, List<Date> date,List<String> mucdo,List<String> lydo){
        List<CachLyBean> list = new ArrayList<>();
        
        Calendar calendar = Calendar.getInstance();
        
        DateString dateString =new DateString();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT cl.cachLyID,cl.nhanKhauID,cl.ngayBatDauCachLy, cl.noiCachLy, cl.soNgayCachLy, "
                    + "cl.mucDoCachLy, cl.hinhThucCachLy,cl.nguoiChamSoc, cl.lyDoCachLy,nk.hoTen,nk.namSinh,"
                    + "nk.noiThuongTru,nk.gioiTinh, cmt.ID cmtID, "
                    + "cmt.soCMT,cmt.ngayCap,cmt.noiCap \n" 
                    + "FROM cach_ly cl JOIN nhan_khau nk ON cl.nhanKhauID=nk.ID \n" 
                    + "JOIN chung_minh_thu cmt ON nk.ID= cmt.idNhanKhau \n" 
                    + "JOIN (SELECT cachLyID, max(ngayBatDauCachLy) FROM cach_ly GROUP BY nhanKhauID) maxcl ON cl.cachLyID=maxcl.cachLyID\n"
                    ;
            List<String> liststr=new ArrayList<String>();
            if(boolCheckbox.get(0)){
                String str="( ngayBatDauCachLy >= '";
                calendar.setTime(date.get(0));
                str+= String.valueOf(calendar.get(Calendar.YEAR))+"-"+
                      String.valueOf(calendar.get(Calendar.MONTH)+1)+"-"+
                      String.valueOf(calendar.get(Calendar.DATE));
                str+="' AND ngayBatDauCachLy <= '";
                calendar.setTime(date.get(1));
                str+= String.valueOf(calendar.get(Calendar.YEAR))+"-"+
                      String.valueOf(calendar.get(Calendar.MONTH)+1)+"-"+
                      String.valueOf(calendar.get(Calendar.DATE));
                str+="' )";
                liststr.add(str);
            }
            if(boolCheckbox.get(1)){
                String str ="( ngayBatDauCachLy >= '"
                        +dateString.dateToString(date.get(0))
                        +"' AND ngayBatDauCachLy <= '"
                        +dateString.dateToString(date.get(1))
                        +"' )";
                liststr.add(str);
            }
            if(boolCheckbox.get(1)){
                String str="( ngayBatDauCachLy >= '"
                        +dateString.dateToString(date.get(2))
                        +"' AND ngayBatDauCachLy <= '"
                        +dateString.dateToString(date.get(3))
                        +"' )";
                liststr.add(str);
            }
            if(boolCheckbox.get(2)&& !mucdo.isEmpty()){
                String str="( mucDoCachLy IN (";
                str+=" '"+mucdo.get(0) +"' ";
                for(int i=1;i<mucdo.size();i++)str+=", '"+mucdo.get(i)+"' ";
                str+=") )";
                liststr.add(str);
            }
            if(boolCheckbox.get(3)&& !lydo.isEmpty()){
                for(int i=0;i<lydo.size();i++){
                    if(lydo.get(i).equalsIgnoreCase("khác"))
                        lydo.set(i, "( lyDoCachLy NOT LIKE '%tiếp xúc%' AND  lyDoCachLy NOT LIKE '%dương tính%' )");
                    else 
                        lydo.set(i,"( lyDoCachLy LiKE '%"+lydo.get(i)+ "%' )");
                }
                liststr.add("( "+String.join(" OR ", lydo)+" )" );
                
            }
            if(!liststr.isEmpty())query=query+"WHERE "+String.join(" AND ",liststr );
            query+="\n;";
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                CachLyBean cachLyBean =new CachLyBean();
                CachLyModel cachLyModel= new CachLyModel();
                cachLyModel.setCachLyID(rs.getInt("cachLyID"));
                cachLyModel.setNhanKhauID(rs.getInt("nhanKhauID"));
                cachLyModel.setNgayBatDauCachLy(rs.getDate("ngayBatDauCachLy"));
                cachLyModel.setNoiCachLy(rs.getString("noiCachLy"));
                cachLyModel.setSoNgayCachLy(rs.getInt("soNgayCachLy"));
                cachLyModel.setMucDoCachLy(rs.getString("mucDoCachLy"));
                cachLyModel.setHinhThucCachLy(rs.getString("hinhThucCachLy"));
                cachLyModel.setNguoiChamSoc(rs.getString("nguoiChamSoc"));
                cachLyModel.setLyDoCachLy(rs.getString("lyDoCachLy"));
                cachLyBean.getListCachLyModels().add(cachLyModel);
                
                NhanKhauModel nhanKhau = cachLyBean.getNhanKhauModel();
                nhanKhau.setID(rs.getInt("nhanKhauID"));
                nhanKhau.setHoTen(rs.getString("hoTen"));
                nhanKhau.setGioiTinh(rs.getString("gioiTinh"));
                nhanKhau.setNamSinh(rs.getDate("namSinh"));
                nhanKhau.setNoiThuongTru(rs.getString("noiThuongTru"));
                ChungMinhThuModel chungMinhThuModel = cachLyBean.getChungMinhThuModel();
                chungMinhThuModel.setID(rs.getInt("cmtID"));
                chungMinhThuModel.setIdNhanKhau(rs.getInt("nhanKhauID"));
                chungMinhThuModel.setSoCMT(rs.getString("soCMT"));
                chungMinhThuModel.setNgayCap(rs.getDate("ngayCap"));
                chungMinhThuModel.setNoiCap(rs.getString("noiCap"));
                
                list.add(cachLyBean);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Loi tai dong 300 Cach Ly Service");
        }
        return list;
    }
        
    /*
     * Ham sử lý ngoại lệ : thông báo ra lỗi nhận được
     */
    private void exceptionHandle(String message) {
        JOptionPane.showMessageDialog(null, message, "Warning", JOptionPane.ERROR_MESSAGE);
    }
}
