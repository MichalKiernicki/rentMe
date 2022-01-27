package com.rentMe.rentMe.controller.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rentMe.rentMe.model.Apartament;
import com.rentMe.rentMe.model.User;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AddReservationRequest {

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;
    private Double totalCost;
    private User userWithRoleOwner;
    private User userWithRoleUser;
    private Apartament apartament;


}
