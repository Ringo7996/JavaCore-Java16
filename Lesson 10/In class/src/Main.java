import account.Account;
import news.News;
import polygon.Rectangle;
import polygon.Square;
import qlhs.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        News news = new News("Tên", "Tác giả ", "Ngày", 13);
        news.display();


        System.out.println("--------");
        Account account = new Account("A", 123, "mail", 132);
        account.recharge(456);
        account.changeEmail("mail2");
        account.displayInfo();


        System.out.println("--------");
        Rectangle rectangle = new Rectangle(1, 5);
        rectangle.display();
        rectangle.calArea();


        System.out.println("--------");
        Square square = new Square(3);
        square.display();
        square.calArea();

        System.out.println("--------");
        Student student = new Student("Linh", 25, 4.5);
        student.classify();
        student.display();


        ArrayList<Integer> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add(12);
        list.add(null);


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
//        list.clear();
        list.removeAll(list1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        for (Integer i : list1){
            System.out.println(i);
        }



    }
}
