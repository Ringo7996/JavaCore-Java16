import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
//  Nhập số tự nhiên n rồi tính tổng S = 1+ 1/2 + 1/3 + ... + 1/n

        System.out.print("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Tổng S= " + tongPhanSo(n));
    }

    public static double tongPhanSo(double n) {
        if (n == 1) {
            return 1;
        }
        return (1 / n) + tongPhanSo(n - 1);
    }
}
