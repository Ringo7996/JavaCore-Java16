import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String name;
    private Date dob;
    private String job;

    public Person(String name, Date dob, String job) {
        this.name = name;
        this.dob = dob;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", job='" + job + '\'' +
                '}';
    }
}
