package com.company.run;

import com.company.nhanvien.luong;
import com.company.nhanvien.luongbanthoigian;
import com.company.nhanvien.nhanvien;
import com.company.nhaptt.nhap_luong;
import com.company.nhaptt.nhap_luongbanthoigian;
import com.company.nhaptt.nhap_nhanvien;
import java.util.ArrayList;
import java.util.Scanner;

public class run_luong {
    public  void menu(){
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╔══════════════════════════════════════════╗");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║ 1.nhập thông tin lương cho nhân viên     ║ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║ 2.hiển thị thông lương tin nhân viên     ║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║ 3.tim kiếm                               ║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║ 4.sắp xếp theo tăng dần                  ║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║ 5.sắp xếp theo giảm dần                  ║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║ 6.thoát                                  ║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╚══════════════════════════════════════════╝");

    }
    public void run_luong(nhanvien nhanvien, luong luong, luongbanthoigian luongbanthoigian, nhap_nhanvien nhap_nhanvien, nhap_luong nhap_luong, nhap_luongbanthoigian nhap_luongbanthoigian, ArrayList<luong> luongs, ArrayList<nhanvien>nhanviens, ArrayList<luongbanthoigian> luongbanthoigians, run_nhanvien run_nhanvien, run_luongbanthoigian run_luongthoigian, run_luong run_luong){
        int chon;
        Scanner scanner=new Scanner(System.in);
        do {
            menu();
            chon=Integer.parseInt(scanner.nextLine());
            switch (chon){
                case 1:
                    nhap_nhanvien.xem(nhanviens);
                    nhap_luong.add(luongs,luong);
                    nhap_luong.ghifile(luongs);
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();
                    break;
                case 2:
                    nhap_luong.xem(luongs);
                    scanner.nextLine();break;
                case 3:
                    nhap_luong.timkiem(luongs);
                    nhap_luong.ghifile(luongs);System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();break;
                case 4:
                    nhap_luong.xapsep(luongs);
                    nhap_luong.ghifile(luongs);
                    nhap_luong.xem(luongs);
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();
                    break;
                case 5:
                    nhap_luong.xapsep1(luongs);
                    nhap_luong.ghifile(luongs);
                    nhap_luong.xem(luongs);System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();break;
                case 6:
                    run.dangnhap(nhanvien,luong,luongbanthoigian,nhap_nhanvien,nhap_luong,nhap_luongbanthoigian,luongs, nhanviens,luongbanthoigians,run_nhanvien,run_luongthoigian,run_luong);
                    break;
                default:
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╔════════════════════════════════════════════════════════════════╗");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║         nhập sai vui lòng nhập lại !!!!!!!!!!!!!!!!!! :)       ║ ");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╚════════════════════════════════════════════════════════════════╝");
                    break;
            }
        }while (chon!=6);
    }
}
