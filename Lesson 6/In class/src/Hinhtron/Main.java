package Hinhtron;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hinhtron hinhtron = new Hinhtron();

        System.out.println("Nhập bán kính hình tròn");
        double r = new Scanner(System.in).nextDouble();

        hinhtron.setBanKinh(r);
        System.out.println("Chu vi hình tròn" + hinhtron.chuVi());
        System.out.println("Diện tích hình tròn" + hinhtron.dienTich());


        System.out.println("Nhập tuoir sinh viên");
        int tuoi = new Scanner(System.in).nextInt();

        Student st1 = new Student();
        st1.setAge(tuoi);

    }
}
