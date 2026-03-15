package com.enterprise.risk.repository;

import com.enterprise.risk.entity.FraudAlert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudAlertRepository extends JpaRepository<FraudAlert,Long> {
}