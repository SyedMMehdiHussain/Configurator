package com.example.Configurator.controller;

import com.example.Configurator.model.CruiseControl;
import com.example.Configurator.model.Order;
import com.example.Configurator.service.CruiseControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cruiseControl")
public class CruiseControlController {
    @Autowired
    private final CruiseControlService cruiseControlService;

    public CruiseControlController(CruiseControlService cruiseControlService) {
        this.cruiseControlService = cruiseControlService;
    }

    @GetMapping("all")
    public ResponseEntity<List<CruiseControl>> getAllCruiseControls(){
        List<CruiseControl> cruiseControlList = cruiseControlService.findAllCruiseControl();
        return new ResponseEntity<>(cruiseControlList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<CruiseControl> addCruiseControl(@RequestBody CruiseControl cruiseControl){
        CruiseControl newCruiseControl = cruiseControlService.addCruiseControl(cruiseControl);
        return new ResponseEntity<>(newCruiseControl, HttpStatus.CREATED);
    }
}
