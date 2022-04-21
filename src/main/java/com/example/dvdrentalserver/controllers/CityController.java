/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.example.dvdrentalserver.controllers;

import com.example.dvdrentalserver.entities.City;
import com.example.dvdrentalserver.entities.Country;
import com.example.dvdrentalserver.repositories.CountryRepository;
import com.example.dvdrentalserver.services.CityService;
import com.example.dvdrentalserver.services.CountryService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author user01
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CityController {
     @Autowired
    private CityService cityService;
    
    @GetMapping("/cities")
    public List<City> list() {
        return cityService.findAll();
    }
    
    @GetMapping("/city/{id}")
    public Object get(@PathVariable String id) {
        return null;
    }
    
    @PutMapping("/city/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Object input) {
        return null;
    }
    
    @PostMapping("/city")
    public ResponseEntity<?> post(@RequestBody Object input) {
        return null;
    }
    
    @DeleteMapping("/city/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }
    
}
