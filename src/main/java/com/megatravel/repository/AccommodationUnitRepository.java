package com.megatravel.repository;

import com.megatravel.model.AccommodationType;
import com.megatravel.model.AccommodationUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccommodationUnitRepository extends JpaRepository<AccommodationUnit,Long> {


    List<AccommodationUnit> findAllByAccommodation_Id(Long id);

    List<AccommodationUnit> findAllByAccommodation_User_Id(Long id);
}
