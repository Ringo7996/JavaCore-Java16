import java.awt.peer.PanelPeer;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public void showMenu() {
        System.out.println("1. Nhập thông tin sinh viên");
        System.out.println("2. In ra map");
        System.out.println("3. Tìm sinh viên bằng id");
        System.out.println("4. Cập nhật học sinh bằng id");
        System.out.println("0. Thoát");
        System.out.println("--------");
    }

    public void chooseFunction(Scanner scanner, Map<Integer, Student> map) {
        StudentHandle studentHandle = new StudentHandle();
        System.out.print("Chọn chức năng: ");
        int choice = -1;
        while (true) {
            choice = studentHandle.returnNumber(scanner, choice);
            if (choice > 5 || choice < 0) {
                System.out.println("Vui lòng chọn lại: ");
                continue;
            }
            break;
        }

        switch (choice) {
            case 1:
                System.out.print("Nhập số học sinh muốn thêm: ");
                int studentNumber = 0;
                studentNumber = studentHandle.returnNumber(scanner, studentNumber);
                for (int i = 1; i <= studentNumber; i++) {
                    Student student = studentHandle.inputInfo(scanner);
                    map.put(student.getId(), student);
                }
                break;
            case 2:
                System.out.println("In ra map: ");
                for (Map.Entry<Integer, Student> entry : map.entrySet()) {
                    System.out.println(entry.getKey() + "-" + entry.getValue());
                }
                break;
            case 3:
                System.out.println("Tìm bằng id: ");
                // nhập vào id
                //  map.get(id);
                studentHandle.findById(scanner, map);
                break;
            case 4:
                System.out.println("Cập nhật bằng id: ");
                studentHandle.updateById(scanner, map);
                break;
            case 0:
                System.exit(0);
        }
    }
}
