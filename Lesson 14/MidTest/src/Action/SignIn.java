package Action;

import entity.Account;
import view.MainMenu;

import java.util.ArrayList;
import java.util.Scanner;

import static Action.GeneralHandle.*;

public class SignIn {
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
