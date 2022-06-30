package File_work.XML;

import java.io.Serializable;

public class StudentRoom implements Serializable {
    private static final long serialVersionUID = 4492606185294532683L;
    private Student[] group = new Student[3];

    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] group) {
        this.group = group;
    }


}
