package com.example.model;

import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
public class TransferRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long fromAccountId;

    private Long toAccountId;

    private BigDecimal amount;

    private LocalDateTime transferTime;


    public TransferRecord(long from, long to, BigDecimal amount, LocalDateTime now) {
        this.fromAccountId = from;
        this.toAccountId = to;
        this.amount = amount;
        this.transferTime = now;
    }
}
