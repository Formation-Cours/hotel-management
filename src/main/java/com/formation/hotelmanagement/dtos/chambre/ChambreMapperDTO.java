package com.formation.hotelmanagement.dtos.chambre;

import com.formation.hotelmanagement.dtos.chambre_service.ChambreServiceByChambreDTO;
import com.formation.hotelmanagement.dtos.chambre_service.ChambreServiceMapperDTO;
import com.formation.hotelmanagement.dtos.reservation.ReservationByChambreDTO;
import com.formation.hotelmanagement.dtos.reservation.ReservationMapperDTO;
import com.formation.hotelmanagement.entities.ChambreEntity;

import java.util.List;

public class ChambreMapperDTO {

    public static ChambreDTO convertToDTOChambre(ChambreEntity chambreEntity) {
        ChambreDTO chambreDTO = new ChambreDTO();
        copyProperties(chambreEntity, chambreDTO);
        return chambreDTO;
    }

    public static ChambreAvecReservationDTO convertToDTOChambreAvecReservation(ChambreEntity chambreEntity) {
        ChambreAvecReservationDTO chambreDTO = new ChambreAvecReservationDTO();
        copyProperties(chambreEntity, chambreDTO);

        if (chambreEntity.getReservations() != null) {
            List<ReservationByChambreDTO> res = chambreEntity.getReservations()
                    .stream()
                    .map(ReservationMapperDTO::convertToDTOReservationByChambre)
                    .toList();
            chambreDTO.setReservations(res);
        }
        if (chambreEntity.getChambreServices() != null) {
            List<ChambreServiceByChambreDTO> chambreServiceDTOS = chambreEntity.getChambreServices()
                    .stream()
                    .map(ChambreServiceMapperDTO::convertToChambreServiceByChambreDTO)
                    .toList();
            chambreDTO.setServices(chambreServiceDTOS);
        }
        return chambreDTO;
    }

    private static void copyProperties(ChambreEntity chambreEntity, ChambreDTO chambreDTO) {
        chambreDTO.setId(chambreEntity.getId());
        chambreDTO.setNumero(chambreEntity.getNumero());
        chambreDTO.setType(chambreEntity.getType());
        chambreDTO.setPrixParNuit(chambreEntity.getPrixParNuit());
        chambreDTO.setDisponible(chambreEntity.getDisponible());
    }
}
