package com.rentMe.rentMe.mapper;

import com.rentMe.rentMe.dto.ApartamentDto;
import com.rentMe.rentMe.model.Apartament;
import org.mapstruct.Mapper;

@Mapper(componentModel= "spring")
public interface ApartamentMapper {

    ApartamentDto mapToDto(Apartament apartament);

    Apartament mapToApartament(ApartamentDto apartamentDto);

}
