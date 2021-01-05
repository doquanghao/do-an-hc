package com.company.run;

import com.company.nhanvien.luong;
import com.company.nhanvien.luongbanthoigian;
import com.company.nhanvien.nhanvien;
import com.company.nhaptt.nhap_luong;
import com.company.nhaptt.nhap_luongbanthoigian;
import com.company.nhaptt.nhap_nhanvien;

import java.util.ArrayList;
import java.util.Scanner;

public class run {
    public static void dangnhap(nhanvien nhanvien, luong luong, luongbanthoigian luongbanthoigian, nhap_nhanvien nhap_nhanvien, nhap_luong nhap_luong, nhap_luongbanthoigian nhap_luongbanthoigian, ArrayList<luong> luongs, ArrayList<nhanvien>nhanviens, ArrayList<luongbanthoigian> luongbanthoigians, run_nhanvien run_nhanvien, run_luongbanthoigian run_luongthoigian, run_luong run_luong){
    int chon;
    Scanner scanner=new Scanner(System.in);
    do{
        chonmenu();
        chon=Integer.parseInt(scanner.nextLine());
        switch (chon){
            case 1: run_nhanvien.run_nhan_vien(nhanvien,luong,luongbanthoigian,nhap_nhanvien,nhap_luong,nhap_luongbanthoigian,luongs,nhanviens,luongbanthoigians,run_nhanvien,run_luongthoigian,run_luong);

                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();
                break;
                case 2:
                run_luong.run_luong(nhanvien,luong,luongbanthoigian,nhap_nhanvien,nhap_luong,nhap_luongbanthoigian,luongs,nhanviens,luongbanthoigians,run_nhanvien,run_luongthoigian,run_luong);scanner.nextLine();
            case 3:
                run_luongthoigian.run_luongbanthoigian(nhanvien,luong,luongbanthoigian,nhap_nhanvien,nhap_luong,nhap_luongbanthoigian,luongs,nhanviens,luongbanthoigians,run_nhanvien,run_luongthoigian,run_luong);
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();
                break;
            case 4:
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╔══════════════════════════════════════════════════╗");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║                Goodbye !!!!!!! :))               ║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╚══════════════════════════════════════════════════╝");

                break;
            default:
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╔════════════════════════════════════════════════════════════════╗");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║         nhập sai vui lòng nhập lại !!!!!!!!!!!!!!!!!! :)       ║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╚════════════════════════════════════════════════════════════════╝");

                break;
        }
    }while (chon!=4);
}

    static void chonmenu(){
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╔══════════════════════════════════════════╗");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║ 1.thông tin cho nhân viên                ║ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║ 2.thông tin lương cho nhân viên          ║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║ 3.thông tin lương cho nhân viên thời vụ  ║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║ 4.thoát                                  ║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╚══════════════════════════════════════════╝");
    }
}
