package Entity;

import Constant.Teacherlv;

import java.util.Scanner;

public class Teacher extends Person {

    private int id;
    private String level;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                ", level='" + level + '\'' +
                '}';
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhập trình độ");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("Chọn ");
        int choice = 0;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 4) {
                break;
            }

        } while (true);

        switch (choice){
            case 1:
                this.level= Teacherlv.GS_TS.value;
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }



    }


}
