import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        double chieudai;
        double chieurong;

        Scanner nhap_chieu_dai = new Scanner(System.in);
        System.out.println("Nhập chiều dài hình chữ nhật");
        chieudai = nhap_chieu_dai.nextDouble();

        Scanner nhap_chieu_rong = new Scanner(System.in);
        System.out.println("Nhập chiều rộng hình chữ nhật");
        chieurong = nhap_chieu_rong.nextDouble();

        System.out.println("Diện tích hình chữ nhật là "+(chieudai*chieurong));
        System.out.println("Chu vi hình chữ nhật là "+(chieudai+chieurong)*2);
    }
}
