import java.util.Scanner;

public class Homework24 {
    //Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0). Thực hiện sắp xếp mảng theo thứ tự giảm dần.
    public static void main(String[] args) {
        System.out.print("Nhập n là số lượng phần tử trong mảng ");
        int n = new Scanner(System.in).nextInt();
        int[] mang = nhapMang(n);
        System.out.println("Mảng đã được sắp xếp là: ");
        xuatMang(sapXepMang(mang));
    }

    public static int[] nhapMang(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=\t");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static int[] sapXepMang(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
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

}