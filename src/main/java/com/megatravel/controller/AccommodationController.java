package com.megatravel.controller;




import com.megatravel.dtos.*;
import com.megatravel.model.*;
import com.megatravel.service.AccommodationService;
import com.megatravel.service.MessageService;
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
        List<AccommodationDTO> accommodationDTOS = new ArrayList<>();

        if(accommodations.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        for (Accommodation acc : accommodations){
            accommodationDTOS.add(new AccommodationDTO(acc));
        }
        return new ResponseEntity<>(accommodationDTOS,HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<AccommodationDTO> getAccommodation(@PathVariable Long id) {
        Accommodation acc = accomodationService.findById(id);

        if (acc==null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(new AccommodationDTO(acc),HttpStatus.OK);

    }

//    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
//    public ResponseEntity<AccommodationDTO> saveAccommodation(@RequestBody AccommodationDTO accommodationDTO) {
//
//        Accommodation accommodation = new Accommodation();
//        accommodation.setAccommodationType(new AccommodationType(accommodationDTO.getAccommodationTypeDTO()));
//        List<AccommodationUnit>  unit = new ArrayList<>();
//        for(AccommodationUnitDTO e:accommodationDTO.getAccommodationUnitDTO())
//        {
//            unit.add(new AccommodationUnit(e));
//        }
//
//        accommodation.setAccommodationUnit(unit);
//        accommodation.setAccommodationType(new AccommodationType(accommodationDTO.getAccommodationTypeDTO()));
//        //accommodation.setCancelationDays(accommodationDTO.getC); TODO FIX
//        accommodation.setDescription(accommodationDTO.getDescription());
//
//        List<Image> images = new ArrayList<>();
//
////        for(ImageDTO e: accommodationDTO.getImageDTO())
////        {
////            images.add(new Image(e));
////        } TODO FIX
//
//
//       // accommodation.setImage(images);
//
//        accommodation.setLocation(new Location(accommodationDTO.getLocationDTO()));
//
//        accommodation.setName(accommodationDTO.getName());
//        accommodation.setUser(new User(accommodationDTO.getUserDTO()));
//
//        List<ExtraService> services = new ArrayList<>();
//
//        for(Object e: accommodationDTO.getExtraServiceDTO())
//        {
//            services.add(new ExtraService( (ExtraServiceDTO) e)); //TODO Fix
//        }
//
//        accommodation.setExtraService(services);
//
//        accommodation = accomodationService.save(accommodation);
//
//        return new ResponseEntity<>(ToDTO.toAccommodationUnitDTO(accommodation),HttpStatus.OK);
//    }


    @RequestMapping(value="/create", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<AccommodationDTO> createAccommodation(@RequestBody AccommodationDTO accommodationDTO){
        accomodationService.createAccommodation(accommodationDTO);
        return new ResponseEntity<>(accommodationDTO, HttpStatus.CREATED);
    }


    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
    public ResponseEntity<AccommodationDTO> updateAccommodation(@RequestBody AccommodationDTO accommodationDTO) {
        return null;

    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteAccommodation(@PathVariable Long id) {
        accomodationService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);


    }
/*
    proveri da li je zauzeto
    repository, unit, type, image location,
    accodomationUnit Controller
    pricing controller da cennu jedinicu
    sve poruke od korisnika



 */
}