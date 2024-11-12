package com.example.ebankify.repository;

import com.example.ebankify.model.Loan;
import com.example.ebankify.model.enums.LoanStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findUserId(Long userId);
    List<Loan> findByLoanStatus(LoanStatus status);
    List<Loan> findByUserIdAndLoanStatus(Long userId,LoanStatus status);
    @Query("SELECT l FROM Loan l where l.approvedAt < :date")
    List<Loan> findLoansApprovedBefore(@Param("date") LocalDateTime date);
}
