package com.example.ebankify.request;

import com.example.ebankify.model.enums.InvoiceStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InvoiceRequest {
    private Double amount;
    private InvoiceStatus invoiceStatus;
    private LocalDateTime dueDate;
    private Long userId;
}
