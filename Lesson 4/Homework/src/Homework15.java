import java.util.Scanner;

public class Homework15 {
    public static void main(String[] args) {
//Nhập số tự nhiên n rồi tính tổng các số tự nhiên không lớn hơn n và chia hết cho 7.
        System.out.print("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Tổng số không lớn hơn n và chia hết 7 là: " + tongSoChiaHet7(n));

    }

    public static int tongSoChiaHet7(int n) {
        int S = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 7 == 0) {
                S += i;
            }
        }
        return S;
    }
}
