package logic;

import entity.Salesman;

import java.util.Scanner;

import static run.MainRun.salesmen;

public class SalesmanLogic {

    public static void addNewSalesman() {
        System.out.print("Nhập số người bán hàng muốn thêm");
        int salesmanNumber = new Scanner(System.in).nextInt();

        for (int i = 0; i < salesmanNumber; i++) {
            Salesman salesman = new Salesman();
            salesman.inputInfo();
            saveSalesman(salesman);
        }
    }

    private static void saveSalesman(Salesman salesman) {
        for (int i = 0; i < salesmen.length; i++) {
            if (salesmen[i] == null) {
                salesmen[i] = salesman;
                break;
            }
        }
    }

    public static void showSalesman(){
        for (int i = 0; i < salesmen.length; i++) {
            if (salesmen[i] != null) {
                System.out.println(salesmen[i]);
            }
        }
    }

}
