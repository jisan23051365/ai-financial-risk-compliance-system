package com.enterprise.risk.ai;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Component
public class PythonRiskAnalyzer {

    public String analyze(double amount) {

        try {

            ProcessBuilder processBuilder =
                    new ProcessBuilder(
                            "python3",
                            "ai/predict.py",
                            String.valueOf(amount)
                    );

            Process process = processBuilder.start();

            BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(
                                    process.getInputStream()
                            )
                    );

            return reader.readLine();

        }
        catch (Exception e) {

            return "AI_ANALYSIS_ERROR";

        }

    }

}