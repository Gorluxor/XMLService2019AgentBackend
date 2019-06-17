package com.megatravel.dtos;


import com.megatravel.model.Service;

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
 *         &lt;element name="nameOfService" type="{http://www.megatravel.com/types}name"/>
 *         &lt;element name="description" type="{http://www.megatravel.com/types}description"/>
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
        "nameOfService",
        "description"
})
@XmlRootElement(name = "serviceDTO")
public class ServiceDTO {

    protected long id;
    @XmlElement(required = true)
    protected String nameOfService;
    @XmlElement(required = true)
    protected String description;

    public ServiceDTO() {
    }

    public ServiceDTO(Service service) {
        this.id = service.getId();
        this.nameOfService = service.getNameOfService();
        this.description = service.getDescription();
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
     * Gets the value of the nameOfService property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNameOfService() {
        return nameOfService;
    }

    /**
     * Sets the value of the nameOfService property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNameOfService(String value) {
        this.nameOfService = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
