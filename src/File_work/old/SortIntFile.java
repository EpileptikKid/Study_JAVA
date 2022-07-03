package File_work.old;

import java.io.DataInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.PriorityQueue;
import java.util.Queue;

public class SortIntFile {
    public static void main(String[] args) {
        Queue<Integer> arr = new PriorityQueue<>();
        try (DataInputStream in1 = new DataInputStream(Files.newInputStream(Paths.get("src/File_work/file20.dat")));
             DataInputStream in2 = new DataInputStream(Files.newInputStream(Paths.get("src/File_work/file21.dat")))) {

            try {
                while (true) {
                    int k = in1.readInt();
                    arr.add(k);

                }
            }
            catch (Exception ignored) {

            }
            try {
                while (true) {
                    int p = in2.readInt();
                    arr.add(p);

                }
            }
            catch (Exception ignored) {

            }
            for (int s : arr) {
                System.out.print(s + " ");
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
