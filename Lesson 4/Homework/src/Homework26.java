import java.util.Scanner;

public class Homework26 {
    public static void main(String[] args) {
//Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0) và một số nguyên x.
// Đếm số lần xuất hiện của x trong mảng a.
        System.out.print("Nhập n là số lượng phần tử trong mảng ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhập số x ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Số lần xuất hiện của x trong mảng a là "+ demSoX(nhapMang(n),x));
    }

    public static int[] nhapMang(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=\t");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static int demSoX(int[] arr, int x) {
        int S = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                S += 1;
            }
        }
        return S;
    }

}

