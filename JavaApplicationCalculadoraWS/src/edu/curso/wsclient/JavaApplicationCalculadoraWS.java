/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.curso.wsclient;

/**
 *
 * @author educacionit
 */
public class JavaApplicationCalculadoraWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int total = 0;

        HolaMundoWebService_Service service = new HolaMundoWebService_Service();
        total = service.getHolaMundoWebServicePort().sumar(num1, num2);
        System.out.println("El total es: " + total);
    }

}
