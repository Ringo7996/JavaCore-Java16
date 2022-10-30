import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
//   Hãy nhập một số và kiểm tra xem số đó có phải số thuật nghịch hay không
        System.out.print("Nhập một dãy số: ");
        int n = new Scanner(System.in).nextInt();
        int number = n;
        int temp = 0;

        while (n > 0) {
            temp = temp * 10 + n % 10;
            n = n / 10;
        }

        if (temp == number) {
            System.out.println("Số đã nhập là số thuận nghịch");
        } else {
            System.out.println("Số đã nhập không phải số thuận nghịch");
        }

    }
}


