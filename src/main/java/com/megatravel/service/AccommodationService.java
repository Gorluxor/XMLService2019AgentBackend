package com.megatravel.service;


import com.megatravel.model.Accommodation;
import com.megatravel.repository.AccommodationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccommodationService {

    @Autowired
    private AccommodationRepository accomodationRepository;

    public Accommodation findById(Long  id){
        return accomodationRepository.findById(id).get();
    }

    public List<Accommodation> findAll(){
        return accomodationRepository.findAll();
    }

    public Accommodation save(Accommodation user){
        return accomodationRepository.save(user);
    }

    public void remove(Long id){accomodationRepository.deleteById(id);}


}