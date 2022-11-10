import Entity.Assignment;
import Entity.BusDriver;
import Entity.Route;
import Entity.RouteDetail;

import java.util.Scanner;

public class MainRun {
    public static BusDriver[] busDrivers = new BusDriver[1000];
    public static Route[] routes = new Route[1000];
    public static Assignment[] assignments = new Assignment[1000];

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
                Assign();
                showAssignent();
                break;
            case 4:
                System.out.println("in 4");
                break;
            case 5:
                System.out.println("in 5");
                break;
            case 6:
                System.out.println("in 6");
                break;
        }

    }


    public static void Assign() {
        if (busDrivers.length == 0 || routes.length == 0) {
            System.out.println("Cần nhập thông tin lái xa và tuyến xe");
            return;
        }
        System.out.println("Bạn muốn phân công cho mấy lái xe");
        int driverNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < driverNum; i++) {
            System.out.println("Phân công lái xe thứ 1");
            System.out.println("Nhập mã lái xe:");
            int driverId;
            BusDriver busDriver = null;
            do {
                driverId = new Scanner(System.in).nextInt();
                for (int j = 0; j < busDrivers.length; j++) {
                    if (busDrivers[j].getDriverId() == driverId) {
                        busDriver = busDrivers[j];
                        break;
                    }
                }
                if (busDriver != null) {
                    break;
                }
                System.out.println("Nhập lại mã lái xe hợp lệ");
            }
            while (true);


            System.out.println("Lái xe muốn chạy bao nhiêu tuyến: ");
            int routeNum = new Scanner(System.in).nextInt();
            RouteDetail[] routeDetails = new RouteDetail[routeNum];
            int count = 0;
            for (int j = 0; j < routeNum; j++) {
                System.out.println("Nhập thông tin tuyến thứ " +j );
                System.out.println("Nhập mã tuyến");

                int routeId;
                Route route = null;

                do {
                    routeId = new Scanner(System.in).nextInt();
                    for (int k = 0; k < routes.length; k++) {
                        if (routes[k].getRouteId() == routeId) {
                            route = routes[k];
                            break;
                        }
                    }
                    if (route != null) {
                        break;
                    }
                    System.out.println("Nhập lại mã tuyến hợp lệ");
                }
                while (true);


                System.out.println("Tuyến này chạy mấy lượt");
                int turnNum;
                do {
                    turnNum = new Scanner(System.in).nextInt();
                    if (turnNum > 0 && turnNum <= 15) {
                        break;
                    }
                    System.out.println("Số lượt không được âm, không vượt quá 15");
                } while (true);

                routeDetails[count] = new RouteDetail(route, turnNum);
                count++;
            }

            Assignment assignment = new Assignment(busDriver, routeDetails);
            saveAssignment(assignment);
        }
    }

    private static void saveAssignment(Assignment assignment) {
        for (int i = 0; i < assignments.length; i++) {
            if (assignments[i] == null) {
                assignments[i] = assignment;
                break;
            }
        }

    }

    public static void showAssignent(){
        for (int i = 0; i < assignments.length; i++) {
            if (assignments[i] != null) {
                System.out.println(assignments[i]);
            }
        }
        System.out.println("-----------");
    }







    public static void addNewDriver() {
        System.out.print("Nhập số lượng lái xe muốn thêm mới: ");
        int driverNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < driverNum; i++) {
            BusDriver busDriver = new BusDriver();
            busDriver.inputInfo();
            saveBusDriver(busDriver);
            System.out.println("-----------");
        }
    }

    public static void saveBusDriver(BusDriver busDriver) {
        for (int i = 0; i < busDrivers.length; i++) {
            if (busDrivers[i] == null) {
                busDrivers[i] = busDriver;
                break;
            }
        }
    }

    public static void showAllDriver() {
        for (int i = 0; i < busDrivers.length; i++) {
            if (busDrivers[i] != null) {
                System.out.println(busDrivers[i]);
            }
        }
        System.out.println("-----------");
    }



    public static void addNewRoute() {
        System.out.print("Nhập số tuyến xe muốn thêm mới: ");
        int driverNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < driverNum; i++) {
            Route route = new Route();
            route.inputInfo();
            saveRoute(route);
            System.out.println("-----------");
        }
    }



    private static void saveRoute(Route route) {
        for (int i = 0; i < routes.length; i++) {
            if (routes[i] == null) {
                routes[i] = route;
                break;
            }
        }
    }

    public static void showAllRoute() {
        for (int i = 0; i < routes.length; i++) {
            if (routes[i] != null) {
                System.out.println(routes[i]);
            }
        }
        System.out.println("-----------");
    }







}