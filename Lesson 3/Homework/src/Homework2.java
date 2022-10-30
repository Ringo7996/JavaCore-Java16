import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
// Nhập số tự nhiên n rồi liệt kê các ước số của nó. Có bao nhiêu ước số?
        int S = 0;

        System.out.print("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();

        // n chia hết cho i thì in ra i, cộng 1 vào S
        System.out.println("Các ước số của n là:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + "\t");
                S = S + 1;
            }
        }

        System.out.println("\nTổng số ước số là " + S);
    }
}
