import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Nhập a");
        int a = new Scanner(System.in).nextInt();

        System.out.println("Nhập b");
        int b = new Scanner(System.in).nextInt();

        System.out.println("Nhập c");
        int c = new Scanner(System.in).nextInt();

        int max=a;
        if (a>b) {
            max=a;
        } else if (b>c){
            max=b;
        } else {
            max=c;
        }

        System.out.println(max);
    }
}
