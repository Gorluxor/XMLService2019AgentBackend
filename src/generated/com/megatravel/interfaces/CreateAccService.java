
package com.megatravel.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.megatravel.agent.ExtraServiceDTO;


/**
 * <p>Java class for createAccService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createAccService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtraServiceDTO" type="{http://www.megatravel.com/agent}extraServiceDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createAccService", propOrder = {
    "extraServiceDTO"
})
public class CreateAccService {

    @XmlElement(name = "ExtraServiceDTO")
    protected ExtraServiceDTO extraServiceDTO;

    /**
     * Gets the value of the extraServiceDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraServiceDTO }
     *     
     */
    public ExtraServiceDTO getExtraServiceDTO() {
        return extraServiceDTO;
    }

    /**
     * Sets the value of the extraServiceDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraServiceDTO }
     *     
     */
    public void setExtraServiceDTO(ExtraServiceDTO value) {
        this.extraServiceDTO = value;
    }

}
