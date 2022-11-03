package Circle;

import java.util.Scanner;

public class Circle2 {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("nhập bán kính");
        Scanner abc = new Scanner(System.in);
        circle.radius = abc.nextDouble();

        System.out.println("chu vi là "+circle.calculateArea());
        System.out.println("diện tích là"+circle.calculatePerimeter());


    }
}
