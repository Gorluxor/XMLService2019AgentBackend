package com.megatravel.repository;

import com.megatravel.model.AccommodationType;
import com.megatravel.model.AccommodationUnit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccommodationUnitRepository extends JpaRepository<AccommodationUnit,Long> {
}
