package com.rentMe.rentMe.controller;

import com.rentMe.rentMe.controller.request.AddUserRequest;
import com.rentMe.rentMe.controller.response.GetUserResponse;
import com.rentMe.rentMe.dto.UserDto;
import com.rentMe.rentMe.mapper.UserMapper;
import com.rentMe.rentMe.repository.UserRepository;
import com.rentMe.rentMe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserMapper userMapper;
    private UserRepository userRepository;
    private UserService userService;

    @Autowired
    public UserController(UserService service){
        this.userService = service;
    }

    @GetMapping
    public GetUserResponse getUsers() {
        List<UserDto> userDtos = userService.getAllUsers();
        return GetUserResponse.of(userDtos);
    }

    @PostMapping
    public ResponseEntity<Void> addUser(@Valid @RequestBody AddUserRequest request) {
        UserDto userDto = UserDto.builder()
                .name(request.getName())
                .surName(request.getSurName())
//                .role(request.)
                .build();
        userService.addUser(userDto);
        return ResponseEntity.ok().build();
    }

}
