package entity;

import java.util.Scanner;

public class Article implements Inputable{
    public static int AUTO_ID = 100;

    private int id;
    private String name;
    private double price;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ArticleType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void inputInfo(){
        this.id = AUTO_ID;
        AUTO_ID++;
        System.out.print("Nhập tên kiểu bài: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập đơn giá: ");
        this.price = new Scanner(System.in).nextDouble();
    }

}
