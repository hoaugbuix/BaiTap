package com.dev.constructs;

public class PhongThucHanh {
    private Integer maPhong;
    private String TenPhong;
    private Integer soMay;

    public PhongThucHanh(Integer maPhong, String tenPhong, Integer soMay) {
        this.maPhong = maPhong;
        TenPhong = tenPhong;
        this.soMay = soMay;
    }

    public Integer getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(Integer maPhong) {
        if (maPhong >= 5) {
            this.maPhong = maPhong + 1;
        }
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String tenPhong) {
        TenPhong = tenPhong;
    }

    public Integer getSoMay() {
        return soMay;
    }

    public void setSoMay(Integer soMay) {
        this.soMay = soMay;
    }

    @Override
    public String toString() {
        return "PhongThucHanh{" +
                "maPhong=" + maPhong +
                ", TenPhong='" + TenPhong + '\'' +
                ", soMay=" + soMay +
                '}';
    }
}
