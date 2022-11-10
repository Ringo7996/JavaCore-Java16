package abstraction;

public abstract class Sinhvien {

    private int masv;
    private String ten;
    private String lop;
    private String gioiTinh;

    public Sinhvien(int masv, String hoTen, String lop, String gioiTinh) {
        this.masv = masv;
        this.ten = hoTen;
        this.lop = lop;
        this.gioiTinh = gioiTinh;
    }


    public void hocBai() {
        System.out.println("Sinh viên đang học bài");
    }

    public abstract void diThi(); // hàm ảo, phương thức ảo

    SinhvienThat sinhvienThat = new SinhvienThat();

}
