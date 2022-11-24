
public class Employee {
    protected String name;
    protected double salary;

    public double getSalary() {
        return salary;
    }

    public Employee() {

    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //add and complete your other methods here (if needed)


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
