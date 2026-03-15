package com.enterprise.risk.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String name;

private String email;

private String country;

private String riskLevel;

}