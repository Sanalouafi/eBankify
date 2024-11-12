package com.example.ebankify.dto;

import com.example.ebankify.model.enums.TransactionStatus;
import com.example.ebankify.model.enums.TransactionType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TransactionDTO {
    private Long id;
    private Double amount;
    private TransactionType transactionType;
    private TransactionStatus transactionStatus;
    private Long sourceAccountId;
    private Long targetAccountId;
    private LocalDateTime createdAt;
}
