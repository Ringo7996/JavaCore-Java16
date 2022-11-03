import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
// Nhập một dãy số có n phần tử trong đó không cho phép nhập các số trùng nhau.
// Nếu nhập một số đã có thì yêu cầu nhập lại. Sau khi đủ n phần tử thì in dãy số đã nhập ra màn hình.
        System.out.print("Nhập số n (số phần tử mảng) ");
        int n = new Scanner(System.in).nextInt();
        xuatMang(nhapMangKoTrung(n));
    }

    public static int[] nhapMangKoTrung(int n) {
        int[] arr = new int[n];
        int i = 0;
        boolean trung;
        while (i < n) {
            System.out.print("a[" + i + "]\t");
            arr[i] = new Scanner(System.in).nextInt();

            trung = false;
            for (int j = 0; j < i; j++) {     // ở lần nhập số lần thứ i thì chạy các phần tử từ 0 đến i xem có trùng ko
                if (arr[j] == arr[i]) {
                    trung = true;
                    break;   // chỉ cần 1 phần tử có trùng thì break lấy giá trị "trung" la true.
                }            //Nếu chạy hết ko trùng thì "trung" ko bị gán gì cả, vẫn giữ giá trị ban đầu là false.
            }

            if (trung) {   // nếu "trung" = true thì bắt nhập lại.
                System.out.println("Nhập lại a[" + i + "]");
            } else {      // nếu ko trùng thì mới được i+1 sang lần nhập tiếp theo.
                i += 1;
            }
        }
        return arr;
    }

    public static void xuatMang(int[] arr) {
        System.out.println("Mảng đã nhập là ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
