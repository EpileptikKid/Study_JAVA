package File_work.XML;

import java.io.*;
import java.nio.file.Files;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;



public class DomXML {
    public static void main(String[] args) throws Exception {
        Document doc;
        DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        doc = db.parse(new File("src//File_work//XML//Students.xml"));
        Node rootNode = doc.getDocumentElement();
        for (int i = 0; i < rootNode.getChildNodes().getLength(); i++) {
            Node currentNode = rootNode.getChildNodes().item(i);
            if (currentNode.getNodeName().equals("Student")) {
                System.out.println(currentNode.getAttributes().item(0).getNodeValue() + " " + currentNode.getAttributes().item(1).getNodeValue());

                Node balls = currentNode.getChildNodes().item(1);
                for (int j = 0; j < balls.getChildNodes().getLength(); j++) {
                    if (balls.getChildNodes().item(j).getNodeName().equals("Mark")) {
                        System.out.println("----- " + balls.getChildNodes().item(j).getAttributes().item(0).getNodeValue() + " - " + balls.getChildNodes().item(j).getAttributes().item(1).getNodeValue());
                        balls.getChildNodes().item(j).getAttributes().item(1).setNodeValue("5");
                    }
                }
            }
        }
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.transform(new DOMSource(doc), new StreamResult(Files.newOutputStream(new File("src//File_work//XML//HelloDOM.xml").toPath())));
    }
}
