package com.homebanking.mappers;

import com.homebanking.entities.User;
import com.homebanking.entities.dtos.UserDto;
import com.homebanking.entities.dtos.UserUpdateDto;
import com.homebanking.entities.dtos.UserRegisterDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toUser(UserRegisterDto dto){
        return new User(null,dto.getEmail(),dto.getEmail(),dto.getFullname());
    }
    public User toUser(UserUpdateDto dto) {
        return new User(dto.getId(), dto.getEmail(),dto.getEmail(),dto.getFullname());
    }
    public UserDto toDto(User user){
        return new UserDto(user.getId(),user.getEmail(),user.getFullname());
    }

}
