import java.util.ArrayList;

public class Household {
    private int id;
    private String adress;
    private ArrayList<Person> people;

    public Household(int id, String adress, ArrayList<Person> people) {
        this.id = id;
        this.adress = adress;
        this.people = people;
    }

    @Override
    public String toString() {
        return "Household{" +
                "id=" + id +
                ", adress='" + adress + '\'' +
                ", people=" + people +
                '}';
    }
}
