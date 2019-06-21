package com.megatravel.controller;

import com.megatravel.dtos.AccommodationUnitDTO;
import com.megatravel.dtos.PricingDTO;
import com.megatravel.model.AccommodationUnit;
import com.megatravel.model.Pricing;
import com.megatravel.model.Reservation;
import com.megatravel.model.User;
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

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<PricingDTO>> getAll() {
        List<Pricing> accommodations = pricingService.findAll();
        List<PricingDTO> rentACarDTOS = new ArrayList<>();

        for (Pricing aCar : accommodations){
            rentACarDTOS.add(new PricingDTO(aCar));
        }
        return new ResponseEntity<>(rentACarDTOS, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<PricingDTO> postaviCenu(@RequestBody PricingDTO reservationDTO) {

        Pricing pricing = new Pricing();

        pricing.setPrice(reservationDTO.getPrice());
       // pricing.setPriceForUnit(); KOJI UNIT KAD GA NEMAM U DTO

        pricing.setStartDate(reservationDTO.getStartDate());

        pricing=pricingService.save(pricing);

        return new ResponseEntity<>(new PricingDTO(pricing),HttpStatus.OK);

    }
}
