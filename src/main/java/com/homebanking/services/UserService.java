package com.homebanking.services;

import com.homebanking.entities.User;
import com.homebanking.entities.dtos.UserDto;
import com.homebanking.entities.dtos.UserRegisterDto;
import com.homebanking.entities.dtos.UserUpdateDto;
import com.homebanking.mappers.UserMapper;
import com.homebanking.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private UserRepository repository=new UserRepository();
    private UserMapper mapper=new UserMapper();

    public UserDto getById(Long id){
        User user=repository.getById(id);
        return mapper.toDto(user);
    }

    public List<UserDto> getUsers(){
        return repository.getUsers()
                .parallelStream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    public Long createUser(UserRegisterDto dto){
        return  repository.createUser(mapper.toUser(dto));
    }
}
