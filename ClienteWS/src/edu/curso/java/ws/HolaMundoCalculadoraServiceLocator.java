/**
 * HolaMundoCalculadoraServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.curso.java.ws;

public class HolaMundoCalculadoraServiceLocator extends org.apache.axis.client.Service implements edu.curso.java.ws.HolaMundoCalculadoraService {

    public HolaMundoCalculadoraServiceLocator() {
    }


    public HolaMundoCalculadoraServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HolaMundoCalculadoraServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HolaMundoCalculadora
    private java.lang.String HolaMundoCalculadora_address = "http://localhost:8080/EjemploWs/services/HolaMundoCalculadora";

    public java.lang.String getHolaMundoCalculadoraAddress() {
        return HolaMundoCalculadora_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HolaMundoCalculadoraWSDDServiceName = "HolaMundoCalculadora";

    public java.lang.String getHolaMundoCalculadoraWSDDServiceName() {
        return HolaMundoCalculadoraWSDDServiceName;
    }

    public void setHolaMundoCalculadoraWSDDServiceName(java.lang.String name) {
        HolaMundoCalculadoraWSDDServiceName = name;
    }

    public edu.curso.java.ws.HolaMundoCalculadora getHolaMundoCalculadora() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HolaMundoCalculadora_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHolaMundoCalculadora(endpoint);
    }

    public edu.curso.java.ws.HolaMundoCalculadora getHolaMundoCalculadora(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            edu.curso.java.ws.HolaMundoCalculadoraSoapBindingStub _stub = new edu.curso.java.ws.HolaMundoCalculadoraSoapBindingStub(portAddress, this);
            _stub.setPortName(getHolaMundoCalculadoraWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHolaMundoCalculadoraEndpointAddress(java.lang.String address) {
        HolaMundoCalculadora_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (edu.curso.java.ws.HolaMundoCalculadora.class.isAssignableFrom(serviceEndpointInterface)) {
                edu.curso.java.ws.HolaMundoCalculadoraSoapBindingStub _stub = new edu.curso.java.ws.HolaMundoCalculadoraSoapBindingStub(new java.net.URL(HolaMundoCalculadora_address), this);
                _stub.setPortName(getHolaMundoCalculadoraWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HolaMundoCalculadora".equals(inputPortName)) {
            return getHolaMundoCalculadora();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.java.curso.edu", "HolaMundoCalculadoraService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.java.curso.edu", "HolaMundoCalculadora"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HolaMundoCalculadora".equals(portName)) {
            setHolaMundoCalculadoraEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
