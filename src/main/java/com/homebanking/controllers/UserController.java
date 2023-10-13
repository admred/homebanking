package com.homebanking.controllers;

import com.homebanking.entities.User;
import com.homebanking.entities.dtos.UserDto;
import com.homebanking.entities.dtos.UserRegisterDto;
import com.homebanking.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private final UserService service;

    public UserController(UserService service){
        this.service = service;
    }
    @GetMapping("/list")
    public List<UserDto> getUsers(){
        return service.getUsers();
    }

    @GetMapping("/get/{id}")
    public UserDto getUserById(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping("/create")
    public void createUser(@RequestBody UserRegisterDto dto) {
        service.createUser(dto);
    }

    @GetMapping("/update/{id}")
    public void updateGet(@PathVariable Long id) {
        // TODO:
    }

    @PostMapping("/update/{id}")
    public void updatePost(@PathVariable Long id,@RequestBody UserDto userDto) {
        // TODO:

    }

}
