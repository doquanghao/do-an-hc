package com.company.run;
import com.company.nhanvien.*;
import com.company.nhaptt.*;


import java.util.ArrayList;
import java.util.Scanner;

public class run_nhanvien {
    static void menu(){
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╔═════════════════════════════════════╗");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║ 1.nhập thông tin cho nhân viên      ║ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║═════════════════════════════════════║ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║ 2.hiển thị thông tin nhân viên      ║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║═════════════════════════════════════║ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║ 3.tim kiếm                          ║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║═════════════════════════════════════║ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║ 4.sắp xếp theo tên                  ║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║═════════════════════════════════════║ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║  5.thoát                            ║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╚═════════════════════════════════════╝");
    }
    public void run_nhan_vien(nhanvien nhanvien, luong luong, luongbanthoigian luongbanthoigian, nhap_nhanvien nhap_nhanvien, nhap_luong nhap_luong, nhap_luongbanthoigian nhap_luongbanthoigian, ArrayList<luong> luongs, ArrayList<nhanvien>nhanviens, ArrayList<luongbanthoigian> luongbanthoigians, run_nhanvien run_nhanvien, run_luongbanthoigian run_luongthoigian, run_luong run_luong){
      int chon;
        Scanner scanner=new Scanner(System.in);
        do {
            menu();
            chon=Integer.parseInt(scanner.nextLine());
            if(chon==0) break;
            switch (chon){
                case 1:nhap_nhanvien.add(nhanviens,nhanvien);
                    nhap_nhanvien.ghifile(nhanviens);System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();
                    break;
                case 2:
                    nhap_nhanvien.xem(nhanviens);
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();break;
                case 3:
                    nhap_nhanvien.timkiem(nhanviens);
                    nhap_nhanvien.ghifile(nhanviens);
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();break;
                case 4:
                    nhap_nhanvien.xapsep(nhanviens);
                    nhap_nhanvien.ghifile(nhanviens);
                    nhap_nhanvien.xem(nhanviens);
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();
                    break;
                case 5:
                    run.dangnhap(nhanvien,luong,luongbanthoigian,nhap_nhanvien,nhap_luong,nhap_luongbanthoigian,luongs,nhanviens,luongbanthoigians,run_nhanvien,run_luongthoigian,run_luong);
                    break;
                default:
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╔════════════════════════════════════════════════════════════════╗");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║         nhập sai vui lòng nhập lại !!!!!!!!!!!!!!!!!! :)       ║ ");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╚════════════════════════════════════════════════════════════════╝");
                    break;
            }
        }while (chon!=5);
    }
}
