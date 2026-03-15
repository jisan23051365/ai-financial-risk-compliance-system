package com.enterprise.risk.controller;

import com.enterprise.risk.service.RiskAnalysisService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/risk")
@RequiredArgsConstructor
public class RiskController {

private final RiskAnalysisService service;

@GetMapping("/analyze/{amount}")
public String analyze(@PathVariable double amount){
return service.analyzeRisk(amount);
}

}