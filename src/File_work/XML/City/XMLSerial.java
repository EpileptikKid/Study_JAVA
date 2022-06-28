package File_work.XML.City;

import File_work.XML.Student;
import File_work.XML.StudentRoom;

import java.beans.XMLEncoder;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class XMLSerial {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        st1.setName("Аліна");
        st1.setCourse(1);
        st2.setName("Андрій");
        st2.setCourse(2);
        st3.setName("Віталік");
        st3.setCourse(3);
        StudentRoom studentRoom = new StudentRoom();
        Student[] students = new Student[3];
        students[0] = st1;
        students[1] = st2;
        students[2] = st3;
        studentRoom.setGroup(students);
        try (XMLEncoder xmlEncoder = new XMLEncoder(Files.newOutputStream(new File("src//File_work//XML//StudentRoom.xml").toPath()))) {
            xmlEncoder.writeObject(studentRoom);
            xmlEncoder.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
