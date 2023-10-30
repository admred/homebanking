package com.homebanking.entities.dtos;

import java.math.BigDecimal;

public class TransferDto {
    private Long fromUserId;
    private Long toUserId;
    private BigDecimal amount=new BigDecimal(0);
    public TransferDto(Long fromUserId, Long toUserId, BigDecimal amount) {
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.amount = amount;
    }


}
