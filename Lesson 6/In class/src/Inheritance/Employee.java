package Inheritance;

public class Employee extends Person{
    public double heSoLuong;
    public  double luongCoBan;

    protected double tinhLuong(){
        return heSoLuong*luongCoBan;
    }
}
