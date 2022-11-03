package Rectangle;

public class Rectangle {
    public double length;
    public double width;


    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return (length + width) * 2;
    }

}
