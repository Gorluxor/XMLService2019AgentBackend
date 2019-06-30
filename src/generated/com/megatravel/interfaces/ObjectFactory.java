
package com.megatravel.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.megatravel.interfaces package. 
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

    private final static QName _CreateAccUnitType_QNAME = new QName("http://interfaces.megatravel.com/", "createAccUnitType");
    private final static QName _CreateAccUnitTypeResponse_QNAME = new QName("http://interfaces.megatravel.com/", "createAccUnitTypeResponse");
    private final static QName _DeleteAccUnitType_QNAME = new QName("http://interfaces.megatravel.com/", "deleteAccUnitType");
    private final static QName _DeleteAccUnitTypeResponse_QNAME = new QName("http://interfaces.megatravel.com/", "deleteAccUnitTypeResponse");
    private final static QName _GetAccUnitType_QNAME = new QName("http://interfaces.megatravel.com/", "getAccUnitType");
    private final static QName _GetAccUnitTypeResponse_QNAME = new QName("http://interfaces.megatravel.com/", "getAccUnitTypeResponse");
    private final static QName _GetAllUnitType_QNAME = new QName("http://interfaces.megatravel.com/", "getAllUnitType");
    private final static QName _GetAllUnitTypeResponse_QNAME = new QName("http://interfaces.megatravel.com/", "getAllUnitTypeResponse");
    private final static QName _UpdateAccUnitType_QNAME = new QName("http://interfaces.megatravel.com/", "updateAccUnitType");
    private final static QName _UpdateAccUnitTypeResponse_QNAME = new QName("http://interfaces.megatravel.com/", "updateAccUnitTypeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.megatravel.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateAccUnitType }
     * 
     */
    public CreateAccUnitType createCreateAccUnitType() {
        return new CreateAccUnitType();
    }

    /**
     * Create an instance of {@link CreateAccUnitTypeResponse }
     * 
     */
    public CreateAccUnitTypeResponse createCreateAccUnitTypeResponse() {
        return new CreateAccUnitTypeResponse();
    }

    /**
     * Create an instance of {@link DeleteAccUnitType }
     * 
     */
    public DeleteAccUnitType createDeleteAccUnitType() {
        return new DeleteAccUnitType();
    }

    /**
     * Create an instance of {@link DeleteAccUnitTypeResponse }
     * 
     */
    public DeleteAccUnitTypeResponse createDeleteAccUnitTypeResponse() {
        return new DeleteAccUnitTypeResponse();
    }

    /**
     * Create an instance of {@link GetAccUnitType }
     * 
     */
    public GetAccUnitType createGetAccUnitType() {
        return new GetAccUnitType();
    }

    /**
     * Create an instance of {@link GetAccUnitTypeResponse }
     * 
     */
    public GetAccUnitTypeResponse createGetAccUnitTypeResponse() {
        return new GetAccUnitTypeResponse();
    }

    /**
     * Create an instance of {@link GetAllUnitType }
     * 
     */
    public GetAllUnitType createGetAllUnitType() {
        return new GetAllUnitType();
    }

    /**
     * Create an instance of {@link GetAllUnitTypeResponse }
     * 
     */
    public GetAllUnitTypeResponse createGetAllUnitTypeResponse() {
        return new GetAllUnitTypeResponse();
    }

    /**
     * Create an instance of {@link UpdateAccUnitType }
     * 
     */
    public UpdateAccUnitType createUpdateAccUnitType() {
        return new UpdateAccUnitType();
    }

    /**
     * Create an instance of {@link UpdateAccUnitTypeResponse }
     * 
     */
    public UpdateAccUnitTypeResponse createUpdateAccUnitTypeResponse() {
        return new UpdateAccUnitTypeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccUnitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAccUnitType }{@code >}
     */
    @XmlElementDecl(namespace = "http://interfaces.megatravel.com/", name = "createAccUnitType")
    public JAXBElement<CreateAccUnitType> createCreateAccUnitType(CreateAccUnitType value) {
        return new JAXBElement<CreateAccUnitType>(_CreateAccUnitType_QNAME, CreateAccUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccUnitTypeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAccUnitTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://interfaces.megatravel.com/", name = "createAccUnitTypeResponse")
    public JAXBElement<CreateAccUnitTypeResponse> createCreateAccUnitTypeResponse(CreateAccUnitTypeResponse value) {
        return new JAXBElement<CreateAccUnitTypeResponse>(_CreateAccUnitTypeResponse_QNAME, CreateAccUnitTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAccUnitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteAccUnitType }{@code >}
     */
    @XmlElementDecl(namespace = "http://interfaces.megatravel.com/", name = "deleteAccUnitType")
    public JAXBElement<DeleteAccUnitType> createDeleteAccUnitType(DeleteAccUnitType value) {
        return new JAXBElement<DeleteAccUnitType>(_DeleteAccUnitType_QNAME, DeleteAccUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAccUnitTypeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteAccUnitTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://interfaces.megatravel.com/", name = "deleteAccUnitTypeResponse")
    public JAXBElement<DeleteAccUnitTypeResponse> createDeleteAccUnitTypeResponse(DeleteAccUnitTypeResponse value) {
        return new JAXBElement<DeleteAccUnitTypeResponse>(_DeleteAccUnitTypeResponse_QNAME, DeleteAccUnitTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccUnitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccUnitType }{@code >}
     */
    @XmlElementDecl(namespace = "http://interfaces.megatravel.com/", name = "getAccUnitType")
    public JAXBElement<GetAccUnitType> createGetAccUnitType(GetAccUnitType value) {
        return new JAXBElement<GetAccUnitType>(_GetAccUnitType_QNAME, GetAccUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccUnitTypeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccUnitTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://interfaces.megatravel.com/", name = "getAccUnitTypeResponse")
    public JAXBElement<GetAccUnitTypeResponse> createGetAccUnitTypeResponse(GetAccUnitTypeResponse value) {
        return new JAXBElement<GetAccUnitTypeResponse>(_GetAccUnitTypeResponse_QNAME, GetAccUnitTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUnitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllUnitType }{@code >}
     */
    @XmlElementDecl(namespace = "http://interfaces.megatravel.com/", name = "getAllUnitType")
    public JAXBElement<GetAllUnitType> createGetAllUnitType(GetAllUnitType value) {
        return new JAXBElement<GetAllUnitType>(_GetAllUnitType_QNAME, GetAllUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUnitTypeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllUnitTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://interfaces.megatravel.com/", name = "getAllUnitTypeResponse")
    public JAXBElement<GetAllUnitTypeResponse> createGetAllUnitTypeResponse(GetAllUnitTypeResponse value) {
        return new JAXBElement<GetAllUnitTypeResponse>(_GetAllUnitTypeResponse_QNAME, GetAllUnitTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAccUnitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateAccUnitType }{@code >}
     */
    @XmlElementDecl(namespace = "http://interfaces.megatravel.com/", name = "updateAccUnitType")
    public JAXBElement<UpdateAccUnitType> createUpdateAccUnitType(UpdateAccUnitType value) {
        return new JAXBElement<UpdateAccUnitType>(_UpdateAccUnitType_QNAME, UpdateAccUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAccUnitTypeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateAccUnitTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://interfaces.megatravel.com/", name = "updateAccUnitTypeResponse")
    public JAXBElement<UpdateAccUnitTypeResponse> createUpdateAccUnitTypeResponse(UpdateAccUnitTypeResponse value) {
        return new JAXBElement<UpdateAccUnitTypeResponse>(_UpdateAccUnitTypeResponse_QNAME, UpdateAccUnitTypeResponse.class, null, value);
    }

}
