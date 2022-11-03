package Demo;

public class mainRun {
    public static void main(String[] args) {
        //tạo đối tượng từ class
        // Person là 1 class Đại Diện cho 1 tập hợp đối tượng.
        // Còn cái toiday là 1 đối tượng cụ thể của lớp person.

        Person toiday = new Person();
        toiday.name = "Linh";  // truy cập vào đối tượng và thay đổi nó, dùng toán tử chấm thông qua tên đối tượng.
        toiday.id = 1234 + "";
        toiday.address = "Hanoi";
        toiday.keKhai();

        Person toiday2 = new Person(1141 + "", "Linh éc", "Hà nội");
        toiday2.keKhai();

        Person Linh = new Person();   //hàm tạo. dùng để  khởi tạo đối tượng. phải có từ khoá new
        Linh.name = "Ngô";
        Linh.id = 126224 + "";
        Linh.address = "Vietnam";
        Linh.keKhai();

        Person p1 = new Person("demooo");
        p1.breath();
    }
}
