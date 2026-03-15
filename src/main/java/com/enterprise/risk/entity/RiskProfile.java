package com.enterprise.risk.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class RiskProfile {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private Long customerId;

private double riskScore;

private String riskCategory;

}