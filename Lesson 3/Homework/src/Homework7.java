import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
                    //*  *  *  *  *
                    //*  *  *  *  *
                    //*  *  *  *  *
                    //*  *  *  *  *

        System.out.print("Nhập số tự nhiên n (chiều ngang): ");
        int n = new Scanner(System.in).nextInt();

        System.out.print("Nhập số tự nhiên m (chiều dọc): ");
        int m = new Scanner(System.in).nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (j<n) {
                    System.out.print("*\t");
                }else {
                    System.out.print("*\n");
                }
            }
        }
    }
}
