package com.rentMe.rentMe.service;

import com.rentMe.rentMe.dto.UserDto;
import com.rentMe.rentMe.mapper.UserMapper;
import com.rentMe.rentMe.model.User;
import com.rentMe.rentMe.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public List<UserDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::mapToDto)
                .collect(Collectors.toList());
    }
    public void addUser(UserDto userDto){
        User user = userMapper.mapToUser(userDto);
        userRepository.save(user);
    }
    public Optional<UserDto> getUser(Long userId) {
        return userRepository.findById(userId)
                .map(userMapper::mapToDto);
    }
}
