package com.megatravel.model;

import com.megatravel.dtos.UnitTypeDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("WeakerAccess")
@Entity
public class UnitType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
    protected String nameOfUnitType;

    public UnitType() {
    }

    public UnitType(UnitTypeDTO unitTypeDTO){
        this.id = unitTypeDTO.getId();
        this.nameOfUnitType = unitTypeDTO.getNameOfUnitType();
    }

    public UnitType(String nameOfUnitType) {
        this.nameOfUnitType = nameOfUnitType;
    }

    public long getId() {
        return id;
    }

    public void setId(long value) {
        this.id = value;
    }

    public String getNameOfUnitType() {
        return nameOfUnitType;
    }

    public void setNameOfUnitType(String value) {
        this.nameOfUnitType = value;
    }

}
