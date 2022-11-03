import java.util.Scanner;

public class Homework25 {
//Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0).
// Đếm xem trong mảng có bao nhiêu số lẻ và bao nhiêu số chẵn.
    public static void main(String[] args) {
        System.out.print("Nhập n là số lượng phần tử trong mảng ");
        int n = new Scanner(System.in).nextInt();
        demChanLe(nhapMang(n));
    }

    public static int[] nhapMang(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=\t");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static void demChanLe(int[] arr) {
        int Le = 0;
        int Chan = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                Le += 1;
            } else {
                Chan += 1;
            }
        }
        System.out.println("Số số lẻ trong mảng là "+Le);
        System.out.println("Số số chẵn trong mảng là "+Chan);
    }
}
