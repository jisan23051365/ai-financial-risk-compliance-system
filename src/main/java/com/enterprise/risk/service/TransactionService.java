package com.enterprise.risk.service;

import com.enterprise.risk.entity.Transaction;
import com.enterprise.risk.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

private final TransactionRepository repository;

public Transaction createTransaction(Transaction transaction){

transaction.setTimestamp(LocalDateTime.now());

return repository.save(transaction);
}

public List<Transaction> getAllTransactions(){
return repository.findAll();
}

}