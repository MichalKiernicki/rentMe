package com.rentMe.rentMe.service;

import com.rentMe.rentMe.dto.ReservationDto;
import com.rentMe.rentMe.mapper.ReservationMapper;
import com.rentMe.rentMe.model.Reservation;
import com.rentMe.rentMe.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private ReservationRepository reservationRepository;
    private ReservationMapper reservationMapper;

    public void addReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    public Optional<ReservationDto> getResrvationByUserNameAndSurName(String name, String surName){
        return reservationRepository.findByUserNameAndSurName(name,surName)
                .map(reservationMapper::mapToDto);
    }

}
