package entity;

public class Techmaster {
    private String classManager;
    private String teacher;
    private Clazz clazz;

    public Techmaster(String classManager, String teacher, Clazz clazz) {
        this.classManager = classManager;
        this.teacher = teacher;
        this.clazz = clazz;
    }

    public String getClassManager() {
        return classManager;
    }

    public void setClassManager(String classManager) {
        this.classManager = classManager;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Techmaster{" +
                "classManager='" + classManager + '\'' +
                ", teacher='" + teacher + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
