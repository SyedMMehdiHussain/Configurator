package com.example.Configurator.repository;

import com.example.Configurator.model.Trim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrimRepo extends JpaRepository<Trim,Integer> {
    Trim findTrimById(Integer id);
}
