import java.util.Scanner;

public class Homework4 {
//Nhập số liệu cho dãy số nguyên a[0], a[1],…, a[n-1]. Đếm xem có bao nhiêu cặp 2 phần tử liên tiếp bằng nhau trong dãy
    public static void main(String[] args) {
        System.out.print("Nhập số n (số phần tử mảng) ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Số cặp phần tử liên tiếp bằng nhau trong dãy là: "+demPhanTuBangNhau(nhapMang(n)) );
    }

    public static int[] nhapMang(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]\t");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static int demPhanTuBangNhau(int[] arr) {
        int S = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]) {
                S+=1;
            }
        }
        return S;
    }


}
