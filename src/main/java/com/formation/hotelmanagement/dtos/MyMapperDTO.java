package com.formation.hotelmanagement.dtos;

import com.formation.hotelmanagement.entities.ClientEntity;
import com.formation.hotelmanagement.entities.ReservationEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyMapperDTO {
    public ClientDTO convertToDTOClient(ClientEntity clientEntity) {
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setId(clientEntity.getId());
        clientDTO.setNom(clientEntity.getNom());
        clientDTO.setPrenom(clientEntity.getPrenom());
        clientDTO.setEmail(clientEntity.getEmail());
        clientDTO.setTelephone(clientEntity.getTelephone());
        if (clientEntity.getReservations() != null) {
            List<ReservationByClientDTO> reservation = clientEntity.getReservations()
                    .stream()
                    .map(this::convertToDTOReservationByClient)
                    .toList();

            clientDTO.setReservations(reservation);
        }
        return clientDTO;
    }

    public ReservationByClientDTO convertToDTOReservationByClient(ReservationEntity reservationEntity) {
        ReservationByClientDTO reservationDTO = new ReservationByClientDTO();
        reservationDTO.setId(reservationEntity.getId());
        reservationDTO.setDateDebut(reservationEntity.getDateDebut());
        reservationDTO.setDateFin(reservationEntity.getDateFin());
        // TODO: set chambre
        return reservationDTO;
    }
}
