import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
//  In ra màn hình kết quả xem số nào lớn nhất trong 4 số vừa nhập.
        System.out.print("Nhập a: ");
        int a = new Scanner(System.in).nextInt();

        System.out.print("Nhập b: ");
        int b = new Scanner(System.in).nextInt();

        System.out.print("Nhập c: ");
        int c = new Scanner(System.in).nextInt();

        System.out.print("Nhập d: ");
        int d = new Scanner(System.in).nextInt();

        int max = a;

        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        if (max < d) {
            max = d;
        }

        System.out.println("Số lớn nhất là " + max);
    }
}
