package com.megatravel.service;

import com.megatravel.model.AccommodationType;
import com.megatravel.repository.AccommodationTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccommodationTypeService {

    @Autowired
    private AccommodationTypeRepository accomodationRepository;

    public AccommodationType findById(Long  id){
        return accomodationRepository.findById(id).get();
    }

    public List<AccommodationType> findAll(){
        return accomodationRepository.findAll();
    }

    public AccommodationType save(AccommodationType user){
        return accomodationRepository.save(user);
    }

    public void remove(Long id){accomodationRepository.deleteById(id);}
}
