package Hinhtron;

public class Hinhtron {
    private double banKinh;

    public double chuVi() {
        return this.banKinh * 2 * Math.PI;
    }

    public double dienTich() {
        return this.banKinh * this.banKinh * Math.PI;
    }

    public double getBanKinh() {    //hàm get bán kính
        return this.banKinh;
    }

    public void setBanKinh(double banKinh) {   //hàm set bán kính
        this.banKinh = banKinh;
    }

}
