package Bean;

import java.util.ArrayList;
import java.util.List;
import models.CachLyModel;
import models.ChungMinhThuModel;

import models.NhanKhauModel;


/**
 *
 * @author Hai
 */
public class CachLyBean {
    private NhanKhauModel nhanKhauModel;
    private List<CachLyModel> listCachLyModels;
    private ChungMinhThuModel chungMinhThuModel;
     
    public CachLyBean(NhanKhauModel nhanKhauModel,List<CachLyModel> listCachLyModels,ChungMinhThuModel chungMinhThuModel) {
        this.nhanKhauModel = nhanKhauModel;
        this.listCachLyModels=listCachLyModels;
        this.chungMinhThuModel=chungMinhThuModel;
    }

    public CachLyBean() {
        this.nhanKhauModel = new NhanKhauModel();
        this.listCachLyModels= new ArrayList<>();
        this.chungMinhThuModel= new ChungMinhThuModel();
    }
        
    public NhanKhauModel getNhanKhauModel() {
        return nhanKhauModel;
    }

    public void setNhanKhauModel(NhanKhauModel nhanKhauModel) {
        this.nhanKhauModel = nhanKhauModel;
    }
    
    public ChungMinhThuModel getChungMinhThuModel() {
        return chungMinhThuModel;
    }
    
    public void setChungMinhThuModel(ChungMinhThuModel chungMinhThuModel) {
        this.chungMinhThuModel = chungMinhThuModel;
    }

    public List<CachLyModel> getListCachLyModels() {
        return listCachLyModels;
    }

    public void setListCachLyModels(List<CachLyModel> listCachLyModels) {
        this.listCachLyModels = listCachLyModels;
    }
   
    @Override
    public String toString() {
        String res =  "<html><style>p {padding: 5px; margin-left: 20px} table, th, td {border: 1px solid black; border-collapse: collapse;} table {width: 500px}</style> <div>"
                + "<h3>Thông tin cơ bản:"
                + "<p>Họ tên: <b>" + nhanKhauModel.getHoTen() + "</p>"
                + "<p>Năm sinh: <b>" + nhanKhauModel.getNamSinh() + "</p>"
                + "<p>Giới tính: <b>" + nhanKhauModel.getGioiTinh() + "</p>"
                + "<p>Nơi thường trú: <b>" + nhanKhauModel.getNoiThuongTru()+ "</p>"
                + "<p>Số CMT: <b>" + chungMinhThuModel.getSoCMT()+ "</p>"
                + "<h4>Lịch sử cách ly<table>"
                + "<tr>"
                + "<th>Ngày bắt đầu cách ly</th>"
                + "<th>Nơi cách ly</th>"
                + "<th>Số ngày cách ly</th>"
                + "<th>Ngày kết thúc cách ly</th>"
                + "<th>Mức độ cách ly</th>"
                + "<th>Hình thức cách ly</th>"
                + "<th>Người chăm sóc</th>"
                + "<th>Lý Do cách ly</th>"
                + "</tr>";
        for(CachLyModel cachLyModel: listCachLyModels){
            res += "<tr>"
                +  "<td>"
                + cachLyModel.getNgay(0)
                +  "/td"    
                +  "<td>"
                + cachLyModel.getNoiCachLy()
                +  "/td"
                +  "<td>"
                + String.valueOf(cachLyModel.getSoNgayCachLy())
                +  "/td" 
                +  "<td>"
                + cachLyModel.getNgay(1)
                +  "/td" 
                +  "<td>"
                + cachLyModel.getMucDoCachLy()
                +  "/td"
                +  "<td>"
                + cachLyModel.getHinhThucCachLy()
                +  "/td"
                +  "<td>"
                + cachLyModel.getNguoiChamSoc()
                +  "/td"
                +  "<td>"
                + cachLyModel.getLyDoCachLy()
                +  "/td"
                + "</tr>"    ;
        }

        res +=  "</table>"
                + "</div></html>";
        return res;
    }


}
