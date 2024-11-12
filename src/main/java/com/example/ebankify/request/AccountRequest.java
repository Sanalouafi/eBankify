package com.example.ebankify.request;
import com.example.ebankify.model.enums.AccountStatus;
import lombok.Data;

@Data
public class AccountRequest {
    private String accountNumber;
    private Double balance;
    private AccountStatus accountStatus;
    private Long userId;
}