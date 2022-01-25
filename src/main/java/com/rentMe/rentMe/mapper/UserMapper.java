package com.rentMe.rentMe.mapper;

import com.rentMe.rentMe.dto.UserDto;
import com.rentMe.rentMe.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel= "spring")
public interface UserMapper {

    UserDto mapToDto(User user);

    User mapToUser(UserDto userDto);
}
