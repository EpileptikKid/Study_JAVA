package File_work.old;

import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerialAG {
    public static void main(String[] args) {
        AcademicGroup ag = new AcademicGroup();
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        st1.setName("Vova");
        st1.setCourse(1);
        st2.setName("Dima");
        st2.setCourse(2);
        st3.setName("Misha");
        st3.setCourse(3);
        ag.addStudent(st1);
        ag.addStudent(st2);
        ag.addStudent(st3);
        ag.setName("Super Group");

        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get("src/File_work/file.dat")))) {
            out.writeObject(ag);
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
