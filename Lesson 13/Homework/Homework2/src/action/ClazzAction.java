package action;

import entity.Clazz;
import entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

import static action.GeneralHandle.inputInterger;

public class ClazzAction {

    public ArrayList<Student> students = new ArrayList<>();

    public Clazz inputClazz(Scanner scanner) {
        System.out.print("Nhập tên môn học: ");
        String subject = scanner.nextLine();
        System.out.print("Nhập số lượng học viên trong lớp: ");
        int studentNumber = 0;
        studentNumber = inputInterger(scanner, studentNumber);

        for (int i = 0; i < studentNumber; i++) {
            StudentAction studentAction = new StudentAction();
            Student student = studentAction.inputStudent(scanner);
            students.add(student);
        }
        Clazz clazz = new Clazz(subject, students);
        return clazz;

    }

    public Clazz addStudent(Scanner scanner, Clazz clazz) {
        StudentAction studentAction = new StudentAction();
        System.out.print("Nhập số học viên muốn thêm: ");
        int studentNumber = 0;
        studentNumber = inputInterger(scanner, studentNumber);

        for (int i = 0; i < studentNumber; i++) {
            Student student = studentAction.inputStudent(scanner);
            clazz.getStudents().add(student);
        }
        return clazz;
    }
}
