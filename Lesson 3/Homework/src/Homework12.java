import java.util.Scanner;

public class Homework12 {
    public static void main(String[] args) {
//  Nhập vào 2 số tự nhiên m và n, sao cho m < n. Hãy liệt kê các số chính phương trong đoạn [m,n].
//  Có bao nhiêu số chính phương?
        System.out.println("Nhập 2 số nguyên dương m và n sao cho m<n");
        System.out.print("Nhập số nguyên dương m: ");
        int m = new Scanner(System.in).nextInt();

        System.out.print("Nhập số nguyên dương n: ");
        int n = new Scanner(System.in).nextInt();

        while (m >= n) {
            System.out.print("Nhập lại số nguyên dương m: ");
            m = new Scanner(System.in).nextInt();

            System.out.print("Nhập lại số nguyên dương n: ");
            n = new Scanner(System.in).nextInt();
        }

        int S = 0;

        System.out.println("Các số chính phương trong khoảng [m,n] là: ");
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (Math.pow(i, 2) >= m && Math.pow(i, 2) <= n) {
                System.out.print(Math.pow(i, 2) + "\t");
                S += 1;
            }
        }
        System.out.println("\nSố số chính phương tìm được là " + S);
    }
}
