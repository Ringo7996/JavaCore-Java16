import java.util.Scanner;

public class Homework22 {
    public static void main(String[] args) {
//Thực hiện nhập vào một ma trận số nguyên a có n dòng và m cột (n, m>0).
// Tìm giá trị lớn nhất và nhỏ nhất của ma trận này.
        System.out.print("Nhập số dòng n: ");
        int row = new Scanner(System.in).nextInt();
        System.out.print("Nhập số cột m: ");
        int col = new Scanner(System.in).nextInt();
        int[][] mang = nhapMang(row,col);
        System.out.println("In ma trận");
        xuatMang(mang);
        timMinMax(mang);
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

    public static void timMinMax(int[][] arr) {
        int min = arr[0][0];
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Giá trị min trong chuỗi là "+min);
        System.out.println("Giá trị max trong chuỗi là "+max);

    }

}
