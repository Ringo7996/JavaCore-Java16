package LogicHandle;

import Entity.Driver;

import java.util.Scanner;

import static run.MainRun.drivers;

public class DriverHandle {
    public static void addNewDriver() {
        System.out.print("Nhập số lượng lái xe muốn thêm mới: ");
        int driverNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < driverNum; i++) {
            Driver driver = new Driver();
            driver.inputInfo();
            saveBusDriver(driver);
            System.out.println("-----------");
        }
    }

    public static void saveBusDriver(Driver driver) {
        for (int i = 0; i < drivers.length; i++) {
            if (drivers[i] == null) {
                drivers[i] = driver;
                break;
            }
        }
    }

    public static void showAllDriver() {
        for (int i = 0; i < drivers.length; i++) {
            if (drivers[i] != null) {
                System.out.println(drivers[i]);
            }
        }
        System.out.println("-----------");
    }
}
