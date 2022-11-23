import action.ClazzAction;
import action.StudentAction;
import action.TechmasterAction;
import entity.Clazz;
import entity.Student;
import entity.Techmaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập thông tin");
        Scanner scanner = new Scanner(System.in);
        TechmasterAction techmasterAction = new TechmasterAction();
        Techmaster techmaster = techmasterAction.inputTechmaster(scanner);

        System.out.println("In thông tin");
        System.out.println(techmaster);


        System.out.println("Thêm học viên vào lớp ");
        ClazzAction clazzAction = new ClazzAction();
        Clazz clazzAdd2 = clazzAction.add2Student(scanner, techmaster.getClazz());
        techmaster.setClazz(clazzAdd2);
        System.out.println(techmaster);

        System.out.println("Thay đổi học lực của học sinh");
        System.out.println("Nhập id của học viên muốn điều chỉnh:");
        int id = Integer.parseInt(scanner.nextLine());

        for (Student i : techmaster.getClazz().getStudents()) {
            if (id == i.getId()) {
                System.out.println("Nhập học lực mới của học sinh");
                String newLevel = scanner.nextLine();
                i.setLevel(newLevel);
                break;
            }
        }
    }
}
