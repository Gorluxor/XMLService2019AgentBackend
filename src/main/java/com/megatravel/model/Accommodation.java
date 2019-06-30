package com.megatravel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//
//import com.megatravel.dtos.agent.AccommodationDTO;
//import com.megatravel.model.admin.User;
//import com.megatravel.model.types.Location;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.megatravel.agent.AccommodationDTO;



@Entity
@SuppressWarnings({"WeakerAccess","Duplicates"})
public class Accommodation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected String name;

    protected String description;

    @ManyToOne
    protected Location location;

    @ManyToOne
    protected AccommodationType accommodationType;

    @OneToOne
    protected User user; // User that administrates the accommodation

    @OneToMany(mappedBy = "accommodation")
    protected List<AccommodationUnit> accommodationUnit = new ArrayList<>();

    @ManyToMany
    protected List<ExtraService> extraService = new ArrayList<>();

    protected String category;

    protected boolean freeToCancel;

    protected int freeToCancelDays;


    protected Date lastChangedDate;

    public Accommodation() {
        this.lastChangedDate = new Date();
    }

    public Accommodation(AccommodationDTO accommodationDTO) {
        this.id = accommodationDTO.getId();
        this.name = accommodationDTO.getName();
        this.description = accommodationDTO.getDescription();
        //this.location = new Location(accommodationDTO.getLocationDTO());
        this.lastChangedDate = new Date();
        this.freeToCancel = accommodationDTO.isFreeToCancel();
        this.freeToCancelDays = accommodationDTO.getFreeToCancelDays() >= 0 ? accommodationDTO.getFreeToCancelDays() : 0 ;
        this.category = validCategory(accommodationDTO.getCategory());
        this.accommodationType = accommodationDTO.getAccommodationTypeDTO() == null ? null : new AccommodationType(accommodationDTO.getAccommodationTypeDTO());
        this.user = accommodationDTO.getUserDTO() == null ? null : new User(accommodationDTO.getUserDTO());
    }

    public static String validCategory(String value){
        if (value == null){
            return "Uncategorized";
        }

        switch (value){
            case "One star":
                return "One star";
            case "Two star":
                return "Two star";
            case "Three star":
                return "Three star";
            case "Four star":
                return "Four star";
            case "Five star":
                return "Five star";
            default:
                return "Uncategorized";
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = validCategory(category);
    }

    public boolean isFreeToCancel() {
        return freeToCancel;
    }

    public void setFreeToCancel(boolean freeToCancel) {
        this.freeToCancel = freeToCancel;
    }

    public int getFreeToCancelDays() {
        return freeToCancelDays;
    }

    public void setFreeToCancelDays(int freeToCancelDays) {
        this.freeToCancelDays = freeToCancelDays;
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


    public String getName() {
        return name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String value) {
        this.description = value;
    }


    public Location getLocation() {
        return location;
    }


    public void setLocation(Location value) {
        this.location = value;
    }


    public AccommodationType getAccommodationType() {
        return accommodationType;
    }


    public void setAccommodationType(AccommodationType value) {
        this.accommodationType = value;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User value) {
        this.user = value;
    }


    public void setAccommodationUnit(List<AccommodationUnit> accommodationUnit) {
        this.accommodationUnit = accommodationUnit;
    }

    public void setExtraService(List<ExtraService> extraService) {
        this.extraService = extraService;
    }


    public List<AccommodationUnit> getAccommodationUnit() {
        if (accommodationUnit == null) {
            accommodationUnit = new ArrayList<AccommodationUnit>();
        }
        return this.accommodationUnit;
    }


    public List<ExtraService> getExtraService() {
        if (extraService == null) {
            extraService = new ArrayList<ExtraService>();
        }
        return this.extraService;
    }



}
