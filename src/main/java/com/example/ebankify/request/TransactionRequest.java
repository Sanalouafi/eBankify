package com.example.ebankify.request;
import com.example.ebankify.model.enums.TransactionType;
import lombok.Data;

@Data
public class TransactionRequest {
    private Double amount;
    private TransactionType transactionType;
    private Long sourceAccountId;
    private Long targetAccountId;
}