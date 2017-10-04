/**
 * HolaMundoCalculadoraService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.curso.java.ws;

public interface HolaMundoCalculadoraService extends javax.xml.rpc.Service {
    public java.lang.String getHolaMundoCalculadoraAddress();

    public edu.curso.java.ws.HolaMundoCalculadora getHolaMundoCalculadora() throws javax.xml.rpc.ServiceException;

    public edu.curso.java.ws.HolaMundoCalculadora getHolaMundoCalculadora(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
