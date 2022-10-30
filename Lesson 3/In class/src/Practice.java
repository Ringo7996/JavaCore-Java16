import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Nhập n");
        int n = new Scanner(System.in).nextInt();

        double S=0;
        for (int i = 1; i < n; i++) {
            S=S+ (double) 1/(double)i;
            i=i+1;
        }
        System.out.println("S="+S);
    }
}
