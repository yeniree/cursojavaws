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

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod
    public int sumar(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        System.out.println("Ejecutando sumar...");
        return num1 + num2;
    }

}
