package com.formation.hotelmanagement.dtos.client;

import com.formation.hotelmanagement.dtos.reservation.ReservationByClientDTO;
import com.formation.hotelmanagement.dtos.reservation.ReservationMapperDTO;
import com.formation.hotelmanagement.entities.ClientEntity;
import org.springframework.stereotype.Component;

import java.util.List;

public class ClientMapperDTO {

    public static ClientDTO convertToDTOClient(ClientEntity clientEntity) {
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setId(clientEntity.getId());
        clientDTO.setNom(clientEntity.getNom());
        clientDTO.setPrenom(clientEntity.getPrenom());
        clientDTO.setEmail(clientEntity.getEmail());
        clientDTO.setTelephone(clientEntity.getTelephone());
        return clientDTO;
    }

    public static ClientAvecReservationDTO convertToDTOClientWithReservation(ClientEntity clientEntity) {
        ClientAvecReservationDTO clientDTO = new ClientAvecReservationDTO();
        clientDTO.setId(clientEntity.getId());
        clientDTO.setNom(clientEntity.getNom());
        clientDTO.setPrenom(clientEntity.getPrenom());
        clientDTO.setEmail(clientEntity.getEmail());
        clientDTO.setTelephone(clientEntity.getTelephone());
        if (clientEntity.getReservations() != null) {
            List<ReservationByClientDTO> res = clientEntity.getReservations()
                    .stream()
                    .map(ReservationMapperDTO::convertToDTOReservationByClient)
                            .toList();
            clientDTO.setReservations(res);
        }
        return clientDTO;
    }
}
