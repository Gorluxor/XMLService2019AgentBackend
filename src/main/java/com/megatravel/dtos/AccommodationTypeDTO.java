package com.megatravel.dtos;

import com.megatravel.model.AccommodationType;
import org.hibernate.boot.jaxb.hbm.spi.Adapter1;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;


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
 *         &lt;element name="lastChangedDate" type="{http://www.megatravel.com/types}Date"/>
 *         &lt;element name="nameOfAccType" type="{http://www.megatravel.com/types}name"/>
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
    "lastChangedDate",
    "nameOfAccType"
})
@XmlRootElement(name = "accommodationTypeDTO")
public class AccommodationTypeDTO {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    protected Date lastChangedDate;
    @XmlElement(required = true)
    protected String nameOfAccType;

    public AccommodationTypeDTO() {
    }

    public AccommodationTypeDTO(AccommodationType accommodationType) {
        this.id = accommodationType.getId();
        this.nameOfAccType = accommodationType.getNameOfAccType();
        this.lastChangedDate = accommodationType.getLastChangedDate();
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
     * Gets the value of the lastChangedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getLastChangedDate() {
        return lastChangedDate;
    }

    /**
     * Sets the value of the lastChangedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChangedDate(Date value) {
        this.lastChangedDate = value;
    }

    /**
     * Gets the value of the nameOfAccType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfAccType() {
        return nameOfAccType;
    }

    /**
     * Sets the value of the nameOfAccType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfAccType(String value) {
        this.nameOfAccType = value;
    }

}