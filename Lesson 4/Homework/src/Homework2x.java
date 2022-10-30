public class Homework2x {
    public static void main(String[] args) {
//Bài 2: Viết chương trình liệt kê các số nguyên có 7 chữ số thoả mãn:
//a) Là số nguyên tố.
//b) Tất cả các chữ số là nguyên tố
//c) Đảo của nó cũng là một số nguyên tố
        for (int i = 1000000; i < 10000000; i++) {
            if (laSoNguyenTo(i)  &&daoNghichLaSNT(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean laSoNguyenTo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean tatCaSoLaSNT(int n) {
        int[] arr = {2, 3, 5, 7};
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] != n % 10) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static boolean daoNghichLaSNT(int n) {
        int daonghich = 0;
        while (n > 0) {
            daonghich = daonghich * 10 + n % 10;
            n = n / 10;
        }

        for (int i = 2; i < daonghich; i++) {
            if (daonghich % i == 0) {
                return false;
            }
        }
        return true;
    }
}



