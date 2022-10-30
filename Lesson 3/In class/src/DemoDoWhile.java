import java.util.Scanner;

public class DemoDoWhile {
    public static void main(String[] args) {
        int i=2;
        int S=0;
        System.out.println("Nhập số nguyên dương");
        int n=new Scanner(System.in).nextInt();

        do {
            S=S+i;
            i=i+2;
        }
        while (i<n);
        System.out.println(S);

    }
}
