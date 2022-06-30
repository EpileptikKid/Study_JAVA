package File_work.XML.City;

import File_work.XML.City.Ferm.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CityWithJAXB {
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance("File_work.XML.City.Ferm");
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            CityData data = (CityData) unmarshaller.unmarshal(Files.newInputStream(Paths.get("src//File_work//XML//City.xml")));
            for (CityData.StreetsData.StreetData c : data.getStreetsData().getStreetData()) {
                if (c.getName().equals("Чміленка")) {
                    c.getOldNameData().setName("Чмоненка");
                }
            }
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(data, new FileWriter("src//File_work//XML//City_newData.xml"));
        }
        catch (JAXBException | IOException e) {
            e.printStackTrace();
        }
    }
}
