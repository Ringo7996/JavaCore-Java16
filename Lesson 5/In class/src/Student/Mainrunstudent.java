package Student;

import Demo.Person;

public class Mainrunstudent {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person();
        person.name="ABC";
        person.id="1";
        System.out.println(person);

        person2.name="ABC";
        person2.id="1";
        System.out.println(person2);

        System.out.println(person);
        System.out.println(person2);

    }
}
