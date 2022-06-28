package com.example.Configurator.controller;

import com.example.Configurator.model.CruiseControl;
import com.example.Configurator.model.Order;
import com.example.Configurator.model.Trim;
import com.example.Configurator.service.TrimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trim")
public class TrimController {
    @Autowired
    private final TrimService trimService;

    public TrimController(TrimService trimService) {
        this.trimService = trimService;
    }

    @GetMapping("all")
    public ResponseEntity<List<Trim>> getAllTrims(){
        List<Trim> trimList = trimService.findAllTrim();
        return new ResponseEntity<>(trimList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Trim> addTrim(@RequestBody Trim trim){
        Trim newTrim= trimService.addTrim(trim);
        return new ResponseEntity<>(newTrim, HttpStatus.CREATED);
    }
}
