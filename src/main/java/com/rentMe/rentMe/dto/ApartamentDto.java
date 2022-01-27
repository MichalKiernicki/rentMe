package com.rentMe.rentMe.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApartamentDto {

    private Long id;
    private String name;
    private Double price;
    private String surface;
    private String description;
    private String apartamentstatus;

}
