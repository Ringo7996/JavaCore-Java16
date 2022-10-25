import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        double a;
        double b;

        System.out.println("Giải phương trình bậc nhất ax + b = 0");

        Scanner nhap_a = new Scanner(System.in);
        System.out.println("Nhập hệ số a");
        a = nhap_a.nextDouble();

        Scanner nhap_b = new Scanner(System.in);
        System.out.println("Nhập hệ số b");
        b = nhap_b.nextDouble();

        String x = (a==0)&&(b!=0)? "Phương trình vô nghiệm": (a==0)&&(b==0)? "Phương trình vô số nghiệm" : "Phương trình có nghiệm x="+ (-b/a);
        System.out.println(x);
    }
}
