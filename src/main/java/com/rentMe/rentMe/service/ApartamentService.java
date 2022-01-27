package com.rentMe.rentMe.service;

import com.rentMe.rentMe.dto.ApartamentDto;
import com.rentMe.rentMe.mapper.ApartamentMapper;
import com.rentMe.rentMe.model.Apartament;
import com.rentMe.rentMe.repository.ApartamentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ApartamentService {

    private final ApartamentMapper apartamentMapper;
    private final ApartamentRepository apartamentRepository;

    public List<ApartamentDto> getAllApartaments() {
        return apartamentRepository.findAll()
                .stream()
                .map(apartamentMapper::mapToDto)
                .collect(Collectors.toList());
    }
    public void addApartament(ApartamentDto apartamentDto){
        Apartament apartament = apartamentMapper.mapToApartament(apartamentDto);
        apartamentRepository.save(apartament);
    }

}
