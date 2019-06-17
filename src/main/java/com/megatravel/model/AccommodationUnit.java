package com.megatravel.model;


import com.megatravel.dtos.AccommodationUnitDTO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("WeakerAccess")
@Entity
public class AccommodationUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
    protected int capacity;
    protected int size;
    protected String nameOfUnit;

    @ManyToOne
    protected UnitType unitType;
    @OneToMany(mappedBy = "priceForUnit")
    protected List<Pricing> pricing = new ArrayList<>();
    @OneToMany(mappedBy = "serviceForAccUnit")
    protected List<Service> service = new ArrayList<>();

    @ManyToOne
    protected Accommodation accommodation;

    public AccommodationUnit() {
    }

    public AccommodationUnit(AccommodationUnitDTO accommodationUnitDTO) {
        this.id = accommodationUnitDTO.getId();
        this.capacity = accommodationUnitDTO.getCapacity();
        this.size = accommodationUnitDTO.getSize();
        this.nameOfUnit = accommodationUnitDTO.getNameOfUnit();
        this.unitType = new UnitType(accommodationUnitDTO.getUnitTypeDTO());
    }

    public AccommodationUnit(int capacity, int size, String nameOfUnit, UnitType unitType, List<Pricing> pricing, List<Service> service) {
        this.capacity = capacity;
        this.size = size;
        this.nameOfUnit = nameOfUnit;
        this.unitType = unitType;
        this.pricing = pricing;
        this.service = service;
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

    public void setService(List<Service> service) {
        this.service = service;
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


    public List<Service> getService() {
        if (service == null) {
            service = new ArrayList<Service>();
        }
        return this.service;
    }

}
