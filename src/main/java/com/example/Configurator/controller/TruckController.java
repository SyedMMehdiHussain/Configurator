package com.example.Configurator.controller;

import com.example.Configurator.model.Truck;
import com.example.Configurator.service.TruckService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/truck")
public class TruckController {
    @Autowired
    private final TruckService truckService;

    public TruckController(TruckService truckService) {
        this.truckService = truckService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Truck>> getAllTruck(){
        List<Truck> trucks = truckService.findAllTruck();
        return new ResponseEntity<>(trucks, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Truck> addTruck(@RequestBody Truck truck){
        Truck newTruck = truckService.addTruck(truck);
        return new ResponseEntity<>(newTruck, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Truck> updateTruck(@RequestBody Truck truck){
        Truck updateTruck = truckService.updateTruck(truck);
        return new ResponseEntity<>(updateTruck, HttpStatus.OK);
    }
}
