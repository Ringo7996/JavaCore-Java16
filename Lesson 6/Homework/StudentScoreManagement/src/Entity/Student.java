package Entity;

import java.util.Scanner;

public class Student extends Person {
    private static int AUTO_ID = 0;
    private int id;
    private String classs;

    public Student() {
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

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                ", classs='" + classs + '\'' +
                '}';
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhập lớp: ");
        this.classs = new Scanner(System.in).nextLine();
        System.out.println("-------------");
    }
}
