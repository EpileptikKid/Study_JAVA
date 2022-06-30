package File_work.XML;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class SaxXML extends DefaultHandler {
    @Override
    public void startDocument() {
        System.out.println("Данньіе о студентах:");
        System.out.println("-----------------");
    }

    @Override
    public void endDocument() {
        System.out.println("конец документа");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if (qName.equals("Student") | qName.equals("Mark")) {
            System.out.println(attributes.getValue(0) + " " + attributes.getValue(1));
        }
        if (qName.equals("Comments")) {
            System.out.println();
        }

    }

    @Override
    public void characters(char[] ch, int start, int length) {
        String s = new String(ch).substring(start, start + length).trim();
        if (s.length() > 0) {
            System.out.println(s);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equals("Student")) {
            System.out.println("------------------");
        }
    }

    public static void main(String[] args) {
        SAXParser parser = null;
        try {
            parser = SAXParserFactory.newInstance().newSAXParser();
        }
        catch (ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }
        if (parser != null) {
            InputSource input = new InputSource("src//File_work//XML//Students.xml");
            try {
                parser.parse(input, new SaxXML());
            }
            catch (SAXException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
