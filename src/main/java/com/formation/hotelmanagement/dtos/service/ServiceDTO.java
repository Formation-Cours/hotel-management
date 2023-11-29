package com.formation.hotelmanagement.dtos.service;

import lombok.Data;

@Data
public class ServiceDTO {
    protected Long id;
    protected String nom;
    protected String description;
    protected Double tarif;
}
