package com.megatravel.service;

import com.megatravel.model.UnitType;
import com.megatravel.repository.UnitTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitTypeService {

    @Autowired
    private UnitTypeRepository accomodationRepository;

    public UnitType findById(Long  id){
        return accomodationRepository.findById(id).get();
    }

    public List<UnitType> findAll(){
        return accomodationRepository.findAll();
    }

    public UnitType save(UnitType user){
        return accomodationRepository.save(user);
    }

    public void remove(Long id){accomodationRepository.deleteById(id);}
}
