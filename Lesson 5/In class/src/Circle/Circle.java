package Circle;

public class Circle {
    public double radius;
    public double calculatePerimeter() {
        return radius*2*Math.PI;
    }
    public double calculateArea() {
        return radius*radius*Math.PI;
    }
}
