package com.example.Configurator.service;

import com.example.Configurator.model.Truck;
import com.example.Configurator.repository.TruckRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TruckService {
    private final TruckRepo truckRepo;

    @Autowired
    public TruckService(TruckRepo truckRepo) {
        this.truckRepo = truckRepo;
    }

    public List<Truck> findAllTruck(){
        return truckRepo.findAll();
    }

    public Truck addTruck(Truck truck){
        return truckRepo.save(truck);
    }

    public Truck updateTruck(Truck truck) {
        return truckRepo.save(truck);
    }
}
