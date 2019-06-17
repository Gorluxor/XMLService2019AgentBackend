package com.megatravel.dtos;


import com.megatravel.model.Accommodation;
import com.megatravel.model.AccommodationUnit;
import com.megatravel.model.Image;
import com.megatravel.model.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.megatravel.com/types}id"/>
 *         &lt;element name="name" type="{http://www.megatravel.com/types}name"/>
 *         &lt;element name="description" type="{http://www.megatravel.com/types}description"/>
 *         &lt;element name="cancelationDays" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element ref="{http://www.megatravel.com/types}locationDTO"/>
 *         &lt;element ref="{http://www.megatravel.com/agent}accommodationTypeDTO"/>
 *         &lt;element ref="{http://www.megatravel.com/admin}userDTO" minOccurs="0"/>
 *         &lt;element ref="{http://www.megatravel.com/agent}accommodationUnitDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.megatravel.com/agent}serviceDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.megatravel.com/agent}imageDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id",
        "name",
        "description",
        "cancelationDays",
        "locationDTO",
        "accommodationTypeDTO",
        "userDTO",
        "accommodationUnitDTO",
        "serviceDTO",
        "imageDTO"
})
@XmlRootElement(name = "accommodationDTO")
public class AccommodationDTO {

    protected long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger cancelationDays;
    @XmlElement(namespace = "http://www.megatravel.com/types", required = true)
    protected LocationDTO locationDTO;
    @XmlElement(required = true)
    protected AccommodationTypeDTO accommodationTypeDTO;
    @XmlElement(namespace = "http://www.megatravel.com/admin")
    protected UserDTO userDTO;
    protected List<AccommodationUnitDTO> accommodationUnitDTO;
    protected List<ServiceDTO> serviceDTO;
    protected List<ImageDTO> imageDTO;

    public AccommodationDTO() {
    }

    public AccommodationDTO(Accommodation accommodation) {
        this.id = accommodation.getId();
        this.name = accommodation.getName();
        this.description = accommodation.getDescription();
        this.cancelationDays = accommodation.getCancelationDays();
        this.locationDTO = new LocationDTO(accommodation.getLocation());
        this.accommodationTypeDTO = new AccommodationTypeDTO(accommodation.getAccommodationType());
        this.userDTO = new UserDTO(accommodation.getUser());
        this.accommodationUnitDTO = new ArrayList<>();
        this.serviceDTO = new ArrayList<>();
        this.imageDTO = new ArrayList<>();
        for (AccommodationUnit au : accommodation.getAccommodationUnit()){
            this.accommodationUnitDTO.add(new AccommodationUnitDTO(au));
        }
        for (Service s : accommodation.getService()){
            this.serviceDTO.add(new ServiceDTO(s));
        }
        for (Image im : accommodation.getImage()){
            this.imageDTO.add(new ImageDTO(im));
        }
    }

    /**
     * Gets the value of the id property.
     *
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the cancelationDays property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getCancelationDays() {
        return cancelationDays;
    }

    /**
     * Sets the value of the cancelationDays property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setCancelationDays(BigInteger value) {
        this.cancelationDays = value;
    }

    /**
     * Gets the value of the locationDTO property.
     *
     * @return
     *     possible object is
     *     {@link LocationDTO }
     *
     */
    public LocationDTO getLocationDTO() {
        return locationDTO;
    }

    /**
     * Sets the value of the locationDTO property.
     *
     * @param value
     *     allowed object is
     *     {@link LocationDTO }
     *
     */
    public void setLocationDTO(LocationDTO value) {
        this.locationDTO = value;
    }

    /**
     * Gets the value of the accommodationTypeDTO property.
     *
     * @return
     *     possible object is
     *     {@link AccommodationTypeDTO }
     *
     */
    public AccommodationTypeDTO getAccommodationTypeDTO() {
        return accommodationTypeDTO;
    }

    /**
     * Sets the value of the accommodationTypeDTO property.
     *
     * @param value
     *     allowed object is
     *     {@link AccommodationTypeDTO }
     *
     */
    public void setAccommodationTypeDTO(AccommodationTypeDTO value) {
        this.accommodationTypeDTO = value;
    }

    /**
     * Gets the value of the userDTO property.
     *
     * @return
     *     possible object is
     *     {@link UserDTO }
     *
     */
    public UserDTO getUserDTO() {
        return userDTO;
    }

    /**
     * Sets the value of the userDTO property.
     *
     * @param value
     *     allowed object is
     *     {@link UserDTO }
     *
     */
    public void setUserDTO(UserDTO value) {
        this.userDTO = value;
    }

    /**
     * Gets the value of the accommodationUnitDTO property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accommodationUnitDTO property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccommodationUnitDTO().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccommodationUnitDTO }
     *
     *
     */
    public List<AccommodationUnitDTO> getAccommodationUnitDTO() {
        if (accommodationUnitDTO == null) {
            accommodationUnitDTO = new ArrayList<AccommodationUnitDTO>();
        }
        return this.accommodationUnitDTO;
    }

    /**
     * Gets the value of the serviceDTO property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDTO property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceDTO().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceDTO }
     *
     *
     */
    public List<ServiceDTO> getServiceDTO() {
        if (serviceDTO == null) {
            serviceDTO = new ArrayList<ServiceDTO>();
        }
        return this.serviceDTO;
    }

    /**
     * Gets the value of the imageDTO property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageDTO property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageDTO().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageDTO }
     *
     *
     */
    public List<ImageDTO> getImageDTO() {
        if (imageDTO == null) {
            imageDTO = new ArrayList<ImageDTO>();
        }
        return this.imageDTO;
    }

}
