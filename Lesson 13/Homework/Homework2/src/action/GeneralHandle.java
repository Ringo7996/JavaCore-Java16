package action;

import java.util.Scanner;

public class GeneralHandle {
    public static int inputInterger(Scanner scanner, int n) {
        while (true) {
            try {
                n = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.print("Vui lòng nhập dữ liệu là số nguyên: ");
                continue;
            }

            if (n < 1) {
                System.out.print("Vui lòng nhập số nguyên lớn hơn 0: ");
                continue;
            }
            break;
        }
        return n;
    }
}
