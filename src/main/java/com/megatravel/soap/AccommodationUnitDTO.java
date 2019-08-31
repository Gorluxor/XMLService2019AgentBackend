//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.31 at 10:45:46 PM CEST 
//


package com.megatravel.soap;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
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
 *         &lt;element name="id" type="{http://interfaces.megatravel.com/}id"/>
 *         &lt;element name="capacity" type="{http://interfaces.megatravel.com/}capacity"/>
 *         &lt;element name="size" type="{http://interfaces.megatravel.com/}size"/>
 *         &lt;element name="nameOfUnit" type="{http://interfaces.megatravel.com/}name"/>
 *         &lt;element ref="{http://interfaces.megatravel.com/}unitTypeDTO"/>
 *         &lt;element ref="{http://interfaces.megatravel.com/}pricingDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://interfaces.megatravel.com/}extraServiceDTO" maxOccurs="unbounded" minOccurs="0"/>
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
    "pricingDTO",
    "extraServiceDTO"
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
    protected List<PricingDTO> pricingDTO;
    protected List<ExtraServiceDTO> extraServiceDTO;

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

}
