import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Product> productArrayList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            chooseFuntion();
        }
    }

    private static void showMenu() {
        System.out.println("---Quản lí sản phẩm---");
        System.out.println("1. Thêm sản phẩm mới");
        System.out.println("2. Xem danh sách sản phẩm");
        System.out.println("3. Tìm sản phẩm theo tên");
        System.out.println("4. Tìm sản phẩm theo id");
        System.out.println("5. Tìm các sản phẩn có số lượng dưới 5");
        System.out.println("6. Tìm sản phẩm theo mức giá");
        System.out.println("7. Thoát");
    }

    public static void chooseFuntion() {
        System.out.print("Chọn chức năng");
        int function = new Scanner(System.in).nextInt();
        while (true) {
            if (function > 0 && function < 8) {
                break;
            }
            System.out.println("Nhập lại chức năng hợp lệ");
            function = new Scanner(System.in).nextInt();
        }

        switch (function) {
            case 1:
                ProductManagement.addNewProduct();
                break;
            case 2:
                ProductManagement.showAllProduct();
                break;
            case 3:
                ProductManagement.findProductByName();
                break;
            case 4:
                Product product1 = ProductManagement.chooseProductbyID();
                showSubMenu4();
                chooseFuntion4(product1);
                break;
            case 5:
                ProductManagement.findProductWithQuantityUnder5();
                break;
            case 6:
                showSubMenu6();
                chooseFuntion6();
                break;
            case 7:
                return;
        }
    }


    private static void showSubMenu4() {
        System.out.println("1. Xoá sản phẩm");
        System.out.println("2. Cập nhật số lượng sản phẩm");
        System.out.println("3. Quay lại menu chính");
    }


    public static void chooseFuntion4(Product product1) {
        System.out.print("Chọn chức năng đối với sản phẩm này: ");
        int function4 = new Scanner(System.in).nextInt();
        while (true) {
            if (function4 > 0 && function4 < 4) {
                break;
            }
            System.out.print("Nhập lại chức năng hợp lệ");
            function4 = new Scanner(System.in).nextInt();
        }

        switch (function4) {
            case 1:
                ProductManagement.removeThisProduct(product1);
                ProductManagement.showAllProduct();
                return;
            case 2:
                ProductManagement.changeQuantityOfThisProduct(product1);
                ProductManagement.showAllProduct();
                return;
            case 3:
                return;
        }
    }


    private static void showSubMenu6() {
        System.out.println("Tìm menu theo mức giá");
        System.out.println("1. Dưới 50.000");
        System.out.println("2. Từ 50.000 đến dưới 100.000");
        System.out.println("3. Từ 100.000 trở lên");
        System.out.println("4. Quay lại menu chính");
    }

    private static void chooseFuntion6() {
        System.out.print("Chọn mức giá muốn tìm: ");
        int function6 = new Scanner(System.in).nextInt();
        while (true) {
            if (function6 > 0 && function6 < 5) {
                break;
            }
            System.out.print("Nhập lại chức năng hợp lệ");
            function6 = new Scanner(System.in).nextInt();
        }

        switch (function6) {
            case 1:
                ProductManagement.findPriceUnder50();
                return;
            case 2:
                ProductManagement.findPriceFrom50to100();
                return;
            case 3:
                ProductManagement.findPriceFrom100();
                return;
            case 4:
                return;
        }
    }
}
