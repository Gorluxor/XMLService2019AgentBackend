package com.megatravel.dtos;

import org.hibernate.boot.jaxb.hbm.spi.Adapter1;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


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
 *         &lt;element name="city" type="{http://www.megatravel.com/types}name"/>
 *         &lt;element name="startDate" type="{http://www.megatravel.com/types}Date"/>
 *         &lt;element name="endDate" type="{http://www.megatravel.com/types}Date"/>
 *         &lt;element name="numberOfPeople" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="extraServices" type="{http://www.megatravel.com/types}name" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accommodationType" type="{http://www.megatravel.com/types}name"/>
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
    "city",
    "startDate",
    "endDate",
    "numberOfPeople",
    "extraServices",
    "accommodationType",
    "searchFreeDays",
    "freeToCancel",
    "distance",
    "category"
})
@XmlRootElement(name = "SearchDTO")
public class SearchDTO {

    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    protected Date startDate;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date endDate;
    protected int numberOfPeople;
    protected List<String> extraServices;
    protected String accommodationType;
    protected int distance;
    protected int searchFreeDays;
    protected boolean freeToCancel;
    protected String category;

    /**
     * Gets the value of the freeToCancel property.
     *
     */
    public boolean isFreeToCancel() {
        return freeToCancel;
    }

    /**
     * Sets the value of the freeToCancel property.
     *
     */
    public void setFreeToCancel(boolean value) {
        this.freeToCancel = value;
    }



    /**
     * Gets the value of the distance property.
     *
     */
    public int getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     *
     */
    public void setDistance(int value) {
        this.distance = value;
    }


    /**
     * Sets the value of the SearchFreeDays property.
     *
     */
    public void setSearchFreeDays(int value) {
        this.searchFreeDays = value;
    }

    /**
     * Gets the value of the SearchFreeDays property.
     *
     */
    public int getSearchFreeDays() {
        return searchFreeDays;
    }



    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the category property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCategory(String value) {
        this.category = value;
    }



    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the numberOfPeople property.
     * 
     */
    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    /**
     * Sets the value of the numberOfPeople property.
     * 
     */
    public void setNumberOfPeople(int value) {
        this.numberOfPeople = value;
    }

    /**
     * Gets the value of the extraServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExtraServices() {
        if (extraServices == null) {
            extraServices = new ArrayList<String>();
        }
        return this.extraServices;
    }

    public void setExtraServices(List<String> extraServices) {
        this.extraServices = extraServices;
    }



    /**
     * Gets the value of the accommodationType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccommodationType() {
        return this.accommodationType;
    }


    /**
     * Sets the value of the accommodationType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccommodationType(String value) {
        this.accommodationType = value;
    }


}