//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.04 at 07:10:31 PM CEST 
//


package com.megatravel.soap;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="AccId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element ref="{http://interfaces.megatravel.com/}accommodationUnitProsireniDTO" minOccurs="0"/>
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
    "accId",
    "accommodationUnitProsireniDTO"
})
@XmlRootElement(name = "CreateUnitProsireni")
public class CreateUnitProsireni {

    @XmlElement(name = "AccId")
    protected Long accId;
    protected AccommodationUnitProsireniDTO accommodationUnitProsireniDTO;

    /**
     * Gets the value of the accId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccId() {
        return accId;
    }

    /**
     * Sets the value of the accId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccId(Long value) {
        this.accId = value;
    }

    /**
     * Gets the value of the accommodationUnitProsireniDTO property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationUnitProsireniDTO }
     *     
     */
    public AccommodationUnitProsireniDTO getAccommodationUnitProsireniDTO() {
        return accommodationUnitProsireniDTO;
    }

    /**
     * Sets the value of the accommodationUnitProsireniDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationUnitProsireniDTO }
     *     
     */
    public void setAccommodationUnitProsireniDTO(AccommodationUnitProsireniDTO value) {
        this.accommodationUnitProsireniDTO = value;
    }

}
