package com.megatravel.repository;

import com.megatravel.model.Pricing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PricingRepository extends JpaRepository<Pricing,Long> {
}
