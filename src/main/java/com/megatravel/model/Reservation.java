package com.megatravel.model;



import com.megatravel.dtos.ReservationDTO;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings("WeakerAccess")
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected Date arrivalDate;

    protected Date departureDate;

    protected boolean stayRealized;

    protected BigDecimal reservationPrice;

    @ManyToOne
    protected User user;

    @ManyToMany
    protected List<AccommodationUnit> accommodationUnit;

    public Reservation() {
    }


    public Reservation(ReservationDTO reservationDTO) {
        this.arrivalDate = reservationDTO.getArrivalDate();
        this.departureDate = reservationDTO.getDepartureDate();
        this.stayRealized = reservationDTO.isStayRealized();
        this.reservationPrice = reservationDTO.getReservationPrice();
        this.user = new User(reservationDTO.getUserDTO());
    }


    public Reservation(Date arrivalDate, Date departureDate, boolean stayRealized, BigDecimal reservationPrice, User user) {
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.stayRealized = stayRealized;
        this.reservationPrice = reservationPrice;
        this.user = user;
        this.accommodationUnit = new ArrayList<AccommodationUnit>();
    }



    public long getId() {
        return id;
    }


    public void setId(long value) {
        this.id = value;
    }


    public Date getArrivalDate() {
        return arrivalDate;
    }


    public void setArrivalDate(Date value) {
        this.arrivalDate = value;
    }


    public Date getDepartureDate() {
        return departureDate;
    }


    public void setDepartureDate(Date value) {
        this.departureDate = value;
    }


    public boolean isStayRealized() {
        return stayRealized;
    }

    public void setStayRealized(boolean value) {
        this.stayRealized = value;
    }

    public BigDecimal getReservationPrice() {
        return reservationPrice;
    }

    public void setReservationPrice(BigDecimal value) {
        this.reservationPrice = value;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User value) {
        this.user = value;
    }


    public List<AccommodationUnit> getAccommodationUnit() {
        if (accommodationUnit == null) {
            accommodationUnit = new ArrayList<AccommodationUnit>();
        }
        return this.accommodationUnit;
    }

    public void setAccommodationUnit(List<AccommodationUnit> accommodationUnit) {
        this.accommodationUnit = accommodationUnit;
    }


}
