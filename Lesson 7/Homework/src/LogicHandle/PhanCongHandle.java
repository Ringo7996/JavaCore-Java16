package LogicHandle;

import Entity.Driver;
import Entity.PhanCong;
import Entity.Route;
import Entity.Tuyen_Vong;

import java.util.Scanner;

import static run.MainRun.*;

public class PhanCongHandle {


    public static void phanCong() {
        System.out.print("Nhập số tài xế muốn phân công ");
        int driverNum = new Scanner(System.in).nextInt();

        for (int i = 0; i < driverNum; i++) {
            System.out.println("Mã lái xe của họ: ");
            int driverID = new Scanner(System.in).nextInt();
            Driver driver = new Driver();

            for (int j = 0; j < drivers.length; j++) {
                if (drivers[j] != null && driverID == drivers[j].getDriverId()) {
                    driver = drivers[j];
                    break;
                }
            }

            System.out.print("Lái bao nhiêu tuyến ");
            int routeNum = new Scanner(System.in).nextInt();
            Tuyen_Vong[] tuyen_vongs = new Tuyen_Vong[routeNum];
            int count = 0;

            for (int j = 0; j < routeNum; j++) {
                System.out.println("Nhập mã tuyến số" + (j + 1));
                int routeID = new Scanner(System.in).nextInt();
                Route route = new Route();
                for (int k = 0; k < routes.length; k++) {
                    if (routes[k] != null && routeID == routes[k].getRouteId()) {
                        route = routes[k];
                        break;
                    }
                }

                System.out.println("Nhập số vòng của tuyến này");
                int vong = new Scanner(System.in).nextInt();

                Tuyen_Vong tuyen_vong = new Tuyen_Vong(route, vong);
                tuyen_vongs[count] = tuyen_vong;
                count++;
            }

            PhanCong phanCong = new PhanCong(driver, tuyen_vongs);
            savePhanCong(phanCong);
        }
    }





    private static void savePhanCong(PhanCong phanCong) {
        for (int i = 0; i < phanCongs.length; i++) {
            if (phanCongs[i] == null) {
                phanCongs[i] = phanCong;
                break;
            }
        }
    }

    public static void showPhanCong() {
        for (int i = 0; i < phanCongs.length; i++) {
            if (phanCongs[i] != null) {
                System.out.println(phanCongs[i]);
            }

        }
    }


    public static void sortByName() {
        for (int i = 0; i < phanCongs.length; i++) {
            if (phanCongs[i] == null) {
                continue;
            }

            for (int j = 0; j < phanCongs.length; j++) {
                if (phanCongs[j] == null) {
                    continue;
                }

                if (phanCongs[i].getDriver().getName().compareTo(phanCongs[j].getDriver().getName()) < 0) {
                    PhanCong temp = phanCongs[i];
                    phanCongs[i] = phanCongs[j];
                    phanCongs[j] = temp;
                }
            }
        }
    }


    public static void sortByTuyen() {
        for (int i = 0; i < phanCongs.length; i++) {
            if (phanCongs[i] == null) {
                continue;
            }
            for (int j = 0; j < phanCongs.length; j++) {
                if (phanCongs[j] == null) {
                    continue;
                }

                if (phanCongs[i].getTuyen_vongs().length > phanCongs[j].getTuyen_vongs().length) {
                    PhanCong temp = phanCongs[i];
                    phanCongs[i] = phanCongs[j];
                    phanCongs[j] = temp;
                }
            }
        }
    }
}