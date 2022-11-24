import entity.Worker;
import handle.SalaryManagement;
import handle.WorkerAction;
import view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Worker> workers = new ArrayList<>();
    public static ArrayList<SalaryManagement> salaryManagements = new ArrayList<>();


    public static void main(String[] args) {
        Menu menu = new Menu();
        WorkerAction workerAction = new WorkerAction();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu.displayMenu(scanner);

        }
    }



    private static void showSalary(ArrayList<Worker> workers) {
        System.out.println("Code \t Name \t\t Age \t\t Salary \t\t Status \t\t Date ");
        for (Worker i : workers) {
            System.out.println(i.getCode() + " \t" + i.getName() + "\t" + i.getAge() + "\t" + i.getSalary());
        }
    }







}
