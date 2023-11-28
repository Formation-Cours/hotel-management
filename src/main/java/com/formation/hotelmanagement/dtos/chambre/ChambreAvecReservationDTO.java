package com.formation.hotelmanagement.dtos.chambre;

import com.formation.hotelmanagement.dtos.reservation.ReservationByChambreDTO;
import com.formation.hotelmanagement.enums.TypeChambreEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ChambreAvecReservationDTO extends ChambreDTO {
    private List<ReservationByChambreDTO> reservations;
}
