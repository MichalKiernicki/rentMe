package com.rentMe.rentMe.dto;

import com.rentMe.rentMe.model.Apartament;
import com.rentMe.rentMe.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDto {

    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double totalCost;
    private User userWhitRoleOwner;
    private User userWhitRoleUser;
    private Apartament apartament;
}
