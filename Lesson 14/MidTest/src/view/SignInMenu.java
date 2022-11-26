package view;

import action.SignIn;
import entity.Account;

import java.util.ArrayList;
import java.util.Scanner;

import static action.GeneralHandle.*;

public class SignInMenu {

    public void signInMenu() {
        System.out.println("1. Thay đổi username");
        System.out.println("2. Thay đổi email");
        System.out.println("3. Thay đổi mật khẩu");
        System.out.println("4. Đăng xuất");
        System.out.println("0. Thoát chương trình");
        System.out.println("---------");
    }


    public void signInFunction(Scanner scanner, ArrayList<Account> accounts, Account account) {
        SignIn signIn = new SignIn();
        System.out.print("Chọn chức năng: ");
        int choice = 0;
        choice = inputInterger(scanner, choice);
        while (choice < 0 || choice > 4) {
            System.out.print("Vui lòng chọn chức năng hợp lệ: ");
            choice = inputInterger(scanner, choice);
        }

        switch (choice) {
            case 1:
                signIn.changeUsername(scanner, accounts, account);
                signInMenu();
                signInFunction(scanner, accounts, account);
                break;
            case 2:
                signIn.changeEmail(scanner, accounts, account);
                signInMenu();
                signInFunction(scanner, accounts, account);
                break;
            case 3:
                signIn.changePassword(scanner,account);
                signInMenu();
                signInFunction(scanner, accounts, account);
                break;
            case 4:
                signIn.SignOut(scanner, accounts);
                break;
            case 0:
                System.exit(0);
        }
    }

}
