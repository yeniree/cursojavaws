/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.curso.java.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author educacionit
 */
@WebService(serviceName = "HolaMundoWebService")
public class HolaMundoWebService {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "recuperarPersona")
    public Persona recuperarPersona(@WebParam(name = "id") int id) {
        return new Persona(id, "Ejemplo Persona");
    }

    @WebMethod(operationName = "recuperarPersonas")
    public Persona[] recuperarPersonas() {
        Persona[] personas = new Persona[3];
        personas[0] = new Persona(1, "Ejemplo Persona1");
        personas[1] = new Persona(1, "Ejemplo Persona2");
        personas[2] = new Persona(1, "Ejemplo Persona3");

        return personas;
    }
}
