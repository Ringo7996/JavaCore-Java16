package view;

import action.ClazzAction;
import action.TechmasterAction;
import entity.Clazz;
import entity.Student;
import entity.Techmaster;

import java.util.Scanner;

import static action.GeneralHandle.inputInterger;

public class Menu {

    public void showMenu() {
        System.out.println("1. Nhập thông tin chi tiết của trung tâm");
        System.out.println("2. Hiển thị thông tin chi tiết của trung tâm");
        System.out.println("3. Thêm học viên vào lớp hiện tại");
        System.out.println("4. Cập nhật thông tin học lực của 1 học viên dựa vào ID");
        System.out.println("5. Xoá học viên khỏi lớp học");
        System.out.println("6. Thoát");
    }

    public void chooseFunction(Scanner scanner, Techmaster techmaster) {
        TechmasterAction techmasterAction = new TechmasterAction();
        System.out.print("Chọn chức năng:");
        int choice = 0;
        choice = inputInterger(scanner, choice);
        while (choice <= 0 || choice >= 7) {
            System.out.print("Vui lòng chọn lại chức năng hợp lệ");
            choice = inputInterger(scanner, choice);
        }

        switch (choice) {
            case 1:
                techmaster = techmasterAction.inputTechmaster(scanner, techmaster);
                System.out.println(techmaster);
                break;
            case 2:
                System.out.println(techmaster);
                break;
            case 3:
                ClazzAction clazzAction = new ClazzAction();
                Clazz addNewStudent = clazzAction.addStudent(scanner, techmaster.getClazz());
                techmaster.setClazz(addNewStudent);
                System.out.println(techmaster);
                break;
            case 4:
                techmaster = techmasterAction.updateLevelofStudent(scanner, techmaster);
                System.out.println(techmaster);
                break;
            case 5:
                techmaster = techmasterAction.removeStudent(scanner, techmaster);
                System.out.println(techmaster);
                break;
            case 6:
                System.exit(0);
        }
    }
}
