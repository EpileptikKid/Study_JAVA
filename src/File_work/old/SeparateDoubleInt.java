package File_work.old;

import java.io.DataInputStream;

import java.io.DataOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SeparateDoubleInt {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        try (DataInputStream in = new DataInputStream(Files.newInputStream(Paths.get("src/File_work/file.dat")))) {

            int size = in.readInt();
            for (int i = 0; i < size; i++) {
                int k = in.readInt();
                arr.add(k);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try (DataOutputStream one = new DataOutputStream(Files.newOutputStream(Paths.get("src/File_work/file1.dat")));
             DataOutputStream two = new DataOutputStream(Files.newOutputStream(Paths.get("src/File_work/file0.dat")))) {
            for (int i : arr) {
                if (i % 2 == 0) {
                    two.writeInt(i);
                } else {
                    one.writeInt(i);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
