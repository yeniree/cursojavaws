
package edu.curso.ws.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.curso.ws.cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Hello_QNAME = new QName("http://ws.java.curso.edu/", "hello");
    private final static QName _RecuperarPersonas_QNAME = new QName("http://ws.java.curso.edu/", "recuperarPersonas");
    private final static QName _RecuperarPersonaResponse_QNAME = new QName("http://ws.java.curso.edu/", "recuperarPersonaResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://ws.java.curso.edu/", "helloResponse");
    private final static QName _RecuperarPersonasResponse_QNAME = new QName("http://ws.java.curso.edu/", "recuperarPersonasResponse");
    private final static QName _Persona_QNAME = new QName("http://ws.java.curso.edu/", "persona");
    private final static QName _RecuperarPersona_QNAME = new QName("http://ws.java.curso.edu/", "recuperarPersona");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.curso.ws.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecuperarPersonasResponse }
     * 
     */
    public RecuperarPersonasResponse createRecuperarPersonasResponse() {
        return new RecuperarPersonasResponse();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link RecuperarPersona }
     * 
     */
    public RecuperarPersona createRecuperarPersona() {
        return new RecuperarPersona();
    }

    /**
     * Create an instance of {@link RecuperarPersonaResponse }
     * 
     */
    public RecuperarPersonaResponse createRecuperarPersonaResponse() {
        return new RecuperarPersonaResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link RecuperarPersonas }
     * 
     */
    public RecuperarPersonas createRecuperarPersonas() {
        return new RecuperarPersonas();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.java.curso.edu/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperarPersonas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.java.curso.edu/", name = "recuperarPersonas")
    public JAXBElement<RecuperarPersonas> createRecuperarPersonas(RecuperarPersonas value) {
        return new JAXBElement<RecuperarPersonas>(_RecuperarPersonas_QNAME, RecuperarPersonas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperarPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.java.curso.edu/", name = "recuperarPersonaResponse")
    public JAXBElement<RecuperarPersonaResponse> createRecuperarPersonaResponse(RecuperarPersonaResponse value) {
        return new JAXBElement<RecuperarPersonaResponse>(_RecuperarPersonaResponse_QNAME, RecuperarPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.java.curso.edu/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperarPersonasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.java.curso.edu/", name = "recuperarPersonasResponse")
    public JAXBElement<RecuperarPersonasResponse> createRecuperarPersonasResponse(RecuperarPersonasResponse value) {
        return new JAXBElement<RecuperarPersonasResponse>(_RecuperarPersonasResponse_QNAME, RecuperarPersonasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.java.curso.edu/", name = "persona")
    public JAXBElement<Persona> createPersona(Persona value) {
        return new JAXBElement<Persona>(_Persona_QNAME, Persona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperarPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.java.curso.edu/", name = "recuperarPersona")
    public JAXBElement<RecuperarPersona> createRecuperarPersona(RecuperarPersona value) {
        return new JAXBElement<RecuperarPersona>(_RecuperarPersona_QNAME, RecuperarPersona.class, null, value);
    }

}
