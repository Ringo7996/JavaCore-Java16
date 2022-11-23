import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        addNewStudent(scanner);
        addStudentOrNot(scanner);
    }

    private static void addStudentOrNot(Scanner scanner) {
        System.out.print("Bạn có muốn nhập thêm sinh viên không: ");
        System.out.print("1. Có \t 2. Không. In danh sách ra màn hình ");
        int choice;

        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Kiểu dữ liệu không hợp lệ, vui lòng chọn lại");
                continue;
            }

            if (choice > 2 || choice < 1) {
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
                continue;
            }
            break;
        }

        switch (choice) {
            case 1:
                addNewStudent(scanner);
                addStudentOrNot(scanner);
                break;
            case 2:
                System.out.println(students);
        }

    }

    private static void addNewStudent(Scanner scanner) {
        System.out.print("Nhập số sinh viên muốn lưu vào chuỗi: ");
        int studentNumber;

        while (true) {
            try {
                studentNumber = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại dữ liệu kiểu số nguyên.");
                continue;
            }

            if (studentNumber < 1) {
                System.out.print("Vui lòng nhập số nguyên lớn hơn 0: ");
                continue;
            }
            break;
        }

        for (int i = 0; i < studentNumber; i++) {
            StudentAction studentAction = new StudentAction();
            Student student = studentAction.putInfo(scanner);
            students.add(student);
        }
    }
}
