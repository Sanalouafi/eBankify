package com.example.ebankify.dto;

import com.example.ebankify.model.enums.InvoiceStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InvoiceDTO {
    private Long id;
    private Double amount;
    private InvoiceStatus invoiceStatus;
    private LocalDateTime issuedAt;
    private LocalDateTime dueDate;
    private Long userId;
}
