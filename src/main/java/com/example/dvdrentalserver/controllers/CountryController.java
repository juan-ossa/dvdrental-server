/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.example.dvdrentalserver.controllers;

import com.example.dvdrentalserver.entities.City;
import com.example.dvdrentalserver.entities.Country;
import com.example.dvdrentalserver.repositories.CityRepository;
import com.example.dvdrentalserver.repositories.CountryRepository;
import com.example.dvdrentalserver.services.CountryService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
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
public class CountryController {

    @Autowired
    private CountryService countryService;
//     @Autowired
//       CityRepository cityRepository ;

    @GetMapping("/countries")
    public List<Country> list() {
        return countryService.findAll();
    }

//    @GetMapping("/paises")
//    public List<Country> paises() {
//
//        ///////////
//        List<Country> coutries;
//        
//        coutries = countryService.findAll();
//
////            for (Country country : coutries) {
////                System.out.println("Pais :" + country);
////
////                List<City> cities = cityRepository.findByCountryId(country);
////                country.setCityList(cities);
////                for (City ciudad : cities) {
////                    System.out.println("Ciudad :" + ciudad);
////
////                }
////                System.out.println("--------");
////            }
//        ///////////
//        return coutries;
//    }
    @GetMapping("/country/{id}")
    public Optional<Country> get(@PathVariable("id") Integer id) {
        return countryService.getCountry(id);
    }

    @PutMapping("/country/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Object input) {
        return null;
    }

    @PostMapping("/country")
    public void post(@RequestBody Country country) {
        countryService.save(country);
        
    }
    
//    @PostMapping(path = "/libro")
//    void addActors(@RequestBody Book libro) {
//
//        
//    }

    @DeleteMapping("/country/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }

}
