package action;

import entities.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MemberAction {
    public Member inputInfo() {
        System.out.print("Nhập tên: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Nhập ngày sinh theo dạng dd/MM/yyyy: ");
        String date = new Scanner(System.in).nextLine();
        LocalDate dob = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Nhập nghề nghiệp: ");
        String job = new Scanner(System.in).nextLine();
        Member member = new Member(name, dob, job);

        return member;
    }

}
