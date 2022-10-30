import java.util.Scanner;

public class Homework15 {
    public static void main(String[] args) {
//      Bài 15: Nhập 2 số tự nhiên m,n rồi kiểm tra xem chúng có nguyên tố cùng nhau không.
        System.out.print("Nhập số tự nhiên m: ");
        int m = new Scanner(System.in).nextInt();

        System.out.print("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();

        for (int i = 2; i <= m; i++) {
            if (m % i == 0 && n % i == 0) {
                System.out.println("Hai số không phải số nguyên tố cùng nhau");
                return;
            }
        }
        System.out.println("Hai số là số nguyên tố cùng nhau");
    }
}
