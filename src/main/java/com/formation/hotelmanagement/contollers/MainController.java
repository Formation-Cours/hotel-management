package com.formation.hotelmanagement.contollers;

import com.formation.hotelmanagement.dtos.chambre.ChambreAvecReservationDTO;
import com.formation.hotelmanagement.dtos.chambre.ChambreMapperDTO;
import com.formation.hotelmanagement.dtos.client.ClientAvecReservationDTO;
import com.formation.hotelmanagement.dtos.client.ClientMapperDTO;
import com.formation.hotelmanagement.dtos.reservation.ReservationGetClientGetChambreDTO;
import com.formation.hotelmanagement.dtos.reservation.ReservationMapperDTO;
import com.formation.hotelmanagement.dtos.service.ServiceAvecChambreServiceByServiceDTO;
import com.formation.hotelmanagement.dtos.service.ServiceMapperDTO;
import com.formation.hotelmanagement.entities.ChambreEntity;
import com.formation.hotelmanagement.entities.ClientEntity;
import com.formation.hotelmanagement.entities.ReservationEntity;
import com.formation.hotelmanagement.repositories.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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
    public Page<ClientAvecReservationDTO> getAllClients(Pageable pageable) {
        return clientRepository.findAll(pageable)
                .map(ClientMapperDTO::convertToDTOClientWithReservation);
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

    @PostMapping("/reservations")
    @Transactional
    public ReservationGetClientGetChambreDTO createReservation(@RequestBody ReservationGetClientGetChambreDTO reservationGetClientGetChambreDTO) {
        ReservationEntity reservationEntity = new ReservationEntity();
        reservationEntity.setDateDebut(reservationGetClientGetChambreDTO.getDateDebut());
        reservationEntity.setDateFin(reservationGetClientGetChambreDTO.getDateFin());

        ClientEntity client = new ClientEntity();
        client.setNom(reservationGetClientGetChambreDTO.getClientDTO().getNom());
        client.setPrenom(reservationGetClientGetChambreDTO.getClientDTO().getPrenom());
        client.setId(reservationGetClientGetChambreDTO.getClientDTO().getId());
        client.setEmail(reservationGetClientGetChambreDTO.getClientDTO().getEmail());
        client.setTelephone(reservationGetClientGetChambreDTO.getClientDTO().getTelephone());

        ChambreEntity chambre = new ChambreEntity();
        chambre.setNumero(reservationGetClientGetChambreDTO.getChambre().getNumero());
        chambre.setDisponible(reservationGetClientGetChambreDTO.getChambre().getDisponible());
        chambre.setId(reservationGetClientGetChambreDTO.getChambre().getId());
        chambre.setPrixParNuit(reservationGetClientGetChambreDTO.getChambre().getPrixParNuit());
        chambre.setType(reservationGetClientGetChambreDTO.getChambre().getType());

        reservationEntity.setClient(client);
        reservationEntity.setChambre(chambre);

        System.out.println(reservationEntity);

//        clientRepository.save(client);
//        chambreRepository.save(chambre);
        reservationRepository.save(reservationEntity);

        return ReservationMapperDTO.convertToDTOReservationGetClientGetChambre(reservationEntity);
    }
}
