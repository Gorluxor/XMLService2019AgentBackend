package com.megatravel.service;

import com.megatravel.model.Service;
import com.megatravel.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceService {

    @Autowired
    private ServiceRepository accomodationRepository;

    public Service findById(Long  id){
        return accomodationRepository.findById(id).get();
    }

    public List<Service> findAll(){
        return accomodationRepository.findAll();
    }

    public Service save(Service user){
        return accomodationRepository.save(user);
    }

    public void remove(Long id){accomodationRepository.deleteById(id);}
}
