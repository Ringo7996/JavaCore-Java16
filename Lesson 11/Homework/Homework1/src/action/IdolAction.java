package action;

import entity.Follower;
import entity.Idol;

import java.util.ArrayList;
import java.util.Scanner;

public class IdolAction {
    public static int AUTO_ID = 1;
    public Idol inputIdol(Scanner scanner) {
        int id = AUTO_ID;
        AUTO_ID++;
        System.out.print("Nhập tên idol: ");
        String name = scanner.nextLine();
        System.out.print("Nhập email idol: ");
        String email = scanner.nextLine();
        System.out.print("Nhập nhóm: ");
        String group = scanner.nextLine();


        ArrayList<Follower> followers = new ArrayList<>();
        System.out.print("Nhập số follower bạn muốn thêm: ");
        int followerNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < followerNumber; i++) {
            FollowerAction followerAction = new FollowerAction();
            Follower follower = followerAction.inputFollower(scanner);
            followers.add(follower);
        }
        System.out.println("-------");

        Idol idol = new Idol(id, name, email, followers, group);
        return idol;
    }
}
