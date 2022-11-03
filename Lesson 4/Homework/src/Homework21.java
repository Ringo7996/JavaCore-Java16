import java.util.Scanner;

public class Homework21 {
    public static void main(String[] args) {
//    Thực hiện nhập vào một ma trận số nguyên a có n dòng và m cột (n, m>0).
//    Tính tổng, trung bình cộng của tất cả các giá trị trong ma trận.
        System.out.print("Nhập số dòng n: ");
        int row = new Scanner(System.in).nextInt();
        System.out.print("Nhập số cột m: ");
        int col = new Scanner(System.in).nextInt();
        int[][]mang = nhapMang(row,col);
        xuatMang(mang);
        tinhTongvaTBC(mang);
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

    public static void tinhTongvaTBC(int[][] arr) {
        int S = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                S += arr[i][j];
            }
        }
        System.out.println("Tổng giá trị các phần tử là " + S);
        System.out.println("Trung bình cộng các phần tử là " + (double) S / (arr.length * arr[0].length));
    }
}
