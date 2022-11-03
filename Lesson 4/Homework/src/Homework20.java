import java.util.Scanner;

public class Homework20 {
    public static void main(String[] args) {
// Thực hiện nhập vào một mảng số nguyên a có n phần tử (n>0) và một giá trị thực x.
// Thực hiện sắp xếp mảng a theo thứ tự tăng dần và chèn giá trị x vào trong mảng a sao cho vẫn giữ được tính sắp xếp của mảng.
        System.out.print("Nhập số n (số phần tử mảng) ");
        int n = new Scanner(System.in).nextInt();
        int[] mang = nhapMang(n);
        System.out.println("Mảng theo thứ tự tăng dần là");
        xuatMang(sapXepMang(mang));
        System.out.print("\nNhập giá trị x ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Mảng đã chèn x là ");
        xuatMang(chenXVaoMang(sapXepMang(mang), x));

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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static int[] chenXVaoMang(int[] arr, int x) {
        int[] newarr = new int[arr.length + 1];
        int vitri = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x > arr[i]) {
                newarr[i] = arr[i];
                vitri = i + 1;
            } else {
                newarr[i + 1] = arr[i];
            }
        }
        newarr[vitri] = x;
        return newarr;
    }
}