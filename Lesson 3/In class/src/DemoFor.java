import java.util.Scanner;

public class DemoFor {
    public static void main(String[] args) {
        System.out.println("nhập số nguyên dương");
        int n = new Scanner(System.in).nextInt();
        int S = 0;
        for (int i =1; i<=n; i++) {
            S=S+i;
        }
        System.out.println("tổng S="+S);
    }
}
