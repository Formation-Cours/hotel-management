package com.formation.hotelmanagement.repositories;

import com.formation.hotelmanagement.entities.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServiceEntity, Long> {
}
