package com.formation.hotelmanagement.dtos.chambre_service;

import com.formation.hotelmanagement.dtos.chambre.ChambreDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ChambreServiceByServiceDTO extends ChambreServiceDTO {
    private ChambreDTO chambre;
}
