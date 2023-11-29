package com.formation.hotelmanagement.dtos.chambre_service;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class ChambreServiceDTO {
    protected LocalDate date;
    protected LocalTime heure;
    protected String commentaire;
}
