import java.util.Scanner;

public class FollowerAction {
    public static int AUTO_ID = 1;
    public Follower inputFollower(Scanner scanner) {
        int id = AUTO_ID;
        AUTO_ID++;
        System.out.print("Nhập tên follower: ");
        String name = scanner.nextLine();
        System.out.print("Nhập email follower: ");
        String email = scanner.nextLine();
        System.out.print("Nhập số lượng like: ");
        int numberOfLike = Integer.parseInt(scanner.nextLine());
        System.out.println("-------");

        Follower follower = new Follower(id,name, email, numberOfLike);
        return follower;
    }
}
