import Entity.Student;
import Entity.Subject;

import java.util.Scanner;

public class MainRun {
    public static Student[] students = new Student[1000];
    public static Subject[] subjects = new Subject[1000];

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int functionChoice = chooseFunction();
            logicHandle(functionChoice);
        }
    }

    private static int chooseFunction() {
        System.out.print("\nXin mời chọn chức năng: ");
        int functionChoice;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 6) {
                break;
            }
            System.out.print("Không hợp lệ. Xin mời chọn lại chức năng: ");
        } while (true);
        return functionChoice;
    }


    private static void addNewStudent() {
        System.out.print("Nhập số sinh viên muốn thêm mới: ");
        int StudentNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < StudentNum; i++) {
            Student student = new Student();
            student.nhapThongTin();
            saveStudent(student);
        }
    }

    private static void saveStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    private static void showAllStudent() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            }
        }
    }

    private static void addNewSubject() {
        System.out.print("Nhập số môn học muốn thêm: ");
        int subjectNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < subjectNum; i++) {
            Subject subject = new Subject();
            subject.nhapThongtin();
            saveSubject(subject);
        }
    }

    private static void saveSubject(Subject subject) {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == null) {
                subjects[i] = subject;
                break;
            }
        }
    }

    private static void showAllSubject() {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] != null) {
                System.out.println(subjects[i]);
            }
        }
    }

    private static void logicHandle(int functionChoice) {
        switch (functionChoice) {
            case 1:
                addNewStudent();
                showAllStudent();
                break;
            case 2:
                addNewSubject();
                showAllSubject();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                System.exit(0);
        }
    }

    private static void showMenu() {
        System.out.println("---------Quản lí điểm sinh viên-------");
        System.out.println("1.Nhập danh sách sinh viên mới. In ra danh sách sinh viên sau khi nhập.");
        System.out.println("2.Nhập danh sách môn học mới. In ra danh sách môn học sau khi nhập.");
        System.out.println("3.Nhập điểm cho mỗi sinh viên đã có và in danh sách ra màn hình.");
        System.out.println("4.Sắp xếp danh sách Bảng điểm");
        System.out.println("a. Theo Họ tên sinh viên");
        System.out.println("b. Theo Tên Môn học");
        System.out.println("5.Tính điểm tổng kết chung cho mỗi sinh viên dựa trên điểm môn học và số đơn vị học trình của môn học đó.");
        System.out.println("6.Thoát chương trình");
    }
}
