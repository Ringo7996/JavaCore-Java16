import java.util.Scanner;

public class Homework17 {
//Nhập 2 số tự nhiên m,n rồi kiểm tra xem chúng có nguyên tố cùng nhau không.
    public static void main(String[] args) {
        System.out.print("Nhập số m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        if (checkSNTcungnhau(m,n)) {
            System.out.println("Hai số đã nhập là 2 số nguyên tố cùng nhau");
        } else {
            System.out.println("Hai số đã nhập không phải là 2 số nguyên tố cùng nhau");
        }
    }

    public static boolean checkSNTcungnhau(int a, int b) {
        for (int i = 2; i <= a ; i++) {
            if (a%i==0 && b%i==0) {
                return false;
            }
        }
        return true;
    }
}
