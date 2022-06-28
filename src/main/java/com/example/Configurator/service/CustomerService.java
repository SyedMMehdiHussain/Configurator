package com.example.Configurator.service;

import com.example.Configurator.model.Customer;
import com.example.Configurator.model.Truck;
import com.example.Configurator.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerService {
    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer addCustomer(Customer customer){
        return customerRepo.save(customer);
    }
    public List<Customer> findAllCustomer(){
        return customerRepo.findAll();
    }


}
