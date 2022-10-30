public class Homework1x {
    public static void main(String[] args) {
//Bài 1: Viết chương trình liệt kê các số nguyên có 7 đến 9 chữ số thoả mãn:
//a) Là số thuận nghịch.
//b) Chỉ có chữ số 0, 6, 8
//c) Tổng chữ số chia hết cho 10
        for (int i = 1000000; i < 1000000000; i++) {
            if (laThuanNghich(i) && chua068(i) && tongChuSoChiaHet10(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean laThuanNghich(int n) {
        int soBanDau = n;
        int temp = 0;
        while (n > 0) {
            temp = temp * 10 + n % 10;
            n = n / 10;
        }
        return temp == soBanDau;
    }

    public static boolean chua068(int n) {
        int soBanDau = n;
        int[] a = {0, 6, 8};
        while (n > 0) {
            for (int i = 0; i < a.length; i++) {
                if (n % 10 != a[i]) {
                    return false;
                }
            }
            n /= 10;
        }
        return true;
    }

    public static boolean tongChuSoChiaHet10(int n) {
        int S = 0;
        while (n > 0) {
            S += n % 10;
            n /= 10;
        }

        return S == 10;
    }

}
