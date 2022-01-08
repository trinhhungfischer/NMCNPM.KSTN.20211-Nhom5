package Bean;

import java.util.ArrayList;
import java.util.List;

import models.XetNghiemModel;

public class XetNghiemBean {
    private XetNghiemModel xetNghiemModel;
    private List<XetNghiemModel> listXetNghiemModels;

    public XetNghiemBean(XetNghiemModel xetNghiemModel, List<XetNghiemModel> listXetNghiemModels) {
        this.xetNghiemModel = xetNghiemModel;
        this.listXetNghiemModels = listXetNghiemModels;
    }
    
    public XetNghiemBean() {
        this.xetNghiemModel = new XetNghiemModel();
        this.listXetNghiemModels = new ArrayList<>();
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
                + "<p>Mã xét nghiệm: <b>" + xetNghiemModel.getXetNghiemID()+ "</p>"
                + "<p>Mã nhân khẩu: <b>" + xetNghiemModel.getNhanKhauID() + "</p>"
                + "<p>Ngày xét nghiệm: <b>" + xetNghiemModel.getNgayXetNghiem().toString() + "</p>"
                + "<p>Nơi xét nghiệm: <b>" + xetNghiemModel.getNoiXetNghiem() + "</p>"
                + "<p>Nơi xét nghiệm: <b>" + xetNghiemModel.getHinhThucXetNghiem() + "</p>"
                + "<p>Nơi xét nghiệm: <b>" + xetNghiemModel.getKetQuaXetNghiem() + "</p>";
            
        for (int i = 0; i < listXetNghiemModels.size(); i++) {
            res += "<tr>"
                    + "<td>"
                    + listXetNghiemModels.get(i).getNhanKhauID()
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
