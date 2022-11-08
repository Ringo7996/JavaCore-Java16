package Hinhtron;

public class Student {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Nhập lại tuổi dương");
            return;
        }
        this.age = age;
    }
}
