package handle;

import entity.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerAction {

    public Worker inputWorker(Scanner scanner) {
        System.out.println("Nhập mã nhân viên: ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập lương: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập nơi làm việc: ");
        String workPlace = scanner.nextLine();

        Worker worker = new Worker(code, name, age, salary, workPlace);
        return worker;
    }

    private static void addWorker(Scanner scanner, ArrayList<Worker> workers) {
        WorkerAction workerAction = new WorkerAction();
        Worker worker = workerAction.inputWorker(scanner);
        workers.add(worker);
    }

    private static void changeSalary(Scanner scanner,ArrayList<Worker> workers) {
        System.out.print("Nhập mã nhân viên muốn thay đổi lương: ");
        int code = Integer.parseInt(scanner.nextLine());
        String change;
        while (true) {
            for (Worker i : workers) {
                if (i.getCode() == code) {
                    System.out.print("Nhập mức lương mới: ");
                    double newSalary = Double.parseDouble(scanner.nextLine());
                    i.setSalary(newSalary);
                    if (newSalary > i.getSalary()){
                        salaryManagements.get(i).setChange("UP");
                    } else if (newSalary < i.getSalary()){
                        salaryManagements.get(i).setChange("DOWN");
                    } else {
                        salaryManagements.get(i).setChange("DOWN");
                    }
                    return;
                }
            }
            System.out.print("Không có mã nhân viên hợp lệ, vui lòng nhập lại: ");
            code = Integer.parseInt(scanner.nextLine());
        }
    }




}
