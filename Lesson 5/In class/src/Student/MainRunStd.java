package Student;

import java.util.Random;
import java.util.Scanner;

public class MainRunStd {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng sinh viên muốn thêm mới");
        int studentnumber = new Scanner(System.in).nextInt();
        Student[] students = new Student[studentnumber];
        for (int i = 0; i < studentnumber; i++) {
            students[i] = new Student();
            students[i].nhapThongtin(studentnumber);
        }

        Random r = new Random();   // thay đổi giá trị của một sinh viên bất kỳ trong mảng
        int randomNum = r.nextInt(studentnumber);
        students[randomNum].nhapThongtin(randomNum);

    }
}
