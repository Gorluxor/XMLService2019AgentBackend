package com.megatravel.service;

import com.megatravel.model.Location;
import com.megatravel.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    private LocationRepository accomodationRepository;

    public Location findById(Long  id){
        return accomodationRepository.findById(id).get();
    }

    public List<Location> findAll(){
        return accomodationRepository.findAll();
    }

    public Location save(Location user){
        return accomodationRepository.save(user);
    }

    public void remove(Long id){accomodationRepository.deleteById(id);}
}
