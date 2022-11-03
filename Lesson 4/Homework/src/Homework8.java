import java.util.Scanner;

public class Homework8 {
// Nhập mảng a gồm N phần tử bao gồm các số nguyên dương.
// In phần tử có số lần xuất hiện nhiều nhất trong a.
    public static void main(String[] args) {
        System.out.print("Nhập số n (số phần tử mảng) ");
        int n = new Scanner(System.in).nextInt();
        int[] mang = nhapMang(n);
        System.out.print("Số phần tử xuất hiện nhiều nhất trong a là " +timPhanTuXuatHienNhieuNhat(mang));
    }

    public static int[] nhapMang(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]\t");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static int timPhanTuXuatHienNhieuNhat(int[] arr) {
        int so = 0;
        int dem = 0;
        int demmoc = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    dem += 1;
                }
            }
            if (dem > demmoc) {
                demmoc = dem;
                so = arr[i];
            }
            dem = 0;
        }

        return so;
    }
}
