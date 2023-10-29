package com.homebanking.services;

import com.homebanking.entities.User;
import com.homebanking.entities.dtos.UserDto;
import com.homebanking.entities.dtos.UserRegisterDto;
import com.homebanking.mappers.UserMapper;
import com.homebanking.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository repository;

    private final UserMapper mapper = new UserMapper();

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public UserDto getById(Long id) {
        return mapper.toDto(repository.findById(id).orElse(null));
    }

    public List<UserDto> getUsers() {
        return repository.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    public Long createUser(UserRegisterDto dto) {
        return repository.save(mapper.toUser(dto)).getId();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public User findByEmail(String email) {
        return repository.findByEmail(email).orElse(null);
    }
}