package com.formation.hotelmanagement.dtos.reservation;

import com.formation.hotelmanagement.dtos.chambre.ChambreMapperDTO;
import com.formation.hotelmanagement.dtos.client.ClientMapperDTO;
import com.formation.hotelmanagement.entities.ReservationEntity;

public class ReservationMapperDTO {

    public static ReservationByClientDTO convertToDTOReservationByClient(ReservationEntity reservationEntity) {
        ReservationByClientDTO reservationDTO = new ReservationByClientDTO();
        reservationDTO.setId(reservationEntity.getId());
        reservationDTO.setDateDebut(reservationEntity.getDateDebut());
        reservationDTO.setDateFin(reservationEntity.getDateFin());
        if (reservationEntity.getChambre() != null) {
            reservationDTO.setChambre(ChambreMapperDTO.convertToDTOChambre(reservationEntity.getChambre()));
        }
        return reservationDTO;
    }

    // Méthode pour convertir une entité réservation en DTO lors de l'appel du controller réservation
    public static ReservationGetClientGetChambreDTO convertToDTOReservationGetClientGetChambre(ReservationEntity reservationEntity) {
        ReservationGetClientGetChambreDTO reservationDTO = new ReservationGetClientGetChambreDTO();
        reservationDTO.setId(reservationEntity.getId());
        reservationDTO.setDateDebut(reservationEntity.getDateDebut());
        reservationDTO.setDateFin(reservationEntity.getDateFin());
        if (reservationEntity.getClient() != null) {
            reservationDTO.setClientDTO(ClientMapperDTO.convertToDTOClient(reservationEntity.getClient()));
        }
        if (reservationEntity.getChambre() != null) {
            reservationDTO.setChambre(ChambreMapperDTO.convertToDTOChambre(reservationEntity.getChambre()));
        }
        return reservationDTO;
    }

}
