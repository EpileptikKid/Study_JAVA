package File_work.old;

import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Deserial {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get("src/File_work/file.dat")))) {
            AcademicGroup ag = (AcademicGroup) in.readObject();
            ag.printGroup();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
