package com.formation.hotelmanagement.dtos.chambre_service;

import com.formation.hotelmanagement.entities.ChambreServiceID;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class ChambreServiceDTO {
    protected ChambreServiceID ids;
    protected LocalDate date;
    protected LocalTime heure;
    protected String commentaire;
}
