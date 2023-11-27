package com.formation.hotelmanagement.repositories;

import com.formation.hotelmanagement.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
}
