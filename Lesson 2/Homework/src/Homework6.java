import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        double r;

        System.out.println("Nhập bán kính r của đường tròn");
        Scanner nhap_r = new Scanner(System.in);
        r = nhap_r.nextDouble();

        double C = r*2*Math.PI;
        double S = r*r*Math.PI;

        System.out.println("Hình tròn có chu vi là "+C+" và diện tích là "+S);
    }
}
