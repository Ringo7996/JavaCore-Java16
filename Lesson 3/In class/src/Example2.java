import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        int S=0;

        System.out.println("Nhập số nguyên dương");
        int n = new Scanner(System.in).nextInt();

        for (int i =1; i<=n; i++) {
            if (i%2==0) {
                S=S+i;
            }
        }
        System.out.println("Tổng = "+S);
    }
}
