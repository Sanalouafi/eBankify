package com.example.ebankify.repository;

import com.example.ebankify.model.Invoice;
import com.example.ebankify.model.enums.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    List<Invoice> findByUserId(Long userId);
    List<Invoice> findByUserIdAndInvoiceStatus(Long userId, InvoiceStatus invoiceStatus);
    List<Invoice> findByInvoiceStatus(InvoiceStatus invoiceStatus);
    @Query("SELECT i from Invoice i WHERE i.dueDate <:date")
    List<Invoice> findOverDueInvoices(@Param("date")LocalDateTime date);
}
