package services;

import Bean.XetNghiemBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import models.XetNghiemModel;
import models.ChungMinhThuModel;
import models.NhanKhauModel;
import utility.DateString;

public class XetNghiemService {
    // them moi nguoi xet nghiem
    public XetNghiemBean getXetNghiem(int nhanKhauID){
        XetNghiemBean xetNghiemBean= new XetNghiemBean();
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
                NhanKhauModel nhanKhau = xetNghiemBean.getNhanKhauModel();
                nhanKhau.setID(nhanKhauID);
                nhanKhau.setHoTen(rs.getString("hoTen"));
                nhanKhau.setGioiTinh(rs.getString("gioiTinh"));
                nhanKhau.setNamSinh(rs.getDate("namSinh"));
                nhanKhau.setNoiThuongTru(rs.getString("noiThuongTru"));
                ChungMinhThuModel chungMinhThuModel = xetNghiemBean.getChungMinhThuModel();
                chungMinhThuModel.setID(rs.getInt("cmtID"));
                chungMinhThuModel.setIdNhanKhau(nhanKhauID);
                chungMinhThuModel.setSoCMT(rs.getString("soCMT"));
                chungMinhThuModel.setNgayCap(rs.getDate("ngayCap"));
                chungMinhThuModel.setNoiCap(rs.getString("noiCap"));

            }
            preparedStatement.close();
            query = "SELECT xetNghiemID,nhanKhauID,ngayXetNghiem,noiXetNghiem,"
                + "hinhThucXetNghiem, ketQuaXetNghiem \n" +
                "FROM xet_nghiem\n" +
                "WHERE nhanKhauID= " +String.valueOf(nhanKhauID)+
                ";";
            preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            rs = preparedStatement.executeQuery();
            while (rs.next()){
                XetNghiemModel xetNghiemModel= new XetNghiemModel();
                xetNghiemModel.setXetNghiemID(rs.getInt("xetNghiemID"));
                xetNghiemModel.setNhanKhauID(rs.getInt("nhanKhauID"));
                xetNghiemModel.setNgayXetNghiem(rs.getDate("ngayXetNghiem"));
                xetNghiemModel.setNoiXetNghiem(rs.getString("noiXetNghiem"));
                xetNghiemModel.setHinhThucXetNghiem(rs.getString("hinhThucXetNghiem"));
                xetNghiemModel.setKetQuaXetNghiem(rs.getString("ketQuaXetNghiem"));
                
                xetNghiemBean.getListXetNghiemModels().add(xetNghiemModel);
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return xetNghiemBean;
    }
    
