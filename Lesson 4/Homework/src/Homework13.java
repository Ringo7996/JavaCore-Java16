import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {
//Bài 13: Nhập vào 2 số tự nhiên m và n, sao cho m < n.
// Hãy liệt kê các số chính phương trong đoạn [m,n]. Có bao nhiêu số chính phương?
        System.out.println("Nhập 2 số tự nhiên m < n");
        System.out.print("Nhập số m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        checkSoChinhPhuong(m,n);
    }

    public static void checkSoChinhPhuong(int a, int b) {
        int S = 0;
        System.out.print("Các số chính phương trong khoảng [m,n] là: ");
        for (int i = 1; i <= Math.sqrt(b); i++) {
            if (Math.pow(i, 2) >= a && Math.pow(i, 2) <= b) {
                System.out.print((int)Math.pow(i,2)+"\t");
                S+=1;
            }
        }
        System.out.println("\nCó tất cả "+S+" số chính phương.");
    }

}



