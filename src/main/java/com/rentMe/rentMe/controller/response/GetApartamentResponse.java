package com.rentMe.rentMe.controller.response;

import com.rentMe.rentMe.dto.ApartamentDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class GetApartamentResponse {

    private List<ApartamentDto> apartamentDtos;
}
