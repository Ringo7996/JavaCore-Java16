import java.util.Scanner;

public class ProductManagement {

    public static void addNewProduct() {
        System.out.print("Nhập số lượng sản phẩm muốn thêm: ");
        int productNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < productNumber; i++) {
            Product product = new Product();
            product.inputInfo();
            Main.productArrayList.add(product);
        }
    }

    public static void showAllProduct() {
        for (Product i : Main.productArrayList) {
            System.out.println(i);
        }
    }

    public static void findProductByName() {
        System.out.print("Nhập tên của sản phẩm muốn tìm:");
        String findbyName = new Scanner(System.in).nextLine();

        while (true) {
            for (Product i : Main.productArrayList) {

                if (i.getName().equals(findbyName)) {
                    System.out.println("Dưới đây là thông tin sản phẩm bạn muốn tìm:");
                    System.out.println(i);
                    return;
                }
            }
            System.out.print("Không có tên phẩm này trong hệ thông, mời nhập lại: ");
            findbyName = new Scanner(System.in).nextLine();
        }
    }

    public static Product chooseProductbyID() {
        System.out.println("Nhập id của sản phẩm muốn chọn:");
        String findID = new Scanner(System.in).nextLine();


        while (true) {
            for (Product i : Main.productArrayList) {
                if (i.getId().equals(findID)) {
                    System.out.println(i);
                    return i;
                }
            }
            System.out.print("Không có mã sản phẩm này trong hệ thông, mời nhập lại: ");
            findID = new Scanner(System.in).nextLine();
        }
    }


    public static void changeQuantityOfThisProduct(Product product) {
        System.out.print("Cập nhật số lượng sản phẩm của mặt hàng này: ");
        int newQuantity = new Scanner(System.in).nextInt();
        product.setQuantity(newQuantity);
    }

    public static void removeThisProduct(Product product) {
        Main.productArrayList.remove(product);
    }


    public static void findProductWithQuantityUnder5() {
        boolean HaveAProdcuctUnder5 = false;
        System.out.println("Các sản phẩm có số lượng dưới 5 là: ");
        for (Product i : Main.productArrayList) {
            if (i.getQuantity() < 5) {
                System.out.println(i);
                HaveAProdcuctUnder5 = true;
            }
        }
        if (!HaveAProdcuctUnder5) {
            System.out.println("Không có sản phẩm nào có số lượng dưới 5");
        }
    }


    public static void findPriceFrom100() {
        System.out.println("Sản phẩm có giá trên 1000k: ");
        boolean haveAPriceFrom100 = false;
        for (Product i : Main.productArrayList) {
            if (i.getPrice() > 100000) {
                System.out.println(i);
                haveAPriceFrom100 = true;
            }
        }
        if (!haveAPriceFrom100) {
            System.out.println("Không có sản phẩm nào có giá trên 100k");
        }
    }

    public static void findPriceUnder50() {
        System.out.println("Sản phẩm có giá dưới 50k: ");
        boolean haveAPriceUnder50 = false;
        for (Product i : Main.productArrayList) {
            if (i.getPrice() < 50000) {
                System.out.println(i);
                haveAPriceUnder50 = true;
            }
        }
        if (!haveAPriceUnder50) {
            System.out.println("Không có sản phẩm nào có giá dưới 50k");
        }
    }

    public static void findPriceFrom50to100() {
        System.out.println("Sản phẩm có giá trên 50k dưới 100k: ");
        boolean haveAPriceFrom50to100 = false;
        for (Product i : Main.productArrayList) {
            if (i.getPrice() <= 100000 && i.getPrice() >= 50000) {
                System.out.println(i);
                haveAPriceFrom50to100 = true;
            }
        }
        if (!haveAPriceFrom50to100) {
            System.out.println("Không có sản phẩm nào có giá từ 50k đến 100k");
        }

    }




}
