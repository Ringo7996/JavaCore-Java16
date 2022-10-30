import java.util.Scanner;

public class DemoFibo {
    public static void main(String[] args) {
        System.out.println("Nhập số n");
        int n = new Scanner(System.in).nextInt();
        System.out.println(Fibo(n));
    }

    public static long Fibo(int n) {
        if (n==1) {
            return  1;
        }
        return n + Fibo(n-1);
    }


}
