
package com.megatravel.agent;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.megatravel.admin.UserDTO;
import com.megatravel.types.LocationDTO;


/**
 * <p>Java class for accommodationDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accommodationDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accommodationTypeDTO" type="{http://www.megatravel.com/agent}accommodationTypeDTO" minOccurs="0"/&gt;
 *         &lt;element name="accommodationUnitDTO" type="{http://www.megatravel.com/agent}accommodationUnitDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extraServiceDTO" type="{http://www.megatravel.com/agent}extraServiceDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="freeToCancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="freeToCancelDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="lastChangedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="locationDTO" type="{http://www.megatravel.com/types}locationDTO" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userDTO" type="{http://www.megatravel.com/admin}userDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accommodationDTO", propOrder = {
    "accommodationTypeDTO",
    "accommodationUnitDTO",
    "category",
    "description",
    "extraServiceDTO",
    "freeToCancel",
    "freeToCancelDays",
    "id",
    "lastChangedDate",
    "locationDTO",
    "name",
    "userDTO"
})
public class AccommodationDTO {

    protected AccommodationTypeDTO accommodationTypeDTO;
    @XmlElement(nillable = true)
    protected List<AccommodationUnitDTO> accommodationUnitDTO;
    protected String category;
    protected String description;
    @XmlElement(nillable = true)
    protected List<ExtraServiceDTO> extraServiceDTO;
    protected boolean freeToCancel;
    protected int freeToCancelDays;
    protected long id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastChangedDate;
    protected LocationDTO locationDTO;
    protected String name;
    protected UserDTO userDTO;

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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
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
     * Gets the value of the extraServiceDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraServiceDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraServiceDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtraServiceDTO }
     * 
     * 
     */
    public List<ExtraServiceDTO> getExtraServiceDTO() {
        if (extraServiceDTO == null) {
            extraServiceDTO = new ArrayList<ExtraServiceDTO>();
        }
        return this.extraServiceDTO;
    }

    /**
     * Gets the value of the freeToCancel property.
     * 
     */
    public boolean isFreeToCancel() {
        return freeToCancel;
    }

    /**
     * Sets the value of the freeToCancel property.
     * 
     */
    public void setFreeToCancel(boolean value) {
        this.freeToCancel = value;
    }

    /**
     * Gets the value of the freeToCancelDays property.
     * 
     */
    public int getFreeToCancelDays() {
        return freeToCancelDays;
    }

    /**
     * Sets the value of the freeToCancelDays property.
     * 
     */
    public void setFreeToCancelDays(int value) {
        this.freeToCancelDays = value;
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
     * Gets the value of the lastChangedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChangedDate() {
        return lastChangedDate;
    }

    /**
     * Sets the value of the lastChangedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChangedDate(XMLGregorianCalendar value) {
        this.lastChangedDate = value;
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

}
