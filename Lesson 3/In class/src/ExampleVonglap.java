import java.util.Scanner;

public class ExampleVonglap {
    public static void main(String[] args) {
        System.out.println("Nhập số n");
        int n = new Scanner(System.in).nextInt();
        if (n < 2) {
            System.out.println("ko phải số nguyên tố");
            return;  //dừng ctrinh
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("ko phải số nguyên tố");
                return;
            }
            System.out.println("là số ngt");
        }
    }
}
