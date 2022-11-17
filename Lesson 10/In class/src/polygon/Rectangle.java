package polygon;

public class Rectangle implements Polygon {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void display() {
        System.out.println("Hình chữ nhật có hiều dài " + length + ", chiều rộng" + width);

    }

    @Override
    public void calArea() {
        System.out.println("Diện tích bằng"+ (length*width));
    }
}
