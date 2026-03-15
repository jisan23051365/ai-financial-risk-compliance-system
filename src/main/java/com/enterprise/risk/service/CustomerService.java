package com.enterprise.risk.service;

import com.enterprise.risk.entity.Customer;
import com.enterprise.risk.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

private final CustomerRepository repository;

public Customer createCustomer(Customer customer){
return repository.save(customer);
}

public List<Customer> getAllCustomers(){
return repository.findAll();
}

}