package polygon;

public class Square implements Polygon {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void display() {
        System.out.println("Hình vuông có hiều dài 1 cạnh:" + side);
    }

    @Override
    public void calArea() {
        System.out.println("Diện tích bằng " + (side * side));
    }
}
