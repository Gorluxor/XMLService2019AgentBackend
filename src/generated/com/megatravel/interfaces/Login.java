
package com.megatravel.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.megatravel.admin.LoginDTO;


/**
 * <p>Java class for login complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="login"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="loginDTO" type="{http://www.megatravel.com/admin}loginDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "login", propOrder = {
    "loginDTO"
})
public class Login {

    protected LoginDTO loginDTO;

    /**
     * Gets the value of the loginDTO property.
     * 
     * @return
     *     possible object is
     *     {@link LoginDTO }
     *     
     */
    public LoginDTO getLoginDTO() {
        return loginDTO;
    }

    /**
     * Sets the value of the loginDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginDTO }
     *     
     */
    public void setLoginDTO(LoginDTO value) {
        this.loginDTO = value;
    }

}
