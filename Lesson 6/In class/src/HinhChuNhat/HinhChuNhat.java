package HinhChuNhat;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public double chuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public double dienTich() {
        return this.chieuDai * this.chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
}
