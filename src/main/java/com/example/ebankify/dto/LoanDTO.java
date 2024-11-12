package com.example.ebankify.dto;

import com.example.ebankify.model.enums.LoanStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LoanDTO {
    private Long id;
    private Double amount;
    private String collateral;
    private LoanStatus loanStatus;
    private LocalDateTime approvedAt;
    private Long userId;
}
