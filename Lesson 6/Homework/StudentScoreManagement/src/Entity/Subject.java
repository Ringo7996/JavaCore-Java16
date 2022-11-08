package Entity;

import Constant.SubjectTypeConstant;

import java.util.Scanner;

public class Subject {
    private static int AUTO_ID = 0;
    private int id;
    private String name;
    private int unit;
    private String type;

    public Subject() {
        if (AUTO_ID == 0) {
            AUTO_ID = 99;
        }
        AUTO_ID++;
        this.id = AUTO_ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Subject{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", unit=" + unit +
                ", type='" + type + '\'' +
                '}';
    }

    public void nhapThongtin() {
        System.out.print("Nhập tên môn: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập số đơn vị học trình: ");
        this.unit = new Scanner(System.in).nextInt();
        System.out.println("Chọn loại môn: ");
        System.out.println("1.Đại cương");
        System.out.println("2.Cơ sở ngành");
        System.out.println("3.Chuyên ngành");
        int subjectType;

        do {
            subjectType = new Scanner(System.in).nextInt();
            if (subjectType >= 1 && subjectType <= 3) {
                break;
            }
            System.out.print("Loại môn không hợp lệ, nhập lại ");
        } while (true);

        switch (subjectType) {
            case 1:
                this.type = SubjectTypeConstant.GENERAL;
                break;
            case 2:
                this.type = SubjectTypeConstant.BASE;
                break;
            case 3:
                this.type = SubjectTypeConstant.MAJOR;
                break;
        }
        System.out.println("-------------");
    }

}
