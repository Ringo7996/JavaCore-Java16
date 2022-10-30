import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
//Viết chương trình tìm ước số chung lớn nhất và bội số chung nhỏ nhất của hai số nguyên dương a và b.
        System.out.print("Nhập số nguyên dương a: ");
        int a = new Scanner(System.in).nextInt();

        System.out.print("Nhập số nguyên dương b: ");
        int b = new Scanner(System.in).nextInt();

        int Solon = 0;   // gán số nào số lớn số nào số bé
        int Sobe = 0;
        if (a > b) {
            Solon = a;
            Sobe = b;
        }
        if (a < b) {
            Solon = b;
            Sobe = a;
        }

        // a b bằng nhau thì UCBC là chính nó
        if (a == b) {
            System.out.println("UCLN và BCNN của 2 số là chính nó: " + a);
        } else {
            // nếu ko bằng nhau thì chạy ước chung từ số lớn, giảm dần đi, bắt gặp ước chung đầu tiên thì break
            for (int UCLN = Solon; true; UCLN--) {
                if (a % UCLN == 0 && b % UCLN == 0) {
                    System.out.println("Ước chung lớn nhất là " + UCLN);
                    break;
                }
            }
            // và chạy bội chung từ số lớn, tăng dần lên, bắt gặp bội chung đầu tiên thì break
            for (int BCNN = Sobe; true; BCNN++) {
                if (BCNN % a == 0 && BCNN % b == 0) {
                    System.out.println("Bội chung lớn nhất là " + BCNN);
                    break;
                }
            }
        }
    }
}
