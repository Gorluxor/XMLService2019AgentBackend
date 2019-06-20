package com.megatravel.service;

import com.megatravel.model.Pricing;
import com.megatravel.repository.PricingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PricingService {

    @Autowired
    private PricingRepository accomodationRepository;

    public Pricing findById(Long  id){
        return accomodationRepository.findById(id).get();
    }

    public List<Pricing> findAll(){
        return accomodationRepository.findAll();
    }

    public Pricing save(Pricing user){
        return accomodationRepository.save(user);
    }

    public void remove(Long id){accomodationRepository.deleteById(id);}
}
