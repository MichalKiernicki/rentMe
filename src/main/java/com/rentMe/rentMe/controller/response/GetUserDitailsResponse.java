package com.rentMe.rentMe.controller.response;

import com.rentMe.rentMe.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetUserDitailsResponse {

    private UserDto userDto;
}
