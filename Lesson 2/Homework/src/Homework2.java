import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        System.out.println("Giải phương trình  ax2 + bx + c = 0 (a khác 0)");

        System.out.println("Nhập hệ số a");
        Scanner nhap_a = new Scanner(System.in);
        a = nhap_a.nextDouble();

        System.out.println("Nhập hệ số b");
        Scanner nhap_b = new Scanner(System.in);
        b = nhap_b.nextDouble();

        System.out.println("Nhập hệ số c");
        Scanner nhap_c = new Scanner(System.in);
        c = nhap_c.nextDouble();

        double delta = b*b-4*a*c;

        String x = (delta<0)?"Phương trình vô nghiệm":(delta==0)? "Phương trình có 1 nghiệm x="+ (-b/(2*a)): "Phương trình có 2 nghiệm x1="+ (-b+Math.sqrt(delta))/(2*a) +" và x2= "+ (-b-Math.sqrt(delta))/(2*a);
        System.out.println(x);
    }
}
