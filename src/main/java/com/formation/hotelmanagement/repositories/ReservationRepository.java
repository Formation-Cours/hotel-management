package com.formation.hotelmanagement.repositories;

import com.formation.hotelmanagement.entities.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {
}
