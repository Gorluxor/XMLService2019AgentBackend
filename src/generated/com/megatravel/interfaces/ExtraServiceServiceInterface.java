package com.megatravel.interfaces;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2019-06-30T11:47:29.096+02:00
 * Generated source version: 3.3.2
 *
 */
@WebServiceClient(name = "ExtraServiceServiceInterface",
                  wsdlLocation = "file:/C:/Users/Predator/Desktop/AgenskiModuo/Backend/src/main/resources/wsdl/ExtraServiceInterface.wsdl",
                  targetNamespace = "http://interfaces.megatravel.com/")
public class ExtraServiceServiceInterface extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://interfaces.megatravel.com/", "ExtraServiceServiceInterface");
    public final static QName ExtraServicePort = new QName("http://interfaces.megatravel.com/", "ExtraServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Predator/Desktop/AgenskiModuo/Backend/src/main/resources/wsdl/ExtraServiceInterface.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ExtraServiceServiceInterface.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Predator/Desktop/AgenskiModuo/Backend/src/main/resources/wsdl/ExtraServiceInterface.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ExtraServiceServiceInterface(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ExtraServiceServiceInterface(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ExtraServiceServiceInterface() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ExtraServiceServiceInterface(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ExtraServiceServiceInterface(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ExtraServiceServiceInterface(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ExtraServiceInterface
     */
    @WebEndpoint(name = "ExtraServicePort")
    public ExtraServiceInterface getExtraServicePort() {
        return super.getPort(ExtraServicePort, ExtraServiceInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExtraServiceInterface
     */
    @WebEndpoint(name = "ExtraServicePort")
    public ExtraServiceInterface getExtraServicePort(WebServiceFeature... features) {
        return super.getPort(ExtraServicePort, ExtraServiceInterface.class, features);
    }

}
