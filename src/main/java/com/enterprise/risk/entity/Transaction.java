package com.enterprise.risk.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Transaction {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private Long customerId;

private double amount;

private String transactionType;

private LocalDateTime timestamp;

private String status;

}