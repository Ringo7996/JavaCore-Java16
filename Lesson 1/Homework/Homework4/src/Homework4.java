public class Homework4 {
    public static void main(String[] args) {
        double a = 6.8;
        double cana = Math.sqrt(a);

        System.out.println("Căn bậc 2 của số dương "+a+" là "+ cana);
        System.out.println("Căn bậc 2 của số dương "+a+" làm tròn đến 3 chữ số thập phân là "+ (double) Math.round(cana*1000)/1000);
    }
}
