package com.enterprise.risk.controller;

import com.enterprise.risk.entity.Customer;
import com.enterprise.risk.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

private final CustomerService service;

@PostMapping
public Customer create(@RequestBody Customer c){
return service.createCustomer(c);
}

@GetMapping
public List<Customer> all(){
return service.getAllCustomers();
}

}
