package com.company.nhaptt;
import com.company.chuanhoa.chuanhoa;
import com.company.intfac.luon_if;
import com.company.nhanvien.luong;
import com.company.nhanvien.nhanvien;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class nhap_luong implements luon_if {
    @Override
    public void add(ArrayList<luong> luongs,luong luong) {
        chuanhoa chuanhoa= new chuanhoa();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.print("\t\t\t   nhập mã nhân viên gồm 4 kí tự :   ");
            while (!luong.setmaNV(scanner.nextLine()));
            boolean a=false;
            for (int i=0;i<luongs.size();i++){
                if(luongs.get(i).getManv().equals(luong.getManv())){
                    a=true;
                }
            }
            if(!a){
                break;
            }
            else {
                System.out.print("\t\t\tnhập lại :");
            }
        }System.out.print("\t\t\tnhập họ  nhân viên :");
        while (!luong.setho(scanner.nextLine())) ;

        System.out.print("\t\t\tnhập tên nhân viên :");
        while (!luong.sethoten(scanner.nextLine())) ;
        chuanhoa.chuanhoadanhturieng(luong.getTenNV());

        System.out.print("\t\t\tnhập tên chức vụ :");
        while (!luong.setchucvu(scanner.nextLine())) ;

        System.out.print("\t\t\tkhu vực làm việc :");
        while (!luong.setkhuvuc(scanner.nextLine())) ;

        do {
            System.out.print("\t\t\tnhập số ngày :");
            luong.setSongaylam(Integer.parseInt(scanner.nextLine()));
        } while (luong.getSongaylam() < 1 || luong.getSongaylam() > 30);

        do {
            System.out.print("\t\t\tnhập số ngày nghỉ có phép:");
            luong.setNgaynghicophep(Integer.parseInt(scanner.nextLine()));
        } while (luong.getNgaynghicophep() < 0 || luong.getNgaynghicophep() > 10);

        do {
            System.out.print("\t\t\tnhập số ngày không có phép:");
            luong.setNgaynghikhongphep(Integer.parseInt(scanner.nextLine()));
        } while (luong.getNgaynghikhongphep() < 0 || luong.getNgaynghikhongphep() > 10);

        do {
            System.out.print("\t\t\tngày làm thêm (nếu có):");
            luong.setSongaylamthem(Integer.parseInt(scanner.nextLine()));
        } while (luong.getSongaylamthem() < 0);

        System.out.print(" ");
        System.out.print("\t\t\tngày nhập  :");
        while (!luong.setngaynhap(scanner.nextLine()));

        luongs.add(new luong(luong.getManv(),luong.getHo(),luong.getTenNV(),luong.getTenchucvu(),luong.getKhuvuc(),luong.getSongaylam(),luong.getSongaylamthem(),luong.getNgaynghicophep(),luong.getNgaynghikhongphep(),luong.getTinhluong(),luong.getNgaynhap()));
        System.out.println("                            ╔═════════════════════════════════════════════╗");
        System.out.println("                            ║           Nhập thành công!                  ║");
        System.out.println("                            ╚═════════════════════════════════════════════╝");

    }
    public void xuat(luong luong){
        System.out.printf("\t\t\t|\t%5s\t|%15s\t|%10s\t|%20s\t|%12s\t|%16s\t|%16s\t|%24s\t|%20s\t|%16s\t| \n",luong.getManv(),luong.getHo(),luong.getTenNV(),luong.getKhuvuc(),luong.getTenchucvu(),luong.getSongaylam(),luong.getSongaylamthem(),luong.ngaynghi(),luong.tinhluong(),luong.getNgaynhap());
    }
    @Override
    public void xem(ArrayList<luong> luongs) {
        System.out.println("\t\t\t╔===================================================================================================================================================================================================╗");
        System.out.printf("\t\t\t|\t%5s\t|%15s\t|%10s\t|%20s\t|%12s\t|%16s\t|%16s\t|%24s\t|%20s\t|%16s\t| \n","mã NV","họ nv","tên NV","khu vực","tên chúc vụ","số ngày làm","số ngày làm thêm","ngày nghỉ","lương","ngày nhập");
        System.out.println("\t\t\t╟===================================================================================================================================================================================================╢");
        for (luong a:luongs){
            xuat(a);
        }
        System.out.println("\t\t\t=====================================================================================================================================================================================================");
        System.out.printf("\t\t\t|\t%5s\t|%142s\t\t\t\t\t\t\t\t\t\t\t|\n","tổng",tong(luongs));
        System.out.println("\t\t\t╚===================================================================================================================================================================================================╝");

    }
    @Override
    public void sua(ArrayList<luong> luongs, luong luong) {
        chuanhoa chuanhoa= new chuanhoa();
            Scanner scanner=new Scanner(System.in);
            while (true) {
            String chon;
                System.out.println("\t\t\t\t\t\t\t\t\t\t╔══════════════════════════════════════════╗");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║ 1.mã nhân viên                           ║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║ 2.họ nhân viên                           ║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║ 3.tên nhân viên                          ║");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║ 4.khu vực làm việc nhân viên             ║");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║ 5.chức vụ nhân viên                      ║");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║ 6.số ngày làm                            ║");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║ 7.số ngày nghỉ có phép                   ║");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║ 8.số ngày nghỉ không phép                ║");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║ 9.số ngày làm thêm                       ║");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║ 10.ngày nhập thông tin                    ║");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║ 0.thoát                                  ║");
                System.out.println("\t\t\t\t\t\t\t\t\t\t╚══════════════════════════════════════════╝");
            chon=scanner.nextLine();
            if(chon.equals("0"))break;
            switch (chon){ case "1":
                System.out.print("\t\t\tnhập mã nhân viên gồm 4 kí tự :");
                while (!luong.setmaNV(scanner.nextLine()));System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();
            break;case "2":
                do {
                    System.out.print("\t\t\tnhập họ nhân viên :");}
                while (!luong.sethoten(scanner.nextLine())) ;System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();break;
                case "3":
            do {
                System.out.print("\t\t\tnhập tên nhân viên :");}
            while (!luong.sethoten(scanner.nextLine())) ;
            chuanhoa.chuanhoadanhturieng(luong.getTenNV());System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();break;
                case "4":
            System.out.print("\t\t\tkhu vực làm việc :");
            while (!luong.setkhuvuc(scanner.nextLine())) ;System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();break;
                case "5":
            System.out.print("\t\t\tnhập tên chức vụ :");
            while (!luong.setchucvu(scanner.nextLine())) ;System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();break;
                case "6":
            do {
                System.out.print("\t\t\tnhập số ngày :");
                luong.setSongaylam(Integer.parseInt(scanner.nextLine()));
            } while (luong.getSongaylam() < 1 || luong.getSongaylam() > 30);System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();break;
                case "7":
            do {
                System.out.print("\t\t\tnhập số ngày nghỉ có phép:");
                luong.setNgaynghicophep(Integer.parseInt(scanner.nextLine()));
            } while (luong.getNgaynghicophep() < 0 || luong.getNgaynghicophep() > 10);System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();break;

                case "8":
            do {
                System.out.print("\t\t\tnhập số ngày không có phép:");
                luong.setNgaynghikhongphep(Integer.parseInt(scanner.nextLine()));
            } while (luong.getNgaynghikhongphep() < 0 || luong.getNgaynghikhongphep() > 10);System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();break;
                case "9":
            do {
                System.out.print("\t\t\tngày làm thêm (nếu có):");
                luong.setSongaylamthem(Integer.parseInt(scanner.nextLine()));
            } while (luong.getSongaylamthem() < 0);System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();break;

                case "10":
            System.out.print("\t\t\tngày nhập  :");
            while (!luong.setngaynhap(scanner.nextLine()));System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Nhấn ENTER để tiếp tục   ");scanner.nextLine();break;
                default:break;}}
    }

    @Override
    public void xapsep(ArrayList<luong> luongs) {
        Collections.sort(luongs, new Comparator<luong>() {
            @Override
            public int compare(luong o1, luong o2) {

                if (o1.tinhluong() == o2.tinhluong()) {
                    return 0;
                } else {
                    if (o1.tinhluong() > o2.tinhluong())
                        return -1;
                    else
                        return 1;
                }
            }
        });
    }

    @Override
    public void xapsep1(ArrayList<luong> luongs) {
        Collections.sort(luongs, new Comparator<luong>() {
            @Override
            public int compare(luong o1, luong o2) {

                if (o1.tinhluong() == o2.tinhluong()) {
                    return 0;
                } else {
                    if (o1.tinhluong() < o2.tinhluong())
                        return -1;
                    else
                        return 1;
                }
            }
        });
    }
    public static luong luong(ArrayList<luong>luongs,String nhap){

        luong result = null;
        for (luong luong : luongs
        ) {
            if (nhap.equals(luong.getManv()) || nhap.equals(luong.getTenNV())
            ) {
                result = luong;
            }
        }
        return result;
    }

    @Override
    public void timkiem(ArrayList<luong> luongs) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("\t\t\tnhập mã nhân viên bạn muốn tìm :");
        String ten=scanner.nextLine();
        luong a=luong(luongs,ten);
        if (a!=null){
            System.out.println("\t\t\t╔===================================================================================================================================================================================================╗");
            System.out.printf("\t\t\t|\t%5s\t|%15s\t|%10s\t|%20s\t|%12s\t|%16s\t|%16s\t|%24s\t|%20s\t|%16s\t| \n","mã NV","họ nv","tên NV","khu vực","tên chúc vụ","số ngày làm","số ngày làm thêm","ngày nghỉ","lương","ngày nhập");
            System.out.println("\t\t\t╟===================================================================================================================================================================================================╢");
                xuat(a);
            System.out.println("\t\t\t=====================================================================================================================================================================================================");
            System.out.println("\t\t\t╚===================================================================================================================================================================================================╝");
            while (true){
                System.out.println("\t\t\t\t\t\t\t\t\t\t╔══════════════════════════════════════════╗");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║ 1.Sửa thông tin nhân viên                ║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║ 2.xóa thông tin nhân viên                ║  ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║ 3.nhân viên có lương cao nhất            ║");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║ 4.nhân viên có lương thấp nhất           ║");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║══════════════════════════════════════════║ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t║ 0.thoát                                  ║");
                System.out.println("\t\t\t\t\t\t\t\t\t\t╚══════════════════════════════════════════╝");

                int choose = scanner.nextInt();
                if(choose==0)break;
                switch (choose) {
                    case 1:
                        sua(luongs,a);xem(luongs);break;
                    case 2:
                        xoa(luongs,a);break;
                    case 3:max(luongs);break;
                    case 4:min1(luongs);break;
                    case 0:break;
                    default:break;
                }
            }
        }else {
            System.out.println("\t\t\t\t\t\t\t\t\t╔═══════════════════════════════════════════════╗");
            System.out.println("\t\t\t\t\t\t\t\t\t║           không tìm thấy nhân viên !!!        ║ ");
            System.out.println("\t\t\t\t\t\t\t\t\t╚═══════════════════════════════════════════════╝");
        }

    }

    @Override
    public void xoa(ArrayList<luong> luongs, luong luong) {
                luongs.remove(luong);
        System.out.println("\t\t\t\t\t\t\t\t\t\t╔════════════════════════════════════╗");
        System.out.println("\t\t\t\t\t\t\t\t\t\t║         xóa thành công             ║ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t╚════════════════════════════════════╝");
    }

    public int maxa(ArrayList<luong> luongs) {
        int max = 0;
        for (luong a: luongs) {
            if (max < a.tinhluong()) {
                max = a.tinhluong();
            }
        }
        return max;
    }
    @Override
    public int max(ArrayList<luong> luongs) {
        int max = maxa(luongs);
        System.out.println("\t\t\t╔===================================================================================================================================================================================================╗");
        System.out.printf("\t\t\t|\t%5s\t|%15s\t|%10s\t|%20s\t|%12s\t|%16s\t|%16s\t|%24s\t|%20s\t|%16s\t| \n","mã NV","họ nv","tên NV","khu vực","tên chúc vụ","số ngày làm","số ngày làm thêm","ngày nghỉ","lương","ngày nhập");
        System.out.println("\t\t\t╟===================================================================================================================================================================================================╢");
         for (luong l : luongs) {
            if (max == l.tinhluong()) {
                xuat(l);
            }
        } System.out.println("\t\t\t===================================================================================================================================================================================================");
        System.out.println("\t\t\t╚===================================================================================================================================================================================================╝");

        return max;
    }

    public int min1(ArrayList<luong> luongs) {
        int max = 0;
        for (luong luonglamfulltime : luongs) {
            if (max > luonglamfulltime.tinhluong()) {
                max = luonglamfulltime.tinhluong();
            }
        }
        return max;
    }

    @Override
    public int min(ArrayList<luong> luongs) {
        int max = min1(luongs);
        System.out.println("\t\t\t╔=================================================================================================================================================================================================╗");
        System.out.printf("\t\t\t|\t%5s\t|%15s\t|%10s\t|%20s\t|%12s\t|%16s\t|%16s\t|%24s\t|%20s\t|%16s\t| \n","mã NV","họ nv","tên NV","khu vực","tên chúc vụ","số ngày làm","số ngày làm thêm","ngày nghỉ","lương","ngày nhập");
        System.out.println("\t\t\t╟=================================================================================================================================================================================================╢");

         for (luong luonglamfulltime : luongs) {
            if (max == luonglamfulltime.tinhluong()) {
                xuat(luonglamfulltime);
            }
        }System.out.println("\t\t\t==================================================================================================================================================================================================");
        System.out.println("\t\t\t╚=================================================================================================================================================================================================╝");

        return max;
    }

    @Override
    public int tong(ArrayList<luong> luongs) {
        int tong=0;
        for (luong a:luongs){
            tong=tong+ a.tinhluong();
        }
        return tong;
    }
    File file=new File("luong.txt");
    @Override
    public void docfile(ArrayList<luong> luongs) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null ) {
                luongs.add(new luong(line.split("#")[0],line.split("#")[1],line.split("#")[2],line.split("#")[3],line.split("#")[4],Integer.parseInt(line.split("#")[5]),Integer.parseInt(line.split("#")[6]),Integer.parseInt(line.split("#")[7]),Integer.parseInt(line.split("#")[8]),Integer.parseInt(line.split("#")[9]),line.split("#")[10]));
            }

            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.getMessage();
            System.out.println("\t\t\t\t\t\t\t\t\t╔════════════════════════════════╗");
            System.out.println("\t\t\t\t\t\t\t\t\t║         lỗi mở file !!!        ║ ");
            System.out.println("\t\t\t\t\t\t\t\t\t╚════════════════════════════════╝");
        } catch (IOException e) {
            e.getMessage();
            System.out.println("\t\t\t\t\t\t\t\t\t╔════════════════════════════════╗");
            System.out.println("\t\t\t\t\t\t\t\t\t║          tập tin trống !!!     ║ ");
            System.out.println("\t\t\t\t\t\t\t\t\t╚════════════════════════════════╝");
        }

    }

    @Override
    public void ghifile(ArrayList<luong> luongs) {
        try {

            FileWriter fileWriter=new FileWriter(file);
            for(luong luonglamfulltime:luongs){
                fileWriter.write(luonglamfulltime.toString()+"\n");}
            fileWriter.close();
        }
        catch (Exception e){
            System.out.println("\t\t\t\t\t\t\t\t\t╔════════════════════════════╗");
            System.out.println("\t\t\t\t\t\t\t\t\t║     lỗi ghi flie !!!       ║ ");
            System.out.println("\t\t\t\t\t\t\t\t\t╚════════════════════════════╝");
            System.out.println(e.getMessage());
        }
    }
}