    public List<XetNghiemBean> getListXetNghiem(){
        List<XetNghiemBean> list = new ArrayList<>();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT xn.xetNghiemID,xn.nhanKhauID,xn.ngayXetNghiem, xn.noiXetNghiem,  "
                    + "xn.hinhThucXetNghiem, xn.ketQuaXetNghiem,nk.hoTen,nk.namSinh,"
                    + "nk.noiThuongTru,nk.gioiTinh, cmt.ID cmtID, "
                    + "cmt.soCMT,cmt.ngayCap,cmt.noiCap \n" 
                    + "FROM xet_nghiem xn JOIN nhan_khau nk ON xn.nhanKhauID=nk.ID \n" 
                    + "JOIN chung_minh_thu cmt ON nk.ID= cmt.idNhanKhau \n" 
                    + "JOIN (SELECT xetNghiemID, ngayXetNghiem) FROM xet_nghiem GROUP BY nhanKhauID) maxxn ON xn.xetNghiemID=maxxn.xetNghiemID\n" 
                    +";";
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                XetNghiemBean xetNghiemBean =new XetNghiemBean();
                XetNghiemModel xetNghiemModel= new XetNghiemModel();
                xetNghiemModel.setXetNghiemID(rs.getInt("xetNghiemID"));
                xetNghiemModel.setNhanKhauID(rs.getInt("nhanKhauID"));
                xetNghiemModel.setNgayXetNghiem(rs.getDate("ngayXetNghiem"));
                xetNghiemModel.setNoiXetNghiem(rs.getString("noiXetNghiem"));
                xetNghiemModel.setHinhThucXetNghiem(rs.getString("hinhThucXetNghiem"));
                xetNghiemModel.setKetQuaXetNghiem(rs.getString("ketQuaXetNghiem"));
                
                xetNghiemBean.getListXetNghiemModels().add(xetNghiemModel);
                
                NhanKhauModel nhanKhau = xetNghiemBean.getNhanKhauModel();
                nhanKhau.setID(rs.getInt("nhanKhauID"));
                nhanKhau.setHoTen(rs.getString("hoTen"));
                nhanKhau.setGioiTinh(rs.getString("gioiTinh"));
                nhanKhau.setNamSinh(rs.getDate("namSinh"));
                nhanKhau.setNoiThuongTru(rs.getString("noiThuongTru"));
                ChungMinhThuModel chungMinhThuModel = xetNghiemBean.getChungMinhThuModel();
                chungMinhThuModel.setID(rs.getInt("cmtID"));
                chungMinhThuModel.setIdNhanKhau(rs.getInt("nhanKhauID"));
                chungMinhThuModel.setSoCMT(rs.getString("soCMT"));
                chungMinhThuModel.setNgayCap(rs.getDate("ngayCap"));
                chungMinhThuModel.setNoiCap(rs.getString("noiCap"));
                list.add(xetNghiemBean);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Loi tai dong 135 XetNghiem Service");
        }
        return list;
    }
    
    public List<XetNghiemBean> findListXetNghiem(String field,String value){
        List<XetNghiemBean> list = new ArrayList<>();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT xn.xetNghiemID,xn.nhanKhauID,xn.ngayXetNghiem, xn.noiXetNghiem, "
                    + "xn.hinhThucXetNghiem, xn.ketQuaXetNghiem,nk.hoTen,nk.namSinh,"
                    + "nk.noiThuongTru,nk.gioiTinh, cmt.ID cmtID, "
                    + "cmt.soCMT,cmt.ngayCap,cmt.noiCap \n" 
                    + "FROM xet_nghiem xn JOIN nhan_khau nk ON xn.nhanKhauID=nk.ID \n" 
                    + "JOIN chung_minh_thu cmt ON nk.ID= cmt.idNhanKhau \n" 
                    + "JOIN (SELECT xetNghiemID, max(ngayXetNghiem) FROM xet_nghiem GROUP BY nhanKhauID) maxxn ON xn.xetNghiemID=maxxn.xetNghiemID\n" 
                    + "WHERE "+field +" LIKE '%"+value+"%' "
                    +"\n;";
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                XetNghiemBean xetNghiemBean =new XetNghiemBean();
                XetNghiemModel xetNghiemModel= new XetNghiemModel();
                xetNghiemModel.setXetNghiemID(rs.getInt("xetNghiemID"));
                xetNghiemModel.setNhanKhauID(rs.getInt("nhanKhauID"));
                xetNghiemModel.setNgayXetNghiem(rs.getDate("ngayXetNghiem"));
                xetNghiemModel.setNoiXetNghiem(rs.getString("noiXetNghiem"));
                xetNghiemModel.setHinhThucXetNghiem(rs.getString("hinhThucXetNghiem"));
                xetNghiemModel.setKetQuaXetNghiem(rs.getString("ketQuaXetNghiem"));
                xetNghiemBean.getListXetNghiemModels().add(xetNghiemModel);
                
                NhanKhauModel nhanKhau = xetNghiemBean.getNhanKhauModel();
                nhanKhau.setID(rs.getInt("nhanKhauID"));
                nhanKhau.setHoTen(rs.getString("hoTen"));
                nhanKhau.setGioiTinh(rs.getString("gioiTinh"));
                nhanKhau.setNamSinh(rs.getDate("namSinh"));
                nhanKhau.setNoiThuongTru(rs.getString("noiThuongTru"));
                ChungMinhThuModel chungMinhThuModel = xetNghiemBean.getChungMinhThuModel();
                chungMinhThuModel.setID(rs.getInt("cmtID"));
                chungMinhThuModel.setIdNhanKhau(rs.getInt("nhanKhauID"));
                chungMinhThuModel.setSoCMT(rs.getString("soCMT"));
                chungMinhThuModel.setNgayCap(rs.getDate("ngayCap"));
                chungMinhThuModel.setNoiCap(rs.getString("noiCap"));
                
                list.add(xetNghiemBean);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Loi tai dong 187 Xet Nghiem Service");
        }
        return list;
        
    }
    
    
    public List<XetNghiemBean> thongKeListXetNghiem(List<Boolean> boolCheckbox, List<Date> date,List<String> hinhthuc,List<String> ketqua){
        List<XetNghiemBean> list = new ArrayList<>();
        
        Calendar calendar = Calendar.getInstance();
        
        DateString dateString =new DateString();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT xn.xetNghiemID,xn.nhanKhauID,xn.ngayXetNghiem, xn.noiXetnghiem, "
                    + "xn.hinhThucXetNghiem, xn.ketQuaXetNghiem,nk.hoTen,nk.namSinh,"
                    + "nk.noiThuongTru,nk.gioiTinh, cmt.ID cmtID, "
                    + "cmt.soCMT,cmt.ngayCap,cmt.noiCap \n" 
                    + "FROM xet_nghiem xn JOIN nhan_khau nk ON xn.nhanKhauID=nk.ID \n" 
                    + "JOIN chung_minh_thu cmt ON nk.ID= cmt.idNhanKhau \n" 
                    + "JOIN (SELECT xetNghiemID, max(ngayXetNghiem) FROM xet_nghiem GROUP BY nhanKhauID) maxxn ON xn.xetNghiemID=maxxn.xetNghiemID\n"
                    ;
            List<String> liststr=new ArrayList<String>();
            if(boolCheckbox.get(0)){
                String str="( ngayXetNghiem >= '";
                calendar.setTime(date.get(0));
                str+= String.valueOf(calendar.get(Calendar.YEAR))+"-"+
                      String.valueOf(calendar.get(Calendar.MONTH)+1)+"-"+
                      String.valueOf(calendar.get(Calendar.DATE));
                str+="' AND ngayXetNghiem <= '";
                calendar.setTime(date.get(1));
                str+= String.valueOf(calendar.get(Calendar.YEAR))+"-"+
                      String.valueOf(calendar.get(Calendar.MONTH)+1)+"-"+
                      String.valueOf(calendar.get(Calendar.DATE));
                str+="' )";
                liststr.add(str);
            }
            if(boolCheckbox.get(1)){
                String str ="( ngayXetNghiem >= '"
                        +dateString.dateToString(date.get(0))
                        +"' AND ngayXetNghiem <= '"
                        +dateString.dateToString(date.get(1))
                        +"' )";
                liststr.add(str);
            }
            if(boolCheckbox.get(1)){
                String str="( ngayXetNghiem >= '"
                        +dateString.dateToString(date.get(2))
                        +"' AND ngayXetNghiem <= '"
                        +dateString.dateToString(date.get(3))
                        +"' )";
                liststr.add(str);
            }
            if(boolCheckbox.get(2)&& !hinhthuc.isEmpty()){
                String str="( hinhThucXetNghiem IN (";
                str+=" '"+hinhthuc.get(0) +"' ";
                for(int i=1;i<hinhthuc.size();i++)str+=", '"+hinhthuc.get(i)+"' ";
                str+=") )";
                liststr.add(str);
            }
            if(boolCheckbox.get(3)&& !ketqua.isEmpty()){
                for(int i=0;i<ketqua.size();i++){
                    if(ketqua.get(i).equalsIgnoreCase("khác"))
                        ketqua.set(i, "( ketQuaXetNghiem NOT LIKE '%dương tính%' AND  ketQuaXetNghiem NOT LIKE '%âm tính%' )");
                    else 
                        ketqua.set(i,"( ketQuaXetNghiem LiKE '%"+ketqua.get(i)+ "%' )");
                }
                liststr.add("( "+String.join(" OR ", ketqua)+" )" );
                
            }
            if(!liststr.isEmpty())query=query+"WHERE "+String.join(" AND ",liststr );
            query+="\n;";
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                XetNghiemBean xetNghiemBean =new XetNghiemBean();
                XetNghiemModel xetNghiemModel= new XetNghiemModel();
                xetNghiemModel.setXetNghiemID(rs.getInt("xetNghiemID"));
                xetNghiemModel.setNhanKhauID(rs.getInt("nhanKhauID"));
                xetNghiemModel.setNgayXetNghiem(rs.getDate("ngayXetNghiem"));
                xetNghiemModel.setNoiXetNghiem(rs.getString("noiXetNghiem"));;
                xetNghiemModel.setHinhThucXetNghiem(rs.getString("hinhThucXetNghiem"));
                xetNghiemModel.setKetQuaXetNghiem(rs.getString("ketQuaXetNghiem"));
                xetNghiemBean.getListXetNghiemModels().add(xetNghiemModel);
                
                NhanKhauModel nhanKhau = xetNghiemBean.getNhanKhauModel();
                nhanKhau.setID(rs.getInt("nhanKhauID"));
                nhanKhau.setHoTen(rs.getString("hoTen"));
                nhanKhau.setGioiTinh(rs.getString("gioiTinh"));
                nhanKhau.setNamSinh(rs.getDate("namSinh"));
                nhanKhau.setNoiThuongTru(rs.getString("noiThuongTru"));
                ChungMinhThuModel chungMinhThuModel = xetNghiemBean.getChungMinhThuModel();
                chungMinhThuModel.setID(rs.getInt("cmtID"));
                chungMinhThuModel.setIdNhanKhau(rs.getInt("nhanKhauID"));
                chungMinhThuModel.setSoCMT(rs.getString("soCMT"));
                chungMinhThuModel.setNgayCap(rs.getDate("ngayCap"));
                chungMinhThuModel.setNoiCap(rs.getString("noiCap"));
                
                list.add(xetNghiemBean);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Loi tai dong 300 Xet Nghiem Service");
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
