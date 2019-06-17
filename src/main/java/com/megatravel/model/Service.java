package com.megatravel.model;


import com.megatravel.dtos.ServiceDTO;

import javax.persistence.*;

@SuppressWarnings("WeakerAccess")
@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected String nameOfService;

    protected String description;

    // Note that one service can be global - for Accommodation, or local only for some Accommodation unit
    // Shouldn't have links to both at the same time (as it would be redundant)

    @ManyToOne
    protected AccommodationUnit serviceForAccUnit;

    @ManyToOne
    protected Accommodation serviceForAcc;

    public Service() {
    }

    public Service(ServiceDTO serviceDTO) {
        this.id = serviceDTO.getId();
        this.nameOfService = serviceDTO.getNameOfService();
        this.description = serviceDTO.getDescription();
    }

    public Service(long id, String nameOfService, String description) {
        this.id = id;
        this.nameOfService = nameOfService;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long value) {
        this.id = value;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String value) {
        this.nameOfService = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

}
