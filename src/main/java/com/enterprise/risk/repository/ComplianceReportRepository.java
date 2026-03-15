package com.enterprise.risk.repository;

import com.enterprise.risk.entity.ComplianceReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplianceReportRepository extends JpaRepository<ComplianceReport,Long> {
}