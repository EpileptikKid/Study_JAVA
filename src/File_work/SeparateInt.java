package File_work;



import java.io.DataOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparateInt {
    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(Files.newOutputStream(Paths.get("src/File_work/file.dat")))) {
            List<Integer> outs = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            int num = 1;
            int size = 0;
            while (num != -1) {
                num = scanner.nextInt();
                if (num != -1) {
                    outs.add(num);
                    size++;
                }
            }
            out.writeInt(size);
            for (int i : outs) {
                out.writeInt(i);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }




    }
}
