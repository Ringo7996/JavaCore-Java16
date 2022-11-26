package Action;

import entity.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class GeneralHandle {
    //hàm thông báo exception yêu cầu nhập số nguyên khi nhập dữ liệu ko hợp lệ.
    public static int inputInterger(Scanner scanner, int n) {
        while (true) {
            try {
                n = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.print("Vui lòng nhập dữ liệu là số nguyên: ");
            }
        }
        return n;
    }

    //hàm check username chưa tồn tại.
    //Duyệt từng phần tử trong accs, get username, nếu khớp với username nhập vào thì bắt nhập lại. Cho đến khi khác thì return.
    public static String checkUserName(Scanner scanner, ArrayList<Account> accounts, String username) {
        while (true) {
            boolean existUsername = false;
            for (Account i : accounts) {
                if (username.equals(i.getUsername())) {
                    existUsername = true;
                    System.out.print("Username đã tồn tại, vui lòng chọn username khác: ");
                    username = scanner.nextLine();
                    break;
                }
            }

            if (!existUsername) {
                return username;
            }
        }
    }

    //hàm check email
    public static String checkEmail(Scanner scanner, ArrayList<Account> accounts, String email) {
        while (true) {
            // check email regex. Điền cho đến khi là dạng email hợp lệ mới break.
            while (true) {
                boolean checkEmailRegex; //email bắt đầu bằng kí tự chữ, phần sau @ là chữ và số, phần tên miền có 1 hoặc 2 dấu chấm
                String emailRegex = "[a-z][a-z0-9_\\.]+@[a-z0-9]+(\\.[a-z0-9]+){1,2}";
                checkEmailRegex = email.matches(emailRegex);
                if (!checkEmailRegex) {
                    System.out.print("Email không hợp lệ, vui lòng điền lại email: ");
                    email = scanner.nextLine();
                } else {
                    break;
                }
            }

            // Sau khi có email hợp lệ thì check email đã tồn tại chưa.
            // Duyệt từng phần tử trong accs, get email, nếu khớp email nhập vào thì bắt nhập lại. Cho đến khi khác thì return.
            boolean existEmail = false;
            for (Account i : accounts) {
                if (email.equals(i.getEmail())) {
                    existEmail = true;
                    System.out.print("Email đã tồn tại, vui lòng sử dụng email khác: ");
                    email = scanner.nextLine();
                    break;
                }
            }
            if (!existEmail) {
                return email;
            }
        }
    }

    //hàm check password
    public static String checkPassword(Scanner scanner, String password) {
        while (true) {
            //check độ dài 7-15 kí tự. Đặt vòng lặp yêu cầu nhập lại khi ko đạt, đạt thì mới break, sang bước check tiếp theo.
            while (true) {
                boolean passwordLength = false;
                if (password.length() >= 7 && password.length() <= 15) {
                    passwordLength = true;
                    break;
                }
                System.out.print("Vui lòng nhập lại mật khẩu có độ dài 7-15 kí tự: ");
                password = scanner.nextLine();
            }

            //check có chứ kí tự in hoa
            boolean checkCapitalLetter = false;
            boolean checkSpecialLetter = false;
            String capitalLetter = "[A-Z]";
            String specialLetter = "[.,_;-]";

            //Duyệt từng kí tự trong password đã nhập (lấy giá trị kiểu string của từng kí tự dạng char)
            //kiểm tra xem có nằm trong regex in hoa và đặc biệt ko. Đạt từng điều kiện thì chuyển boolean tương ứng sang true.
            for (int i = 0; i < password.length(); i++) {
                if (String.valueOf(password.charAt(i)).matches(capitalLetter)) {
                    checkCapitalLetter = true;
                }
                if (String.valueOf(password.charAt(i)).matches(specialLetter)) {
                    checkSpecialLetter = true;
                }
            }

            // chỉ cần 1 trong 2 điều kiện bị false thì bắt nhập lại, quay lại vòng lặp check từ đầu.
            // Hai điều kiện đều ok thì break vòng lặp check.
            if (!checkCapitalLetter || !checkSpecialLetter) {
                System.out.print("Mật khẩu phải có ít nhất 1 kí tự in hoa và 1 kí tự đặc biệt, vui lòng nhập lại: ");
                password = scanner.nextLine();
            } else {
                return password;
            }
        }
    }


    public void addSomeExistedAccount(ArrayList<Account> accounts) {
        Account account = new Account("Linh", "linh@gmail.com", "ab12A_");
        Account account2 = new Account("Linh2", "linh2@gmail.com", "ab12A_");
        accounts.add(account);
        accounts.add(account2);
    }
}
