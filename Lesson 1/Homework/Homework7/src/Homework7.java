public class Homework7 {
    public static void main(String[] args) {
        double a = 2;
        double b = 5;
        double c = -7;

        double delta= b*b-4*a*c;
        double x1=(-b+Math.sqrt(delta))/(2*a);
        double x2=(-b-Math.sqrt(delta))/(2*a);

        System.out.println("Phương trình bậc hai "+a+"x2"+b+"x+"+c+"=0 có 2 nghiệm là "+x1+" và "+x2 );
    }
}
