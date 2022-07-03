package File_work.old;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipGreat {
    public static void main(String[] args) {
        String file0 = "src/File_work/file0.dat";
        String file1 = "src/File_work/file1.dat";
        Path paths = Paths.get("src/File_work/file.zip");
        try (ZipOutputStream zOut = new ZipOutputStream(Files.newOutputStream(paths));
             FileInputStream fis0 = new FileInputStream(file0);
             FileInputStream fis1 = new FileInputStream(file1)) {
            ZipEntry entry1 = new ZipEntry("0.dat");
            zOut.putNextEntry(entry1);
            byte[] buffer1 = new byte[fis0.available()];
            fis0.read(buffer1);
            zOut.write(buffer1);
            zOut.closeEntry();
            ZipEntry entry2 = new ZipEntry("1.dat");
            zOut.putNextEntry(entry2);
            byte[] buffer2 = new byte[fis1.available()];
            fis1.read(buffer2);
            zOut.write(buffer2);
            zOut.closeEntry();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try (ZipInputStream zin = new ZipInputStream(Files.newInputStream(paths))) {
            ZipEntry entry;
            String name;
            long size;
            while ((entry = zin.getNextEntry()) != null) {
                name = entry.getName();
                size = entry.getSize();
                System.out.printf("File name: %s \t File size: %d \n", name, size);

                FileOutputStream fout = new FileOutputStream("src/File_work/file2" + name);
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    fout.write(c);
                }
                fout.flush();
                zin.closeEntry();
                fout.close();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
