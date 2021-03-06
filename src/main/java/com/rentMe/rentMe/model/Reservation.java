package com.rentMe.rentMe.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    private LocalDate endDate;

    private Double totalCost;

    @ManyToOne
    private User userWithRoleOwner;

    @ManyToOne
    private User userWithRoleUser;

    @ManyToOne
    private Apartament apartament;

}