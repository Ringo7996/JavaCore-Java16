package view;

import action.ClazzAction;
import action.TechmasterAction;
import entity.Clazz;
import entity.Student;
import entity.Techmaster;

import java.util.Scanner;

public class Menu {

    public static void showMenu() {
        System.out.println("1. Nhập thông tin chi tiết của trung tâm");
        System.out.println("2. Hiển thị thông tin chi tiết của trung tâm");
        System.out.println("3. Thêm học viên vào lớp hiện tại");
        System.out.println("4. Cập nhật thông tin học lực của 1 học viên dựa vào ID");
        System.out.println("5. Xoá học viên khỏi lớp học");
        System.out.println("6. Thoát");
    }

    public static void chooseFunction(Scanner scanner ) {
        TechmasterAction techmasterAction = new TechmasterAction();
        Techmaster techmaster = new Techmaster();
        System.out.print("Chọn chức năng:");
        int choice = Integer.parseInt(scanner.nextLine());

        //nếu chức năng ko nằm trong menu thì yêu cầu chọn lại
        while (true) {
            if (choice > 0 && choice < 7) {
                break;
            }
            System.out.print("Vui lòng chọn lại chức năng hợp lệ");
            choice = Integer.parseInt(scanner.nextLine());
        }

        switch (choice) {
            case 1:
                techmaster = techmasterAction.inputTechmaster(scanner);
                System.out.println(techmaster);
                break;
            case 2:
                System.out.println(techmaster);
                break;
            case 3:
                ClazzAction clazzAction = new ClazzAction();
                Clazz clazzAddNew = clazzAction.addStudent(scanner, techmaster.getClazz());
                techmaster.setClazz(clazzAddNew);
                System.out.println(techmaster);
                break;
            case 4:
                System.out.println("Nhập id của học viên muốn điều chỉnh:");
                int id = Integer.parseInt(scanner.nextLine());

                boolean trueID = false;
                for (Student i : techmaster.getClazz().getStudents()) {
                    if (id == i.getId()) {
                        System.out.println("Nhập học lực mới của học sinh");
                        String newLevel = scanner.nextLine();
                        i.setLevel(newLevel);
                        trueID = true;
                        break;
                    }
                }
                if (!trueID) {
                    System.out.println("Không có id hợp lệ trong lớp");
                }
                System.out.println(techmaster);

                break;
            case 5:
                System.out.println("Nhập id của học viên muốn xoá:");
                int removeId = Integer.parseInt(scanner.nextLine());

                boolean haveId = false;
                for (Student i : techmaster.getClazz().getStudents()) {
                    if (removeId == i.getId()) {
                        techmaster.getClazz().getStudents().remove(i);
                        System.out.println(techmaster);
                        haveId = true;
                        break;
                    }
                }
                if (!haveId) {
                    System.out.println("Không có id hợp lệ trong lớp");
                }
                break;
            case 6:
                System.exit(0);
        }

    }

}
