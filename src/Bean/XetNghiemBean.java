package Bean;

import java.util.ArrayList;
import java.util.List;
import Bean.NhanKhauBean;
import models.NhanKhauModel;
import models.XetNghiemModel;
import models.ChungMinhThuModel;

public class XetNghiemBean {
    private XetNghiemModel xetNghiemModel;
    private NhanKhauBean nhanKhauBean;
    private ChungMinhThuModel chungMinhThuModel;
    private NhanKhauModel nhanKhauModel;

    public NhanKhauModel getNhanKhauModel() {
        return nhanKhauModel;
    }

    public void setNhanKhauModel(NhanKhauModel nhanKhauModel) {
        this.nhanKhauModel = nhanKhauModel;
    }
    private List<XetNghiemModel> listXetNghiemModels;

    public XetNghiemBean(XetNghiemModel xetNghiemModel, List<XetNghiemModel> listXetNghiemModels, NhanKhauBean nhanKhauBean, ChungMinhThuModel chungMinhThuModel) {
        this.xetNghiemModel = xetNghiemModel;
        this.listXetNghiemModels = listXetNghiemModels;
        this.nhanKhauBean = nhanKhauBean;
        this.chungMinhThuModel = chungMinhThuModel;
    }
    
    public XetNghiemBean() {
        this.xetNghiemModel = new XetNghiemModel();
        this.listXetNghiemModels = new ArrayList<>();
        this.nhanKhauBean = new NhanKhauBean();
        this.chungMinhThuModel = new ChungMinhThuModel();
    }

    public XetNghiemModel getXetNghiemModel() {
        return xetNghiemModel;
    }

    public void setXetNghiemModel(XetNghiemModel xetNghiemModel) {
        this.xetNghiemModel = xetNghiemModel;
    }


    public List<XetNghiemModel> getListXetNghiemModels() {
        return listXetNghiemModels;
    }

    public void setListNhanKhauModels(List<XetNghiemModel> listXetNghiemModels) {
        this.listXetNghiemModels = listXetNghiemModels;
    }

    
    

    @Override
    public String toString() {
        String res = "<html> <style>p {padding: 5px; margin-left: 20px} table, th, td {border: 1px solid black; border-collapse: collapse;} table {width: 500px}</style> <div>"
                + "<h3>Thông tin cơ bản"
                + "<p>Mã nhân khẩu: <b>" + nhanKhauBean.getNhanKhauModel().getID()+ "</p>"
                + "<p>Ngày sinh: <b>" + nhanKhauBean.getNhanKhauModel().getNamSinh()+ "</p>"
                + "<p>Số CCCD: <b>" + nhanKhauBean.getChungMinhThuModel().getSoCMT()+ "</p>"
                + "<p>Địa chỉ: <b>" + nhanKhauBean.getNhanKhauModel().getDiaChiHienNay()+ "</p>"
                + "<h4>Lịch sử xét nghiệm<table>"
                + "<tr>"
                + "<th>Mã xét nghiệm:</th>"
                + "<th>Ngày xét nghiệm:</th>"
                + "<th>Nơi xét nghiệm:</th>"
                + "<th>Hình thức xét nghiệm:</th>"
                + "<th>Kết quả xét nghiệm:</th>";
            
        for (int i = 0; i < listXetNghiemModels.size(); i++) {
            res += "<tr>"
                    + "<td>"
                    + listXetNghiemModels.get(i).getXetNghiemID()
                    + "</td>"
                    + "<td>"
                    + listXetNghiemModels.get(i).getNgayXetNghiem().toString()
                    + "</td>"
                    + "<td>"
                    + listXetNghiemModels.get(i).getNoiXetNghiem()
                    + "</td>"
                    + "<td>"
                    + listXetNghiemModels.get(i).getHinhThucXetNghiem()
                    + "</td>"
                    + "<td>"
                    + listXetNghiemModels.get(i).getKetQuaXetNghiem()
                    + "</td>"
                    + "</tr>";
        }
        res += "</table></div></html>";
        return res;
    }

}
