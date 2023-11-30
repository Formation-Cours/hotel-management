package com.formation.hotelmanagement.dtos.chambre_service;

import com.formation.hotelmanagement.dtos.chambre.ChambreMapperDTO;
import com.formation.hotelmanagement.dtos.service.ServiceMapperDTO;
import com.formation.hotelmanagement.entities.ChambreServiceEntity;

public class ChambreServiceMapperDTO {
    // créer une méthode qui retourne un ChambreServiceByServiceDTO à partir d'un ChambreServiceEntity
    public static ChambreServiceByServiceDTO convertToChambreServiceByServiceDTO(ChambreServiceEntity chambreServiceEntity) {
        ChambreServiceByServiceDTO chambreServiceByServiceDTO = new ChambreServiceByServiceDTO();
        chambreServiceByServiceDTO.setDate(chambreServiceEntity.getId().getDate());
        chambreServiceByServiceDTO.setHeure(chambreServiceEntity.getId().getHeure());
        chambreServiceByServiceDTO.setCommentaire(chambreServiceEntity.getCommentaire());

        chambreServiceByServiceDTO.setChambre(ChambreMapperDTO.convertToDTOChambre(chambreServiceEntity.getChambre()));

        return chambreServiceByServiceDTO;
    }

    // créer une méthode qui retourne un ChambreServiceByChambreDTO à partir d'un ChambreServiceEntity
    public static ChambreServiceByChambreDTO convertToChambreServiceByChambreDTO(ChambreServiceEntity chambreServiceEntity) {
        ChambreServiceByChambreDTO chambreServiceByChambreDTO = new ChambreServiceByChambreDTO();
        chambreServiceByChambreDTO.setDate(chambreServiceEntity.getId().getDate());
        chambreServiceByChambreDTO.setHeure(chambreServiceEntity.getId().getHeure());
        chambreServiceByChambreDTO.setCommentaire(chambreServiceEntity.getCommentaire());

        chambreServiceByChambreDTO.setService(ServiceMapperDTO.convertToServiceDTOByChambreDTO(chambreServiceEntity.getService()));

        return chambreServiceByChambreDTO;
    }
}
