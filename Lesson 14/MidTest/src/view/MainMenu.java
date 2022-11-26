package view;

import Action.ForgotPassword;
import Action.SignIn;
import Action.SignUp;
import entity.Account;

import java.util.ArrayList;
import java.util.Scanner;

import static Action.GeneralHandle.*;

public class MainMenu {
    public void mainMenu() {
        System.out.println("1. Đăng nhập");
        System.out.println("2. Đăng kí");
        System.out.println("---------");
    }

    public void mainFunction(Scanner scanner, ArrayList<Account> accounts) {
        SignInMenu signInMenu = new SignInMenu();
        System.out.print("Chọn chức năng: ");
        int choice = 0;
        choice = inputInterger(scanner, choice);
        while (choice < 1 || choice > 3) {
            System.out.print("Vui lòng chọn chức năng hợp lệ: ");
            choice = inputInterger(scanner, choice);
        }

        switch (choice) {
            case 1:
                // nhập IDPW, tìm đc trong chuỗi thì return acc, ko tìm đc thì nhập lại hoặc tạo acc
                Account oldAccount = InputIdPw(scanner, accounts);
                signInMenu.signInMenu();
                signInMenu.signInFunction(scanner, accounts, oldAccount);

                break;
            case 2:
                //tạo acc mới, add vào arraylist accs.
                SignUp signUp = new SignUp();
                Account newAccount = signUp.signUp(scanner, accounts);
                signInMenu.signInMenu();
                signInMenu.signInFunction(scanner, accounts, newAccount);
                break;

            case 3:
                System.out.println(accounts);
        }
    }

    public Account InputIdPw(Scanner scanner, ArrayList<Account> accounts) {
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
                int choice = 0;
                choice = inputInterger(scanner, choice);
                while (choice != 1 && choice != 2) {
                    System.out.print("Vui lòng chọn chức năng hợp lệ: ");
                    choice = inputInterger(scanner, choice);
                }

                switch (choice) {
                    case 1:
                        account = InputIdPw(scanner, accounts);
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
        return InputIdPw(scanner, accounts);
    }
}
