import java.util.Scanner;

public class Homework16 {
    public static void main(String[] args) {
// Nhập số tự nhiên n rồi in ra các số chẵn nhỏ hơn n và các số lẻ nhỏ hơn n.
        System.out.print("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        inChanLe(n);
    }

    public static void inChanLe(int n) {
        String Le = "Các sỗ lẻ nhỏ hơn n là: ";
        String Chan = "Các sỗ chẵn nhỏ hơn n là: ";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                Chan = Chan + i + "\t";
            } else {
                Le = Le + i + "\t";
            }
        }
        System.out.println(Le);
        System.out.println(Chan);

    }
}
