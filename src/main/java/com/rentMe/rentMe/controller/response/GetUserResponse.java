package com.rentMe.rentMe.controller.response;

import com.rentMe.rentMe.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class GetUserResponse {

    private List<UserDto> users;
}
