package File_work;

import java.io.*;


public class FileDobleMultiply {
    public static void main(String[] args) {

        try (BufferedReader in = new BufferedReader(new FileReader("src/File_work/123.txt"));
             PrintWriter out = new PrintWriter(new FileWriter("src/File_work/312.txt"))) {
            Double mult = 1.0;
            String line;
            while ((line = in.readLine()) != null) {
                if (Double.parseDouble(line) != 0) {
                    mult *= Math.abs(Double.parseDouble(line));
                }
            }
            out.println(mult);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
