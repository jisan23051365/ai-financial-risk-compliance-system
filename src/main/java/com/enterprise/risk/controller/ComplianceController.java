package com.enterprise.risk.controller;

import com.enterprise.risk.entity.ComplianceReport;
import com.enterprise.risk.service.ComplianceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compliance")
@RequiredArgsConstructor
public class ComplianceController {

private final ComplianceService service;

@PostMapping("/report")
public ComplianceReport generate(@RequestBody String details){
return service.generateReport(details);
}

}