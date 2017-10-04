package curso.java.xml.dom;

import java.io.*;
import java.util.*;
import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.*;


public class Lectura {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	     try {
	         SAXBuilder builder=new SAXBuilder(false); 

	         Document doc=builder.build("datos/datos2.xml");
	        
	         Element raiz=doc.getRootElement();
	         //cojo el elemento raiz
	         System.out.println("La liga es de tipo:" + raiz.getAttributeValue("tipo"));
	     
	         List equipos=raiz.getChildren("equipo");
	         System.out.println("Formada por:"+equipos.size()+" equipos");
	         Iterator i = equipos.iterator();
	         while (i.hasNext()){
	             Element e= (Element)i.next();

	             Element club =e.getChild("club"); 
	             List plantilla=e.getChildren("plantilla"); 
	             System.out.println(club.getText()+":"+"valoracion="+
	                            club.getAttributeValue("valoracion")+","+
	                            "ciudad="+club.getAttributeValue("ciudad")+","+
	                            "formada por:"+plantilla.size()+"jugadores");
	              
	         }

	     }catch (Exception e){
	         e.printStackTrace();
	      }

	}

}

