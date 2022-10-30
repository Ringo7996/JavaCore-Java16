import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
//Viết chương trình liệt kê n số nguyên tố đầu tiên.
        System.out.print("Nhập một số nguyên: ");
        int n = new Scanner(System.in).nextInt();
        int dem = 0;
        boolean laSNT = false;

        System.out.print(n+" số nguyên tố đầu tiên là: 2\t");
        for (int i = 2; dem < n - 1; i++) {
            for (int j = 2; j < i ; j++) {
                if (i % j == 0) {
                    laSNT = false;
                    break;
                }
                laSNT = true;
            }
                if (laSNT) {
                    System.out.print(i + "\t");
                    dem++;
                }
            }
        }
    }


