package com.homebanking.controllers;

import com.homebanking.services.TransferService;
import com.homebanking.services.UserService;
import com.homebanking.entities.dtos.TransferDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/transfer/")
public class TransferController {
    private UserService userService;
    private TransferService transferService;
    public TransferController(UserService userService, TransferService transferService){
        this.userService=userService;
        this.transferService=transferService;
    }

    @PostMapping("")
    public void transfer(@RequestBody TransferDto transferDto){

    }



    // TODO: el resto
}
