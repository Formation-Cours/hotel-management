package com.formation.hotelmanagement.dtos.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {
    protected Long id;
    protected String nom;
    protected String prenom;
    protected String email;
    protected String telephone;
}
