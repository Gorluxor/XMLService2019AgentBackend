package com.megatravel.service;

import com.megatravel.model.Reservation;
import com.megatravel.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository accomodationRepository;

    public Reservation findById(Long  id){
        return accomodationRepository.findById(id).get();
    }

    public List<Reservation> findAll(){
        return accomodationRepository.findAll();
    }

    public Reservation save(Reservation user){
        return accomodationRepository.save(user);
    }

    public void remove(Long id){accomodationRepository.deleteById(id);}
}
