package com.dev;

import com.dev.constructs.MayTinh;
import com.dev.constructs.XuatXu;
import com.dev.handle.MayTinhHandle;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

	// write your code here
        MayTinhHandle mayTinhHandle = new MayTinhHandle();
        Test test = new Test();
        mayTinhHandle.save();


        System.out.print("Nhập Mã: ");
        int ma = scanner.nextInt();
       List<MayTinh> mayTinh = mayTinhHandle.getId(ma);
       System.out.println("ID" +mayTinh);
       System.out.print("Nhap xx: ");
       String xx = scanner.nextLine();
       mayTinhHandle.getName(XuatXu.getTypeByInput(xx));


        for (MayTinh ms : mayTinhHandle.getAll()) {
            System.out.println("MSSS"+ms);
        }
    }
}
