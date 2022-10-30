import java.util.Scanner;

public class DemoContinue {
    public static void main(String[] args) {
        // Tổng số chắn
        System.out.println("Nhập n");
        int n = new Scanner(System.in).nextInt();
        int S = 0;
        for (int i = 1; i <= n; i += 2) {
            if (i % 2 == 0) {
                continue;
            }
            S += 1;
            System.out.println(i);
        }
        System.out.println(S);
    }
}