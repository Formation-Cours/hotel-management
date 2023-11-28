package com.formation.hotelmanagement.dtos.reservation;

import com.formation.hotelmanagement.dtos.chambre.ChambreDTO;
import com.formation.hotelmanagement.entities.ChambreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
// Classe appelée par le controller client pour afficher les réservations d'un client
public class ReservationByClientDTO extends ReservationDTO {
    private ChambreDTO chambre;
}
