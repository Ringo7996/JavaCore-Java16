package action;

import entity.Student;

import java.util.Scanner;

public class StudentAction {
    public Student inputStudent(Scanner scanner) {
        try {
            System.out.print("Nhập tên học viên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập tuổi");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập học lực: ");
            String level = scanner.nextLine();

            Student student = new Student(name, age, level);
            return student;
        } catch (Exception e) {
            System.out.println("Lỗi input student");
        }
        return null;
    }

}
