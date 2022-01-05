
package models;

/**
 *
 * @author Admin
 */
public class SucKhoeModel {
    private int ID;
    private String maNhanKhau;
    private String hoTen;
    private String trinhTrangSucKhoe;
    private String ghiChu;

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaNhanKhau() {
        return maNhanKhau;
    }

    public void setMaNhanKhau(String maNhanKhau) {
        this.maNhanKhau = maNhanKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTrinhTrangSucKhoe() {
        return trinhTrangSucKhoe;
    }

    public void setTrinhTrangSucKhoe(String trinhTrangSucKhoe) {
        this.trinhTrangSucKhoe = trinhTrangSucKhoe;
    }
    
    
}
