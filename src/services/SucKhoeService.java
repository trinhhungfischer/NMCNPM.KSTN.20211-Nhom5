/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import Bean.NhanKhauBean;
import Bean.SucKhoeBean;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import javax.swing.JOptionPane;
import models.SucKhoeModel;

/**
 *
 * @author Hoang
 */
public class SucKhoeService {
    public SucKhoeBean getSucKhoeBean(int idNhanKhau){
        SucKhoeBean temp = new SucKhoeBean();
        temp.getNhanKhauBean().getNhanKhauModel().setID(-1);
        try{
            Connection connection = MysqlConnection.getMysqlConnection();
            String sql = "SELECT * FROM nhan_khau INNER JOIN chung_minh_thu ON nhan_khau.ID = chung_minh_thu.idNhanKhau WHERE nhan_khau.ID = " + idNhanKhau;
            PreparedStatement prst = (PreparedStatement)connection.prepareStatement(sql);
            ResultSet rs_l = prst.executeQuery();
            while(rs_l.next()){
                temp.getNhanKhauBean().getNhanKhauModel().setID(rs_l.getInt("ID"));
                temp.getNhanKhauBean().getNhanKhauModel().setHoTen(rs_l.getString("hoTen"));
                temp.getNhanKhauBean().getNhanKhauModel().setDiaChiHienNay(rs_l.getString("diaChiHienNay"));
                temp.getNhanKhauBean().getNhanKhauModel().setNamSinh(rs_l.getDate("namSinh"));
                temp.getNhanKhauBean().getChungMinhThuModel().setSoCMT(rs_l.getString("soCMT"));
            }
            prst.close();
            idNhanKhau = temp.getNhanKhauBean().getNhanKhauModel().getID();
            if(idNhanKhau > 0){
                List<SucKhoeModel> listSucKhoe = new ArrayList<>();
                sql = "SELECT * FROM suc_khoe where nhanKhauID = " + idNhanKhau +  " ORDER BY sucKhoeID DESC";
                temp.getNhanKhauBean().getNhanKhauModel().setID(-1);
                prst = (PreparedStatement)connection.prepareStatement(sql);
                rs_l = prst.executeQuery();
                while(rs_l.next()){
                    temp.getNhanKhauBean().getNhanKhauModel().setID(rs_l.getInt("nhanKhauID"));
                    SucKhoeModel sucKhoeModel = new SucKhoeModel();
                    sucKhoeModel.setNhanKhauID(rs_l.getInt("nhanKhauID"));
                    sucKhoeModel.setSucKhoeID(rs_l.getInt("sucKhoeID"));
                    sucKhoeModel.setTrangThaiSucKhoe(rs_l.getString("trangThaiSucKhoe"));
                    sucKhoeModel.setTrieuChungCovid(rs_l.getInt("trieuChungCovid"));
                    sucKhoeModel.setNgayCapNhat(rs_l.getDate("ngayCapNhat"));
                    listSucKhoe.add(sucKhoeModel);
                }
                prst.close();
                if(temp.getNhanKhauBean().getNhanKhauModel().getID() > 0){
                    temp.setListSucKhoe(listSucKhoe);
                    temp.setSucKhoeCuoi(listSucKhoe.get(0));
                }
            }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Lỗi");
        }
   
        return temp;
    }
    
    public List<SucKhoeBean> getListSucKhoe(){
    List<SucKhoeBean> list = new ArrayList<>();
    try{
        Connection connection = MysqlConnection.getMysqlConnection();
        String query = "SELECT nhanKhauID, MAX(sucKhoeID) FROM suc_khoe GROUP BY nhanKhauID ORDER BY MAX(sucKhoeID) DESC";
        PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
        ResultSet rs = preparedStatement.executeQuery();
        int idNhanKhau = -1;
        while(rs.next()){
//            SucKhoeBean temp = new SucKhoeBean();
            idNhanKhau = rs.getInt("nhanKhauID");
//            temp.getNhanKhauBean().getNhanKhauModel().setID(idNhanKhau);
            if(idNhanKhau > 0){
//                String sql = "SELECT * FROM nhan_khau INNER JOIN chung_minh_thu ON nhan_khau.ID = chung_minh_thu.idNhanKhau WHERE nhan_khau.ID = " + idNhanKhau;
//                PreparedStatement prst = (PreparedStatement)connection.prepareStatement(sql);
//                ResultSet rs_l = prst.executeQuery();
//                while(rs_l.next()){
//                    temp.getNhanKhauBean().getNhanKhauModel().setHoTen(rs_l.getString("hoTen"));
//                    temp.getNhanKhauBean().getNhanKhauModel().setDiaChiHienNay(rs_l.getString("diaChiHienNay"));
//                    temp.getNhanKhauBean().getNhanKhauModel().setNamSinh(rs_l.getDate("namSinh"));
//                    temp.getNhanKhauBean().getChungMinhThuModel().setSoCMT(rs_l.getString("soCMT"));
//                }
//                prst.close();
//                
//                List<SucKhoeModel> listSucKhoe = new ArrayList<>();
//                sql = "SELECT * FROM suc_khoe where nhanKhauID = " + idNhanKhau +  " ORDER BY sucKhoeID DESC";
//                prst = (PreparedStatement)connection.prepareStatement(sql);
//                rs_l = prst.executeQuery();
//                while(rs_l.next()){
//                    SucKhoeModel sucKhoeModel = new SucKhoeModel();
//                    sucKhoeModel.setNhanKhauID(idNhanKhau);
//                    sucKhoeModel.setSucKhoeID(rs_l.getInt("sucKhoeID"));
//                    sucKhoeModel.setTrangThaiSucKhoe(rs_l.getString("trangThaiSucKhoe"));
//                    sucKhoeModel.setTrieuChungCovid(rs_l.getInt("trieuChungCovid"));
//                    sucKhoeModel.setNgayCapNhat(rs_l.getDate("ngayCapNhat"));
//                    listSucKhoe.add(sucKhoeModel);
//                }
//                prst.close();
//                temp.setListSucKhoe(listSucKhoe);
//                temp.setSucKhoeCuoi(listSucKhoe.get(0));
                SucKhoeBean temp = getSucKhoeBean(idNhanKhau);
                list.add(temp);
            }
        }
        preparedStatement.close();
        connection.close();
    } catch(Exception e){
        System.out.println(e.getMessage());
    }
    return list;
    }
    
