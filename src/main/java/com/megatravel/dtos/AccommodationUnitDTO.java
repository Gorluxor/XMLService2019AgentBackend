package com.megatravel.dtos;


import com.megatravel.model.AccommodationUnit;
import com.megatravel.model.Pricing;
import com.megatravel.model.Service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="capacity" type="{http://www.megatravel.com/types}capacity"/>
 *         &lt;element name="size" type="{http://www.megatravel.com/types}size"/>
 *         &lt;element name="nameOfUnit" type="{http://www.megatravel.com/types}name"/>
 *         &lt;element ref="{http://www.megatravel.com/agent}unitTypeDTO"/>
 *         &lt;element ref="{http://www.megatravel.com/agent}pricingDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.megatravel.com/agent}serviceDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "serviceDTO"
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
    protected List<ServiceDTO> serviceDTO;

    public AccommodationUnitDTO() {
    }

    public AccommodationUnitDTO(AccommodationUnit accommodationUnit) {
        this.id = accommodationUnit.getId();
        this.capacity = accommodationUnit.getCapacity();
        this.size = accommodationUnit.getSize();
        this.nameOfUnit = accommodationUnit.getNameOfUnit();
        this.unitTypeDTO = new UnitTypeDTO(accommodationUnit.getUnitType());
        this.pricingDTO = new ArrayList<>();
        this.serviceDTO = new ArrayList<>();
        for (Pricing p : accommodationUnit.getPricing()){
            this.pricingDTO.add(new PricingDTO(p));
        }
        for (Service s : accommodationUnit.getService()){
            this.serviceDTO.add(new ServiceDTO(s));
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

}
