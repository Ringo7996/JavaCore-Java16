package MyPoint;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        System.out.print("Nhập n là số đối tượng điểm muốn tạo ");
        int n = new Scanner(System.in).nextInt();

        MyPoint[] points = new MyPoint[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập toạ độ điểm thứ " + (i + 1));
            System.out.print("Nhập toạ độ x ");
            double x = new Scanner(System.in).nextDouble();
            System.out.print("Nhập toạ độ y ");
            double y = new Scanner(System.in).nextDouble();
            points[i] = new MyPoint(x, y);
            System.out.println("--------------");
        }

        System.out.println("In toạ độ các điểm dã tạo");
        for (int i = 0; i < n; i++) {
            System.out.println("Điểm " + (i + 1) + " (" + points[i].x + "," + points[i].y + ")");
        }
        System.out.println("--------------");

        System.out.print("Hai điểm có khoảng cách lớn nhất là: ");
        double maxdistance = 0;
        MyPoint pointA = null;
        MyPoint pointB = null;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (points[i].distance(points[i], points[j]) >= maxdistance) {
                    maxdistance = points[i].distance(points[i], points[j]);
                    pointA = points[i];
                    pointB = points[j];
                }
            }
        }
        System.out.println("(" + pointA.x + "," + pointA.y + ") và (" + pointB.x + "," + pointB.y + ")");
        System.out.println("Giá trị khoảng cách đó là "+maxdistance);
    }
}
