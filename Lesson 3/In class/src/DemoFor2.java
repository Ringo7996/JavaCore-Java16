import java.util.Scanner;

public class DemoFor2 {
    public static void main(String[] args) {
        System.out.println("Nhập chiều dài");
        int dai =new Scanner(System.in).nextInt();

        while (dai<=0)
         {
             System.out.println("nhập lại");
             dai =new Scanner(System.in).nextInt();
         }
    }
}
