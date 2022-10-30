import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        //                      *
        //                   *  *  *
        //                *  *  *  *  *
        //             *  *  *  *  *  *  *
        System.out.print("Nhập số tự nhiên h: ");
        int h = new Scanner(System.in).nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= h + i; j++) {
                if (j < h - i) {
                    System.out.print("\t");
                } else if (h - i <= j && j < h + i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("*\n");
                }
            }
        }
    }
}
