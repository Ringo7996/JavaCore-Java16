package entity;

import constant.WriterType;

import java.util.Scanner;

public class Writer extends Person {

    private static int AUTO_ID = 10000;
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
        return "Writer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                ", post='" + type + '\'' +
                '}';
    }

    public void inputInfo() {
        this.id = AUTO_ID;
        AUTO_ID++;
        super.inputInfo();
//        System.out.println("Chọn loại phóng viên");
//        System.out.println("1. Chuyên nghiệp");
//        System.out.println("2. Nghiệp dư");
//        System.out.println("3. CTV");
//        int type = new Scanner(System.in).nextInt();
//        do {
//            if (type >= 1 && type <= 3) {
//                break;
//            }
//            System.out.print("Chọn lại: ");
//        } while (true);
//
//        switch (type){
//            case 1:
//                this.type = WriterType.CHUYEN_NGHIEP.value;
//                break;
//            case 2:
//                this.type = WriterType.NGHIEP_DU.value;
//                break;
//            case 3:
//                this.type = WriterType.CTV.value;
//                break;
//        }
    }
}
