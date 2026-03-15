package com.enterprise.risk.service;

import com.enterprise.risk.ai.PythonRiskAnalyzer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RiskAnalysisService {

    private final PythonRiskAnalyzer analyzer;

    public String analyzeRisk(double amount) {

        return analyzer.analyze(amount);

    }

}