    public boolean insertSucKhoe(SucKhoeModel sucKhoeModel){
        try{
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "INSERT INTO suc_khoe(nhanKhauID, trangThaiSucKhoe, trieuChungCovid,ngayCapNhat) values (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, sucKhoeModel.getNhanKhauID());
            preparedStatement.setString(2, sucKhoeModel.getTrangThaiSucKhoe());
            preparedStatement.setInt(3, sucKhoeModel.getTrieuChungCovidInt());
            Date date = new Date(sucKhoeModel.getNgayCapNhat().getTime());
            preparedStatement.setDate(4, date);
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
            return true;
        } catch(Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra");
            return false;
        }
    }
    public List<SucKhoeBean> statisticSucKhoe(String tuNgay, String denNgay, String trieuChung, String tinhTrangSucKhoe){
        List<SucKhoeBean> list = new ArrayList<>();
        String query = "SELECT nhanKhauID, MAX(sucKhoeID) FROM suc_khoe ";
        StringJoiner condition = new StringJoiner(" AND ");
        if(tuNgay != null) condition.add("suc_khoe.ngayCapNhat >= '" + tuNgay + "'");
        if(denNgay != null) condition.add("suc_khoe.ngayCapNhat <= '" + denNgay + "'");
        if(trieuChung != null){
            if(trieuChung.equals("Co")){
                condition.add("suc_khoe.trieuChungCovid = 1");
            }
            if(trieuChung.equals("Khong")){
                condition.add("suc_khoe.trieuChungCovid = 0");
            }
        }
        if(tinhTrangSucKhoe != null){
            condition.add("suc_khoe.trangThaiSucKhoe LIKE '%" + tinhTrangSucKhoe + "%'");
        }
        if(condition.length() > 0){
            query += "WHERE ";
            query += condition.toString();
        }
//        query += " suc_khoe.trangThaiSucKhoe LIKE '%" + tinhTrangSucKhoe + "%'";
//        if(tuNgay != null) {
//            query += " AND suc_khoe.ngayCapNhat >= '" + tuNgay + "'";
//        }
//        if(denNgay != null){
//           query += " AND suc_khoe.ngayCapNhat <= '" + denNgay + "'";
//        } 
//        if(trieuChung.equals("Co")) {
//            query += " AND suc_khoe.trieuChungCovid == 1";
//        }
//        if(trieuChung.equals("Khong")){
//            query += " AND suc_khoe.trieuChungCovid == 0";
//        }
        query += " GROUP BY nhanKhauID ORDER BY MAX(sucKhoeID) DESC";
        try{
            Connection connection = MysqlConnection.getMysqlConnection();
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            int nhanKhauID = -1;
            while(rs.next()){
                nhanKhauID = rs.getInt("nhanKhauID");
                if(nhanKhauID > 0){
                    SucKhoeBean temp = getSucKhoeBean(nhanKhauID);
                    list.add(temp);
                }
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e){
        JOptionPane.showMessageDialog(null, "Lỗi");
        }
        return list;
    }
    
    public List<SucKhoeBean> search(String keyword){
        if(keyword.trim().isEmpty()){
            return getListSucKhoe();
        }
        NhanKhauService nhanKhauService = new NhanKhauService();
        List<SucKhoeBean> list = new ArrayList<>();
        List<NhanKhauBean> listNhanKhauBeans = nhanKhauService.search(keyword.trim());
        for(int i = 0; i< listNhanKhauBeans.size(); i++){
            NhanKhauBean nhanKhauBean = listNhanKhauBeans.get(i);
            int idNhanKhau = nhanKhauBean.getNhanKhauModel().getID();
            SucKhoeBean temp = getSucKhoeBean(idNhanKhau);
            if(temp.getNhanKhauBean().getNhanKhauModel().getID() > 0){
                list.add(temp);
            }
        }
        return list;
    }
    
//    public static void main(String[] args) {
//        SucKhoeService service = new SucKhoeService();
//        List<SucKhoeBean> list = service.search("Dũng");
//        for(int i = 0; i < list.size(); i++){
//            System.out.println(StringService.covertToString(list.get(i).toString()));
//        }
//    }
}
