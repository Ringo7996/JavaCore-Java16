package Sinhvien;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        System.out.print("Nhập số lượng sinh viên muốn thêm mới ");
        int soSinhVien = new Scanner(System.in).nextInt();
        Sinhvien[] sinhviens = new Sinhvien[soSinhVien];

        for (int i = 0; i < soSinhVien; i++) {
            sinhviens[i] = new Sinhvien();
            sinhviens[i].nhapThongTin();
        }

        System.out.println("Danh sách sinh viên");
        for (int i = 0; i < soSinhVien; i++) {
            sinhviens[i].inThongTin();
        }
        System.out.println("------------------");

        System.out.println("Sắp xếp danh sách theo tên sinh viên");
        Sinhvien temp;
        for (int i = 0; i < soSinhVien; i++) {
            for (int j = 0; j < soSinhVien; j++) {
                if (sinhviens[i].ten.compareToIgnoreCase(sinhviens[j].ten) < 0) {
                    temp = sinhviens[i];
                    sinhviens[i] = sinhviens[j];
                    sinhviens[j] = temp;
                }
            }
        }
        for (int i = 0; i < soSinhVien; i++) {
            sinhviens[i].inThongTin();
        }
        System.out.println("------------------");


        System.out.println("Sắp xếp danh sách theo lớp");
        Sinhvien temp1;
        for (int i = 0; i < soSinhVien; i++) {
            for (int j = 0; j < soSinhVien; j++) {
                if (sinhviens[i].lop.compareToIgnoreCase(sinhviens[j].lop) < 0) {
                    temp1 = sinhviens[i];
                    sinhviens[i] = sinhviens[j];
                    sinhviens[j] = temp1;
                }
            }
        }
        for (int i = 0; i < soSinhVien; i++) {
            sinhviens[i].inThongTin();
        }
        System.out.println("------------------");
    }
}

