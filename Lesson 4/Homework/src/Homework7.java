import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        System.out.print("Nhập số n (số phần tử mảng) ");
        int n = new Scanner(System.in).nextInt();
        int[] mangGoc = nhapMang(n);
        if(kiemTraMangDoiXung(mangGoc,mangDaoNghich(mangGoc,n))) {
            System.out.println("Mảng là mảng đối xứng");
        }else {
            System.out.println("Mảng không phải là mảng đối xứng");
        }
    }

    public static int[] nhapMang(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]\t");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    ///tạo mảng đảo nghịch mới cùng số lượng số ptử, gán ngược dần ptử đầu của mảng mới là ptử cuối của mảng gốc
    public static int[] mangDaoNghich(int[] manggoc, int n) {
        int[] mangdaonghich = new int[n];
        for (int i = 0; i < manggoc.length; i++) {
            mangdaonghich[i] = manggoc[manggoc.length - 1 - i];
        }
        return mangdaonghich;
    }

    //so sánh hai mảng đảo nghịch và mảng gốc xem từng phần tử có bằng nhau không.
    public static boolean kiemTraMangDoiXung(int[] manggoc, int[] mangdaonghich) {
        for (int i = 0; i < manggoc.length; i++) {
            if (manggoc[i] != mangdaonghich[i]) {
                return false;
            }
        }
        return true;
    }
}
