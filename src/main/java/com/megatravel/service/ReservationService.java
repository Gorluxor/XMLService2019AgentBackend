package com.megatravel.service;

import com.megatravel.model.Reservation;
import com.megatravel.model.User;
import com.megatravel.repository.ReservationRepository;
import com.megatravel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Date;
import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private UserRepository userRepository;

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

    public Reservation confirmReservation(Long reservationId, String email){

        User user = userRepository.findByEmail(email);
        if (user == null){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "");
        }


        Reservation reservation = reservationRepository.getOne(reservationId);
        if (!reservation.getAccommodationUnit().get(0).getAccommodation().getUser().equals(user)){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "");
        }
        reservation.setLastChangedDate(new Date());
        reservation.setStayRealized(true);
        reservationRepository.save(reservation);

        return reservation;
    }
}
