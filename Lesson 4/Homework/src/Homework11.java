import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
// Viết chương trình nhập số liệu cho ma trận các số nguyên A cấp mxn trong đó m, n là các số tự nhiên.
//Sau đó tìm ma trận chuyển vị B = (bij) cấp n x m của A, với bij = aji
        System.out.print("Nhập số dòng m của ma trận: ");
        int row = new Scanner(System.in).nextInt();
        System.out.print("Nhập số cột n của ma trận: ");
        int col = new Scanner(System.in).nextInt();
        int[][] maTran = nhapMang(row, col);
        System.out.println("In ma trận đã nhập:");
        xuatMang(maTran);
        System.out.println("In ma trận chuyển vị:");
        xuatMang(maTranChuyenVi(maTran));

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

    public static int[][] maTranChuyenVi(int[][] maTran) {
        int[][] maTranChuyenVi = new int[maTran[0].length][maTran.length];
        for (int i = 0; i < maTranChuyenVi.length; i++) {
            for (int j = 0; j < maTranChuyenVi[i].length; j++) {
                maTranChuyenVi[i][j] = maTran[j][i];
            }
        }
        return maTranChuyenVi;
    }
}