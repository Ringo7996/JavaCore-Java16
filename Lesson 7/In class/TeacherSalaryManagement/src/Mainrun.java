import Constant.Teacherlv;

import java.util.Scanner;



public class Mainrun {

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {
            showmenu();
        }
    }

    private static void showmenu() {
        System.out.println("=-Qản lí trả lương cho giảng viên--");
        System.out.println("1. Nhập danh sách giảng viên");
        System.out.println("2. In danh sách giảng viên");
        System.out.println("3. Nhập danh sách môn mới");
        System.out.println("4. in danh sách môn mới");
        System.out.println("5. Lập lịch phân công giảng dạy");
        System.out.println("6. Sắp xếp phân công giảng dạy");
        System.out.println("7. Tính lương");
        System.out.println("8. Thoát");
    }


    private static int Chonchcnang() {
        int funChoice = 0;
        do {
            funChoice = new Scanner(System.in).nextInt();
            if (funChoice >= 1 && funChoice <= 8) {
                break;
            }

        } while (true);

        switch (funChoice) {
            case 1:
                addNewTeacher();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }

    private static void addNewTeacher() {
        System.out.println("nhập số lượng giảng viên mới muốn thêm");
        int teacNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < teacNumber; i++) {


        }
    }

}
