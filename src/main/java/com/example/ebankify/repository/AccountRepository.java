package com.example.ebankify.repository;

import com.example.ebankify.model.Account;
import com.example.ebankify.model.enums.AccountStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByUserId(long userId);
    Optional<Account> findByAccountNumber(String accountNumber);
    List<Account>findByAccountStatus(AccountStatus accountStatus);
    @Query("SELECT a FROM Account a WHERE a.user.id = :userId AND a.balance> :minimumBalance")
    List<Account> findAccountByUserIdAndMinimumBalance(@Param("userId")Long userId,@Param("minimumBalance")Double minimumBalance);

}
