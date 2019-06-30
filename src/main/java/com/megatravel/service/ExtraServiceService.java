package com.megatravel.service;

import com.megatravel.model.ExtraService;
import com.megatravel.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ExtraServiceService {

    @Autowired
    private ServiceRepository accomodationRepository;

    public ExtraService findById(Long  id){
        return accomodationRepository.findById(id).get();
    }

    public List<ExtraService> findAll(){
        return accomodationRepository.findAll();
    }

    public ExtraService save(ExtraService user){
        return accomodationRepository.save(user);
    }

    public void remove(Long id){accomodationRepository.deleteById(id);}
}
