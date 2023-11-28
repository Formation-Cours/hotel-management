package com.formation.hotelmanagement.dtos.reservation;

import com.formation.hotelmanagement.dtos.client.ClientDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ReservationByChambreDTO extends ReservationDTO {
    private ClientDTO clientDTO;
}
