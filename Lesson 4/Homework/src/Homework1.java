public class Homework1 {
    public static void main(String[] args) {
// Viết chương trình liệt kê các số nguyên có 7 đến 9 chữ số thoả mãn:
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
        int[] a = {0, 6, 8};
        boolean check = false;
        while (n > 0) {
            // chạy từng phần tử trong a, hễ có chữ số trùng 1 phần tử thì break, chạy tiếp chữ số hàng tiếp để so sánh.
            for (int j = 0; j < a.length; j++) {
                check = false;
                if (a[j] == n % 10) {
                    check = true;
                    break;
                }
            }

            //Đối với mỗi chữ số của n, chạy hết các phần tử của a mà vẫn ko có số trùng thì return luôn vì false từ đây)
            if (!check) {
                return check;
            }
            n /= 10;
        }

        // chạy hết các chữ số của mà ko bị false lần nào, thì số đó ok, return giá trị true.
        return check;
    }

    public static boolean tongChuSoChiaHet10(int n) {
        int S = 0;
        while (n > 0) {
            S += n % 10;
            n /= 10;
        }

        return S % 10 == 0;
    }

}
