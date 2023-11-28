package com.formation.hotelmanagement.dtos.reservation;

import com.formation.hotelmanagement.dtos.chambre.ChambreDTO;
import com.formation.hotelmanagement.dtos.client.ClientDTO;
import com.formation.hotelmanagement.entities.ChambreEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservationGetClientGetChambreDTO extends ReservationDTO {
    private ClientDTO clientDTO;
    private ChambreDTO chambre;
}
