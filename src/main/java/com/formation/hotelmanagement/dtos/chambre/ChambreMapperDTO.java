package com.formation.hotelmanagement.dtos.chambre;

import com.formation.hotelmanagement.entities.ChambreEntity;

public class ChambreMapperDTO {

    public static ChambreDTO convertToDTOChambre(ChambreEntity chambreEntity) {
        ChambreDTO chambreDTO = new ChambreDTO();
        chambreDTO.setId(chambreEntity.getId());
        chambreDTO.setNumero(chambreEntity.getNumero());
        chambreDTO.setType(chambreEntity.getType());
        chambreDTO.setPrixParNuit(chambreEntity.getPrixParNuit());
        chambreDTO.setDisponible(chambreEntity.getDisponible());
        return chambreDTO;
    }

}
