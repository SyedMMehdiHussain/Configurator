package com.example.Configurator.repository;

import com.example.Configurator.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer> {
    Order findOrderById(Integer id);
}
