package com.example.Configurator.repository;

import com.example.Configurator.model.CruiseControl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CruiseControlRepo extends JpaRepository<CruiseControl, Integer> {
    CruiseControl findCruiseControlById(Integer id);
}
