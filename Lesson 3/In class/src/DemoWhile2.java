import java.util.Scanner;

public class DemoWhile2 {
    public static void main(String[] args) {
        System.out.println("Nhap n");
        int n = new Scanner(System.in).nextInt();
        int a=1;
        int X=0;
        while (a<=n && a%2==0) {
            X=X+a;
            a=a+1;    ///a=1 bi thoat khoi vong lap luon ma ko chay tiep
        }
        System.out.println(X);

    }
}
