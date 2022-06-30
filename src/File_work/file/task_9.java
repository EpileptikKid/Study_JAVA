package File_work.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class task_9 {
    public static void main(String[] args) throws IOException {
        System.out.println("create and delete....");
        File dd = new File("test.txt");
        File pp = new File(".");
        if (dd.createNewFile()) {
            System.out.println("created!");
        }
        System.out.println(Arrays.asList(Objects.requireNonNull(pp.list())));
        if (dd.delete()) {
            System.out.println("deleted!");
        }
    }
}
