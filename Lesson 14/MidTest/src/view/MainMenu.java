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
        while (choice < 1 || choice > 2) {
            System.out.print("Vui lòng chọn chức năng hợp lệ: ");
            choice = inputInterger(scanner, choice);
        }

        switch (choice) {
            case 1:
                // nhập IDPW, tìm đc trong chuỗi thì return acc, ko tìm đc thì nhập lại hoặc tạo acc
                SignIn signIn = new SignIn();
                Account oldAccount = signIn.signIn(scanner,accounts);
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
        }
    }
}
