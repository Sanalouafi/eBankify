package com.example.ebankify.model;

import com.example.ebankify.model.enums.AccountStatus;
import lombok.*;
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String accountNumber;

    @Column(nullable = false)
    private Double balance;

    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "sourceAccount", cascade = CascadeType.ALL)
    private Set<Transaction> outgoingTransactions;

    @OneToMany(mappedBy = "targetAccount", cascade = CascadeType.ALL)
    private Set<Transaction> incomingTransactions;
}
