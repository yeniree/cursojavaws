package curso.java.xml.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class EjemploHandler extends DefaultHandler {
	private String tagActual = "";
	private String valueActual = "";
	public void characters(char[] ch, int start, int end)  throws SAXException {
		String texto = new String(ch, start, end);
		texto = texto.trim();
		if(!texto.equals("")) {
			valueActual = texto;
			System.out.println("Dato: " + texto);
		}
	}

	public void endDocument() throws SAXException {
		System.out.println("Fin del documento");
	}

	public void endElement(String namespaceURI, String localName, String rawName) {
		System.out.println("Fin del elemento " + localName);
	}

	public void startDocument() throws SAXException {
		System.out.println("Init del documento");
	}

	public void startElement(String namespaceURI, String localName, String rawName, Attributes attr) {
		tagActual = localName;
		System.out.println("Init del elemento " + localName);
		System.out.println("attr Length " + attr.getLength());
		System.out.println("valoracion: " + attr.getValue("valoracion"));
		
	}

}
