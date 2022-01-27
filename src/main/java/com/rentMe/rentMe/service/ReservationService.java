package com.rentMe.rentMe.service;

import com.rentMe.rentMe.dto.ReservationDto;
import com.rentMe.rentMe.mapper.ReservationMapper;
import com.rentMe.rentMe.model.Apartament;
import com.rentMe.rentMe.model.Reservation;
import com.rentMe.rentMe.model.User;
import com.rentMe.rentMe.repository.ApartamentRepository;
import com.rentMe.rentMe.repository.ReservationRepository;
import com.rentMe.rentMe.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final UserRepository userRepository;
    private final ApartamentRepository apartamentRepository;
    private final ReservationMapper reservationMapper;
    private final ReservationRepository reservationRepository;

    public void addReservation(ReservationDto reservationDto){
        Reservation reservation = reservationMapper.mapToReservation(reservationDto);
        reservationRepository.save(reservation);
    }

    public List<ReservationDto> getAllReservations() {
        return reservationRepository.findAll()
                .stream()
                .map(reservationMapper::mapToDto)
                .collect(Collectors.toList());
    }

//    public Optional getReservationsByApartament(Long id) {
//        Optional<Apartament> apartament = apartamentRepository.findById(id);
//        return reservationRepository.findByApartamentId(apartament.get().getId());
//    }

    public void changeReservationDetails(Long reservationId, ReservationDto reservationDto){
        Reservation reservation = reservationRepository.getById(reservationId);
        reservation.setApartament(reservationDto.getApartament());
        reservation.setStartDate(reservationDto.getStartDate());
        reservation.setEndDate(reservationDto.getEndDate());
        reservation.setTotalCost(reservationDto.getTotalCost());
        reservation.setUserWithRoleUser(reservationDto.getUserWhitRoleUser());
        reservation.setUserWithRoleOwner(reservationDto.getUserWhitRoleOwner());
        reservationRepository.save(reservation);

    }

//    public Optional<Reservation> getByUserSurname(String surname){
//        Optional<User> user = userRepository.findBySurname(surname);
//        return reservationRepository.findByUserSurname(user.get().getSurname());
//    }
}
