import java.util.Scanner;

public class Homework19 {
// Thực hiện nhập vào một mảng số nguyên a có n phần tử (n>0).
// Tìm số lớn nhất và nhỏ nhất trong mảng a.
    public static void main(String[] args) {
        System.out.print("Nhập số n (số phần tử mảng) ");
        int n = new Scanner(System.in).nextInt();
        int[] mang = sapXepMang(nhapMang(n));
        System.out.println("Số lớn nhất trong mảng là " + mang[n - 1]);
        System.out.println("Số bé nhất trong mảng là " + mang[0]);
    }

    public static int[] nhapMang(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]\t");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static int[] sapXepMang(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
