package Circle;

import java.util.Scanner;

public class Circle1 {
    //tính diện tích và chu vi hình tròn khi ngời dùng nhập vào bán kính
    //theo lập trình hướng thủ tục
    public static void main(String[] args) {
        System.out.println("Nhập bán kính");
        double radius = new Scanner(System.in).nextDouble();
        System.out.println("Chu vi hình tròn là " + 2 * Math.PI * radius);
        System.out.println("Diện tích hình tròn là " + Math.PI * radius * radius);
    }

}
