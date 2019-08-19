package com.megatravel.dtos;

import com.megatravel.model.AccommodationUnit;
import com.megatravel.model.Reservation;
import org.hibernate.boot.jaxb.hbm.spi.Adapter1;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
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
 *         &lt;element name="id" type="{http://www.megatravel.com/types}id"/>
 *         &lt;element name="arrivalDate" type="{http://www.megatravel.com/types}Date"/>
 *         &lt;element name="departureDate" type="{http://www.megatravel.com/types}Date"/>
 *         &lt;element name="stayRealized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="reservationPrice" type="{http://www.megatravel.com/types}price" form="qualified"/>
 *         &lt;element name="lastChangedDate" type="{http://www.megatravel.com/types}Date"/>
 *         &lt;element ref="{http://www.megatravel.com/admin}userDTO" minOccurs="0"/>
 *         &lt;element ref="{http://www.megatravel.com/agent}accommodationUnitDTO" maxOccurs="unbounded" minOccurs="0"/>
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
    "arrivalDate",
    "departureDate",
    "stayRealized",
    "reservationPrice",
    "lastChangedDate",
    "userDTO",
    "accommodationUnitDTO"
})
@XmlRootElement(name = "reservationDTO")
public class ReservationDTO {

    protected long id;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    protected Date arrivalDate;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date departureDate;
    protected boolean stayRealized;
    @XmlElement(required = true)
    protected BigDecimal reservationPrice;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date lastChangedDate;
    @XmlElement(namespace = "http://www.megatravel.com/admin")
    protected UserDTO userDTO;
    @XmlElement(namespace = "http://www.megatravel.com/agent")
    protected List<AccommodationUnitDTO> accommodationUnitDTO;



    public ReservationDTO() {
    }

    public ReservationDTO(Reservation reservation) {
        this.id =reservation.getId();
        this.arrivalDate = reservation.getArrivalDate();
        this.departureDate = reservation.getDepartureDate();
        this.stayRealized = reservation.isStayRealized();
        this.reservationPrice = reservation.getReservationPrice();
        this.userDTO = reservation.getUser() == null? null : new UserDTO(reservation.getUser());
        this.accommodationUnitDTO = new ArrayList<>();
        this.lastChangedDate = reservation.getLastChangedDate();
        for (AccommodationUnit au : reservation.getAccommodationUnit()){
            this.accommodationUnitDTO.add(new AccommodationUnitDTO(au));
        }
        this.reservationPrice = reservation.getReservationPrice();

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
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDate(Date value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(Date value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the stayRealized property.
     * 
     */
    public boolean isStayRealized() {
        return stayRealized;
    }

    /**
     * Sets the value of the stayRealized property.
     * 
     */
    public void setStayRealized(boolean value) {
        this.stayRealized = value;
    }

    /**
     * Gets the value of the reservationPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReservationPrice() {
        return reservationPrice;
    }

    /**
     * Sets the value of the reservationPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReservationPrice(BigDecimal value) {
        this.reservationPrice = value;
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
     * Gets the value of the userDTO property.
     * 
     * @return
     *     possible object is
     *     {@link UserDTO }
     *     
     */
    public UserDTO getUserDTO() {
        return userDTO;
    }

    /**
     * Sets the value of the userDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDTO }
     *     
     */
    public void setUserDTO(UserDTO value) {
        this.userDTO = value;
    }

    /**
     * Gets the value of the accommodationUnitDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accommodationUnitDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccommodationUnitDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccommodationUnitDTO }
     * 
     * 
     */
    public List<AccommodationUnitDTO> getAccommodationUnitDTO() {
        if (accommodationUnitDTO == null) {
            accommodationUnitDTO = new ArrayList<AccommodationUnitDTO>();
        }
        return this.accommodationUnitDTO;
    }

}