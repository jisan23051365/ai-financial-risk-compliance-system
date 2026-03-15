package com.enterprise.risk.service;

import com.enterprise.risk.entity.FraudAlert;
import com.enterprise.risk.entity.Transaction;
import com.enterprise.risk.repository.FraudAlertRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class FraudDetectionService {

private final FraudAlertRepository repository;

public boolean detectFraud(Transaction tx){

if(tx.getAmount() > 10000){

FraudAlert alert = new FraudAlert();

alert.setTransactionId(tx.getId());
alert.setAlertType("High Value Transaction");
alert.setSeverity("HIGH");
alert.setCreatedAt(LocalDateTime.now());

repository.save(alert);

return true;
}

return false;

}

}