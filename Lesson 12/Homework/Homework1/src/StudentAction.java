import java.util.Scanner;

public class StudentAction {
    public Student putInfo(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Nhập tên: ");
                String name = scanner.nextLine();
                System.out.print("Nhập tuổi: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập địa chỉ: ");
                String address = scanner.nextLine();
                Student student = new Student(name, age, address);
                return student;
            } catch (Exception e) {
                System.out.println("Kiểu dữ liệu nhập vào không hợp lệ, vui lòng nhập lại");
            }
        }
    }
}