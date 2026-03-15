package com.enterprise.risk.controller;

import com.enterprise.risk.repository.FraudAlertRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fraud")
@RequiredArgsConstructor
public class FraudController {

private final FraudAlertRepository repository;

@GetMapping("/alerts")
public Object getAlerts(){
return repository.findAll();
}

}