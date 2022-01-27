package com.rentMe.rentMe.controller.request;

import lombok.Data;

@Data
public class AddApartamentRequest {

    private String name;
    private Double price;
    private String surface;
    private String description;
    private String apartamentstatus;
}
