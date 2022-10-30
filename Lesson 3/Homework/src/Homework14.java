import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
//      Bài 14: Nhập số tự nhiên n rồi in ra các số chẵn nhỏ hơn n và các số lẻ nhỏ hơn n.
        String Le = "Các số lẻ nhỏ hơn n là: ";
        String Chan = "Các số chẵn nhỏ hơn n là: ";

        System.out.print("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();

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
