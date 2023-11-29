package com.formation.hotelmanagement.dtos.service;

import com.formation.hotelmanagement.dtos.chambre_service.ChambreServiceByServiceDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ServiceAvecChambreServiceByServiceDTO extends ServiceDTO {
    private List<ChambreServiceByServiceDTO> chambresServices;
}
