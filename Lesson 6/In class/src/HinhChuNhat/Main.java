package HinhChuNhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        System.out.println("Nhập chiều dài");
        double a = new Scanner(System.in).nextDouble();
        hinhChuNhat.setChieuDai(a);

        System.out.println("Nhập chiều rộng");
        double b = new Scanner(System.in).nextDouble();


        hinhChuNhat.setChieuRong(b);

        System.out.println("Chu vi hình chữ nhật: " + hinhChuNhat.chuVi());
        System.out.println("Diện tích hình chữ nhật: " + hinhChuNhat.dienTich());

    }
}
