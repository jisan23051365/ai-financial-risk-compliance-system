package com.enterprise.risk.service;

import com.enterprise.risk.entity.ComplianceReport;
import com.enterprise.risk.repository.ComplianceReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ComplianceService {

    private final ComplianceReportRepository repository;

    public ComplianceReport generateReport(String details) {

        ComplianceReport report = new ComplianceReport();

        report.setReportType("AML REPORT");

        report.setDetails(details);

        report.setGeneratedAt(LocalDateTime.now());

        return repository.save(report);

    }

}