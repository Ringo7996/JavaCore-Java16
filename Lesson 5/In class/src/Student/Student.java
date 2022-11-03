package Student;

import java.util.Scanner;

public class Student {
    public static int AUTO_ID;
    public static int id;
    public String name;
    public String address;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", gpa=" + gpa +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    public String gender;
    public double gpa;
    public String faculty;

    public Student(){
        this.id =AUTO_ID;
        AUTO_ID++;
    }


    public void nhapThongtin(int i) {
        Student[] students = new Student[i];
        System.out.println("Nhập mã sinh viên");
        students[i].id = new Scanner(System.in).nextInt();
        System.out.println("Nhập tên");
        students[i].name = new Scanner(System.in).nextLine();
        System.out.println("Nhập địa chỉ");
        students[i].address = new Scanner(System.in).nextLine();
        System.out.println("Nhập giới tính");
        students[i].gender = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên khoa");
        students[i].faculty = new Scanner(System.in).nextLine();
        System.out.println("Điểm trung bình");
        students[i].gpa = new Scanner(System.in).nextDouble();
        System.out.println(students[i]);
    }

}
