package com.rentMe.rentMe.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDto {

    private Long id;
    private LocalDate startDate;
    private LocalDate stopDate;
    private BigDecimal totalCost;
    private Long userId;
    private Long apartamentId;
}
