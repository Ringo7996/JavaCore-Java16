package Rectange;

public class Rectange {
    public double width;
    public double height;
    public String color;


    public Rectange() {
        this.width = 1;
        this.height = 1;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double findArea(){
        double Area = this.height*this.width;
        return Area;
    }

    public double findPerimeter(){
        double Perimeter = 2*(this.height+this.width);
        return Perimeter;
    }
}
