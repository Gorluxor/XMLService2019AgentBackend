package com.megatravel.controller;

import com.megatravel.dtos.AccommodationUnitDTO;
import com.megatravel.dtos.PricingDTO;
import com.megatravel.dtos.SearchDTO;
import com.megatravel.model.AccommodationUnit;
import com.megatravel.model.Pricing;
import com.megatravel.model.Reservation;
import com.megatravel.model.User;
import com.megatravel.service.AccommodationUnitService;
import com.megatravel.service.PricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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

    @RequestMapping(method = RequestMethod.GET, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} , produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<PricingDTO>> getAll() {
        List<Pricing> pricings = pricingService.findAll();
        List<PricingDTO> pricingDTOS = new ArrayList<>();

        for (Pricing p : pricings){
            pricingDTOS.add(new PricingDTO(p));
        }
        return new ResponseEntity<>(pricingDTOS, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} , produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<PricingDTO> getOne(@PathVariable Long id) {

        Pricing pricing = pricingService.findById(id);

        return new ResponseEntity<>(new PricingDTO(pricing), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} , produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<PricingDTO> postaviCenu(@RequestBody PricingDTO reservationDTO, @PathVariable Long id) {

        Pricing pricing = new Pricing();

        pricing.setPrice(reservationDTO.getPrice());
        AccommodationUnit unit = accommodationUnitService.findById(id);
        pricing.setPriceForUnit(unit);
        pricing.setStartDate(reservationDTO.getStartDate());
        pricing=pricingService.save(pricing);

        return new ResponseEntity<>(new PricingDTO(pricing),HttpStatus.OK);

    }
    @RequestMapping(value = "/unit/{unitId}",method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} , produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Double> getPricingForUnitForDates(@RequestBody SearchDTO searchDTO, @PathVariable(name="unitId") Long id) {

        Pricing pricing = new Pricing();

        Double price = pricingService.getPriceForDatesUnitId(id, searchDTO.getStartDate(), searchDTO.getEndDate());

        return new ResponseEntity<>(price,HttpStatus.OK );

    }

    @RequestMapping(value = "/accommodation/{accId}",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} , produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Double> getPricingForAccForDates(@RequestBody SearchDTO searchDTO, @PathVariable(name="accId") Long id) {

        Double price = pricingService.getPriceForDatesAccId(id, searchDTO.getStartDate(), searchDTO.getEndDate());

        return new ResponseEntity<>(price,HttpStatus.OK );

    }
}
