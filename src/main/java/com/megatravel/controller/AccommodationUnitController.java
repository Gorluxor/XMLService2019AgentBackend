package com.megatravel.controller;

import com.megatravel.dtos.*;
import com.megatravel.model.*;
import com.megatravel.service.AccommodationService;
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
@RequestMapping("/accommodationUnit")
public class AccommodationUnitController {


    @Autowired
    private ReservationService reservationService;

    @Autowired
    private AccommodationUnitService accommodationUnitService;

    @Autowired
    private AccommodationService accommodationService;

    @RequestMapping(method = RequestMethod.GET, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} , produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<AccommodationUnitDTO>> getAllAccommodationUnits() {
        List<AccommodationUnit> accommodations = accommodationUnitService.findAll();
        if(accommodations.isEmpty())
        {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        List<AccommodationUnitDTO> accommodationUnitDTOS = new ArrayList<>();

        for (AccommodationUnit au : accommodations){
            accommodationUnitDTOS.add(new AccommodationUnitDTO(au));
        }
        return new ResponseEntity<>(accommodationUnitDTOS, HttpStatus.OK);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} , produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<AccommodationUnitDTO> getAccommodationUnit(@PathVariable Long id) {
        AccommodationUnit au = accommodationUnitService.findById(id);

        if (au==null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(new AccommodationUnitDTO(au),HttpStatus.OK);

    }


//    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
//    public ResponseEntity<AccommodationUnitDTO> saveAccommodationUnit(@RequestBody AccommodationUnitDTO accommodationDTO) {
//
//        AccommodationUnit accommodation = new AccommodationUnit();
//
//        accommodation.setCapacity(accommodationDTO.getCapacity());
//        accommodation.setNameOfUnit(accommodationDTO.getNameOfUnit());
//
//
//        List<Pricing>  unit = new ArrayList<>();
//        for(PricingDTO e:accommodationDTO.getPricingDTO())
//        {
//            unit.add(new Pricing(e));
//        }
//
//        accommodation.setPricing(unit);
//
//        accommodation.setSize(accommodationDTO.getSize());
//        accommodation.setUnitType(new UnitType(accommodationDTO.getUnitTypeDTO()));
//
//        List<Service>  service = new ArrayList<>();
//        for(ServiceDTO e:accommodationDTO.getServiceDTO())
//        {
//            service.add(new Service(e));
//        }
//
//        accommodation.setService(service);
//
//        //accomodation????????????????????
//
//        accommodation = accommodationUnitService.save(accommodation);
//
//        return new ResponseEntity<>(new AccommodationUnitDTO(accommodation),HttpStatus.OK);
//    }

    @RequestMapping(value = "/createUnit/{id}",method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<AccommodationUnitDTO> createUnit(@PathVariable("id") Long id, @RequestBody AccommodationUnitDTO accommodationUnitDTO){

        AccommodationUnit accommodationUnit = accommodationUnitService.createUnit(id,accommodationUnitDTO);
        AccommodationUnitDTO accommodationUnitDTO1 = new AccommodationUnitDTO(accommodationUnit);
        return new ResponseEntity<>(accommodationUnitDTO1, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} , produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<AccommodationUnitDTO> updateAccommodationUnit(@RequestBody AccommodationUnitDTO accommodationDTO) {
        return null;

    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} , produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Void> deleteAccommodationUnit(@PathVariable Long id) {
        return new ResponseEntity<>(HttpStatus.OK);


    }

}
