package com.megatravel.repository;

import com.megatravel.model.ExtraService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ExtraService,Long> {
}
