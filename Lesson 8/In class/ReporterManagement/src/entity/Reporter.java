package entity;

import constant.ReporterType;

import java.util.Scanner;

public class Reporter extends Person {
    public static int AUTO_ID = 10000;

    private int id;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Reporter{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void inputInfo() {
        this.id = AUTO_ID;
        AUTO_ID++;
        super.inputInfo();
        System.out.println("Chọn loại phóng viên");
        System.out.println("1. Chuyên nghiệp");
        System.out.println("2. Nghiệp dư");
        System.out.println("3. Cộng tác viên");
        int reporterType = new Scanner(System.in).nextInt();
        do {
            if (reporterType >= 1 && reporterType <= 3) {
                break;
            }
            System.out.print("Chọn lại loại phóng viên hợp lệ: ");
            reporterType = new Scanner(System.in).nextInt();
        } while (true);

        switch (reporterType) {
            case 1:
                this.type = ReporterType.PRO.value;
                break;
            case 2:
                this.type = ReporterType.AMATEUR.value;
                break;
            case 3:
                this.type = ReporterType.PARTTIME.value;
                break;
        }
    }




}
