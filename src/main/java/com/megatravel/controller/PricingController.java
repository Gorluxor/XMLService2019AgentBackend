package com.megatravel.controller;

import com.megatravel.dtos.AccommodationUnitDTO;
import com.megatravel.dtos.PricingDTO;
import com.megatravel.model.AccommodationUnit;
import com.megatravel.model.Pricing;
import com.megatravel.model.Reservation;
import com.megatravel.model.User;
import com.megatravel.service.AccommodationUnitService;
import com.megatravel.service.PricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Access;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/pricing")
public class PricingController {
    
    @Autowired
    private PricingService pricingService;

    @Autowired
    private AccommodationUnitService accommodationUnitService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<PricingDTO>> getAll() {
        List<Pricing> accommodations = pricingService.findAll();
        List<PricingDTO> rentACarDTOS = new ArrayList<>();

        for (Pricing aCar : accommodations){
            rentACarDTOS.add(new PricingDTO(aCar));
        }
        return new ResponseEntity<>(rentACarDTOS, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<PricingDTO> getOne(@PathVariable Long id) {

        Pricing pricing = pricingService.findById(id);

        return new ResponseEntity<>(new PricingDTO(pricing), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<PricingDTO> postaviCenu(@RequestBody PricingDTO reservationDTO, @PathVariable Long id) {

        Pricing pricing = new Pricing();

        pricing.setPrice(reservationDTO.getPrice());
        AccommodationUnit unit = accommodationUnitService.findById(id);
        pricing.setPriceForUnit(unit);
        pricing.setStartDate(reservationDTO.getStartDate());

        pricing=pricingService.save(pricing);

        return new ResponseEntity<>(new PricingDTO(pricing),HttpStatus.OK);

    }
}
