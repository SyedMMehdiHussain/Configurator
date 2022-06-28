package com.example.Configurator.service;

import com.example.Configurator.model.CruiseControl;
import com.example.Configurator.model.Trim;
import com.example.Configurator.model.Truck;
import com.example.Configurator.repository.TrimRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TrimService {
    private final TrimRepo trimRepo;

    @Autowired
    public TrimService(TrimRepo trimRepo) {
        this.trimRepo = trimRepo;
    }

    public Trim addTrim(Trim trim){
        return trimRepo.save(trim);
    }

    public List<Trim> findAllTrim() {
        return trimRepo.findAll();
    }

    public Trim findTrimById(Integer id){
        return trimRepo.findTrimById(id);
    }
}
