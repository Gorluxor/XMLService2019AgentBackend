//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.08 at 02:37:11 AM CEST 
//


package com.megatravel.model;

import com.megatravel.dtos.AccommodationUnitDTO;
import com.megatravel.dtos.ImageDTO;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.datatype.DatatypeFactory;




@SuppressWarnings("WeakerAccess")
@Entity
public class AccommodationUnit {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
    protected int capacity;
    protected int size;
    protected String nameOfUnit;
    protected BigInteger cancelationDays;

    @ManyToOne
    protected UnitType unitType;
    @OneToMany(mappedBy = "priceForUnit", fetch = FetchType.EAGER)
    protected List<Pricing> pricing = new ArrayList<>();
    @ManyToMany
    protected List<ExtraService> extraService = new ArrayList<>();
    @OneToMany(mappedBy = "belongsToAccommodationUnit")
    protected List<Image> images = new ArrayList<>();
    @ManyToOne
    protected Location location;

    @ManyToOne
    protected Accommodation accommodation;

    protected Date lastChangedDate;


    public AccommodationUnit() {
        this.lastChangedDate = new Date();
    }

    public AccommodationUnit(AccommodationUnitDTO accommodationUnitDTO) {
        this.id = accommodationUnitDTO.getId();
        this.capacity = accommodationUnitDTO.getCapacity();
        this.size = accommodationUnitDTO.getSize();
        this.nameOfUnit = accommodationUnitDTO.getNameOfUnit();
        //this.unitType = new UnitType(accommodationUnitDTO.getUnitTypeDTO());
        this.lastChangedDate = new Date();
        this.cancelationDays = accommodationUnitDTO.getCancelationDays();
        //this.location = new Location(accommodationUnitDTO.getLocationDTO());
        List<ImageDTO> images = accommodationUnitDTO.getImageDTO();
        List<Image> values = new ArrayList<>();
        if (images != null){
            for (ImageDTO imageDTO : images){
                Image im = new Image();
                Date date;
                date = accommodationUnitDTO.getLastChangedDate();
                im.lastChangedDate = imageDTO.getLastChangedDate() == null ? new Date() : date;
                im.uri = imageDTO.getUri();
                im.title = imageDTO.getTitle();
                values.add(im);
            }
        }
        this.images = values;


    }

    public AccommodationUnit(int capacity, int size, String nameOfUnit, UnitType unitType, List<Pricing> pricing, List<ExtraService> extraService) {
        this.capacity = capacity;
        this.size = size;
        this.nameOfUnit = nameOfUnit;
        this.unitType = unitType;
        this.pricing = pricing;
        this.extraService = extraService;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public BigInteger getCancelationDays() {
        return cancelationDays;
    }

    public void setCancelationDays(BigInteger cancelationDays) {
        this.cancelationDays = cancelationDays;
    }

    public Date getLastChangedDate() {
        return lastChangedDate;
    }

    public void setLastChangedDate(Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }

    public Accommodation getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(Accommodation accommodation) {
        this.accommodation = accommodation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPricing(List<Pricing> pricing) {
        this.pricing = pricing;
    }

    public void setExtraService(List<ExtraService> extraService) {
        this.extraService = extraService;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int value) {
        this.capacity = value;
    }


    public int getSize() {
        return size;
    }


    public void setSize(int value) {
        this.size = value;
    }

    public String getNameOfUnit() {
        return nameOfUnit;
    }


    public void setNameOfUnit(String value) {
        this.nameOfUnit = value;
    }


    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType value) {
        this.unitType = value;
    }


    public List<Pricing> getPricing() {
        if (pricing == null) {
            pricing = new ArrayList<Pricing>();
        }
        return this.pricing;
    }


    public List<ExtraService> getExtraService() {
        if (extraService == null) {
            extraService = new ArrayList<ExtraService>();
        }
        return this.extraService;
    }

}
