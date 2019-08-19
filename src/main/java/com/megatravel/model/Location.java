//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.08 at 01:40:56 AM CEST 
//


package com.megatravel.model;

import com.megatravel.dtos.LocationDTO;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("WeakerAccess")
@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected String country;
    protected String city;
    protected String street;
    protected BigInteger number;
    protected int postalCode;
    protected Double latitude;
    protected Double longitude;
    protected Date lastChangedDate;

    public Location() {
        this.lastChangedDate = new Date();
    }

    public Location(LocationDTO locationDTO) {
        if (locationDTO != null){
            this.id = locationDTO.getId();
            this.country = locationDTO.getCountry();
            this.city = locationDTO.getCity();
            this.street = locationDTO.getStreet();
            this.number = locationDTO.getNumber();
            this.postalCode = locationDTO.getPostalCode();
            this.latitude = locationDTO.getLatitude();
            this.longitude = locationDTO.getLongitude();
            this.lastChangedDate = new Date();
        }
    }

    public Location(String country, String city, String street, BigInteger number, int postalCode, Double latitude, Double longitude) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Date getLastChangedDate() {
        return lastChangedDate;
    }

    public void setLastChangedDate(Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long value) {
        this.id = value;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String value) {
        this.country = value;
    }

    public String getCity() {
        return city;
    }


    public void setCity(String value) {
        this.city = value;
    }


    public String getStreet() {
        return street;
    }


    public void setStreet(String value) {
        this.street = value;
    }


    public BigInteger getNumber() {
        return number;
    }


    public void setNumber(BigInteger value) {
        this.number = value;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int value) {
        this.postalCode = value;
    }

    public Double getLatitude() {
        return latitude;
    }


    public void setLatitude(Double value) {
        this.latitude = value;
    }

    public Double getLongitude() {
        return longitude;
    }


    public void setLongitude(Double value) {
        this.longitude = value;
    }

}
