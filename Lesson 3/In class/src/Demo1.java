import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        System.out.print("Nhập chiêu dài chữ nhật");
        int width = new Scanner(System.in).nextInt();

        if (width <=0) {
            System.out.print("Nhập lại");
            width = new Scanner(System.in).nextInt();
        }

        System.out.println("OK");

    }
}
