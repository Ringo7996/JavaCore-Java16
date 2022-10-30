import java.util.Scanner;

public class DemoMethodPrimeNumber {
    public static void main(String[] args) {
       System.out.println("Nhập vào số nguyên dương n");
       int n = new Scanner(System.in).nextInt();
        kiemTraSNT(n);   /// gọi hàm kiemtraSNT lên để chạy
    }

    public static void kiemTraSNT (int n){   // tham số truyền vào có thể đặt tuỳ ý, chỉ có ý nghĩa trong phạm vi hàm
        if (n<2) {
            System.out.println("ko phải SNT");
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n%i==0) {
                System.out.println("ko là snt");
                return;
            }
        }
        System.out.println("Là số ngto");
    }
}
