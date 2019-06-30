
package com.megatravel.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.megatravel.agent.UnitTypeDTO;


/**
 * <p>Java class for createAccUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createAccUnitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UnitTypeDTO" type="{http://www.megatravel.com/agent}unitTypeDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createAccUnitType", propOrder = {
    "unitTypeDTO"
})
public class CreateAccUnitType {

    @XmlElement(name = "UnitTypeDTO")
    protected UnitTypeDTO unitTypeDTO;

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

}
