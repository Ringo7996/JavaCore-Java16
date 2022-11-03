import java.util.Scanner;

public class Homework28 {
    public static void main(String[] args) {
// Thực hiện nhập vào ma trận vuông số nguyên a có n dòng và n cột (n>0).
// Tính tổng đường chéo chính của ma trận này.
        System.out.print("Nhập n là số dòng và số cột của ma trận ");
        int n = new Scanner(System.in).nextInt();
        int[][] mang = nhapMang(n);
        xuatMang(mang);
        System.out.println("Tổng đường chéo chính của ma trận là "+tinhTongDuongCheoChinh(mang));
    }


    public static int[][] nhapMang(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử a[" + i + "][" + j + "]\t");
                arr[i][j] = new Scanner(System.in).nextInt();
            }
        }
        return arr;
    }

    public static void xuatMang(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == (arr[i].length - 1)) {
                    System.out.print(arr[i][j] + "\n");
                } else {
                    System.out.print(arr[i][j] + "\t");
                }
            }
        }
    }

    public static int tinhTongDuongCheoChinh(int[][] arr) {
        int S = 0;
        int i = 0;
        while (i < arr.length) {
            S += arr[i][i];
            i += 1;
        }
        return S;
    }
}
