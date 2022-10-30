import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
// Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ
        System.out.print("Nhập một số nguyên: ");
        int n = new Scanner(System.in).nextInt();
        int S = 0;

        while (n > 0) {
            S += n % 10;
            n /= 10;
        }
        System.out.println("Tổng các chữ số của số đã nhập là " + S);
    }
}
