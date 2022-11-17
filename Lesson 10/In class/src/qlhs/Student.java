package qlhs;

public class Student implements Iclassification{
    private String name;
    private int age;
    private double marks;
    private String classification;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public Student(){
    }

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public void classify() {
        if (this.marks >=8){
            this.classification = "A";
        } else if (this.marks >6.5){
            this.classification = "B";
        } else {
            this.classification = "C";
        }
    }

    @Override
    public void display() {
        System.out.println("Học sinh: "+name+" "+age+" "+marks+" "+classification);
    }
}
