package LogicHandle;

import Entity.Route;

import java.util.Scanner;

import static run.MainRun.routes;

public class RouteHandle {


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
