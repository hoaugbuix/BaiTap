package com.dev.handle;

import com.dev.constructs.MayTinh;
import com.dev.constructs.XuatXu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MayTinhHandle implements BaseHandler<MayTinh>{
    private List<MayTinh> mayTinh = new ArrayList<>();

    public static Scanner scanner = new Scanner(System.in);

    @Override
    public List<MayTinh> getAll() {
        List<MayTinh> newArray = new ArrayList<>();
        for (MayTinh ms : mayTinh) {
            newArray.add(ms);
        }
        return newArray;
    }

//    @Override
    public List<MayTinh> getName(String xuatxu) {
        List<MayTinh> newArray = new ArrayList<>();
        MayTinh mt = new MayTinh();
        if (mt.getXuatXu().equals(xuatxu)){
            newArray.add(mt);
        }
        return newArray;
    }

    @Override
    public void save() {
        MayTinh value= new MayTinh();
        System.out.print("Vui lòng nhập số hiệu: ");
        Integer soHieu = scanner.nextInt();
        System.out.print("Vui lòng nhập tên: ");
        scanner.nextLine();
        String ten = scanner.nextLine();
        System.out.print("Vui lòng nhập xuất xứ: ");
        String xuatXu = scanner.nextLine();
        String xx = XuatXu.getTypeByInput(xuatXu);
        System.out.print("Vui lòng nhập năm nhập: ");
        Integer namNhap = scanner.nextInt();
        System.out.print("Vui lòng nhập cấu hình: ");
        scanner.nextLine();
        String cauHinh = scanner.nextLine();

        if (value != null) {
            value.setSoHieu(soHieu);
            value.setTen(ten);
            value.setXuatXu(xx);
            value.setNamNhap(namNhap);
            value.setCauHinh(cauHinh);
            mayTinh.add(value);
        }
    }

    @Override
    public List<MayTinh> getId(int id) {
        for (MayTinh mss : mayTinh){
            if (mss.getSoHieu() == (Integer) id) {
                mayTinh.add(mss);
            }
        }
        return mayTinh;
    }

    @Override
    public void delete(int id) {
        MayTinh mss = null;
        int size = mayTinh.size();
        for (int i = 0; i <= size; i++){
            if (mayTinh.get(i).getSoHieu() == id) {
                mss = mayTinh.get(id);
                break;
            }
        }
        if (mss != null) {
            mayTinh.remove(mss);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }
}
