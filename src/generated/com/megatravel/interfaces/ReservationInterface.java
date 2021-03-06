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
 * 2019-06-30T11:47:30.147+02:00
 * Generated source version: 3.3.2
 *
 */
@WebService(targetNamespace = "http://interfaces.megatravel.com/", name = "ReservationInterface")
@XmlSeeAlso({ObjectFactory.class, com.megatravel.admin.ObjectFactory.class, com.megatravel.reservations.ObjectFactory.class, com.megatravel.agent.ObjectFactory.class, com.megatravel.types.ObjectFactory.class})
public interface ReservationInterface {

    @WebMethod
    @RequestWrapper(localName = "confirmReservation", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.ConfirmReservation")
    @ResponseWrapper(localName = "confirmReservationResponse", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.ConfirmReservationResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.megatravel.reservations.ReservationDTO confirmReservation(

        @WebParam(name = "ReservationId", targetNamespace = "")
        java.lang.Long reservationId
    );

    @WebMethod
    @RequestWrapper(localName = "getListReservationsForUser", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.GetListReservationsForUser")
    @ResponseWrapper(localName = "getListReservationsForUserResponse", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.GetListReservationsForUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.megatravel.reservations.ReservationDTO> getListReservationsForUser(

        @WebParam(name = "userId", targetNamespace = "")
        java.lang.Long userId
    );

    @WebMethod
    @RequestWrapper(localName = "createReservation", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.CreateReservation")
    @ResponseWrapper(localName = "createReservationResponse", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.CreateReservationResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.megatravel.reservations.ReservationDTO createReservation(

        @WebParam(name = "ReservationDTO", targetNamespace = "")
        com.megatravel.reservations.ReservationDTO reservationDTO
    );

    @WebMethod
    @RequestWrapper(localName = "cancelReservation", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.CancelReservation")
    @ResponseWrapper(localName = "cancelReservationResponse", targetNamespace = "http://interfaces.megatravel.com/", className = "com.megatravel.interfaces.CancelReservationResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.megatravel.reservations.ReservationDTO cancelReservation(

        @WebParam(name = "ReservationId", targetNamespace = "")
        java.lang.Long reservationId
    );
}
