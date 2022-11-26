package action;

import entity.Student;

import java.util.Scanner;

import static action.GeneralHandle.inputInterger;

public class StudentAction {
    public Student inputStudent(Scanner scanner) {
        System.out.print("Nhập tên học viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = 0;
        age = inputInterger(scanner, age);
        System.out.print("Nhập học lực: ");
        String level = scanner.nextLine();

        Student student = new Student(name, age, level);
        return student;
    }
}
