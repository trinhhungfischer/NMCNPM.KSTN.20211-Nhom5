package Bean;

import java.util.ArrayList;
import java.util.List;

import models.NhanKhauModel;
import models.XetNghiemModel;
import models.ChungMinhThuModel;

public class XetNghiemBean {
    //private XetNghiemModel xetNghiemModel;
    private NhanKhauModel nhanKhauModel;
    private ChungMinhThuModel chungMinhThuModel;
    private List<XetNghiemModel> listXetNghiemModels;

    public XetNghiemBean(NhanKhauModel nhanKhauModel,List<XetNghiemModel> listXetNghiemModels,ChungMinhThuModel chungMinhThuModel) {
        this.nhanKhauModel = nhanKhauModel;
        this.listXetNghiemModels=listXetNghiemModels;
        this.chungMinhThuModel=chungMinhThuModel;
    }

    public XetNghiemBean() {
        this.nhanKhauModel = new NhanKhauModel();
        this.listXetNghiemModels= new ArrayList<>();
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

    public List<XetNghiemModel> getListXetNghiemModels() {
        return listXetNghiemModels;
    }

    public void setListXetNghiemModels(List<XetNghiemModel> listXetNghiemModels) {
        this.listXetNghiemModels = listXetNghiemModels;
    }
    
    

    
    

    @Override
    public String toString() {
        String res = "<html> <style>p {padding: 5px; margin-left: 20px} table, th, td {border: 1px solid black; border-collapse: collapse;} table {width: 500px}</style> <div>"
                + "<h3>Thông tin cơ bản"
                + "<p>Tên nhân khẩu: <b>" + nhanKhauModel.getHoTen() + "</p>"
                + "<p>Ngày sinh: <b>" + nhanKhauModel.getNamSinh()+ "</p>"
                + "<p>Số CCCD: <b>" + chungMinhThuModel.getSoCMT()+ "</p>"
                + "<p>Nơi thường trú: <b>" + nhanKhauModel.getNoiThuongTru()+ "</p>"
                + "<h4>Lịch sử xét nghiệm<table>"
                + "<tr>"
                + "<th>Ngày xét nghiệm:</th>"
                + "<th>Nơi xét nghiệm:</th>"
                + "<th>Hình thức xét nghiệm:</th>"
                + "<th>Kết quả xét nghiệm:</th>";
            
        for(XetNghiemModel xetNghiemModel: listXetNghiemModels){
            res += "<tr>"
                +  "<td>"
                + xetNghiemModel.getNgayXetNghiem()
                +  "<td>"
                + xetNghiemModel.getNoiXetNghiem()
                +  "<td>"
                + xetNghiemModel.getHinhThucXetNghiem()
                +  "<td>"
                + xetNghiemModel.getKetQuaXetNghiem()
                + "</tr>"   ;
        }
        res += "</table></div></html>";
        return res;
    }

}
