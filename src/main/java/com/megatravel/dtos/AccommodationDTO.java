package com.megatravel.dtos;

import com.megatravel.model.Accommodation;
import com.megatravel.model.AccommodationUnit;
import com.megatravel.model.ExtraService;
import org.hibernate.boot.jaxb.hbm.spi.Adapter1;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
 *         &lt;element ref="{http://www.megatravel.com/types}locationDTO"/>
 *         &lt;element ref="{http://www.megatravel.com/agent}accommodationTypeDTO"/>
 *         &lt;element name="lastChangedDate" type="{http://www.megatravel.com/types}Date"/>
 *         &lt;element ref="{http://www.megatravel.com/admin}userDTO" minOccurs="0"/>
 *         &lt;element ref="{http://www.megatravel.com/agent}accommodationUnitDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.megatravel.com/agent}extraServiceDTO" maxOccurs="unbounded" minOccurs="0"/>
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
    "locationDTO",
    "accommodationTypeDTO",
    "lastChangedDate",
    "userDTO",
    "accommodationUnitDTO",
    "extraServiceDTO",
    "category",
    "freeToCancel",
    "freeToCancelDays"
})
@XmlRootElement(name = "accommodationDTO")
public class AccommodationDTO {

    protected long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(namespace = "http://www.megatravel.com/types", required = true)
    protected LocationDTO locationDTO;
    @XmlElement(required = true)
    protected AccommodationTypeDTO accommodationTypeDTO;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    protected Date lastChangedDate;
    @XmlElement(namespace = "http://www.megatravel.com/admin")
    protected UserDTO userDTO;
    protected List<AccommodationUnitDTO> accommodationUnitDTO;
    protected List<ExtraServiceDTO> extraServiceDTO;

    protected String category;
    protected boolean freeToCancel;
    protected int freeToCancelDays;

    public AccommodationDTO() {
    }

    public AccommodationDTO(Accommodation accommodation) {
        this.id = accommodation.getId();
        this.name = accommodation.getName();
        this.description = accommodation.getDescription();
        this.locationDTO = new LocationDTO(accommodation.getLocation());
        this.accommodationTypeDTO = new AccommodationTypeDTO(accommodation.getAccommodationType());
        this.userDTO = new UserDTO(accommodation.getUser());
        this.accommodationUnitDTO = new ArrayList<>();
        this.extraServiceDTO = new ArrayList<>();
        this.lastChangedDate = accommodation.getLastChangedDate();
        for (AccommodationUnit au : accommodation.getAccommodationUnit()){
            this.accommodationUnitDTO.add(new AccommodationUnitDTO(au));
        }
        for (ExtraService s : accommodation.getExtraService()){
            this.extraServiceDTO.add(new ExtraServiceDTO(s));
        }
        this.category = accommodation.getCategory();
        this.freeToCancel = accommodation.isFreeToCancel();
        this.freeToCancelDays = accommodation.getFreeToCancelDays();

    }

    public void setAccommodationUnitDTO(List<AccommodationUnitDTO> accommodationUnitDTO) {
        this.accommodationUnitDTO = accommodationUnitDTO;
    }

    public void setExtraServiceDTO(List<ExtraServiceDTO> extraServiceDTO) {
        this.extraServiceDTO = extraServiceDTO;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isFreeToCancel() {
        return freeToCancel;
    }

    public void setFreeToCancel(boolean freeToCancel) {
        this.freeToCancel = freeToCancel;
    }

    public int getFreeToCancelDays() {
        return freeToCancelDays;
    }

    public void setFreeToCancelDays(int freeToCancelDays) {
        this.freeToCancelDays = freeToCancelDays;
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
     * Gets the value of the lastChangedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getLastChangedDate() {
        return lastChangedDate;
    }

    /**
     * Sets the value of the lastChangedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChangedDate(Date value) {
        this.lastChangedDate = value;
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

}