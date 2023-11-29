package com.formation.hotelmanagement.dtos.chambre_service;

import com.formation.hotelmanagement.dtos.service.ServiceDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ChambreServiceByChambreDTO extends ChambreServiceDTO {
    private ServiceDTO service;
}
