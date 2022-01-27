package com.rentMe.rentMe.controller.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rentMe.rentMe.model.Apartament;
import com.rentMe.rentMe.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetReservationRequest {

    @Id
    private Long id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;
    private Double totalCost;
    @ManyToOne
    private User userWithRoleOwner;
    @ManyToOne
    private User userWithRoleUser;
    @ManyToOne
    private Apartament apartament;
}
