public class DemoVD6 {
    public static void main(String[] args) {
        System.out.println("Nhập số 5 đén 7 chữ số");
        for (int i = 10000; i <10000000 ; i++) {

            boolean laSNT = false;

            if (i<2) {
                System.out.println("Là snt");
                laSNT = false;
            }
            for (int j=2; j<Math.sqrt(i); j++) {
                if (i%j==0) {
                    System.out.println("ko la sNT");
                    laSNT = false;
                    break;
                }
            }

            boolean thuannghich = false;

            if (laSNT && thuannghich) {
                System.out.println(i);
            }
        }
    }


    public static boolean ktraSNT (int i) {
//        return false;
       return true;
    }

    public static boolean ktra4 (int n) {
        while(n>0) {
            int digit = n%10;
            n = n/10;
        }
        return true;
    }

}
