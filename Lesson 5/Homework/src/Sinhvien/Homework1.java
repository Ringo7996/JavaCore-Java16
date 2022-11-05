package Sinhvien;

public class Homework1 {
    public static void main(String[] args) {
        Sinhvien sinhvien1 = new Sinhvien();

        System.out.println("Nhập thông tin một sinh viên");
        sinhvien1.nhapThongTin();

        System.out.println("Thông tin sinh viên đã nhập:");
        sinhvien1.inThongTin();
    }
}
