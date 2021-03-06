
package estructuras;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Estructuras", targetNamespace = "http://estructuras/", wsdlLocation = "http://localhost:8080/webservicetransmetro/Estructuras?wsdl")
public class Estructuras_Service
    extends Service
{

    private final static URL ESTRUCTURAS_WSDL_LOCATION;
    private final static WebServiceException ESTRUCTURAS_EXCEPTION;
    private final static QName ESTRUCTURAS_QNAME = new QName("http://estructuras/", "Estructuras");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/webservicetransmetro/Estructuras?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ESTRUCTURAS_WSDL_LOCATION = url;
        ESTRUCTURAS_EXCEPTION = e;
    }

    public Estructuras_Service() {
        super(__getWsdlLocation(), ESTRUCTURAS_QNAME);
    }

    public Estructuras_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ESTRUCTURAS_QNAME, features);
    }

    public Estructuras_Service(URL wsdlLocation) {
        super(wsdlLocation, ESTRUCTURAS_QNAME);
    }

    public Estructuras_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ESTRUCTURAS_QNAME, features);
    }

    public Estructuras_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Estructuras_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Estructuras
     */
    @WebEndpoint(name = "EstructurasPort")
    public Estructuras getEstructurasPort() {
        return super.getPort(new QName("http://estructuras/", "EstructurasPort"), Estructuras.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Estructuras
     */
    @WebEndpoint(name = "EstructurasPort")
    public Estructuras getEstructurasPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://estructuras/", "EstructurasPort"), Estructuras.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ESTRUCTURAS_EXCEPTION!= null) {
            throw ESTRUCTURAS_EXCEPTION;
        }
        return ESTRUCTURAS_WSDL_LOCATION;
    }

}
