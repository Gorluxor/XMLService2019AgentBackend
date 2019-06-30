package com.megatravel.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2019-06-30T11:47:29.539+02:00
 * Generated source version: 3.3.2
 *
 */
@WebService(targetNamespace = "http://interfaces.megatravel.com/", name = "PricingInterface")
@XmlSeeAlso({ObjectFactory.class, com.megatravel.admin.ObjectFactory.class, com.megatravel.agent.ObjectFactory.class, com.megatravel.types.ObjectFactory.class})
public interface PricingInterface {

    @WebMethod
    @RequestWrapper(localName = "getPriceForDatesUnitId", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.GetPriceForDatesUnitId")
    @ResponseWrapper(localName = "getPriceForDatesUnitIdResponse", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.GetPriceForDatesUnitIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public double getPriceForDatesUnitId(

        @WebParam(name = "UnitId", targetNamespace = "")
        java.lang.Long unitId,
        @WebParam(name = "startDate", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar startDate,
        @WebParam(name = "endDate", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar endDate
    );

    @WebMethod
    @RequestWrapper(localName = "createPriceForUnit", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.CreatePriceForUnit")
    @ResponseWrapper(localName = "createPriceForUnitResponse", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.CreatePriceForUnitResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.megatravel.agent.PricingDTO createPriceForUnit(

        @WebParam(name = "UnitId", targetNamespace = "")
        java.lang.Long unitId,
        @WebParam(name = "arg1", targetNamespace = "")
        com.megatravel.agent.PricingDTO arg1
    );

    @WebMethod
    @RequestWrapper(localName = "getPricesForUnit", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.GetPricesForUnit")
    @ResponseWrapper(localName = "getPricesForUnitResponse", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.GetPricesForUnitResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.megatravel.agent.PricingDTO getPricesForUnit(

        @WebParam(name = "UnitId", targetNamespace = "")
        java.lang.Long unitId,
        @WebParam(name = "PriceId", targetNamespace = "")
        java.lang.Long priceId
    );

    @WebMethod
    @RequestWrapper(localName = "getAllPricesForUnit", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.GetAllPricesForUnit")
    @ResponseWrapper(localName = "getAllPricesForUnitResponse", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.GetAllPricesForUnitResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.megatravel.agent.PricingDTO> getAllPricesForUnit(

        @WebParam(name = "UnitId", targetNamespace = "")
        java.lang.Long unitId
    );

    @WebMethod
    @RequestWrapper(localName = "updatePriceForUnit", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.UpdatePriceForUnit")
    @ResponseWrapper(localName = "updatePriceForUnitResponse", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.UpdatePriceForUnitResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.megatravel.agent.PricingDTO updatePriceForUnit(

        @WebParam(name = "UnitId", targetNamespace = "")
        java.lang.Long unitId,
        @WebParam(name = "arg1", targetNamespace = "")
        com.megatravel.agent.PricingDTO arg1
    );

    @WebMethod
    @RequestWrapper(localName = "deletePriceForUnit", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.DeletePriceForUnit")
    @ResponseWrapper(localName = "deletePriceForUnitResponse", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.DeletePriceForUnitResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.megatravel.agent.PricingDTO deletePriceForUnit(

        @WebParam(name = "UnitId", targetNamespace = "")
        java.lang.Long unitId,
        @WebParam(name = "PriceId", targetNamespace = "")
        java.lang.Long priceId
    );
}
