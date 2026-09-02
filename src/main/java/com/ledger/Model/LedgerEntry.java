package com.ledger.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
public class LedgerEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Transaction transaction;

    @ManyToOne
    private Account account;

    @Enumerated(EnumType.STRING)
    private EntryType type;

    private BigDecimal amount;

    @CreationTimestamp
    private LocalDateTime createdAt;


}
