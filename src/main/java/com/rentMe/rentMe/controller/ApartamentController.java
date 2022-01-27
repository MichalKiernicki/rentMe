package com.rentMe.rentMe.controller;

import com.rentMe.rentMe.controller.request.AddApartamentRequest;
import com.rentMe.rentMe.controller.response.GetApartamentResponse;
import com.rentMe.rentMe.dto.ApartamentDto;
import com.rentMe.rentMe.service.ApartamentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/apartament")
public class ApartamentController {

    private ApartamentService apartamentService;

    public ApartamentController(ApartamentService service){
        this.apartamentService = service;
    }

    @GetMapping
    public GetApartamentResponse getApartaments() {
        List<ApartamentDto> apartamentDtos = apartamentService.getAllApartaments();
        return GetApartamentResponse.of(apartamentDtos);
    }

    @PostMapping
    public ResponseEntity<Void> addApartament(@Valid @RequestBody AddApartamentRequest request) {
        ApartamentDto apartamentDto = ApartamentDto.builder()
                .name(request.getName())
                .surface(request.getSurface())
                .price(request.getPrice())
                .description(request.getDescription())
                .apartamentstatus(request.getApartamentstatus())
                .build();
        apartamentService.addApartament(apartamentDto);
        return ResponseEntity.ok().build();
    }
}
