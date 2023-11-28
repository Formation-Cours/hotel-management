package com.formation.hotelmanagement.dtos;

import com.formation.hotelmanagement.entities.ChambreEntity;
import com.formation.hotelmanagement.entities.ClientEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservationByClientDTO {
    private Long id;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private ChambreEntity chambre;
}
