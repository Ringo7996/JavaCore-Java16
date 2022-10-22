public class Homework9 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        double c = (double) a/ (double) b;

        System.out.println( "Thương của "+a+" và "+b+" là "+ (double)Math.round(c*1000)/1000);
    }
}
