package com.megatravel.service;

import com.megatravel.dtos.AccommodationUnitDTO;
import com.megatravel.dtos.ExtraServiceDTO;
import com.megatravel.dtos.PricingDTO;
import com.megatravel.model.*;
import com.megatravel.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AccommodationUnitService {

    @Autowired
    private AccommodationUnitRepository accommodationUnitRepository;

    @Autowired
    private UnitTypeRepository unitTypeRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private AccommodationRepository accommodationRepository;

    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private ExtraServiceRepository extraServiceRepository;

    @Autowired
    private PricingRepository pricingRepository;

    public AccommodationUnit findById(Long  id){
        return accommodationUnitRepository.findById(id).get();
    }

    public List<AccommodationUnit> findAll(){
        return accommodationUnitRepository.findAll();
    }

    public AccommodationUnit save(AccommodationUnit user){
        return accommodationUnitRepository.save(user);
    }

    public void remove(Long id){accommodationUnitRepository.deleteById(id);}

    public AccommodationUnit createUnit(Long accId, AccommodationUnitDTO accommodationUnitDTO) throws ResponseStatusException {

        if (accommodationUnitDTO == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No such object in database");
        }

        AccommodationUnit unit = new AccommodationUnit(accommodationUnitDTO);
        Accommodation accommodation = accommodationRepository.getOne(accId);

        if (accommodation.getAccommodationUnit() == null){
            accommodation.setAccommodationUnit(new ArrayList<>());
        }

        if (unit.getUnitType() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No type");
        }


        UnitType unitType = unitTypeRepository.getOne(unit.getUnitType().getId());

        unit.setUnitType(unitType);

        unit.setAccommodation(accommodation);
        unit.setLastChangedDate(new Date());
        locationRepository.save(unit.getLocation());

        accommodationUnitRepository.save(unit);

        for (Image image : unit.getImages()){
            image.setBelongsToAccommodationUnit(unit); // rest set in new AccommodationUnit
            imageRepository.save(image);
        }

        List<ExtraService> list = new ArrayList<>();
        if (accommodationUnitDTO.getExtraServiceDTO() != null){
            for (ExtraServiceDTO serviceDTO : accommodationUnitDTO.getExtraServiceDTO()){
                ExtraService extraService = extraServiceRepository.getOne(serviceDTO.getId());
                list.add(extraService);
            }
        }

        unit.setPricing(new ArrayList<>());
        if (accommodationUnitDTO.getPricingDTO() != null){
            for (PricingDTO p : accommodationUnitDTO.getPricingDTO() ){
                Pricing dbPrice = new Pricing(p);
                dbPrice.setLastChangedDate(new Date());
                pricingRepository.save(dbPrice);
                unit.getPricing().add(dbPrice);
            }
        }

        unit.setExtraService(list);
        accommodation.getAccommodationUnit().add(unit);

        return unit;
    }
}
