package com.rentMe.rentMe.controller;

import com.rentMe.rentMe.controller.request.AddReservationRequest;
import com.rentMe.rentMe.controller.request.EditReservationRequest;
import com.rentMe.rentMe.controller.response.GetReservationResponse;
import com.rentMe.rentMe.dto.ApartamentDto;
import com.rentMe.rentMe.dto.ReservationDto;
import com.rentMe.rentMe.model.Reservation;
import com.rentMe.rentMe.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/reservation")
public class ReservationController {


    private ReservationService reservationService;


    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public GetReservationResponse getReservations() {
        List<ReservationDto> reservationDtos = reservationService.getAllReservations();
        return GetReservationResponse.of(reservationDtos);
    }

    @PostMapping
    public ResponseEntity<Void> addReservations(@Valid @RequestBody AddReservationRequest request){
        ReservationDto reservationDto = ReservationDto.builder()
                .startDate(request.getStartDate())
                .endDate(request.getEndDate())
                .totalCost(request.getTotalCost())
                .userWhitRoleOwner(request.getUserWithRoleOwner())
                .userWhitRoleUser(request.getUserWithRoleUser())
                .apartament(request.getApartament())
                .build();
        reservationService.addReservation(reservationDto);
        return ResponseEntity.ok().build();
    }

//    @PutMapping("/{reservationId}")
//    public void changeReservationDetails(@PathVariable Long reservationId, EditReservationRequest request){
//        reservationService.changeReservationDetails(reservationId, request.getReservationDto());
//    }
//
//    @GetMapping("/{surname}")
//    public GetReservationResponse getReservationsByUserNAme(@PathVariable String surname){
//        Optional<Reservation> reservation = reservationService.getByUserSurname(surname);
//        return GetReservationResponse.of((List<ReservationDto>) reservation.get());
//    }

//    @GetMapping
//    public GetReservationResponse getReservationByApartament(@PathVariable Long id){
//        Optional<ReservationDto> reservation = reservationService.getReservationsByApartament(id);
//        return GetReservationResponse.of(reservation.);
//    }

}
