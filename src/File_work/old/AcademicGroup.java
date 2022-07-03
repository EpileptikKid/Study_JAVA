package File_work.old;

import java.io.Serializable;

public class AcademicGroup implements Serializable {
    private static final long serialVersionUID = -2127695665248762182L;
    private Student[] group = new Student[1];
    private String name;

    public String getName() {
        return name;
    }

    public Student[] getGroup() {
        return group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        if (group.length == 1) {
            group = new Student[2];
            group[0] = student;
        } else {
            Student[] group1 = new Student[group.length + 1];
            System.arraycopy(group, 0, group1, 0, group.length);
            group = group1;
            group[group.length - 2] = student;
        }
    }

    public void printGroup() {
        System.out.println(getName());
        for (Student st : group) {
            if (st != null) {
                System.out.print(st);
            }
        }
    }
}
