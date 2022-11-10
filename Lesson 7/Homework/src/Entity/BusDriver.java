package Entity;

import Constant.BusDriverLevel;

import java.util.Scanner;

public class BusDriver extends Person {
    public static int AUTO_ID = 10000;

    private int driverId;
    private String driveLevel;

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getDriveLevel() {
        return driveLevel;
    }

    public void setDriveLevel(String driveLevel) {
        this.driveLevel = driveLevel;
    }

    @Override
    public String toString() {
        return "BusDriver{" +
                "driverId=" + driverId +
                ", driveLevel='" + driveLevel + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void inputInfo() {
        this.driverId = AUTO_ID;
        AUTO_ID++;
//        super.inputInfo();
//        System.out.println("1. Level A");
//        System.out.println("2. Level B");
//        System.out.println("3. Level C");
//        System.out.println("4. Level D");
//        System.out.println("5. Level E");
//        System.out.println("6. Level F");
//        System.out.print("Chọn trình độ lái xe theo danh sách trên: ");
//        int levelChoice = new Scanner(System.in).nextInt();
//        do {
//            if (levelChoice >= 1 && levelChoice <= 6) {
//                break;
//            }
//            System.out.print("Vui lòng chọn lại trình độ lái xe hợp lệ: ");
//            levelChoice = new Scanner(System.in).nextInt();
//        } while (true);
//
//        switch (levelChoice) {
//            case 1:
//                this.driveLevel = BusDriverLevel.LEVEL_A.value;
//                break;
//            case 2:
//                this.driveLevel = BusDriverLevel.LEVEL_B.value;
//                break;
//            case 3:
//                this.driveLevel = BusDriverLevel.LEVEL_C.value;
//                break;
//            case 4:
//                this.driveLevel = BusDriverLevel.LEVEL_D.value;
//                break;
//            case 5:
//                this.driveLevel = BusDriverLevel.LEVEL_E.value;
//                break;
//            case 6:
//                this.driveLevel = BusDriverLevel.LEVEL_F.value;
//                break;
//
//        }
    }


}
