package com.megatravel.model;


import com.megatravel.dtos.PricingDTO;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@SuppressWarnings("WeakerAccess")
@Entity
public class Pricing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected BigDecimal price;

    protected Date startDate;

    @ManyToOne
    protected AccommodationUnit priceForUnit;

    public Pricing() {
    }

    public Pricing(PricingDTO pricingDTO) {
        this.id = pricingDTO.getId();
        this.price = pricingDTO.getPrice();
        this.startDate = pricingDTO.getStartDate();
    }


    public Pricing(long id, BigDecimal price, Date startDate) {
        this.id = id;
        this.price = price;
        this.startDate = startDate;
    }

    public AccommodationUnit getPriceForUnit() {
        return priceForUnit;
    }

    public void setPriceForUnit(AccommodationUnit priceForUnit) {
        this.priceForUnit = priceForUnit;
    }

    public long getId() {
        return id;
    }


    public void setId(long value) {
        this.id = value;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date value) {
        this.startDate = value;
    }

}
