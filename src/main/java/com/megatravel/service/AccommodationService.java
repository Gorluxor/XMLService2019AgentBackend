package com.megatravel.service;


import com.megatravel.dtos.AccommodationDTO;
import com.megatravel.model.Accommodation;
import com.megatravel.repository.AccommodationRepository;
import com.megatravel.repository.AccommodationTypeRepository;
import com.megatravel.repository.LocationRepository;
import com.megatravel.repository.UserRepository;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AccommodationService {

    @Autowired
    private AccommodationRepository accomodationRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private AccommodationTypeRepository accommodationTypeRepository;

    @Autowired
    private AccommodationRepository accommodationRepository;

    public Accommodation findById(Long  id){
        return accomodationRepository.findById(id).get();
    }

    public List<Accommodation> findAll(){
        return accomodationRepository.findAll();
    }

    public Accommodation save(Accommodation acc){
        return accomodationRepository.save(acc);
    }

    public void remove(Long id){accomodationRepository.deleteById(id);}

    public Accommodation createAccommodation(AccommodationDTO accommodationDTO) {

        if (accommodationDTO == null) {
            throw new ResponseStatusException(HttpStatus.NO_CONTENT, "No accommodation sent");
        }

        Accommodation accommodation = new Accommodation(accommodationDTO );
        accommodation.setExtraService(new ArrayList<>()); // admin doesn't add which extra services does the user have

        locationRepository.save(accommodation.getLocation());

        accommodation.setAccommodationUnit(new ArrayList<>());
        accommodationRepository.save(accommodation);

        return accommodation;
    }
}