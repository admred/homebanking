package com.homebanking.controllers;

import com.homebanking.entities.dtos.UserDto;
import com.homebanking.entities.dtos.UserRegisterDto;
import com.homebanking.entities.dtos.UserUpdateDto;
import com.homebanking.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/list")
    public List<UserDto> getUsers() {
        return service.getUsers();
    }

    @GetMapping("/detail/{id}")
    public UserDto getUserById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping("/create")
    public Long createUser(@RequestBody UserRegisterDto dto) {
        return service.createUser(dto);
    }

    @PutMapping("/update/{id}")
    public void updateFullUser(@PathVariable Long id, @RequestBody UserUpdateDto dto) {
        // TODO:
    }

    @PatchMapping("/update/{id}")
    public void updatePartialUser(@PathVariable Long id, @RequestBody UserUpdateDto dto) {
        // TODO:
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        // TODO:
    }
}
