package Rectangle;

import Circle.Circle;

import java.util.Scanner;

public class RectangleOPP {
    public static void main(String[] args) {
        Rectangle hinhCN1 = new Rectangle();
        System.out.println("Nhập chiều dài");
        hinhCN1.length=new Scanner(System.in).nextDouble();
        System.out.println("Nhập chiều rộng");
        hinhCN1.width = new Scanner(System.in).nextDouble();

        System.out.println("Chu vi là " +hinhCN1.calculatePerimeter());
        System.out.println("Diện tích là "+hinhCN1.calculateArea());

    }
}
