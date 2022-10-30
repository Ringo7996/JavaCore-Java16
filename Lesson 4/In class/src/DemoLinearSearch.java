import java.util.Scanner;

public class DemoLinearSearch {
    public static void main(String[] args) {
        nhapMang();
//    timKiem();
    }

    public static int[] nhapMang() {
        System.out.println("Nhập số lượng phần tử mảng:");
        int n = new Scanner(System.in).nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

//    public static int timKiem(int[] a, int x) {
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == x) {
//                return i;
//            }
//        }
//        return i;

        //tìm vị trí cuối cùng: gán vị trí vào 1 biến để thay đổi dần.
//    }


//    public static int[] sapxepbot(int[] a) {
//        int temp=-1;
//        for (int i = 0; i < a.length - 1; i++) {
//            for (int j = i; j < a.length - 1; j++) {
//                if (a[i] > a[j]) ;
//                a[i] = a[j];
//                a[j] = temp;
//            }
//        }
//        return int[] a;
//    }
//
//}
