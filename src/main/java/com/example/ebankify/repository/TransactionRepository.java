package com.example.ebankify.repository;

import com.example.ebankify.model.Transaction;
import com.example.ebankify.model.enums.TransactionStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.parameters.P;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    List<Transaction> findBySourceAccountId(Long accountId);
    List<Transaction> findByTargetAccountId(Long accountId);
    List<Transaction> findByTransactionStatus(TransactionStatus transactionStatus);
    @Query("SELECT t from Transaction t where t.sourceAccount.id=:accountId and t.amount>:threshold")
    List<Transaction> findBySourceAccountIdAndAmountGreaterThan(@Param("accountId")Long accountId, @Param("treshold")Double threshold);
    @Query("SELECT  t FROM Transaction t WHERE t.createdAt>= :startDate AND t.createdAt<= :endDate")
    List<Transaction> findByDateRange(@Param("startDate")LocalDateTime startDate,@Param("endDate")LocalDateTime endDate);
}
