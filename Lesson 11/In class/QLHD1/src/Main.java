import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        PersonAction personAction = new PersonAction();

        System.out.println("Mời bạn nhập id: ");
        Integer id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập địa chỉ: ");
        String address = scanner.nextLine();
        ArrayList<Person> people = new ArrayList<>();

        Person person = personAction.inputPerson(scanner);
        Person person2 = personAction.inputPerson(scanner);
        people.add(person);
        people.add(person2);

        Household household = new Household(id, address, people);
        System.out.println(household.toString());
    }
}
