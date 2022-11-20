import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin 1 tiktok");
        TiktokAction tiktokAction = new TiktokAction();
        Tiktok tiktok = tiktokAction.inputTiktok(scanner);
        System.out.println(tiktok);
    }
}
