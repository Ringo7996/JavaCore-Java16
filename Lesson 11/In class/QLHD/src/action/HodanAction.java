package action;

import entities.Hodan;
import entities.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class HodanAction {
    public Hodan inputInfo() {
        ArrayList<Member> members = new ArrayList<>();
        System.out.print("Nhập số nhà: ");
        String address = new Scanner(System.in).nextLine();
        System.out.println("Nhập số thành viên trong hộ gia đình: ");
        int memberNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < memberNumber; i++) {
            MemberAction memberAction = new MemberAction();
            members.add(memberAction.inputInfo());
        }

        Hodan hodan = new Hodan(address, members);
        return hodan;
    }

    public void showInfo(Hodan hodan){
        System.out.println(hodan);
    }

}
