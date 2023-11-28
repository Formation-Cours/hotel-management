package com.formation.hotelmanagement.repositories;

import com.formation.hotelmanagement.entities.ChambreServiceEntity;
import com.formation.hotelmanagement.entities.ChambreServiceID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreServiceRepository extends JpaRepository<ChambreServiceEntity, ChambreServiceID> {
}
