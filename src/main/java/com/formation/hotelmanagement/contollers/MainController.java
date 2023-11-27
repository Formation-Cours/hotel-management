package com.formation.hotelmanagement.contollers;

import com.formation.hotelmanagement.entities.ClientEntity;
import com.formation.hotelmanagement.entities.ReservationEntity;
import com.formation.hotelmanagement.repositories.ClientRepository;
import com.formation.hotelmanagement.repositories.ReservationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MainController {

    private final ClientRepository clientRepository;
    private final ReservationRepository reservationRepository;

    public MainController(ClientRepository clientRepository, ReservationRepository reservationRepository) {
        this.clientRepository = clientRepository;
        this.reservationRepository = reservationRepository;

        ClientEntity client = new ClientEntity(null, "Michaux", "Samuel", "sam@sam.fr", "12345678", null, null, null);
        clientRepository.save(client);

        ReservationEntity res = new ReservationEntity(null, LocalDateTime.now(), LocalDateTime.now(), client, null, null, null);
        reservationRepository.save(res);
    }

    @GetMapping("/clients")
    public List<ClientEntity> getAllClients() {
        return clientRepository.findAll();
    }

    @GetMapping("/reservations")
    public List<ReservationEntity> getAllReservations() {
        return reservationRepository.findAll();
    }
}
