import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Menu menu = new Menu();
//
//        Map<Integer, Student> map = new HashMap<>();
//
//        while (true) {
//            menu.showMenu();
//            menu.chooseFunction(scanner, map);
//        }


//        SinglyLinkedList l3 = new SinglyLinkedList(3);
//        SinglyLinkedList l2 = new SinglyLinkedList(2,l3);
//        SinglyLinkedList linkedList = new SinglyLinkedList(1,l2);
//        System.out.println(linkedList);
//        Queue<Student> queue = new LinkedList<>();
//
//        Student student = new Student(1, "linh", 13);
//        Student student2 = new Student(2, "linh2", 13);
//        Student student3 = new Student(3, "linh3", 13);
//        List<Student> students = new ArrayList<>(Arrays.asList(student, student2, student3));

//        for (Student s : students) {
//            System.out.println(s);
//        }
//
//        students.forEach(s -> {
//            if (s.getId() == 1) {
//                System.out.println(s);
//            }
//        });


        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 4, 7, 2, 5));
//        list1.stream().filter(n -> n % 2 == 0).forEach(i -> System.out.println(i));
//        Set<Integer> set = list1.stream().collect(Collectors.toSet());
//        set.forEach(n-> System.out.println(n));


//        Map<Integer, Integer> map = list1.stream().collect(Collectors.toMap(n -> n, n -> n * 2));
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + "-" + entry.getValue());
//        }

        System.out.println(list1.stream().anyMatch(n -> n % 2 == 0));
        list1.stream().allMatch(n -> n % 2 == 0);


    }
}
