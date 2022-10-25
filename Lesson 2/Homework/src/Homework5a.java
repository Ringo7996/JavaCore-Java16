import java.util.Scanner;

public class Homework5a {
    public static void main(String[] args) {
        String chuoi;
        char kitu;

        System.out.println("Nhập chuỗi bất kì");
        Scanner nhap_chuoi = new Scanner(System.in);
        chuoi = nhap_chuoi.nextLine();

        System.out.println("Nhập một kí tự");
        Scanner nhap_ki_tu = new Scanner(System.in);
        kitu = nhap_ki_tu.next().charAt(0);

        String x = "Vị trí xuất hiện đầu tiên của kí tự trong chuỗi là "+ chuoi.indexOf(kitu);
        String y = "Vị trí xuất hiện cuối cùng của kí tự trong chuỗi là " + chuoi.lastIndexOf(kitu);

        System.out.println(chuoi.indexOf(kitu)==-1? "Không có kí tự trong chuỗi": x + "\n"+ y);
    }
}
