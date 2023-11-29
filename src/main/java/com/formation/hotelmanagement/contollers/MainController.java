package com.formation.hotelmanagement.contollers;

import com.formation.hotelmanagement.dtos.chambre.ChambreAvecReservationDTO;
import com.formation.hotelmanagement.dtos.chambre.ChambreMapperDTO;
import com.formation.hotelmanagement.dtos.client.ClientAvecReservationDTO;
import com.formation.hotelmanagement.dtos.client.ClientMapperDTO;
import com.formation.hotelmanagement.dtos.reservation.ReservationGetClientGetChambreDTO;
import com.formation.hotelmanagement.dtos.reservation.ReservationMapperDTO;
import com.formation.hotelmanagement.dtos.service.ServiceAvecChambreServiceByServiceDTO;
import com.formation.hotelmanagement.dtos.service.ServiceMapperDTO;
import com.formation.hotelmanagement.repositories.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MainController {

    private final ClientRepository clientRepository;
    private final ReservationRepository reservationRepository;
    private final ChambreRepository chambreRepository;
    private final ServiceRepository serviceRepository;

    public MainController(ClientRepository clientRepository, ReservationRepository reservationRepository, ChambreRepository chambreRepository, ServiceRepository serviceRepository, ChambreServiceRepository chambreServiceRepository) {
        this.clientRepository = clientRepository;
        this.reservationRepository = reservationRepository;
        this.chambreRepository = chambreRepository;
        this.serviceRepository = serviceRepository;
    }

    @GetMapping("/clients")
    public List<ClientAvecReservationDTO> getAllClients() {
        return clientRepository.findAll()
                .stream()
                .map(ClientMapperDTO::convertToDTOClientWithReservation)
                .toList();
    }

    @GetMapping("/reservations")
    public List<ReservationGetClientGetChambreDTO> getAllReservations() {
        return reservationRepository.findAll()
                .stream()
                .map(ReservationMapperDTO::convertToDTOReservationGetClientGetChambre)
                .toList();
    }

    @GetMapping("/chambres")
    public List<ChambreAvecReservationDTO> getAllChambres() {
        return chambreRepository.findAll()
                .stream()
                .map(ChambreMapperDTO::convertToDTOChambreAvecReservation)
                .toList();
    }

    @GetMapping("/services")
    public List<ServiceAvecChambreServiceByServiceDTO> getAllServices() {
        return serviceRepository.findAll()
                .stream()
                .map(ServiceMapperDTO::convertToServiceAvecChambreServiceByServiceDTO)
                .toList();
    }
}
