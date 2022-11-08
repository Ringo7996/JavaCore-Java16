package Entity;

import Constant.ReaderTypeConstant;

import java.util.Scanner;

public class Reader extends Person {
    private static int AUTO_ID = 0;

    private int id;
    private String type;

    public Reader() {
        if (AUTO_ID == 0) {
            AUTO_ID = 9999;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Entity.Reader{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhập loại bạn đọc. Chọn dưới đây");
        System.out.println("1.Sinh viên");
        System.out.println("2.Giảng vien");
        System.out.println("3.Học viên cao học");
          int readertypeType;

        do {
            readertypeType = new Scanner(System.in).nextInt();
            if (readertypeType >= 1 && readertypeType <= 3) {
                break;
            }
            System.out.print("Không hợp lệ, mời chọn lại: ");
        } while (true);

        switch (readertypeType) {
            case 1:
                this.type = ReaderTypeConstant.STUDENT;
                break;
            case 2:
                this.type = ReaderTypeConstant.TEACHER;
                break;
            case 3:
                this.type = ReaderTypeConstant.POST_UNIVERSITY;
                break;
        }
        System.out.println("-------------");
    }
}