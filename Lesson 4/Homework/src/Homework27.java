import java.util.Scanner;

public class Homework27 {
    public static void main(String[] args) {
//Thực hiện nhập vào hai mảng số nguyên a, b đều có n phần tử (n>0).
// Thực hiện tính tổng hai mảng này theo quy tắc: phần tử đầu của a sẽ được cộng với phần tử cuối của b
// để cho ra phần tử đầu của mảng kết quả, tiếp theo phần tử thứ 2 của a và phần tử gần cuối của b được cộng vào
// để cho ra phần tử thứ 2 của mảng kết quả,…
        System.out.print("Nhập n là số lượng phần tử của cả 2 mảng ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhập mảng a");
        int[] manga = nhapMang(n);
        System.out.println("Nhập mảng b");
        int[] mangb = nhapMang(n);
        System.out.print("\nIn mảng a: ");
        xuatMang(manga);
        System.out.print("\nIn mảng b: ");
        xuatMang(mangb);
        System.out.print("\nIn mảng kêt quả cộng ngược phần tử: ");
        xuatMang(congNguocMang(manga, mangb));

    }

    public static int[] nhapMang(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=\t");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static void xuatMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static int[] congNguocMang(int[] manga, int[] mangb) {
        int[] mangKetQua = new int[manga.length];
        for (int i = 0; i < mangKetQua.length; i++) {
            mangKetQua[i] = manga[i] + mangb[mangb.length - 1 - i];
        }


        return mangKetQua;
    }
}
