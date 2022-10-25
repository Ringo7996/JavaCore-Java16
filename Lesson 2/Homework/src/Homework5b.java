import java.util.Scanner;

public class Homework5b {
    public static void main(String[] args) {
        String s1;
        String s2;
        String s3;

        System.out.println("Nhập chuỗi s1");
        Scanner nhap_s1 = new Scanner(System.in);
        s1 = nhap_s1.nextLine();

        System.out.println("Nhập chuỗi s2");
        Scanner nhap_s2 = new Scanner(System.in);
        s2 = nhap_s2.nextLine();

        System.out.println("Nhập chuỗi s3");
        Scanner nhap_s3 = new Scanner(System.in);
        s3 = nhap_s3.nextLine();

        String new_s1 = s1.replace(s2,s3);
        System.out.println(new_s1);
    }
}
