package com.formation.hotelmanagement.contollers;

import com.formation.hotelmanagement.dtos.chambre.ChambreAvecReservationDTO;
import com.formation.hotelmanagement.dtos.chambre.ChambreMapperDTO;
import com.formation.hotelmanagement.dtos.client.ClientAvecReservationDTO;
import com.formation.hotelmanagement.dtos.client.ClientMapperDTO;
import com.formation.hotelmanagement.dtos.reservation.ReservationGetClientGetChambreDTO;
import com.formation.hotelmanagement.dtos.reservation.ReservationMapperDTO;
import com.formation.hotelmanagement.dtos.service.ServiceAvecChambreServiceByServiceDTO;
import com.formation.hotelmanagement.dtos.service.ServiceMapperDTO;
import com.formation.hotelmanagement.entities.*;
import com.formation.hotelmanagement.enums.TypeChambreEnum;
import com.formation.hotelmanagement.repositories.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MainController {

    private final ClientRepository clientRepository;
    private final ReservationRepository reservationRepository;
    private final ChambreRepository chambreRepository;
    private final ServiceRepository serviceRepository;
    private final ChambreServiceRepository chambreServiceRepository;

    public MainController(ClientRepository clientRepository, ReservationRepository reservationRepository, ChambreRepository chambreRepository, ServiceRepository serviceRepository, ChambreServiceRepository chambreServiceRepository) {
        this.clientRepository = clientRepository;
        this.reservationRepository = reservationRepository;
        this.chambreRepository = chambreRepository;
        this.serviceRepository = serviceRepository;
        this.chambreServiceRepository = chambreServiceRepository;

        ClientEntity client = new ClientEntity(null, "Michaux", "Samuel", "sam@sam.fr", "12345678", null, null, null);
        clientRepository.save(client);

        ChambreEntity chambre = new ChambreEntity(null, "101", TypeChambreEnum.LIT_KING_SIZE, 98.78, false, null, null, null, null);
        chambreRepository.save(chambre);

        ReservationEntity res = new ReservationEntity(null, LocalDateTime.now(), LocalDateTime.now(), client, chambre, null, null);
        reservationRepository.save(res);

        ServiceEntity service = new ServiceEntity(null, "Service 1", "Description du service 1", 12.99, null, null, null);
        serviceRepository.save(service);

        ChambreServiceID chambreServiceID = new ChambreServiceID();
        chambreServiceID.setChambreId(chambre.getId());
        chambreServiceID.setServiceId(service.getId());

        ChambreServiceEntity chambreService = new ChambreServiceEntity(chambreServiceID, chambre, service, LocalDate.now(), LocalTime.now(), "Commentaire du service");
        chambreServiceRepository.save(chambreService);
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
