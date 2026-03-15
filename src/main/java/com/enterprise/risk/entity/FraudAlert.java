package com.enterprise.risk.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class FraudAlert {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private Long transactionId;

private String alertType;

private String severity;

private LocalDateTime createdAt;

}