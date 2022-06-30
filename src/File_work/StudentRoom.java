package File_work;

import java.io.Serializable;

public class StudentRoom implements Serializable {
    private static final long serialVersionUID = 4492606185294532683L;
    private String name, adress;
    private int numberStudent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNumberStudent() {
        return numberStudent;
    }

    public void setNumberStudent(int numberStudent) {
        this.numberStudent = numberStudent;
    }

    public StudentRoom(String name, String adress, int numberStudent) {
        this.name = name;
        this.adress = adress;
        this.numberStudent = numberStudent;
    }

    @Override
    public String toString() {
        return "name - " + getName() + ", adress - " + getAdress() + ", count student - " + getNumberStudent() + ";\n";
    }
}
