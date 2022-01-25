package com.rentMe.rentMe.controller.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddApartamentRequest {

    private String name;
    private BigDecimal price;
    private String surface;
    private String description;
    private String apartamentStatus;
}
