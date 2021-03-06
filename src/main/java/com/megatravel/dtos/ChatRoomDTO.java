package com.megatravel.dtos;

import com.megatravel.model.ChatRoom;
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
 *         &lt;element name="id" type="{http://www.megatravel.com/types}id"/>
 *         &lt;element name="name" type="{http://www.megatravel.com/types}name"/>
 *         &lt;element name="lastChangedDate" type="{http://www.megatravel.com/types}Date"/>
 *         &lt;element ref="{http://megatravel.com/reservations}reservationDTO"/>
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
    "name",
    "lastChangedDate",
    "reservationDTO"
})
@XmlRootElement(name = "chatRoomDTO")
public class ChatRoomDTO {

    protected long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    protected Date lastChangedDate;
    @XmlElement(namespace = "http://megatravel.com/reservations", required = true)
    protected ReservationDTO reservationDTO;

    public ChatRoomDTO() {
    }

    public ChatRoomDTO(ChatRoom chatRoom) {
        this.id = chatRoom.getId();
        this.name = chatRoom.getName();
        this.reservationDTO = new ReservationDTO(chatRoom.getReservation());
        this.lastChangedDate = chatRoom.getLastChangedDate();
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the reservationDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationDTO }
     *     
     */
    public ReservationDTO getReservationDTO() {
        return reservationDTO;
    }

    /**
     * Sets the value of the reservationDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationDTO }
     *     
     */
    public void setReservationDTO(ReservationDTO value) {
        this.reservationDTO = value;
    }

}