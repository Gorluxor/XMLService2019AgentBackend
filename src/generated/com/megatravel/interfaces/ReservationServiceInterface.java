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
 * 2019-06-30T11:47:30.156+02:00
 * Generated source version: 3.3.2
 *
 */
@WebServiceClient(name = "ReservationServiceInterface",
                  wsdlLocation = "file:/C:/Users/Predator/Desktop/AgenskiModuo/Backend/src/main/resources/wsdl/ReservationInterface.wsdl",
                  targetNamespace = "http://interfaces.megatravel.com/")
public class ReservationServiceInterface extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://interfaces.megatravel.com/", "ReservationServiceInterface");
    public final static QName ReservationPort = new QName("http://interfaces.megatravel.com/", "ReservationPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Predator/Desktop/AgenskiModuo/Backend/src/main/resources/wsdl/ReservationInterface.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ReservationServiceInterface.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Predator/Desktop/AgenskiModuo/Backend/src/main/resources/wsdl/ReservationInterface.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ReservationServiceInterface(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ReservationServiceInterface(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReservationServiceInterface() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ReservationServiceInterface(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ReservationServiceInterface(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ReservationServiceInterface(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ReservationInterface
     */
    @WebEndpoint(name = "ReservationPort")
    public ReservationInterface getReservationPort() {
        return super.getPort(ReservationPort, ReservationInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReservationInterface
     */
    @WebEndpoint(name = "ReservationPort")
    public ReservationInterface getReservationPort(WebServiceFeature... features) {
        return super.getPort(ReservationPort, ReservationInterface.class, features);
    }

}
