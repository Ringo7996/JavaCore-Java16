package Rectangle;

import Demo.Person;

public class Mainrun3 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.height = 150;
        Person p2 = new Person();
        p2.height = 170;

        keochan(p1);
        System.out.println(p1.height);

//        p1.name = " A";
//        p2.name = " B";
//        System.out.println("p1.name" + p1.name);
//        System.out.println("p1.name" + p2.name);
//
//        System.out.println("---");
//
//        // p1 chỏ tới name A. p2 trỏ tới name B.
//        // khi p1= p2 thì p1 ko trỏ về name A nữa mà trỏ vào name B
//        // nên khi p2.name thay đổi thì cả p1 và p2 cùng trỏ nên thay đổi theo.
//
//        p1 = p2;
//        System.out.println("p1.name" + p1.name);
//        System.out.println("p1.name" + p2.name);
//
//        System.out.println("---");
//
//        p1.name = "C";
//        System.out.println("p1.name" + p1.name);
//        System.out.println("p1.name" + p2.name);
        Person p4 = null;

        int[] arr = new int[10];
        Person[] persons = new Person[10];

    }


    //thay đổi giá trị của vùng nhớ, mang con trỏ tham gia vào hàm này
    // còn đối với biến bình thường mainraun 2 thì chỉ thay đổi giá trị vùng nhớ, nó tạo vùng nhớ mới chứa gtri moi
    public static void keochan(Person person) {
        person.height +=10;
    }


}
