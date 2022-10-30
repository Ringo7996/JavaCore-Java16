import java.util.Scanner;

public class DemoMethod1 {
    // quyền truy cập + static ko bắt buộc + dạng kết quả trả lại + tên hàm + (tham số truyền vào ko bắt buộc)
    public static void main(String[] args) {
        System.out.println("Nhập dài");
        int dai = new Scanner(System.in).nextInt();
        System.out.println("Nhập rộng");
        int rong = new Scanner(System.in).nextInt();
        System.out.println("Chu vi=" + 2 * (dai + rong));
    }


    //phương thức, hàm tính chu vi khi biết 2 cạnh
    // quyền truy cập + dạng kết quả trả lại + tên hàm + (tham số truyền vào ko bắt buộc)
    public int tinhChuVi(int dai, int rong) {
        int chuVi = 2 * (dai + rong);    //code thực hiện chính của phương thức
        return chuVi;
    }

    // hàm ko có tham số truyền vào.
    // ko trả về dữ liệu gì cả
    public void xxx() {
        System.out.println("Hi");
    }

}
