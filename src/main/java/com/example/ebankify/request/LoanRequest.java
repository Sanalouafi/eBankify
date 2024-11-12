package com.example.ebankify.request;

import lombok.Data;

@Data
public class LoanRequest {
    private Double amount;
    private String collateral;
    private Long userId;
}