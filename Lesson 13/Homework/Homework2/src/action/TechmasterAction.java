package action;

import entity.Clazz;
import entity.Student;
import entity.Techmaster;

import java.util.Scanner;

import static action.GeneralHandle.inputInterger;

public class TechmasterAction {
    public Techmaster inputTechmaster(Scanner scanner, Techmaster techmaster) {
        System.out.print("Nhập tên bạn quản lí: ");
        String classManager = scanner.nextLine();
        System.out.print("Nhập tên giáo viên: ");
        String teacher = scanner.nextLine();

        ClazzAction clazzAction = new ClazzAction();
        Clazz clazz = clazzAction.inputClazz(scanner);

        techmaster.setClassManager(classManager);
        techmaster.setTeacher(teacher);
        techmaster.setClazz(clazz);

        return techmaster;
    }


    public Techmaster updateLevelofStudent(Scanner scanner, Techmaster techmaster) {
        System.out.print("Nhập id của học viên muốn điều chỉnh: ");
        int id = 0;
        id = inputInterger(scanner, id);

        boolean trueID = false;
        for (Student i : techmaster.getClazz().getStudents()) {
            if (id == i.getId()) {
                System.out.print("Nhập học lực mới của học sinh: ");
                String newLevel = scanner.nextLine();
                i.setLevel(newLevel);
                trueID = true;
                break;
            }
        }
        if (!trueID) {
            System.out.println("Không có id hợp lệ trong lớp");
        }
        return techmaster;
    }


    public Techmaster removeStudent(Scanner scanner, Techmaster techmaster) {
        System.out.print("Nhập id của học viên muốn xoá: ");
        int removeId = 0;
        removeId = inputInterger(scanner, removeId);

        while (true) {
            for (Student i : techmaster.getClazz().getStudents()) {
                if (removeId == i.getId()) {
                    techmaster.getClazz().getStudents().remove(i);
                    return techmaster;
                }
            }
            System.out.print("Không có id hợp lệ trong lớp, vui lòng nhập lại id: ");
            removeId = Integer.parseInt(scanner.nextLine());
        }
    }
}
