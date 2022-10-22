public class Homework3 {
    public static void main(String[] args) {
        double x1 = 0.4;
        double x2 = -6.8;
        double x3 = 3.2;
        double x4 = -11;

        double x1x2 = Math.max(x1,x2);
        double x3x4 = Math.max(x3,x4);

        System.out.println("Cho 4 số "+x1+", "+x2+", "+x3+", "+x4);
        System.out.println("Số lớn nhất là "+Math.max(x1x2,x3x4));
    }
}
