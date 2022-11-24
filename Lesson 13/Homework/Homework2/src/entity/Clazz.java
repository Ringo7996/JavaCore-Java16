package entity;

import java.util.ArrayList;

public class Clazz {
    public String subject;
    public ArrayList<Student> students;

    public Clazz(String subject, ArrayList<Student> students) {
        this.subject = subject;
        this.students = students;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "subject='" + subject + '\'' +
                ", students=" + students +
                '}';
    }
}
