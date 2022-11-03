import java.util.Scanner;

public class Homework9 {
// Viết chương trình tạo ngẫu nhiên mảng a gồm N phần tử bao gồm các số nguyên.
// In ra các số khác nhau trong dãy.
    public static void main(String[] args) {
        System.out.print("Nhập số n (số phần tử mảng) ");
        int n = new Scanner(System.in).nextInt();
        inSoKhacNhau(nhapMang(n));
    }


    public static int[] nhapMang(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]\t");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    // so sánh từng số a với các số còn lại trong chuỗi, ngoại trừ chính nó,
    // bắt gặp số bằng nó thì gán trùng = true, break vòng -> ko in. Chạy hết vòng mà ko có số bằng thì trùng =false -> in
    // Sau mỗi số thì gán lại giá trị trùng = false trc khi so số tiếp theo.
    public static void inSoKhacNhau(int[] arr) {
        System.out.print("Các số khác nhau trong chuỗi là: ");
        boolean trung = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && j != i) {
                    trung = true;
                    break;
                }
            }

            if (trung == false) {
                System.out.print(arr[i] + "\t");
            }
            trung = false;
        }

    }

}
