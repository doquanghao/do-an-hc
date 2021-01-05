package com.company;
import  com.company.nhanvien.*;
import com.company.nhaptt.*;
import com.company.run.*;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<nhanvien>nhanviens =new ArrayList<>();
        ArrayList<luong>luongs=new ArrayList<>();
        ArrayList<luongbanthoigian>luongbanthoigians=new ArrayList<>();
        luong luong=new luong();
        nhanvien nhanvien=new nhanvien();
        luongbanthoigian luongbanthoigian=new luongbanthoigian();
        nhap_nhanvien nhap_nhanvien=new nhap_nhanvien();
        nhap_luong nhap_luong=new nhap_luong();
        nhap_luongbanthoigian nhap_luongbanthoigian=new nhap_luongbanthoigian();
        run_nhanvien run_nhanvien =new run_nhanvien();
        run_luongbanthoigian run_luongthoigian=new run_luongbanthoigian();
        run_luong run_luong=new run_luong();
        nhap_nhanvien.docfile(nhanviens);
        nhap_luong.docfile(luongs);
        run run=new run();
        nhap_luongbanthoigian.docfile(luongbanthoigians);
        Scanner sc = new Scanner(System.in);
        String xau = "admin";
        String mk1="123456";
        while (true) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t════════════════════════════════════════════════");
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTài khoản: ");
            String taikhoan = sc.nextLine();
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t════════════════════════════════════════════════");
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tMật khẩu: ");
            String mk = sc.nextLine();
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t════════════════════════════════════════════════");

            if (taikhoan.equals(xau) && mk.equals(mk1)) {

                try {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╔═════════════════════════════════════════════════════════════════════════════════╗");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║                               Đăng nhập thành công >>>                          ║ ");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╚═════════════════════════════════════════════════════════════════════════════════╝");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╔═════════════════════════════════════════════════════════════════════════════════╗");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║                                                                                 ║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║                           Chương trình quản lý nhân viên                        ║   ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║                                   nhà Hàn Sen                                   ║");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║                                                                                 ║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║═════════════════════════════════════════════════════════════════════════════════║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║                                                                                 ║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║                 Giảng viên hướng     :  NGUYỄN THỊ HẢI NẰNG                     ║");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║                                                                                 ║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║                 SINH VIÊN THỰC HIỆN  :  ĐỖ QUANG HÀO                            ║");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║                                                                                 ║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║═════════════════════════════════════════════════════════════════════════════════║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║                              Nhấn ENTER để tiếp tục                             ║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╚═════════════════════════════════════════════════════════════════════════════════╝");
                sc.nextLine();
        run.dangnhap(nhanvien,luong,luongbanthoigian,nhap_nhanvien,nhap_luong,nhap_luongbanthoigian,luongs,nhanviens,luongbanthoigians,run_nhanvien,run_luongthoigian,run_luong);
                break;
            } else {
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╔═════════════════════════════════════════════════════════════════════════════════╗");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║                        Thông tin tài khoản hoặc mật khẩu không                  ║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╚═════════════════════════════════════════════════════════════════════════════════╝");
            }
        }
    }

}
