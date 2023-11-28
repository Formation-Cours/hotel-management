package com.formation.hotelmanagement.dtos.client;

import com.formation.hotelmanagement.dtos.reservation.ReservationByClientDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ClientAvecReservationDTO extends ClientDTO {
    protected List<ReservationByClientDTO> reservations;
}
