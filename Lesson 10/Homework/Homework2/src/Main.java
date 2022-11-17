import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Member> memberList = new ArrayList<>();

    public static void main(String[] args) {
        addNember();
        showMember();
    }

    private static void addNember() {
        System.out.print("Nhập số thành viên muốn thêm: ");
        int memberNumber;

        do {
            memberNumber = new Scanner(System.in).nextInt();
            if (memberNumber >= 3) {
                break;
            }
            System.out.println("Hãy nhập ít nhất 3 thành viên.");
            System.out.print("Nhập lại số thành viên muốn thêm: ");
        } while (true);

        for (int i = 0; i < memberNumber; i++) {
            Member member = new Member();
            member.inputInfo();
            memberList.add(member);
        }
    }

    private static void showMember() {
        for (Member i : memberList){
            System.out.println(i);
        }
    }

}
