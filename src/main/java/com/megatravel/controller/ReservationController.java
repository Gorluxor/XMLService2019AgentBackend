package com.megatravel.controller;


import com.megatravel.dtos.AccommodationUnitDTO;
import com.megatravel.dtos.ReservationDTO;
import com.megatravel.model.AccommodationUnit;
import com.megatravel.model.Reservation;
import com.megatravel.model.User;

import com.megatravel.service.AccommodationUnitService;
import com.megatravel.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/reservation")
public class ReservationController {


    @Autowired
    private ReservationService reservationService;

    @Autowired
    private AccommodationUnitService accommodationUnitService;

    @RequestMapping(method = RequestMethod.GET, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} , produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<ReservationDTO>> getAllReservaitons() {
        List<Reservation> accommodations = reservationService.findAll();
        List<ReservationDTO> rentACarDTOS = new ArrayList<>();

        for (Reservation aCar : accommodations){
            rentACarDTOS.add(new ReservationDTO(aCar));
        }
        return new ResponseEntity<>(rentACarDTOS,HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} , produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ReservationDTO> rezervisi(@RequestBody ReservationDTO reservationDTO) {

     //   if(reservationDTO.getArrivalDate())

        List<AccommodationUnit> units = new ArrayList<>();

        AccommodationUnit acc= new AccommodationUnit();

//        for(AccommodationUnitDTO e:reservationDTO.getAccommodationUnitDTO())
//        {
//           acc=accommodationUnitService.findById(e.getId());
//
//           if(acc!=null)
//           {
//               units.add(new AccommodationUnit(e));
//           }
//        }



        ///proveriti sa back end bazom da li moze

        Reservation res = new Reservation();

        res.setArrivalDate(reservationDTO.getArrivalDate());
        res.setDepartureDate(reservationDTO.getDepartureDate());
        res.setReservationPrice(reservationDTO.getReservationPrice());
        res.setStayRealized(false);
        res.setUser(new User(reservationDTO.getUserDTO()));

        List<AccommodationUnit> unit = new ArrayList<>();
        for(AccommodationUnitDTO e:reservationDTO.getAccommodationUnitDTO())
        {
            unit.add(new AccommodationUnit(e));
        }

        res.setAccommodationUnit(unit);

        res=reservationService.save(res);

        return new ResponseEntity<>(new ReservationDTO(res),HttpStatus.OK);

    }
}
