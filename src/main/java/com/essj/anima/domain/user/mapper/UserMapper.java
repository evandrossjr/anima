package com.essj.anima.domain.user.mapper;

import com.essj.anima.domain.user.dto.UserDTO;
import com.essj.anima.domain.user.model.User;

public class UserMapper {

    public static UserDTO toDTO(User user){
        if(user == null) return null;

        return new UserDTO(
                user.getName(),
                user.getPhoneNumber(),
                user.getEmail(),
                user.getPassword()
        );
    }

    public static User toEntity(UserDTO userDTO){
        if (userDTO == null) return null;

        User user = new User();
        user.setName(userDTO.name());
        user.setEmail(userDTO.email());
        user.setPassword(userDTO.password());
        user.setPhoneNumber(userDTO.phoneNumber());

        return user;

    }
}
