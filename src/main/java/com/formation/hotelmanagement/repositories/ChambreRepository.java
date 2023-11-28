package com.formation.hotelmanagement.repositories;

import com.formation.hotelmanagement.entities.ChambreEntity;
import com.formation.hotelmanagement.entities.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreRepository extends JpaRepository<ChambreEntity, Long> {
}
