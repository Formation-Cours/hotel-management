package com.formation.hotelmanagement.dtos.chambre;

import com.formation.hotelmanagement.dtos.chambre_service.ChambreServiceByChambreDTO;
import com.formation.hotelmanagement.dtos.reservation.ReservationByChambreDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ChambreAvecReservationDTO extends ChambreDTO {
    private List<ReservationByChambreDTO> reservations;
    private List<ChambreServiceByChambreDTO> services;
}
