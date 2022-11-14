package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Salesman extends Person {
    public static int AUTO_ID = 1000;

    private int id;
    private LocalDate contractDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

    @Override
    public String toString() {
        return "Salesman{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                ", contractDate=" + contractDate +
                '}';
    }



    @Override
    public void inputInfo() {
        this.id = AUTO_ID;
        AUTO_ID++;
        super.inputInfo();
        System.out.print("Nhập ngày kí hợp đồng theo dạng dd/MM/yyyy ");
        String date = new Scanner(System.in).nextLine();
        this.contractDate =  LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("--------------");
    }
}