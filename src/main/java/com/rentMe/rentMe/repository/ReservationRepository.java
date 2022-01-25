package com.rentMe.rentMe.repository;

import com.rentMe.rentMe.model.Reservation;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    Optional<Reservation> findByUserNameAndSurName(String name, String surName);

    Optional<Reservation> findByApartamentId(Long id);
}
