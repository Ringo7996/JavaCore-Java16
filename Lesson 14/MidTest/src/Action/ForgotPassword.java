package Action;

import entity.Account;
import view.MainMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class ForgotPassword {
    //hàm quên password
    public Account forgotPassword(Scanner scanner, ArrayList<Account> accounts) {
        MainMenu menu = new MainMenu();
        SignIn signIn = new SignIn();
        Account account = null;
        System.out.print("Nhập email của account: ");
        String email = scanner.nextLine();

        // Duyệt từng phần tử trong accs và get password, nếu có password khớp password đã nhập vào thì set lại password cho phần tử đó.
        boolean validEmail = false;
        for (Account i : accounts) {
            if (email.equals(i.getEmail())) {
                signIn.changePassword(scanner,i);
                validEmail = true;
                account = i;
            }
        }

        //Duyệt hết phần tử trong mảng mà không phát hiện có email đã nhập, thì cho tạo acc mới.
        if (!validEmail) {
            System.out.println("Tài khoản không tồn tại trong hệ thống, tạo tài khoản mới");
            SignUp signUp = new SignUp();
            account = signUp.signUp(scanner, accounts);
        }

        return account;
    }
}
