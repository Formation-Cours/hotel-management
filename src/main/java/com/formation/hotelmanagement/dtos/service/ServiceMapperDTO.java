package com.formation.hotelmanagement.dtos.service;

import com.formation.hotelmanagement.dtos.chambre_service.ChambreServiceMapperDTO;
import com.formation.hotelmanagement.entities.ServiceEntity;

public class ServiceMapperDTO {

    public static ServiceAvecChambreServiceByServiceDTO convertToServiceAvecChambreServiceByServiceDTO(ServiceEntity serviceEntity) {
        ServiceAvecChambreServiceByServiceDTO serviceAvecChambreServiceByServiceDTO = new ServiceAvecChambreServiceByServiceDTO();
        serviceAvecChambreServiceByServiceDTO.setId(serviceEntity.getId());
        serviceAvecChambreServiceByServiceDTO.setNom(serviceEntity.getNom());
        serviceAvecChambreServiceByServiceDTO.setDescription(serviceEntity.getDescription());
        serviceAvecChambreServiceByServiceDTO.setTarif(serviceEntity.getTarif());

        if (serviceEntity.getChambreServices() != null) {
            serviceAvecChambreServiceByServiceDTO.setChambreServices(
                    serviceEntity.getChambreServices()
                            .stream()
                            .map(ChambreServiceMapperDTO::convertToChambreServiceByServiceDTO)
                            .toList()
            );
        }

        return serviceAvecChambreServiceByServiceDTO;
    }

    public static ServiceDTO convertToServiceDTOByChambreDTO(ServiceEntity service) {
        ServiceDTO serviceDTO = new ServiceDTO();
        serviceDTO.setId(service.getId());
        serviceDTO.setNom(service.getNom());
        serviceDTO.setDescription(service.getDescription());
        serviceDTO.setTarif(service.getTarif());

        return serviceDTO;
    }
}
