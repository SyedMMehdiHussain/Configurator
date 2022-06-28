package com.example.Configurator.controller;

import com.example.Configurator.model.CruiseControl;
import com.example.Configurator.model.Customer;
import com.example.Configurator.model.Order;
import com.example.Configurator.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("all")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        List<Customer> customerList = customerService.findAllCustomer();
        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        Customer newCustomer = customerService.addCustomer(customer);
        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }
}
