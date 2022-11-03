import java.util.Scanner;

public class Homework12 {
    public static void main(String[] args) {
//Viết chương trình tính tích 2 ma trận các số nguyên A cấp mxn và B cấp nxk.
        System.out.print("Nhập m (số dòng của A): ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("Nhập n (số cột của A và số dòng của B): ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhập k (số cột của B): ");
        int k = new Scanner(System.in).nextInt();
        System.out.println("Nhập mảng A");
        int[][] mangA = nhapMang(m, n);
        System.out.println("Nhập mảng B");
        int[][] mangB = nhapMang(n, k);
        System.out.println("In mảng A");
        xuatMang(mangA);
        System.out.println("In mảng B");
        xuatMang(mangB);
        System.out.println("In mảng tích của A và B");
        xuatMang(tichMaTran(mangA, mangB, n));


    }

    public static int[][] nhapMang(int row, int col) {
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
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

    public static int[][] tichMaTran(int[][] mangA, int[][] mangB, int n) {
        int[][] mangC = new int[mangA.length][mangB[0].length];
        for (int i = 0; i < mangC.length; i++) {
            for (int j = 0; j < mangC[i].length; j++) {
                mangC[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    mangC[i][j] = mangC[i][j] + mangA[i][k] * mangB[k][j];
                }
            }
        }
        return mangC;
    }
}