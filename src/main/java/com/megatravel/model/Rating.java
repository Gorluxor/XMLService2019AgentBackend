//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.08 at 02:37:10 AM CEST 
//


package com.megatravel.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.megatravel.rating.RatingDTO;

@SuppressWarnings("WeakerAccess")
@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected double ratingValue;

    protected String comment;

    protected Date date;

    protected boolean adminApproved;

    @ManyToOne
    protected User user;

    @ManyToOne
    protected Reservation reservation;

    protected Date lastChangedDate;

    public Rating() {
        this.lastChangedDate = new Date();
    }

    public Rating(RatingDTO ratingDTO) {
        this.id = ratingDTO.getId();
        this.ratingValue = ratingDTO.getRatingValue();
        this.adminApproved = ratingDTO.isAdminApproved();
        this.date = new Date(ratingDTO.getDate());
        this.user = new User(ratingDTO.getUserDTO());
        this.reservation = new Reservation(ratingDTO.getReservationDTO());
        this.lastChangedDate = new Date();
    }

    public Rating(double ratingValue, String comment, Date date) {
        this.ratingValue = ratingValue;
        this.comment = comment;
        this.date = date;
    }


    public long getId() {
        return id;
    }


    public void setId(long value) {
        this.id = value;
    }

    public double getRatingValue() {
        return ratingValue;
    }


    public void setRatingValue(double value) {
        this.ratingValue = value;
    }

    public String getComment() {
        return comment;
    }


    public void setComment(String value) {
        this.comment = value;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date value) {
        this.date = value;
    }

    public boolean isAdminApproved() {
        return adminApproved;
    }


    public void setAdminApproved(boolean value) {
        this.adminApproved = value;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User value) {
        this.user = value;
    }


    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation value) {
        this.reservation = value;
    }

    public Date getLastChangedDate() {
        return lastChangedDate;
    }

    public void setLastChangedDate(Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }
}
