package models;

import java.util.Date;

/**
 *
 * @author Hoang
 */
public class SucKhoeModel {
    private int sucKhoeID;
    private int nhanKhauID;
    private String trangThaiSucKhoe;
    private int trieuChungCovid;
    private Date ngayCapNhat;

    public int getSucKhoeID() {
        return sucKhoeID;
    }

    public void setSucKhoeID(int sucKhoeID) {
        this.sucKhoeID = sucKhoeID;
    }

    public int getNhanKhauID() {
        return nhanKhauID;
    }

    public void setNhanKhauID(int nhanKhauID) {
        this.nhanKhauID = nhanKhauID;
    }

    public String getTrangThaiSucKhoe() {
        return trangThaiSucKhoe;
    }

    public void setTrangThaiSucKhoe(String trangThaiSucKhoe) {
        this.trangThaiSucKhoe = trangThaiSucKhoe;
    }

    public String getTrieuChungCovid() {
        if(trieuChungCovid == 1) return "Co";
        else return "Khong";
    }
    public int getTrieuChungCovidInt(){
        return trieuChungCovid;
    }

    public void setTrieuChungCovid(int trieuChungCovid) {
        this.trieuChungCovid = trieuChungCovid;
    }

    public Date getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(Date ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }
}
