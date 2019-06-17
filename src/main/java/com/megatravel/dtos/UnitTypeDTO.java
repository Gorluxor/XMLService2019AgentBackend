package com.megatravel.dtos;


import com.megatravel.model.UnitType;

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
 *         &lt;element name="Id" type="{http://www.megatravel.com/types}id"/>
 *         &lt;element name="nameOfUnitType" type="{http://www.megatravel.com/types}name"/>
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
        "nameOfUnitType"
})
@XmlRootElement(name = "unitTypeDTO")
public class UnitTypeDTO {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(required = true)
    protected String nameOfUnitType;

    public UnitTypeDTO() {
    }

    public UnitTypeDTO(UnitType unitType) {
        this.id = unitType.getId();
        this.nameOfUnitType = unitType.getNameOfUnitType();
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
     * Gets the value of the nameOfUnitType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNameOfUnitType() {
        return nameOfUnitType;
    }

    /**
     * Sets the value of the nameOfUnitType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNameOfUnitType(String value) {
        this.nameOfUnitType = value;
    }

}
