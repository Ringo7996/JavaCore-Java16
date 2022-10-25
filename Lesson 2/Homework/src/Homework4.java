import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        String ngaysinh;

        System.out.println("Nhập ngày sinh theo dạng dd/MM/yyyy");
        Scanner nhap_ngay_sinh = new Scanner(System.in);
        ngaysinh = nhap_ngay_sinh.nextLine();

        LocalDate ngay = LocalDate.parse(ngaysinh, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Ngày sinh của bạn là "+ngay);
        System.out.println("Ngày hôm nay là "+LocalDate.now());

        int tuoi = LocalDate.now().getYear()-ngay.getYear();
        System.out.println("Tuổi hiện tại là "+ tuoi);
    }
}
