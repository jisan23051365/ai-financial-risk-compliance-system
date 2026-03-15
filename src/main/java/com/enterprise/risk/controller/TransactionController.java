package com.enterprise.risk.controller;

import com.enterprise.risk.entity.Transaction;
import com.enterprise.risk.service.TransactionService;
import com.enterprise.risk.service.FraudDetectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
@RequiredArgsConstructor
public class TransactionController {

private final TransactionService service;
private final FraudDetectionService fraudService;

@PostMapping
public Transaction create(@RequestBody Transaction t){

Transaction saved=service.createTransaction(t);

fraudService.detectFraud(saved);

return saved;

}

@GetMapping
public List<Transaction> all(){
return service.getAllTransactions();
}

}