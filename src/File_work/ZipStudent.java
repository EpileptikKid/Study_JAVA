package File_work;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipStudent {
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
        Path path = Paths.get("src/File_work/file.zip");
        try (ZipOutputStream zOut = new ZipOutputStream(Files.newOutputStream(path))) {
            DataOutputStream out = new DataOutputStream(zOut);
            for (Student st : ag.getGroup()) {
                if (st != null) {
                    ZipEntry zipEntry = new ZipEntry(st.getName());
                    zOut.putNextEntry(zipEntry);
                    out.writeInt(st.getCourse());
                    zOut.closeEntry();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }



        try (ZipInputStream zIn = new ZipInputStream(Files.newInputStream(path));
            DataInputStream in = new DataInputStream(zIn)) {
            ZipEntry entry;
            while ((entry = zIn.getNextEntry()) != null) {
                System.out.println("Student - " + entry.getName());
                System.out.println("Course - " + in.readInt());
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
