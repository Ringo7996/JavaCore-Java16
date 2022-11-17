import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Member {
    private int id;
    private String name;
    private LocalDate dob;
    private String job;

    public void inputInfo() {
        System.out.print("Nhập mã thành viên: ");
        this.id = new Scanner(System.in).nextInt();
        System.out.print("Nhập tên thành viên: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập ngày sinh thành viên theo dạng dd/MM/yyyy: ");
        String dateofbirth = new Scanner(System.in).nextLine();
        this.dob = LocalDate.parse(dateofbirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Nhập công việc của thành viên: ");
        this.job = new Scanner(System.in).nextLine();
        System.out.println("----------");
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", job='" + job + '\'' +
                '}';
    }

}
