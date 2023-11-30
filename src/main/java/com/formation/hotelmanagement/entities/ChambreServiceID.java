package com.formation.hotelmanagement.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Embeddable
@Data
public class ChambreServiceID implements Serializable {
    private Long chambreId;

    private Long serviceId;

    private LocalDate date;

    private LocalTime heure;
}
