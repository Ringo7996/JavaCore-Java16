import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        addNewStudent(scanner);
        showStudentScocre();
        calStudentType(students);
    }

    private static void showStudentScocre() {
        System.out.println(students);
    }

    private static void addNewStudent(Scanner scanner) {
        System.out.print("Nhập số sinh viên muốn thêm: ");
        int studentNumber;
        while (true) {
            try {
                studentNumber = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.print("Kiểu dữ liệu không hợp lệ, mời nhập lại: ");
                continue;
            }

            if (studentNumber < 1) {
                System.out.print("Vui lòng nhập số nguyên lớn hơn không: ");
                continue;
            }
            break;
        }

        for (int i = 0; i < studentNumber; i++) {
            StudentAction studentAction = new StudentAction();
            Student student = studentAction.inputInfo(scanner);
            students.add(student);
        }
    }

    private static void calStudentType(ArrayList<Student> students) {
        int typeA = 0;
        int typeB = 0;
        int typeC = 0;

        for (Student i : students) {
            if (i.getRank() == "A") {
                typeA++;
            } else if (i.getRank() == "B") {
                typeB++;
            } else {
                typeC++;
            }
        }
        System.out.println("Phần trăm số học sinh xếp loại A là "+(double)typeA/students.size());
        System.out.println("Phần trăm số học sinh xếp loại B là "+ (double) typeB/students.size());
        System.out.println("Phần trăm số học sinh xếp loại C là "+(double)typeC/students.size());
    }
}
