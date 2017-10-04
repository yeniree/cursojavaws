/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationclientews;

import edu.curso.ws.cliente.HolaMundoWebService;
import edu.curso.ws.cliente.HolaMundoWebService_Service;
import edu.curso.ws.cliente.Persona;
import java.util.List;

/**
 *
 * @author educacionit
 */
public class JavaApplicationClienteWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HolaMundoWebService_Service clienteSoap = new HolaMundoWebService_Service();
        
        HolaMundoWebService service = clienteSoap.getHolaMundoWebServicePort();
        Persona p = service.recuperarPersona(12345);
        System.out.println("Persona: " + p.getNombre() + " " + p.getId());
        
        System.out.println("*************************************************");
        
        List<Persona> personas = service.recuperarPersonas();
        for (Persona x : personas) {
            System.out.println("Persona: " + x.getNombre() + " " + x.getId());
        }
    }

}
