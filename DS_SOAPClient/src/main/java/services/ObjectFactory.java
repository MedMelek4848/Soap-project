
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _ConsulterRepas_QNAME = new QName("http://services/", "consulterRepas");
    private final static QName _PasserCommandeResponse_QNAME = new QName("http://services/", "passerCommandeResponse");
    private final static QName _PasserCommande_QNAME = new QName("http://services/", "passerCommande");
    private final static QName _ConsulterRepasResponse_QNAME = new QName("http://services/", "consulterRepasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PasserCommande }
     * 
     */
    public PasserCommande createPasserCommande() {
        return new PasserCommande();
    }

    /**
     * Create an instance of {@link ConsulterRepasResponse }
     * 
     */
    public ConsulterRepasResponse createConsulterRepasResponse() {
        return new ConsulterRepasResponse();
    }

    /**
     * Create an instance of {@link ConsulterRepas }
     * 
     */
    public ConsulterRepas createConsulterRepas() {
        return new ConsulterRepas();
    }

    /**
     * Create an instance of {@link PasserCommandeResponse }
     * 
     */
    public PasserCommandeResponse createPasserCommandeResponse() {
        return new PasserCommandeResponse();
    }

    /**
     * Create an instance of {@link Ingredient }
     * 
     */
    public Ingredient createIngredient() {
        return new Ingredient();
    }

    /**
     * Create an instance of {@link Repas }
     * 
     */
    public Repas createRepas() {
        return new Repas();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterRepas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "consulterRepas")
    public JAXBElement<ConsulterRepas> createConsulterRepas(ConsulterRepas value) {
        return new JAXBElement<ConsulterRepas>(_ConsulterRepas_QNAME, ConsulterRepas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasserCommandeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "passerCommandeResponse")
    public JAXBElement<PasserCommandeResponse> createPasserCommandeResponse(PasserCommandeResponse value) {
        return new JAXBElement<PasserCommandeResponse>(_PasserCommandeResponse_QNAME, PasserCommandeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasserCommande }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "passerCommande")
    public JAXBElement<PasserCommande> createPasserCommande(PasserCommande value) {
        return new JAXBElement<PasserCommande>(_PasserCommande_QNAME, PasserCommande.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterRepasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "consulterRepasResponse")
    public JAXBElement<ConsulterRepasResponse> createConsulterRepasResponse(ConsulterRepasResponse value) {
        return new JAXBElement<ConsulterRepasResponse>(_ConsulterRepasResponse_QNAME, ConsulterRepasResponse.class, null, value);
    }

}
