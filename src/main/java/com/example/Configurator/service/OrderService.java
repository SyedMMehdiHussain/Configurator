package com.example.Configurator.service;

import com.example.Configurator.dto.AddOrderDTO;
import com.example.Configurator.model.CruiseControl;
import com.example.Configurator.model.Order;
import com.example.Configurator.model.Trim;
import com.example.Configurator.model.Truck;
import com.example.Configurator.repository.OrderRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrderService {
    private final OrderRepo orderRepo;

    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }


    public Order addOrder(Order order) {
        return orderRepo.save(order);
    }

    public Order findOrderById(Integer id){
        return orderRepo.findOrderById(id);
    }

    public List<Order> findAllOrder() {
        return orderRepo.findAll();
    }

    public void addOrder(AddOrderDTO addOrderDTO, Truck truck, Trim trim, CruiseControl cruiseControl, Integer totalPrice) {

        Order order = new Order();
        order.setCruiseControl(cruiseControl);
        order.setTrim(trim);
        order.setTruck(truck);
        order.setTotalPrice(totalPrice);

        orderRepo.save(order);

    }
}
