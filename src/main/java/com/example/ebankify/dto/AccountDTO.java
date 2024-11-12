package com.example.ebankify.dto;

import com.example.ebankify.model.enums.AccountStatus;
import lombok.Data;

@Data
public class AccountDTO {
    private Long id;
    private String accountNumber;
    private Double balance;
    private AccountStatus accountStatus;
}
