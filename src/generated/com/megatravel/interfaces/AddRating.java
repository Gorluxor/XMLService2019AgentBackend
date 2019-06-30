
package com.megatravel.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.megatravel.admin.UserDTO;
import com.megatravel.agent.AccommodationDTO;
import com.megatravel.reservations.ReservationDTO;


/**
 * <p>Java class for addRating complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addRating"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ratingDTO" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/&gt;
 *                   &lt;element name="ratingValue" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/&gt;
 *                   &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *                   &lt;element name="adminApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/&gt;
 *                   &lt;element ref="{http://www.megatravel.com/admin}userDTO"/&gt;
 *                   &lt;element ref="{http://megatravel.com/reservations}reservationDTO"/&gt;
 *                   &lt;element ref="{http://www.megatravel.com/agent}accommodationDTO"/&gt;
 *                   &lt;element name="lastChangedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addRating", propOrder = {
    "ratingDTO"
})
public class AddRating {

    protected AddRating.RatingDTO ratingDTO;

    /**
     * Gets the value of the ratingDTO property.
     * 
     * @return
     *     possible object is
     *     {@link AddRating.RatingDTO }
     *     
     */
    public AddRating.RatingDTO getRatingDTO() {
        return ratingDTO;
    }

    /**
     * Sets the value of the ratingDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddRating.RatingDTO }
     *     
     */
    public void setRatingDTO(AddRating.RatingDTO value) {
        this.ratingDTO = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/&gt;
     *         &lt;element name="ratingValue" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/&gt;
     *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
     *         &lt;element name="adminApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/&gt;
     *         &lt;element ref="{http://www.megatravel.com/admin}userDTO"/&gt;
     *         &lt;element ref="{http://megatravel.com/reservations}reservationDTO"/&gt;
     *         &lt;element ref="{http://www.megatravel.com/agent}accommodationDTO"/&gt;
     *         &lt;element name="lastChangedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "ratingValue",
        "comment",
        "date",
        "adminApproved",
        "userDTO",
        "reservationDTO",
        "accommodationDTO",
        "lastChangedDate"
    })
    public static class RatingDTO {

        @XmlElement(namespace = "http://interfaces.megatravel.com/")
        protected long id;
        @XmlElement(namespace = "http://interfaces.megatravel.com/")
        protected double ratingValue;
        @XmlElement(namespace = "http://interfaces.megatravel.com/")
        protected String comment;
        @XmlElement(namespace = "http://interfaces.megatravel.com/", required = true)
        protected String date;
        @XmlElement(namespace = "http://interfaces.megatravel.com/")
        protected boolean adminApproved;
        @XmlElement(namespace = "http://www.megatravel.com/admin", required = true)
        protected UserDTO userDTO;
        @XmlElement(namespace = "http://megatravel.com/reservations", required = true)
        protected ReservationDTO reservationDTO;
        @XmlElement(namespace = "http://www.megatravel.com/agent", required = true)
        protected AccommodationDTO accommodationDTO;
        @XmlElement(namespace = "http://interfaces.megatravel.com/")
        protected String lastChangedDate;

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
         * Gets the value of the ratingValue property.
         * 
         */
        public double getRatingValue() {
            return ratingValue;
        }

        /**
         * Sets the value of the ratingValue property.
         * 
         */
        public void setRatingValue(double value) {
            this.ratingValue = value;
        }

        /**
         * Gets the value of the comment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComment() {
            return comment;
        }

        /**
         * Sets the value of the comment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComment(String value) {
            this.comment = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDate(String value) {
            this.date = value;
        }

        /**
         * Gets the value of the adminApproved property.
         * 
         */
        public boolean isAdminApproved() {
            return adminApproved;
        }

        /**
         * Sets the value of the adminApproved property.
         * 
         */
        public void setAdminApproved(boolean value) {
            this.adminApproved = value;
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

        /**
         * Gets the value of the accommodationDTO property.
         * 
         * @return
         *     possible object is
         *     {@link AccommodationDTO }
         *     
         */
        public AccommodationDTO getAccommodationDTO() {
            return accommodationDTO;
        }

        /**
         * Sets the value of the accommodationDTO property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccommodationDTO }
         *     
         */
        public void setAccommodationDTO(AccommodationDTO value) {
            this.accommodationDTO = value;
        }

        /**
         * Gets the value of the lastChangedDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastChangedDate() {
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
        public void setLastChangedDate(String value) {
            this.lastChangedDate = value;
        }

    }

}
