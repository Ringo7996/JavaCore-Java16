package action;

import entity.Account;
import view.MainMenu;

import java.util.ArrayList;
import java.util.Scanner;

import static action.GeneralHandle.*;

public class SignIn {
    public Account signIn(Scanner scanner, ArrayList<Account> accounts) {
        Account account;
        System.out.print("Nhập username:");
        String username = scanner.nextLine();
        System.out.print("Nhập password:");
        String password = scanner.nextLine();

        //Duyệt từng phần tử trong arraylist acc, bắt gặp phần tử trùng username và trùng password thì return acc đó.
        for (Account i : accounts) {
            if (username.equals(i.getUsername()) && password.equals(i.getPassword())) {
                System.out.println("Chào mừng " + i.getUsername() + ", bạn có thể thực hiện các chức năng sau: ");
                account = i;
                return account;
            }

            // nếu có trùng username (ko trùng pw, do trùng pw đã lọc ở if phía trên), thì báo pw ko đúng. Chọn chức năng
            if (username.equals(i.getUsername())) {
                System.out.println("Mật khẩu không đúng.");
                System.out.println("1. Đăng nhập lại \t 2.Quên mật khẩu");
                System.out.print("Mời chọn chức năng: ");
                int choice = 0;
                choice = inputInterger(scanner, choice);
                while (choice != 1 && choice != 2) {
                    System.out.print("Vui lòng chọn chức năng hợp lệ: ");
                    choice = inputInterger(scanner, choice);
                }

                switch (choice) {
                    case 1:
                        account = signIn(scanner, accounts);
                        return account;
                    case 2:
                        ForgotPassword forgotPassword = new ForgotPassword();
                        account = forgotPassword.forgotPassword(scanner, accounts);
                        return account;
                }
                break;
            }
        }

        //Duyệt hết toàn bộ phần tử mà ko có username trùng thì yêu cầu nhập lại.
        System.out.println("Kiểm tra lại username");
        return signIn(scanner, accounts);
    }


    public void changeUsername(Scanner scanner, ArrayList<Account> accounts, Account account) {
        System.out.print("Nhập username mới: ");
        String newUsername = scanner.nextLine();
        newUsername = checkUserName(scanner, accounts, newUsername);
        account.setUsername(newUsername);
        System.out.println("Thay đổi username thành công");
        System.out.println("---------");

    }

    public void changeEmail(Scanner scanner, ArrayList<Account> accounts, Account account) {
        System.out.print("Nhập email mới: ");
        String newEmail = scanner.nextLine();
        newEmail = checkEmail(scanner, accounts, newEmail);
        account.setEmail(newEmail);
        System.out.println("Thay đổi email thành công");
        System.out.println("---------");

    }

    public void changePassword(Scanner scanner, Account account) {
        System.out.print("Nhập password mới: ");
        String newPassword = scanner.nextLine();
        newPassword = checkPassword(scanner, newPassword);
        account.setPassword(newPassword);
        System.out.println("Thay đổi password thành công");
        System.out.println("---------");

    }

    public void SignOut(Scanner scanner, ArrayList<Account> accounts) {
        System.out.println("Hẹn gặp lại!");
        MainMenu mainMenu = new MainMenu();
        mainMenu.mainMenu();
        mainMenu.mainFunction(scanner, accounts);
        System.out.println("---------");
    }
}
