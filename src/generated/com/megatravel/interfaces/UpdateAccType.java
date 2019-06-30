
package com.megatravel.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.megatravel.agent.AccommodationTypeDTO;


/**
 * <p>Java class for updateAccType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateAccType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccommodationTypeDTO" type="{http://www.megatravel.com/agent}accommodationTypeDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateAccType", propOrder = {
    "accommodationTypeDTO"
})
public class UpdateAccType {

    @XmlElement(name = "AccommodationTypeDTO")
    protected AccommodationTypeDTO accommodationTypeDTO;

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

}
