package view;

import handle.WorkerAction;

import java.util.Scanner;

public class Menu {
    public void displayMenu(Scanner scanner){
        System.out.println("1. Add worker");
        System.out.println("2. Up salary");
        System.out.println("3. Down salary");
        System.out.println("4. Display salary infomation ");
        System.out.println("5. Exit");

        System.out.print("Chọn chức năng: ");

        WorkerAction workerAction = new WorkerAction();


        int choice = Integer.parseInt(scanner.nextLine());
        while (true) {
            if (choice > 0 && choice < 6) {
                break;
            }
            System.out.print("Vui lòng nhập lại chức năng hợp lệ: ");
            choice = Integer.parseInt(scanner.nextLine());
        }



        switch (choice) {
            case 1:
                addWorker(scanner);
                break;
            case 2:
                changeSalary(scanner);
                break;
            case 3:
                changeSalary(scanner);
                break;
            case 4:
                showSalary(workers);
                break;
            case 5:
                System.exit();

        }
}
