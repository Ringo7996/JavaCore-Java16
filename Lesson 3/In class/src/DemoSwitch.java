import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args) {
        System.out.println("Input a number between 2 and 6");
        int day = new Scanner(System.in).nextInt();

        switch (day) {
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
