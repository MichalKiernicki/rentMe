package com.rentMe.rentMe.repository;

import com.rentMe.rentMe.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

//    Optional<Reservation> findByUserSurname(String name);
//    Optional<Reservation> findByApartamentId(Long id);
}
