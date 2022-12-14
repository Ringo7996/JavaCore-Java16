import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
//  Nhập số n và dãy các số nguyên a[0], a[1],…, a[n-1]
// rồi sắp xếp dãy trên theo thứ tự tăng dần.
        System.out.print("Nhập số n (số phần tử mảng) ");
        int n = new Scanner(System.in).nextInt();
        xuatMang(sapXepMang(nhapMang(n)));
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

    public static void xuatMang(int[] arr) {
        System.out.println("Chuỗi theo thứ tự tăng dần là ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}
