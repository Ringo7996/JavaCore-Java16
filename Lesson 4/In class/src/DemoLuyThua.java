import java.util.Scanner;

public class DemoLuyThua {
    public static void main(String[] args) {
        System.out.println("Nhập cơ số");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhập số mũ");
        int n = new Scanner(System.in).nextInt();
        long KetQua = 0;
        for (int i = 1; i < n; i++) {
            KetQua = KetQua * a;
        }
        System.out.println(dequyLuyThua(a,n));
    }


    public static long dequyLuyThua(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * dequyLuyThua(a, n - 1);
    }


}