package curso.java.xml.dom;

import java.io.*;
import java.util.*;
import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.*;

public class Escritura {

	public static void main(String[] args) {
		
	    Element root = new Element("Articulos");
	    
	    Element articulo1 = new Element("Articulo");
	    articulo1.setAttribute("Codigo","4507");

	    Element nombre1 = new Element("Nombre");
	    nombre1.setText("CD-ROM 52X");
	    
	    Element costo1 = new Element("Costo");
	    costo1.setText("75.5");

	    root.addContent(articulo1);
	    articulo1.addContent(nombre1);
	    articulo1.addContent(costo1);
	    
	    Element articulo2 = new Element("Articulo");
	    articulo2.setAttribute("Codigo","4508");

	    Element nombre2 = new Element("Nombre");
	    nombre2.setText("DVD-ROM 12X");
	    
	    Element costo2 = new Element("Costo");
	    costo2.setText("136.12");
	    
	    root.addContent(articulo2);
	    articulo2.addContent(nombre2);
	    articulo2.addContent(costo2);

	    Document docXML =new Document(root);
	   
	    try {
	      XMLOutputter out=new XMLOutputter();
	      FileOutputStream file=new FileOutputStream("ejemplo.xml");
	      out.output(docXML,file);
	      file.flush();
	      file.close();
	      out.output(docXML,System.out);
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
	}

}
