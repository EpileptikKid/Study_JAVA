package File_work.old;

import java.io.Serializable;

public class Student implements Serializable{
    private static final long serialVersionUID = -7421197435499381461L;
    private String name;
    private int course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "name - " + getName() + ", course - " + getCourse() + ";\n";
    }
}
