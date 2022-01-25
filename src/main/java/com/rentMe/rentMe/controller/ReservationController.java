package com.rentMe.rentMe.controller;

import com.rentMe.rentMe.model.Reservation;
import com.rentMe.rentMe.service.ReservationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ReservationController {

    private ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public Reservation getReservationsByNAmeAndSurName(){
        return reservationService.getResrvationByUserNameAndSurName();
    }


}
