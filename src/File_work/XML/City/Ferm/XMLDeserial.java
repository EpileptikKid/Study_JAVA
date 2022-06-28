package File_work.XML.City.Ferm;

import File_work.XML.StudentRoom;

import java.beans.XMLDecoder;
import java.nio.file.Files;
import java.nio.file.Paths;

public class XMLDeserial {
    public static void main(String[] args) throws Exception {
        try (XMLDecoder xmlDecoder = new XMLDecoder(Files.newInputStream(Paths.get("src//File_work//XML//StudentRoom.xml")))) {
            StudentRoom studentRoom = (StudentRoom) xmlDecoder.readObject();
            System.out.println(studentRoom.getGroup()[0].getName());
            System.out.println(studentRoom.getGroup()[1].getName());
            System.out.println(studentRoom.getGroup()[2].getName());
        }
    }
}
