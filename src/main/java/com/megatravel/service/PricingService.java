package com.megatravel.service;

import com.megatravel.model.AccommodationUnit;
import com.megatravel.model.Pricing;
import com.megatravel.repository.AccommodationUnitRepository;
import com.megatravel.repository.PricingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PricingService {

    @Autowired
    private PricingRepository pricingRepository;

    @Autowired
    private AccommodationUnitRepository accommodationUnitRepository;

    public Pricing findById(Long  id){
        return pricingRepository.findById(id).get();
    }

    public List<Pricing> findAll(){
        return pricingRepository.findAll();
    }

    public Pricing save(Pricing user){
        return pricingRepository.save(user);
    }

    public void remove(Long id){pricingRepository.deleteById(id);}

    public double getPriceForDatesUnitId(Long unitId, Date startDate, Date endDate) {
        Calendar start = Calendar.getInstance();
        start.setTime(startDate);
        Calendar end = Calendar.getInstance();
        end.setTime(endDate);

        if (start.after(endDate)){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Dates are flipped");
        }

        BigDecimal totalPrice = new BigDecimal(0);

        for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
            totalPrice = totalPrice.add(pricingRepository.findFirstByPriceForUnit_IdAndStartDateBeforeOrderByStartDateDesc(unitId,date).getPrice()) ;
        }

        return totalPrice.doubleValue();
    }

    public double getPriceForDatesAccId(Long accId, Date startDate, Date endDate){

        double minPrice = Double.MAX_VALUE;

        List<AccommodationUnit> list = accommodationUnitRepository.findAllByAccommodation_Id(accId);

        if (list == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No accommodation units for the accommodation");
        }

        for (AccommodationUnit a : list){
            double pom = getPriceForDatesUnitId(a.getId(), startDate, endDate);
            if (minPrice > pom){
                minPrice = pom;
            }
        }

        return minPrice;
    }
}
