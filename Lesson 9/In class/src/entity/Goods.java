package entity;

import constant.GoodsType;

import java.util.Scanner;

public class Goods implements Inputable {
    public static int AUTO_ID = 1000;

    private int id;
    private String name;
    private String type;
    private double price;
    private int quantity;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public void inputInfo() {
        this.id = AUTO_ID;
        AUTO_ID++;
        System.out.print("Nhập tên: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập giá: ");
        this.price = new Scanner(System.in).nextDouble();
        System.out.print("Nhập số lượng: ");
        this.quantity = new Scanner(System.in).nextInt();
        System.out.println("1. Điện tử \t 2. Điện lạnh\t 3. Máy tính\t 4. Thiết bị văn phòng\t");
        System.out.print("Chọn nhóm mặt hàng: ");
        int type = new Scanner(System.in).nextInt();

        do {
            if (type >= 1 && type <= 4) {
                break;
            }
            System.out.print("Chọn lại loại nhóm hàng hợp lệ: ");
            type = new Scanner(System.in).nextInt();
        } while (true);

        switch (type) {
            case 1:
                this.type = GoodsType.DIEN_TU.value;
                break;
            case 2:
                this.type = GoodsType.DIEN_LANH.value;
                break;
            case 3:
                this.type = GoodsType.MAY_TINH.value;
                break;
            case 4:
                this.type = GoodsType.TBVP.value;
                break;
        }
        System.out.println("--------------");
    }
}
