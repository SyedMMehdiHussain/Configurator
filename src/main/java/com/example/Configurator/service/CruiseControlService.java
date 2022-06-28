package com.example.Configurator.service;

import com.example.Configurator.model.CruiseControl;
import com.example.Configurator.model.Customer;
import com.example.Configurator.model.Truck;
import com.example.Configurator.repository.CruiseControlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CruiseControlService {
    private final CruiseControlRepo cruiseControlRepo;

    @Autowired
    public CruiseControlService(CruiseControlRepo cruiseControlRepo) {
        this.cruiseControlRepo = cruiseControlRepo;
    }

    public CruiseControl addCruiseControl(CruiseControl cruiseControl){
        return cruiseControlRepo.save(cruiseControl);
    }

    public List<CruiseControl> findAllCruiseControl() {
        return cruiseControlRepo.findAll();
    }

    public CruiseControl findCruiseControlById(Integer id){
        return cruiseControlRepo.findCruiseControlById(id);
    }
}
