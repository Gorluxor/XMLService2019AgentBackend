package com.megatravel.controller;



import com.megatravel.dtos.*;
import com.megatravel.model.*;
import com.megatravel.service.AccommodationService;
import com.megatravel.service.MessageService;
import com.megatravel.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/accommodation")
public class AccommodationController {


    @Autowired
    private AccommodationService accomodationService;

    @Autowired
    private ReservationService reservationService;

    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<AccommodationDTO>> getAllAccommodations() {
        List<Accommodation> accommodations = accomodationService.findAll();
        List<AccommodationDTO> rentACarDTOS = new ArrayList<>();

        for (Accommodation aCar : accommodations){
            rentACarDTOS.add(new AccommodationDTO(aCar));
        }
        return new ResponseEntity<>(rentACarDTOS,HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<AccommodationDTO> getAccommodation(@PathVariable Long id) {
        Accommodation aCar = accomodationService.findById(id);

        if (aCar==null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(new AccommodationDTO(aCar),HttpStatus.OK);

    }

    @RequestMapping(value = "/realizovana/{id}", method = RequestMethod.GET)
    public ResponseEntity<ReservationDTO> realizovana(@PathVariable Long id) {
        Reservation aCar = reservationService.findById(id);

        if (aCar==null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        aCar.setStayRealized(true);

        return new ResponseEntity<>(new ReservationDTO(aCar),HttpStatus.OK);

    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<AccommodationDTO> saveAccommodation(@RequestBody AccommodationDTO accommodationDTO) {

        Accommodation accommodation = new Accommodation();
        accommodation.setAccommodationType(new AccommodationType(accommodationDTO.getAccommodationTypeDTO()));
        List<AccommodationUnit>  unit = new ArrayList<>();
        for(AccommodationUnitDTO e:accommodationDTO.getAccommodationUnitDTO())
        {
            unit.add(new AccommodationUnit(e));
        }

        accommodation.setAccommodationUnit(unit);
        accommodation.setAccommodationType(new AccommodationType(accommodationDTO.getAccommodationTypeDTO()));
        accommodation.setCancelationDays(accommodationDTO.getCancelationDays());
        accommodation.setDescription(accommodationDTO.getDescription());

        List<Image> images = new ArrayList<>();

        for(ImageDTO e: accommodationDTO.getImageDTO())
        {
            images.add(new Image(e));
        }


        accommodation.setImage(images);

        accommodation.setLocation(new Location(accommodationDTO.getLocationDTO()));

        accommodation.setName(accommodationDTO.getName());
        accommodation.setUser(new User(accommodationDTO.getUserDTO()));

        List<Service> services = new ArrayList<>();

        for(ServiceDTO e: accommodationDTO.getServiceDTO())
        {
            services.add(new Service(e));
        }

        accommodation.setService(services);

        accommodation = accomodationService.save(accommodation);

        return new ResponseEntity<>(new AccommodationDTO(accommodation),HttpStatus.OK);
    }

    @RequestMapping(value = "/zauzeto/{id}", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<ReservationDTO> zauzeto(@RequestBody ReservationDTO reservationDTO, @PathVariable Long id) {
        Reservation res = reservationService.findById(id);

        if (res==null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        res.setArrivalDate(reservationDTO.getArrivalDate());
        res.setDepartureDate(reservationDTO.getDepartureDate());
        res.setReservationPrice(reservationDTO.getReservationPrice());
        res.setStayRealized(false);
        res.setUser(new User(reservationDTO.getUserDTO()));

        List<AccommodationUnit>  unit = new ArrayList<>();
        for(AccommodationUnitDTO e:reservationDTO.getAccommodationUnitDTO())
        {
            unit.add(new AccommodationUnit(e));
        }

        res.setAccommodationUnit(unit);

        res=reservationService.save(res);

        return new ResponseEntity<>(new ReservationDTO(res),HttpStatus.OK);

    }

    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
    public ResponseEntity<AccommodationDTO> updateAccommodation(@RequestBody AccommodationDTO accommodationDTO) {
        return null;

    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteAccommodation(@PathVariable Long id) {
        return null;


    }

}