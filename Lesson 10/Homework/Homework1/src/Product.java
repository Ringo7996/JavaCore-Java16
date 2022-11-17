import java.util.Scanner;

public class Product {
    private String id;
    private String name;
    private String description;
    private int quantity;
    private double price;
    private String unit;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                '}';
    }


    public void inputInfo() {
        System.out.print("Nhập mã sản phẩm: ");
        this.id = new Scanner(System.in).nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập miêu tả sản phẩm: ");
        this.description = new Scanner(System.in).nextLine();
        System.out.print("Nhập số lượng sản phẩm: ");
        this.quantity = new Scanner(System.in).nextInt();
        System.out.print("Nhập giá sản phẩm: ");
        this.price = new Scanner(System.in).nextDouble();
        System.out.print("Nhập đơn vị sản phẩm: ");
        this.unit = new Scanner(System.in).nextLine();
        System.out.println("------------");
    }
}



