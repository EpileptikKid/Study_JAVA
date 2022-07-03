package File_work.old;

import java.io.*;
import java.util.Scanner;


public class CopyTextFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print 1 file name");
        String fileOne = scanner.next();
        System.out.println("Print 2 file name");
        String foleTwo = scanner.next();
        System.out.println("Print length");
        int length = scanner.nextInt();
        try (BufferedReader in = new BufferedReader(new FileReader(fileOne));
             PrintWriter out = new PrintWriter(new FileWriter(foleTwo))) {
            String line;
            while ((line = in.readLine()) != null) {
                if (line.length() <= length) {
                    out.println(line);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
