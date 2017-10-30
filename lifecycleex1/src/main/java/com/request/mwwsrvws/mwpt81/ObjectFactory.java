
package com.request.mwwsrvws.mwpt81;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.request.mwwsrvws.mwpt81 package. 
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

    private final static QName _MWPT81Operation_QNAME = new QName("http://www.MWPT81.MWWSRVWS.Request.com", "MWPT81Operation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.request.mwwsrvws.mwpt81
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProgramInterface }
     * 
     */
    public ProgramInterface createProgramInterface() {
        return new ProgramInterface();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.MWPT81.MWWSRVWS.Request.com", name = "MWPT81Operation")
    public JAXBElement<ProgramInterface> createMWPT81Operation(ProgramInterface value) {
        return new JAXBElement<ProgramInterface>(_MWPT81Operation_QNAME, ProgramInterface.class, null, value);
    }

}
