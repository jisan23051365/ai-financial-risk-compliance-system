package com.enterprise.risk.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class ComplianceReport {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String reportType;

private String details;

private LocalDateTime generatedAt;

}