package com.formation.hotelmanagement.entities;

import com.formation.hotelmanagement.enums.TypeChambreEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "chambre")
@EntityListeners(AuditingEntityListener.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChambreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 4)
    private String numero;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TypeChambreEnum type;

    @Column(nullable = false, columnDefinition = "DECIMAL(10,3)")
    private Double prixParNuit;

    @Column(nullable = false)
    private Boolean disponible;

    @OneToMany(mappedBy = "chambre")
    private List<ReservationEntity> reservations;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @OneToMany(mappedBy = "chambre")
    private List<ChambreServiceEntity> chambreServices;
}
