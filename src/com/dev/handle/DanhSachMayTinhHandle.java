package com.dev.handle;

import com.dev.constructs.DanhSachMayTinh;
import com.dev.constructs.MayTinh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DanhSachMayTinhHandle  implements BaseHandler<DanhSachMayTinh>{
    List<DanhSachMayTinh>  danhsach = new ArrayList<>();

    private MayTinhHandle mayTinhHandle;

    @Override
    public List<DanhSachMayTinh> getAll() {
        return null;
    }

    @Override
    public void save() {
        DanhSachMayTinh ds = new  DanhSachMayTinh();
        MayTinh mt = new MayTinh();
        ds.getId();
        ds.setXuatXu(mt.getXuatXu());
//        if (mt.getXuatXu())
        int cout = mayTinhHandle.getAll().size();
        ds.setSoLuong(cout);
        ds.setTinhTrang(ds.getTinhTrang() != null ? "hoat dong": "khong hoat dong");
        danhsach.add(ds);
    }

    @Override
    public List<DanhSachMayTinh> getId(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
