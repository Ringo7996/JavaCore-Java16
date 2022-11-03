import java.util.Scanner;

public class Homework23 {
//Thực hiện nhập vào hai ma trận số nguyên a, b có n dòng và m cột (n, m>0).
// Thực hiện tính tổng hai ma trận này.
    public static void main(String[] args) {
        System.out.print("Nhập số dòng n: ");
        int row = new Scanner(System.in).nextInt();
        System.out.print("Nhập số cột m: ");
        int col = new Scanner(System.in).nextInt();
        System.out.println("Mảng 1");
        int[][] mang1 = nhapMang(row, col);
        System.out.println("Mảng 2");
        int[][] mang2 = nhapMang(row, col);

        System.out.println("----");
        System.out.println("In mảng 1");
        xuatMang(mang1);
        System.out.println("In mảng 2");
        xuatMang(mang2);

        System.out.println("----");
        System.out.println("Kết quả cộng hai mảng");
        xuatMang(congMang(mang1,mang2));
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

    public static int[][] congMang(int[][] mang1, int[][] mang2) {
        for (int i = 0; i < mang1.length; i++) {
            for (int j = 0; j < mang1[i].length; j++) {
                mang1[i][j] = mang1[i][j] + mang2[i][j];
            }
        }
        return mang1;
    }
}