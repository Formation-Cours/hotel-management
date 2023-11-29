package com.formation.hotelmanagement.dtos.chambre;

import com.formation.hotelmanagement.dtos.reservation.ReservationByChambreDTO;
import com.formation.hotelmanagement.dtos.reservation.ReservationMapperDTO;
import com.formation.hotelmanagement.entities.ChambreEntity;

import java.util.List;

public class ChambreMapperDTO {

    public static ChambreDTO convertToDTOChambre(ChambreEntity chambreEntity) {
        ChambreDTO chambreDTO = new ChambreDTO();
        chambreDTO.setId(chambreEntity.getId());
        chambreDTO.setNumero(chambreEntity.getNumero());
        chambreDTO.setType(chambreEntity.getType());
        chambreDTO.setPrixParNuit(chambreEntity.getPrixParNuit());
        chambreDTO.setDisponible(chambreEntity.getDisponible());
        return chambreDTO;
    }

    public static ChambreAvecReservationDTO convertToDTOChambreAvecReservation(ChambreEntity chambreEntity) {
        ChambreAvecReservationDTO chambreDTO = new ChambreAvecReservationDTO();
        chambreDTO.setId(chambreEntity.getId());
        chambreDTO.setNumero(chambreEntity.getNumero());
        chambreDTO.setType(chambreEntity.getType());
        chambreDTO.setPrixParNuit(chambreEntity.getPrixParNuit());
        chambreDTO.setDisponible(chambreEntity.getDisponible());

        if (chambreEntity.getReservations() != null) {
            List<ReservationByChambreDTO> res = chambreEntity.getReservations()
                    .stream()
                    .map(ReservationMapperDTO::convertToDTOReservationByChambre)
                    .toList();
            chambreDTO.setReservations(res);
        }
        // TODO: faire le mapper du chambreService avant d'implémenter la liste
        return chambreDTO;
    }
}
