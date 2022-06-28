package com.example.Configurator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Configurator.model.Truck;

public interface TruckRepo extends JpaRepository<Truck, Integer> {
}
