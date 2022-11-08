package Inheritance;

public class Teacher extends Employee {
    private double bonus;

    @Override
    public double tinhLuong() {
        return super.tinhLuong()+bonus;

    }
}
