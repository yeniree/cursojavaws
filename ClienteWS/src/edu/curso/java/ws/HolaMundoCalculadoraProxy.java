package edu.curso.java.ws;

public class HolaMundoCalculadoraProxy implements edu.curso.java.ws.HolaMundoCalculadora {
  private String _endpoint = null;
  private edu.curso.java.ws.HolaMundoCalculadora holaMundoCalculadora = null;
  
  public HolaMundoCalculadoraProxy() {
    _initHolaMundoCalculadoraProxy();
  }
  
  public HolaMundoCalculadoraProxy(String endpoint) {
    _endpoint = endpoint;
    _initHolaMundoCalculadoraProxy();
  }
  
  private void _initHolaMundoCalculadoraProxy() {
    try {
      holaMundoCalculadora = (new edu.curso.java.ws.HolaMundoCalculadoraServiceLocator()).getHolaMundoCalculadora();
      if (holaMundoCalculadora != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)holaMundoCalculadora)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)holaMundoCalculadora)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (holaMundoCalculadora != null)
      ((javax.xml.rpc.Stub)holaMundoCalculadora)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public edu.curso.java.ws.HolaMundoCalculadora getHolaMundoCalculadora() {
    if (holaMundoCalculadora == null)
      _initHolaMundoCalculadoraProxy();
    return holaMundoCalculadora;
  }
  
  public int sumar(int num1, int num2) throws java.rmi.RemoteException{
    if (holaMundoCalculadora == null)
      _initHolaMundoCalculadoraProxy();
    return holaMundoCalculadora.sumar(num1, num2);
  }
  
  
}