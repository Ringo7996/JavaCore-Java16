package run;

import entity.Goods;
import entity.PurchaseList;
import entity.Salesman;
import entity.SoldManagement;

import java.util.Scanner;

import static logic.GoodsLogic.addNewGoods;
import static logic.GoodsLogic.showGoods;
import static logic.PurchaseListLogic.*;
import static logic.SalesmanLogic.addNewSalesman;
import static logic.SalesmanLogic.showSalesman;

public class MainRun {
    public static Salesman[] salesmen = new Salesman[1000];
    public static Goods[] goodss = new Goods[1000];
    public static PurchaseList[] purchaseLists = new PurchaseList[1000];
    public static PurchaseList[] purchaseListWithRevenue = new PurchaseList[1000];

    public static void main(String[] args) {
        while (true) {
            showMenu();
            chooseFunction();
        }
    }

    private static void chooseFunction() {
        System.out.print("Chọn chức năng: ");
        int function = new Scanner(System.in).nextInt();
        do {
            if (function >= 1 && function <= 6) {
                break;
            }
            System.out.print("Chọn lại chức năng hợp lệ: ");
            function = new Scanner(System.in).nextInt();
        } while (true);

        switch (function) {
            case 1:
                addNewGoods();
                showGoods();
                break;
            case 2:
                addNewSalesman();
                showSalesman();
                break;
            case 3:
                addPurchaseList();
                showPurchaseList();
                break;
            case 4:
                showSubMenu();
                chooseFunction2();
                break;
            case 5:
                showPurchaseListWithRevenue();
                break;
            case 6:
                return;
        }
    }


    private static void chooseFunction2() {
        System.out.print("Chọn cách sắp xếp: ");
        int function = new Scanner(System.in).nextInt();
        do {
            if (function >= 1 && function <= 3) {
                break;
            }
            System.out.print("Chọn lại các sắp xếp hợp lệ: ");
            function = new Scanner(System.in).nextInt();
        } while (true);

        switch (function) {
            case 1:
                sortByName();
                showPurchaseList();
                break;
            case 2:
                sortbyGoods();
                showPurchaseList();
                break;
            case 3:
                return;

        }
    }


    private static void showMenu() {
        System.out.println("--Quản lí danh sách bán hàng--");
        System.out.println("1. Nhập danh sách mặt hàng mới. In ra danh sách các mặt hàng đã có ");
        System.out.println("2. Nhập danh sách nhân viên. In ra danh sách nhân viên đã có ");
        System.out.println("3. Lập Bảng danh sách bán hàng cho từng nhân viên, và in danh sách ra màn hình ");
        System.out.println("4. Sắp xếp danh sách Bảng danh sách bán hàng");
        System.out.println("5. Lập bảng kê doanh thu cho mỗi nhân viên.");
        System.out.println("6. Thoát");
    }

    private static void showSubMenu() {
        System.out.println("1. Theo tên nhân viên ");
        System.out.println("2. Theo nhóm mặt hàng  ");
        System.out.println("3. Quay lại menu chính");
    }
}
