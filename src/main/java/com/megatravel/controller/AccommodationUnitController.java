package com.megatravel.controller;

import com.megatravel.dtos.*;
import com.megatravel.model.*;
import com.megatravel.service.AccommodationUnitService;
import com.megatravel.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/accommodationUnit")
public class AccommodationUnitController {


    @Autowired
    private ReservationService reservationService;

    @Autowired
    private AccommodationUnitService accommodationUnitService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<AccommodationUnitDTO>> getAllAccommodationUnits() {
        List<AccommodationUnit> accommodations = accommodationUnitService.findAll();
        List<AccommodationUnitDTO> rentACarDTOS = new ArrayList<>();

        for (AccommodationUnit aCar : accommodations){
            rentACarDTOS.add(new AccommodationUnitDTO(aCar));
        }
        return new ResponseEntity<>(rentACarDTOS, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<AccommodationUnitDTO> getAccommodationUnit(@PathVariable Long id) {
        AccommodationUnit aCar = accommodationUnitService.findById(id);

        if (aCar==null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(new AccommodationUnitDTO(aCar),HttpStatus.OK);

    }


    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<AccommodationUnitDTO> saveAccommodationUnit(@RequestBody AccommodationUnitDTO accommodationDTO) {

        AccommodationUnit accommodation = new AccommodationUnit();

        accommodation.setCapacity(accommodationDTO.getCapacity());
        accommodation.setNameOfUnit(accommodationDTO.getNameOfUnit());


        List<Pricing>  unit = new ArrayList<>();
        for(PricingDTO e:accommodationDTO.getPricingDTO())
        {
            unit.add(new Pricing(e));
        }

        accommodation.setPricing(unit);

        accommodation.setSize(accommodationDTO.getSize());
        accommodation.setUnitType(new UnitType(accommodationDTO.getUnitTypeDTO()));

        List<Service>  service = new ArrayList<>();
        for(ServiceDTO e:accommodationDTO.getServiceDTO())
        {
            service.add(new Service(e));
        }

        accommodation.setService(service);

        //accomodation????????????????????

        accommodation = accommodationUnitService.save(accommodation);

        return new ResponseEntity<>(new AccommodationUnitDTO(accommodation),HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
    public ResponseEntity<AccommodationUnitDTO> updateAccommodationUnit(@RequestBody AccommodationUnitDTO accommodationDTO) {
        return null;

    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteAccommodationUnit(@PathVariable Long id) {
        return null;


    }

}
