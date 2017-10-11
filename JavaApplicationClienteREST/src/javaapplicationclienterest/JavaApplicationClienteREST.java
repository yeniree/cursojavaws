/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationclienterest;

import java.util.List;
import javax.ws.rs.core.Response;

/**
 *
 * @author educacionit
 */
public class JavaApplicationClienteREST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewJerseyClient clienteREST = new NewJerseyClient();
        Persona persona =  clienteREST.recuperarPersona_JSON(Persona.class, "1");
        System.out.println("Nombre: " + persona.getNombre());
        
        List<Persona> lista = clienteREST.recuperarPersonas_JSON();
        for (Persona p : lista) {
            System.out.println("Nombre: " + p.getNombre() + " " + p.getApellido());
        }
        
        Persona p = new Persona();
        p.setNombre("Juan");
        
        Response response = clienteREST.altaDePersonas_JSON(p);
        Persona x = response.readEntity(Persona.class);
        
        System.out.println(x.getNombre());
    }
    
}
