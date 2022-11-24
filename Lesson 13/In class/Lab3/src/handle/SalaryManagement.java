package handle;

import entity.Worker;

import java.time.LocalDate;

public class SalaryManagement extends Worker {
    private String change;
    private LocalDate date;

    public SalaryManagement(int code, String name, int age, double salary, String workPlace) {
        super(code, name, age, salary, workPlace);
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
