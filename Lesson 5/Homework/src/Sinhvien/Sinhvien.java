package Sinhvien;

import java.util.Scanner;

public class Sinhvien {
    public String msv;
    public String ten;
    public String lop;
    public String khoa;


    public void nhapThongTin() {
        System.out.print("Mã sinh viên là: ");
        this.msv = new Scanner(System.in).nextLine();
        System.out.print("Tên sinh viên là: ");
        this.ten = new Scanner(System.in).nextLine();
        System.out.print("Lớp sinh viên là: ");
        this.lop = new Scanner(System.in).nextLine();
        System.out.print("Khoá sinh viên là: ");
        this.khoa = new Scanner(System.in).nextLine();
        System.out.println("------------------");
    }

    public void inThongTin() {
        System.out.println("MSV: " + msv + "\tLớp: " + lop + "\tKhoá: " + khoa + "\tTên: " + ten);
    }
}

