import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
//Nhập số liệu cho dãy số nguyên a[0], a[1],…, a[n-1] và 2 số nguyên b, c (b < c).
// Tính trung bình cộng các phần tử của dãy nằm trong đoạn [b, c].
        System.out.print("Nhập số n (số phần tử mảng) ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhập 2 số nguyên b < c");
        System.out.print("Nhập số b ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Nhập số c ");
        int c = new Scanner(System.in).nextInt();
        System.out.println(trungBinhCongPhanTu(nhapMang(n), b, c));
    }

    public static int[] nhapMang(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]\t");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static double trungBinhCongPhanTu(int[] arr, int b, int c) {
        double S = 0;
        double dem = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= b && arr[i] <= c) {
                S = S + arr[i];
                dem += 1;
            }
        }
        return S / dem;
    }
}
