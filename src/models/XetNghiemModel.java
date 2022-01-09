package models;

import java.util.Date;
import java.util.Date;
import utility.DateString;
/**
 *
 * @author Dat
 */
public class XetNghiemModel {

    private int xetNghiemID;
    private int nhanKhauID;
    private Date ngayXetNghiem;
    private String noiXetNghiem;
    private String hinhThucXetNghiem;
    private String ketQuaXetNghiem;
   

    public int getXetNghiemID() {
        return xetNghiemID;
    }

    public void setXetNghiemID(int xetNghiemID) {
        this.xetNghiemID = xetNghiemID;
    }

    public int getNhanKhauID() {
        return nhanKhauID;
    }

    public void setNhanKhauID(int nhanKhauID) {
        this.nhanKhauID = nhanKhauID;
    }

    public Date getNgayXetNghiem() {
        return ngayXetNghiem;
    }

    public void setNgayXetNghiem(Date ngayXetNghiem) {
        this.ngayXetNghiem = ngayXetNghiem;
    }

    public String getNoiXetNghiem() {
        return noiXetNghiem;
    }

    public void setNoiXetNghiem(String noiXetNghiem) {
        this.noiXetNghiem = noiXetNghiem;
    }

    public String getHinhThucXetNghiem() {
        return hinhThucXetNghiem;
    }

    public void setHinhThucXetNghiem(String hinhThucXetNghiem) {
        this.hinhThucXetNghiem = hinhThucXetNghiem;
    }

    public String getKetQuaXetNghiem() {
        return ketQuaXetNghiem;
    }

    public void setKetQuaXetNghiem(String ketQuaXetNghiem) {
        this.ketQuaXetNghiem = ketQuaXetNghiem;
    }

}
