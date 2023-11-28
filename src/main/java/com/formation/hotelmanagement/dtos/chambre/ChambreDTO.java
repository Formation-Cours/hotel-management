package com.formation.hotelmanagement.dtos.chambre;

import com.formation.hotelmanagement.enums.TypeChambreEnum;
import lombok.Data;

@Data
public class ChambreDTO {
    protected Long id;
    protected String numero;
    protected TypeChambreEnum type;
    protected Double prixParNuit;
    protected Boolean disponible;
}
