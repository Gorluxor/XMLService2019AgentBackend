
package com.megatravel.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.megatravel.admin.RegistrationDTO;


/**
 * <p>Java class for signup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="signup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="registrationDTO" type="{http://www.megatravel.com/admin}registrationDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "signup", propOrder = {
    "registrationDTO"
})
public class Signup {

    protected RegistrationDTO registrationDTO;

    /**
     * Gets the value of the registrationDTO property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationDTO }
     *     
     */
    public RegistrationDTO getRegistrationDTO() {
        return registrationDTO;
    }

    /**
     * Sets the value of the registrationDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationDTO }
     *     
     */
    public void setRegistrationDTO(RegistrationDTO value) {
        this.registrationDTO = value;
    }

}
