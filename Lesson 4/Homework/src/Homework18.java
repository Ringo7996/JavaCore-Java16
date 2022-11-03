public class Homework18 {
    public static void main(String[] args) {
//Viết chương trình liệt kê các số thuận nghịch có 6 chữ số mà tổng chữ số chia hết cho 10 (ví dụ số: 721127).
        for (int i = 100000; i < 1000000; i++) {
            if(ThuanNghich(i)&&TongChuSoChiaHet10(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean ThuanNghich(int n) {
        int soBanDau = n;
        int temp = 0;
        while (n > 0) {
            temp = temp * 10 + n % 10;
            n = n / 10;
        }
        return temp == soBanDau;
    }

    public static boolean TongChuSoChiaHet10(int n) {
        int S = 0;
        while (n > 0) {
            S += n % 10;
            n /= 10;
        }

        return S % 10 == 0;
    }
}
