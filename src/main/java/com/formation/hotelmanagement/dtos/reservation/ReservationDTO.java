package com.formation.hotelmanagement.dtos.reservation;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReservationDTO {
    protected Long id;
    protected LocalDateTime dateDebut;
    protected LocalDateTime dateFin;
}
