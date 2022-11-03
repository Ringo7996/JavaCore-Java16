public class Homework2 {
    public static void main(String[] args) {
// Viết chương trình liệt kê các số nguyên có 7 chữ số thoả mãn:
//a) Là số nguyên tố.
//b) Tất cả các chữ số là nguyên tố
//c) Đảo của nó cũng là một số nguyên tố
        for (int i = 1000001; i < 10000000; i+=2) {
            if (laSoNguyenTo(i) &&tatCaSoLaSNT(i) && daoNghichLaSNT(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean laSoNguyenTo(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean tatCaSoLaSNT(int n) {
        int[] a = {2, 3, 5, 7};
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



