/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import java.util.ArrayList;
import java.util.List;
import models.SucKhoeModel;

/**
 *
 * @author Hoang
 */
public class SucKhoeBean {
    private NhanKhauBean nhanKhauBean;
    private List<SucKhoeModel> listSucKhoe;
    private SucKhoeModel sucKhoeCuoi;
    public SucKhoeBean(NhanKhauBean nhanKhauBean, List<SucKhoeModel> listSucKhoe, SucKhoeModel sucKhoeCuoi) {
        this.nhanKhauBean = nhanKhauBean;
        this.listSucKhoe = listSucKhoe;
        this.sucKhoeCuoi = sucKhoeCuoi;
    }
    public SucKhoeBean(){
        this.nhanKhauBean = new NhanKhauBean();
        this.listSucKhoe = new ArrayList<SucKhoeModel>();
        this.sucKhoeCuoi = new SucKhoeModel();
    }
    @Override
    public String toString() {
        String res = "<html> <style>p {padding: 5px; margin-left: 20px} table, th, td {border: 1px solid black; border-collapse: collapse;} table {width: 500px}</style> <div>"
                + "<h3>Thông tin cơ bản"
                + "<p>Mã số nhân khẩu: <b>" + nhanKhauBean.getNhanKhauModel().getID() + "</p>"
                + "<p>Ngày sinh: <b>" + nhanKhauBean.getNhanKhauModel().getNamSinh() + "</p>"
                + "<p> Số CCCD: <b>" + nhanKhauBean.getChungMinhThuModel().getSoCMT() + "</p>"
                + "<p> Địa chỉ: <b>" + nhanKhauBean.getNhanKhauModel().getDiaChiHienNay() + "</p>"
                + "<h4>Lịch sử sức khỏe<table>"
                + "<tr>"
                + "<th>Mã số sức khỏe</th>"
                + "<th>Ngày cập nhật</th>"
                + "<th>Triệu chứng</th>"
                + "<th>Tình trạng sức khỏe</th>"
                + "</tr>";
        for (int i = 0; i < listSucKhoe.size(); i++){
            res += "<tr>"
                    + "<td>"
                    + listSucKhoe.get(i).getSucKhoeID()
                    + "</td>"
                    + "<td>"
                    + listSucKhoe.get(i).getNgayCapNhat()
                    + "</td>"
                    + "<td>"
                    + listSucKhoe.get(i).getTrieuChungCovid()
                    + "</td>"
                    + "<td>"
                    + listSucKhoe.get(i).getTrangThaiSucKhoe()
                    + "</td>"
                    + "</tr>";
        }
        res += "</table></div></html>";
        return res;
    }

    public NhanKhauBean getNhanKhauBean() {
        return nhanKhauBean;
    }

    public void setNhanKhauBean(NhanKhauBean nhanKhauBean) {
        this.nhanKhauBean = nhanKhauBean;
    }

    public List<SucKhoeModel> getListSucKhoe() {
        return listSucKhoe;
    }

    public void setListSucKhoe(List<SucKhoeModel> listSucKhoe) {
        this.listSucKhoe = listSucKhoe;
    }

    public SucKhoeModel getSucKhoeCuoi() {
        return sucKhoeCuoi;
    }

    public void setSucKhoeCuoi(SucKhoeModel sucKhoeCuoi) {
        this.sucKhoeCuoi = sucKhoeCuoi;
    }
}
