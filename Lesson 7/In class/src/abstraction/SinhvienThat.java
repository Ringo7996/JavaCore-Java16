package abstraction;

public class SinhvienThat extends Sinhvien {

    public SinhvienThat(int masv, String hoTen, String lop, String gioiTinh) {
        super(masv, hoTen, lop, gioiTinh);
    }

    @Override
    public void diThi() {
        System.out.println("Đi thi");
    }
}
