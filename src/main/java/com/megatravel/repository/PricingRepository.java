package com.megatravel.repository;

import com.megatravel.model.Pricing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface PricingRepository extends JpaRepository<Pricing,Long> {

    List<Pricing> findAllByPriceForUnit_Id(Long id);
    Pricing findFirstByPriceForUnit_IdAndId(Long unitId, Long priceId);



    Pricing findFirstByPriceForUnit_IdAndStartDateBeforeOrderByStartDateDesc(Long unitId, Date date);
}
