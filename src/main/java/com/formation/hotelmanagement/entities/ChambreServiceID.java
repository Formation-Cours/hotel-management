package com.formation.hotelmanagement.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class ChambreServiceID implements Serializable {
    private Long chambreId;

    private Long serviceId;
}
