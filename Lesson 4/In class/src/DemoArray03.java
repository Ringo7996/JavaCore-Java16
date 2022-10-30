import java.util.Scanner;

public class DemoArray03 {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng phần tử mảng:");
        int n = new Scanner(System.in).nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]");
            arr[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("------------");
        int S = 0;
        for (int i = 0; i < arr.length; i++) {
            S += arr[i];
        }
        System.out.println((double)S/arr.length);
    }

    public static int[] nhapMang() {
        System.out.println("Nhập số lượng phần tử mảng:");
        int n = new Scanner(System.in).nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }


    public static double tinhTBC(int[]a) {
        int S=0;
        for (int i=0; i<a.length;i++) {
            S+=a[i];
        }
        return (double) S/a.length;
    }

}
