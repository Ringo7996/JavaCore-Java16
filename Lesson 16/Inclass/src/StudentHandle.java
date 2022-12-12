import java.util.Map;
import java.util.Scanner;

public class StudentHandle {
    public Student inputInfo(Scanner scanner) {
        System.out.print("Nhập id: ");
        int id = 0;
        id = returnNumber(scanner, id);
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = 0;
        age = returnNumber(scanner, age);
        System.out.print("Nhập điểm: ");
        double score = 0;
        while (true) {
            score = returnNumber(scanner, score);
            if (score < 10) {
                break;
            }
            System.out.print("Vui lòng nhập lại điểm hợp lệ: ");
        }

        System.out.println("----------");

        return new Student(id, name, age, score);
    }


    public int returnNumber(Scanner scanner, int n) {
        while (true) {
            try {
                n = Integer.parseInt(scanner.nextLine());
                if (n < 1) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.print("Vui lòng nhập lại: ");
            }
        }
        return n;
    }

    public double returnNumber(Scanner scanner, double n) {
        while (true) {
            try {
                n = Double.parseDouble(scanner.nextLine());
                if (n < 1) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.print("Vui lòng nhập lại: ");
            }
        }
        return n;
    }

    public void findById(Scanner scanner, Map<Integer, Student> map) {
        System.out.print("Nhập id muốn tìm: ");
        int id = 0;
        id = returnNumber(scanner, id);

///        map.get(id);

        boolean hasId = false;
        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
            if (id == entry.getKey()) {
                System.out.println(entry.getValue());
                hasId = true;
                break;
            }
        }
        if (!hasId) {
            System.out.println("Không có id học sinh trong map");
        }
    }

    public void updateById(Scanner scanner, Map<Integer, Student> map) {
        StudentHandle studentHandle = new StudentHandle();
        System.out.print("Nhập id muốn tìm: ");
        int id = 0;
        id = returnNumber(scanner, id);

//map.set(id)
        boolean hasId = false;
        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
            if (id == entry.getKey()) {
                System.out.println("Cập nhật thông tin cho sinh viên có mã " + entry.getKey());
                Student updateStudent = studentHandle.inputInfo(scanner);
                entry.getValue().setId(updateStudent.getId());
                entry.getValue().setName(updateStudent.getName());
                entry.getValue().setAge(updateStudent.getAge());
                entry.getValue().setScore(updateStudent.getScore());
                hasId = true;
                break;
            }
        }
        if (!hasId) {
            System.out.println("Không có id học sinh trong map");
        }
    }

}