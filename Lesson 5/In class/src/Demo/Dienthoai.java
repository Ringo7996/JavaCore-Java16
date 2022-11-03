package Demo;

public class Dienthoai {
//Tạo lớp DienThoai bao gồm các thông tin về mã điện thoại, dòng điện thoại, hãng sản xuất, màu sắc,số sim vật lý
//và dung lượng pin của điện thoại. Mô tả khả năng thực hiện cuộc gọi, gửi tin nhắn, lướt web, chơi game

    String maDienthoai;
    String dongDienthoai;
    String hangSanXuat;
    String mauSac;
    String soSim;
    int dungLuongPin;


    public void goiDien(){
        System.out.println("gọi điện");

    }
    public void guiTinNhan(){
        System.out.println("gửi tin nhắn");

    }
    public void luotWeb(){
        System.out.println("lướt Web");

    }
    public void choiGame(){
        System.out.println("chơi Game");
    }

}
