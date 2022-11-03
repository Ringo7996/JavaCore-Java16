package Demo;

import java.util.Date;

public class Person {
    //dùng hàm để diễn tả đặc tính của đối tượng
    public String id;
    public String name;
    public Date DOB;
    public String gender;
    public String address;
    public int height;


    //sử dụng phương thức để diễn tả khả năng của đối tượng
    public void breath() {
        System.out.println("Thở");
    }

    //hàm tạo mặc định defaut constructor
    // !! ko có kiểu trả về
    public Person() {
        System.out.println("Đang gọi đến hàm tạo");
    }

    //hàm tạo có tham số truyền vào
    public Person(String abc) {
        System.out.println("Tham số vừa chuyền vào là" + abc);
    }

    public void keKhai() {
        System.out.println("Tên tôi là" + name + " đến từ " + address + "có id là " + id);
    }

    public Person(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

}


