package action;

import entity.Clazz;
import entity.Techmaster;

import java.util.Scanner;

public class TechmasterAction {
    public Techmaster inputTechmaster(Scanner scanner) {
        System.out.print("Nhập tên bạn quản lí: ");
        String classManager = scanner.nextLine();
        System.out.print("Nhập tên giáo viên: ");
        String teacher = scanner.nextLine();

        ClazzAction clazzAction = new ClazzAction();
        Clazz clazz = clazzAction.inputClazz(scanner);

        Techmaster techmaster = new Techmaster(classManager, teacher, clazz);
        return techmaster;
    }
}
