package curso.java.xml.sax;

import org.apache.xerces.parsers.SAXParser;

public class Lectura {

    public static void main(String[] args) {
        try {

            SAXParser parser = new SAXParser();
            parser.setContentHandler(new EjemploHandler());
            parser.parse("datos/datos.xml");

        } catch (Exception e) {
            System.out.println("Error al procesar el fichero de favoritos: " + e.getMessage());
            e.printStackTrace();
        }

    }

}
