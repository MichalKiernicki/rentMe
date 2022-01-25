package com.rentMe.rentMe.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApartamentDto {

    private Long Id;
    private String name;
    private BigDecimal price;
    private String surface;
    private String description;
    private String apartamentStatus;

}
