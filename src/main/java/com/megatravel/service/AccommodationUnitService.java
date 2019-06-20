package com.megatravel.service;

import com.megatravel.model.AccommodationUnit;
import com.megatravel.repository.AccommodationUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccommodationUnitService {

    @Autowired
    private AccommodationUnitRepository accomodationRepository;

    public AccommodationUnit findById(Long  id){
        return accomodationRepository.findById(id).get();
    }

    public List<AccommodationUnit> findAll(){
        return accomodationRepository.findAll();
    }

    public AccommodationUnit save(AccommodationUnit user){
        return accomodationRepository.save(user);
    }

    public void remove(Long id){accomodationRepository.deleteById(id);}
}
