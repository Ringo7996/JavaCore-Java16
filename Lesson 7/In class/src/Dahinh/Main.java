package Dahinh;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.study();

        Children children = new Children();
        children.study();   // chạy runtime mới biết study là học kiểu gì, kiểu sinh viên hay trẻ con



        Person student1 = new Student();  //kiểu dữ liệu là con người, con người theo thể loại sinh viên
        student1.getId();
        student1.study(); //-> ra kết quả hàm của student

    }

}
