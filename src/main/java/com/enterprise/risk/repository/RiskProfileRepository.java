package com.enterprise.risk.repository;

import com.enterprise.risk.entity.RiskProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiskProfileRepository extends JpaRepository<RiskProfile,Long> {
}