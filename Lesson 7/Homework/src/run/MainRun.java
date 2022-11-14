package run;

import Entity.Driver;
import Entity.PhanCong;
import Entity.Route;
import Entity.Tuyen_Vong;

import java.util.Scanner;

import static LogicHandle.DriverHandle.addNewDriver;
import static LogicHandle.DriverHandle.showAllDriver;
import static LogicHandle.PhanCongHandle.*;
import static LogicHandle.RouteHandle.addNewRoute;
import static LogicHandle.RouteHandle.showAllRoute;

public class MainRun {
    public static Driver[] drivers = new Driver[1000];
    public static Route[] routes = new Route[1000];
    public static PhanCong[] phanCongs = new PhanCong[1000];

    public static void main(String[] args) {
        while (true) {
            showMenu();
            choiceFunction();
        }
    }

    private static void showMenu() {
        System.out.println("---Quản lí phân công tài xế xe buýt---");
        System.out.println("1. Nhập danh sách Lái xe mới. In ra danh sách lái xe sau khi nhập.");
        System.out.println("2. Nhập danh sách Tuyến mới. In ra danh sách các tuyến sau khi nhập.");
        System.out.println("3. Nhập danh sách phân công cho mỗi lái xe và in danh sách ra màn hình. ");
        System.out.println("4. Sắp xếp danh sách phân công.");
        System.out.println("a. Theo Họ tên lái xe");
        System.out.println("b. Theo Số lượng tuyến đảm nhận trong ngày (giảm dần)");
        System.out.println("5 Lập bảng kê tổng khoảng cách chạy xe trong ngày của mỗi lái xe");
    }

    private static void choiceFunction() {
        System.out.print("Hãy chọn chức năng: ");
        int functionChoice = new Scanner(System.in).nextInt();
        do {
            if (functionChoice >= 1 && functionChoice <= 5) {
                break;
            }
            System.out.print("Vui lòng chọn lại chức năng có trong menu ");
            functionChoice = new Scanner(System.in).nextInt();
        } while (true);

        switch (functionChoice) {
            case 1:
                addNewDriver();
                showAllDriver();
                break;
            case 2:
                addNewRoute();
                showAllRoute();
                break;
            case 3:
                phanCong();
                showPhanCong();
                break;
            case 4:
                showSubMenu();
                choiceFunction2();
                break;
            case 5:
                System.out.println("in 5");
                break;
            case 6:
                System.out.println("in 6");
                return;
        }
    }

    private static void showSubMenu() {
        System.out.println("Phân loại theo:");
        System.out.println("1. Theo Họ tên lái xe");
        System.out.println("2. Theo Số lượng tuyến đảm nhận trong ngày (giảm dần)");
        System.out.println("3. Quay lại menu chính");
    }

    private static void choiceFunction2() {
        System.out.print("Chọn phân loại ");
        int functionChoice = new Scanner(System.in).nextInt();
        do {
            if (functionChoice >= 1 && functionChoice <= 3) {
                break;
            }
            System.out.print("Vui lòng chọn lại chức năng có trong menu ");
            functionChoice = new Scanner(System.in).nextInt();
        } while (true);

        switch (functionChoice) {
            case 1:
                sortByName();
                showPhanCong();
                break;
            case 2:
                sortByTuyen();
                showPhanCong();
                break;
            case 3:
                return;

        }
    }



}