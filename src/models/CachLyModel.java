package models;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Hai
 */
public class CachLyModel {
    private int cachLyID;
    private int nhanKhauID;
    private Date  ngayBatDauCachLy;
    private String noiCachLy;
    private int soNgayCachLy;
    private String mucDoCachLy;
    private String hinhThucCachLy;
    private String nguoiChamSoc;
    private String lyDoCachLy;

    public int getCachLyID() {
        return cachLyID;
    }

    public int getNhanKhauID() {
        return nhanKhauID;
    }

    public Date getNgayBatDauCachLy() {
        return ngayBatDauCachLy;
    }

    public String getNoiCachLy() {
        return noiCachLy;
    }

    public int getSoNgayCachLy() {
        return soNgayCachLy;
    }

    public String getMucDoCachLy() {
        return mucDoCachLy;
    }

    public String getHinhThucCachLy() {
        return hinhThucCachLy;
    }

    public String getNguoiChamSoc() {
        return nguoiChamSoc;
    }

    public String getLyDoCachLy() {
        return lyDoCachLy;
    }

    public void setCachLyID(int cachLyID) {
        this.cachLyID = cachLyID;
    }

    public void setNhanKhauID(int nhanKhauID) {
        this.nhanKhauID = nhanKhauID;
    }

    public void setNgayBatDauCachLy(Date ngayBatDauCachLy) {
        this.ngayBatDauCachLy = ngayBatDauCachLy;
    }

    public void setNoiCachLy(String noiCachLy) {
        this.noiCachLy = noiCachLy;
    }

    public void setSoNgayCachLy(int soNgayCachLy) {
        this.soNgayCachLy = soNgayCachLy;
    }

    public void setMucDoCachLy(String mucDoCachLy) {
        this.mucDoCachLy = mucDoCachLy;
    }

    public void setHinhThucCachLy(String hinhThucCachLy) {
        this.hinhThucCachLy = hinhThucCachLy;
    }

    public void setNguoiChamSoc(String nguoiChamSoc) {
        this.nguoiChamSoc = nguoiChamSoc;
    }

    public void setLyDoCachLy(String lyDoCachLy) {
        this.lyDoCachLy = lyDoCachLy;
    }
    
    public Date getNgayKetThucCachLy(){
        Calendar c = Calendar.getInstance();
        c.setTime(ngayBatDauCachLy);
        c.add(Calendar.DATE, soNgayCachLy);
        return c.getTime();
    }
    public String getNgay(int i){
        if(i>1||i<0)return null;
        Calendar c = Calendar.getInstance();
        if(i==0)c.setTime(ngayBatDauCachLy);
        else c.setTime(getNgayKetThucCachLy());
        return String.valueOf(c.get(Calendar.YEAR))+"-"
              +String.valueOf(c.get(Calendar.MONTH)+1)+"-"
              +String.valueOf(c.get(Calendar.DATE))  ;
        
    }
}
