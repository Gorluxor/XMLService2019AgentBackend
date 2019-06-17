package com.megatravel.model;


import com.megatravel.dtos.AccommodationTypeDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("WeakerAccess")
@Entity
public class AccommodationType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected String nameOfAccType;

    public AccommodationType() {
        super();
    }

    public AccommodationType(AccommodationTypeDTO accommodationTypeDTO) {
        this.id = accommodationTypeDTO.getId();
        this.nameOfAccType = accommodationTypeDTO.getNameOfAccType();
    }



    public AccommodationType(String nameOfAccType) {
        this.nameOfAccType = nameOfAccType;
    }

    public long getId() {
        return id;
    }


    public void setId(long value) {
        this.id = value;
    }

    public String getNameOfAccType() {
        return nameOfAccType;
    }

    public void setNameOfAccType(String value) {
        this.nameOfAccType = value;
    }

}
