package MyPoint;

public class MyPoint {
    public double x;
    public double y;

    public MyPoint() {
        this.x = 1;
        this.y = 1;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(MyPoint p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        double x = this.x;
        return x;
    }

    public double getY() {
        double y = this.y;
        return y;
    }

    public double distance(MyPoint secondpoint) {
        double distance = Math.sqrt(Math.pow((this.x - secondpoint.x), 2) + Math.pow((this.y - secondpoint.y), 2));
        return distance;
    }

    public double distance(MyPoint p1, MyPoint p2) {
        double distance = Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
        return distance;
    }
}
