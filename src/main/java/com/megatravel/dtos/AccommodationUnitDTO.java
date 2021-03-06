package com.megatravel.dtos;


import com.megatravel.model.AccommodationUnit;
import com.megatravel.model.ExtraService;
import com.megatravel.model.Image;
import com.megatravel.model.Pricing;
import org.hibernate.boot.jaxb.hbm.spi.Adapter1;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigInteger;
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
 *         &lt;element name="capacity" type="{http://www.megatravel.com/types}capacity"/>
 *         &lt;element name="size" type="{http://www.megatravel.com/types}size"/>
 *         &lt;element name="nameOfUnit" type="{http://www.megatravel.com/types}name"/>
 *         &lt;element ref="{http://www.megatravel.com/agent}unitTypeDTO"/>
 *         &lt;element name="cancelationDays" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="lastChangedDate" type="{http://www.megatravel.com/types}Date"/>
 *         &lt;element ref="{http://www.megatravel.com/agent}pricingDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.megatravel.com/agent}extraServiceDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.megatravel.com/agent}imageDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.megatravel.com/types}locationDTO" minOccurs="0"/>
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
    "capacity",
    "size",
    "nameOfUnit",
    "unitTypeDTO",
    "cancelationDays",
    "lastChangedDate",
    "pricingDTO",
    "extraServiceDTO",
    "imageDTO",
    "locationDTO"
})
@XmlRootElement(name = "accommodationUnitDTO")
public class AccommodationUnitDTO {

    protected long id;
    protected int capacity;
    protected int size;
    @XmlElement(required = true)
    protected String nameOfUnit;
    @XmlElement(required = true)
    protected UnitTypeDTO unitTypeDTO;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger cancelationDays;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    protected Date lastChangedDate;
    protected List<PricingDTO> pricingDTO;
    protected List<ExtraServiceDTO> extraServiceDTO;
    protected List<ImageDTO> imageDTO;
    @XmlElement(namespace = "http://www.megatravel.com/types")
    protected LocationDTO locationDTO;

    public AccommodationUnitDTO() {
    }

    public AccommodationUnitDTO(AccommodationUnit accommodationUnit) {
        if (accommodationUnit != null){
            this.id = accommodationUnit.getId();
            this.capacity = accommodationUnit.getCapacity();
            this.size = accommodationUnit.getSize();
            this.nameOfUnit = accommodationUnit.getNameOfUnit();
            this.unitTypeDTO = new UnitTypeDTO(accommodationUnit.getUnitType());
            this.pricingDTO = new ArrayList<>();
            this.extraServiceDTO = new ArrayList<>();
            this.imageDTO = new ArrayList<>();
            for (Pricing p : accommodationUnit.getPricing()){
                this.pricingDTO.add(new PricingDTO(p));
            }
            for (ExtraService s : accommodationUnit.getExtraService()){
                this.extraServiceDTO.add(new ExtraServiceDTO(s));
            }
            for (Image im : accommodationUnit.getImages()){
                this.imageDTO.add(new ImageDTO(im));
            }
            this.locationDTO = new LocationDTO(accommodationUnit.getLocation());
            this.cancelationDays = accommodationUnit.getCancelationDays();
            this.lastChangedDate = accommodationUnit.getLastChangedDate();
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
     * Gets the value of the capacity property.
     * 
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     */
    public void setCapacity(int value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the size property.
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(int value) {
        this.size = value;
    }

    /**
     * Gets the value of the nameOfUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfUnit() {
        return nameOfUnit;
    }

    /**
     * Sets the value of the nameOfUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfUnit(String value) {
        this.nameOfUnit = value;
    }

    /**
     * Gets the value of the unitTypeDTO property.
     * 
     * @return
     *     possible object is
     *     {@link UnitTypeDTO }
     *     
     */
    public UnitTypeDTO getUnitTypeDTO() {
        return unitTypeDTO;
    }

    /**
     * Sets the value of the unitTypeDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitTypeDTO }
     *     
     */
    public void setUnitTypeDTO(UnitTypeDTO value) {
        this.unitTypeDTO = value;
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
     * Gets the value of the pricingDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingDTO }
     * 
     * 
     */
    public List<PricingDTO> getPricingDTO() {
        if (pricingDTO == null) {
            pricingDTO = new ArrayList<PricingDTO>();
        }
        return this.pricingDTO;
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

}