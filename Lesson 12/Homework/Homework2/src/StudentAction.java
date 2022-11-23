import java.util.Scanner;

public class StudentAction {
    public Student inputInfo(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Nhập tên: ");
                String name = scanner.nextLine();
                System.out.print("Nhập điểm Toán: ");
                double scoreMath = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập điểm Lý: ");
                double scorePhysic = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập điểm Hoá: ");
                double scoreChemistry = Double.parseDouble(scanner.nextLine());

                Student student = new Student(name, scoreMath, scorePhysic, scoreChemistry);
                System.out.println("----------");
                return student;
            } catch (Exception e) {
                System.out.println("Kiểu dữ liệu không hợp lệ, vui lòng nhập lại");
                continue;
            }
        }
    }
}
