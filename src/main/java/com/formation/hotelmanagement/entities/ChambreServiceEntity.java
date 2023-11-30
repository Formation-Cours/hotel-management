package com.formation.hotelmanagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "chambre_service")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChambreServiceEntity {
    @EmbeddedId
    private ChambreServiceID id;

    @ManyToOne
    @MapsId("chambreId")
    private ChambreEntity chambre;

    @ManyToOne
    @MapsId("serviceId")
    private ServiceEntity service;

    @Column(columnDefinition = "TEXT")
    private String commentaire;
}
