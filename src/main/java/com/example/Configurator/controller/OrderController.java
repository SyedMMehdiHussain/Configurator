package com.example.Configurator.controller;

import com.example.Configurator.dto.AddOrderDTO;
import com.example.Configurator.model.CruiseControl;
import com.example.Configurator.model.Order;
import com.example.Configurator.model.Trim;
import com.example.Configurator.model.Truck;
import com.example.Configurator.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private final OrderService orderService;

    @Autowired
    private TruckService truckService;

    @Autowired
    private TrimService trimService;

    @Autowired
    private CruiseControlService cruiseControlService;

    @Autowired
    private CustomerService customerService;


    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("all")
    public ResponseEntity<List<Order>> getAllOrders(){
        List<Order> orderList = orderService.findAllOrder();
        return new ResponseEntity<>(orderList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Order> addOrder(@RequestBody AddOrderDTO addOrderDTO){
        Truck truck = truckService.findAllTruck().stream().filter(truck1 ->
                truck1.getId() == addOrderDTO.getTruckId()).findFirst().get();
        Trim trim = trimService.findAllTrim().stream().filter(trim1 ->
                trim1.getId() == addOrderDTO.getTrimId()).findFirst().get();
        CruiseControl cruiseControl = cruiseControlService.findAllCruiseControl().stream().filter(cruiseControl1 ->
                cruiseControl1.getId() == addOrderDTO.getCruiseControlId()).findFirst().get();
        Integer totalPrice = addOrderDTO.getTotalPrice();

        orderService.addOrder(addOrderDTO,truck,trim,cruiseControl,totalPrice);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
