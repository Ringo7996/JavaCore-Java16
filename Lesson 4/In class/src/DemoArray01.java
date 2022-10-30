public class DemoArray01 {
    public static void main(String[] args) {

        int a1 = 2;
        int a2 = 4;
        int a3 = 6;

        int[] arr = new int[3];   // mảng có 3 phần tử
        int[] arr1; // khai báo
        arr1 = new int[3]; //khởi tạo (gán gá trị)

        int[] arr2 = {2,4,6};   // mảng có 3 phần tử là 2 4 6.
        System.out.println(arr2[0]);  //truy xuất tới giá trị phần tử ở vị trí đầu tiên trong mảng.
        arr2 [0] = 100; // thay đổi giá trị của phần tử ở vị trí đầu tiên trong mảng.

        System.out.println(arr2[0]);
        System.out.println(arr.length);

        //duyệt mảng, dùng vòng lặp
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);

        }

    }
}
