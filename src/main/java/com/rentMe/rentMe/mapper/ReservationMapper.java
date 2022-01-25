package com.rentMe.rentMe.mapper;

import com.rentMe.rentMe.dto.ReservationDto;
import com.rentMe.rentMe.model.Reservation;
import org.mapstruct.Mapper;

@Mapper(componentModel= "spring")
public interface ReservationMapper {

    ReservationDto mapToDto(Reservation reservation);

    Reservation mapToReservation(ReservationDto reservationDto);

}
