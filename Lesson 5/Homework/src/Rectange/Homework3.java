package Rectange;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        System.out.print("Nhập chiều dài hình chữ nhật ");
        double width = new Scanner(System.in).nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật ");
        double height = new Scanner(System.in).nextDouble();
        System.out.print("Nhập màu sắc hình chữ nhật ");
        String color = new Scanner(System.in).nextLine();

        Rectange hcn = new Rectange(width,height,color);

        System.out.println("-----------");
        System.out.println("Hình chữ nhật có chiều dài "+hcn.width+ ", chiều rộng "+hcn.height+", màu "+ hcn.color);
        System.out.println("Diện tích là "+hcn.findArea());
        System.out.println("Chu vi là "+hcn.findPerimeter());
    }
}
