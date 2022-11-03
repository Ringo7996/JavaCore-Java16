import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
//Nhập số liệu cho dãy số nguyên a[0], a[1],…, a[n-1].
// Tìm số lớn thứ hai và vị trí của nó trong dãy. Chú ý trường hợp cả dãy bằng nhau thì sẽ không có số lớn thứ 2.
        System.out.print("Nhập số n (số phần tử mảng) ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = nhapMang(n);
        System.out.println("Chuỗi theo thứ tự giảm dần là ");
        xuatMang(sapXepMang(arr));
        timSoLonThu2(sapXepMang(arr));
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
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void xuatMang(int[] arr) {
          for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    // sắp xếp chuỗi theo thứ tự giảm dần, chạy từ vị trí thứ hai đi,
    // bắt gặp số đầu tiên nhỏ hơn số trc đó thì chính là số lớn thứ 2, return vòng lặp;
    // nếu chạy hết vòng lặp ko tìm được thì là chuỗi bằng nhau
    public static void timSoLonThu2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println("\nSố lớn thứ 2 trong chuỗi là " + arr[i]);
                return;
            }
        }
        System.out.println("\nChuỗi bằng nhau không có số lớn thứ 2");
    }

}
