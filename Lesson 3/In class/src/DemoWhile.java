import java.util.Scanner;

public class DemoWhile {
    public static void main(String[] args) {
//        for (int i=1;i<6;i++){
//            System.out.println(i);
//        }
//
//        int i=1;
//        while (i<6) {
//            System.out.println(i);
//            i++;
//        }
//

        System.out.println("n=");
        int S=0;
        int n =new Scanner(System.in).nextInt();
        for (int j=0; j<n; j++) {
            S+=j;
        }

        int j=1;
        int S1=0;
        while (j<=n) {
            S1 +=j;
            j++;
        }

    }
}
