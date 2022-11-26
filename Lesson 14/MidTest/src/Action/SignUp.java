package Action;

import entity.Account;

import java.util.ArrayList;
import java.util.Scanner;

import static Action.GeneralHandle.*;

public class SignUp {
    public Account signUp(Scanner scanner, ArrayList<Account> accounts) {

        System.out.print("Nhập username: ");
        String username = scanner.nextLine();
        username = checkUserName(scanner, accounts, username);
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        email = checkEmail(scanner, accounts, email);
        System.out.print("Nhập password: ");
        String password = scanner.nextLine();
        password = checkPassword(scanner, password);

        Account account = new Account(username, email, password);
        accounts.add(account);
        System.out.println("---------");

        return account;
    }
}
