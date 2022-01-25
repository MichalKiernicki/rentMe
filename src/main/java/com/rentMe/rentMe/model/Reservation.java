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
@Table(name = "Reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "startDate")
    private LocalDate startDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "stopDate")
    private LocalDate stopDate;

    @Column(name = "totalCost")
    private BigDecimal totalCost;

    @ManyToOne
    private User user;

    @ManyToOne
    private Apartament apartament;


}