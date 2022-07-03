package File_work.old;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestArrGeneral {
    public static void main(String[] args) {
        StudentRoom sr1 = new StudentRoom("NAU", "Kiyv", 15000);
        StudentRoom sr2 = new StudentRoom("KPI", "Kiyv", 50000);
        StudentRoom sr3 = new StudentRoom("KNTEU", "Kiyv", 40000);
        ArrayX<StudentRoom> arr = new ArrayX<>(sr1, sr2, sr3);
        arr.printAll();
        Path path = Paths.get("src/File_work/file.dat");
        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(path))) {
            out.writeObject(arr);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("________________________");
        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(path))) {
            ArrayX<StudentRoom> arrOut = (ArrayX<StudentRoom>) in.readObject();
            arrOut.printAll();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
