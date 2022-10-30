import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
//Nhập số tự nhiên n rồi tính các tổng sau:
//• S = tổng các số tự nhiên không lớn hơn n.
//• S1 = tổng các số tự nhiên lẻ không lớn hơn n.
//• S2 = tổng các số tự nhiên chẵn không lớn hơn n

        System.out.print("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();

        int S = 0;
        int S1 = 0;
        int S2 = 0;

        for (int i = 0; i <= n; i++) {
            S += i;
            if (i % 2 != 0) {
                S1 += i;
            } else {
                S2 += i;
            }
        }

        System.out.println("S = tổng các số tự nhiên không lớn hơn n = " + S);
        System.out.println("S1 = tổng các số tự nhiên lẻ không lớn hơn n = " + S1);
        System.out.println("S2 =  tổng các số tự nhiên chẵn không lớn hơn = " + S2);

    }
}
