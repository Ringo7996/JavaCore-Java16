import sun.font.TrueTypeFont;

import java.util.Scanner;

public class ExampleVonglap2 {
    public static void main(String[] args) {
        double PI=0;
        double S=0;
        System.out.println("Nhập c thật bé");
        double c = new Scanner(System.in).nextDouble();

        for (int i = 0; (double) 1/(2*i+1)< c; i++) {
            S=S+ Math.pow(-1,i) /(2*i+1);
        }

        PI=S*4;
        System.out.println(PI);




        int i=1;
        while(true)
             if ((double) 1/(2*i+1)< c) {
                 break;
             }
        S=S+ Math.pow(-1,i) /(2*i+1);

    }
}
