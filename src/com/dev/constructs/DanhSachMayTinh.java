package com.dev.constructs;

public class DanhSachMayTinh {
    private Integer id;
    private String xuatXu;
    private int soLuong;
    private String tinhTrang;

    public DanhSachMayTinh(Integer id, String xuatXu, int soLuong, String tinhTrang) {
        this.id = id;
        this.xuatXu = xuatXu;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
    }

    public DanhSachMayTinh() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        int data = (int) (Math.random() * 5 + 1);
        this.id = data;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "DanhSachMayTinh{" +
                "id=" + id +
                ", xuatXu='" + xuatXu + '\'' +
                ", soLuong=" + soLuong +
                ", tinhTrang='" + tinhTrang + '\'' +
                '}';
    }
}
