package com.dev.constructs;

import java.util.Date;
import java.util.List;

public class MayTinh {
    private Integer soHieu;
    private String ten;
    private String xuatXu;
    private Integer namNhap;
    private String cauHinh;

    public MayTinh(Integer soHieu, String ten, String xuatXu, Integer namNhap, String cauHinh) {
        this.soHieu = soHieu;
        this.ten = ten;
        this.xuatXu = xuatXu;
        this.namNhap = namNhap;
        this.cauHinh = cauHinh;
    }

    public MayTinh() {
        
    }


    public Integer getSoHieu() {
        return soHieu;
    }

    public void setSoHieu(Integer soHieu) {
        if(soHieu >= 5){
            this.soHieu = soHieu + 1;
        }
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public Integer getNamNhap() {
        return namNhap;
    }

    public void setNamNhap(Integer namNhap) {
        this.namNhap = namNhap;
    }

    public String getCauHinh() {
        return cauHinh;
    }

    public void setCauHinh(String cauHinh) {
        this.cauHinh = cauHinh;
    }

    @Override
    public String toString() {
        return "Computer{" +
                ", soHieu='" + soHieu + '\'' +
                ", ten='" + ten + '\'' +
                ", xuatXu=" + xuatXu +
                ", namNhap=" + namNhap +
                ", cauHinh='" + cauHinh + '\'' +
                '}';
    }
}