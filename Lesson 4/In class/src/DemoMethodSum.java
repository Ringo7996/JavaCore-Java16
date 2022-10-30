import java.util.Scanner;

public class DemoMethodSum {
    public static void main(String[] args) {
        System.out.println("Nhập vào số nguyên dương a");
        int a1 = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào số nguyên dương b");
        int b1 = new Scanner(System.in).nextInt();
        System.out.println("Tổng 2 là "+tinhTong2(a1,b1));
        tinhTong(a1, b1);
    }

    public static void tinhTong(int a, int b) {
        int S = a + b;
        System.out.println("Tổng là " + S);
        return;
    }

    public static int tinhTong2(int a, int b) {
        int S = a + b;
        return S;
    }

}
