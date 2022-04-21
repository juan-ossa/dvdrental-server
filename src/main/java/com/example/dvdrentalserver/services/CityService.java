/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.example.dvdrentalserver.services;

import com.example.dvdrentalserver.entities.City;
import com.example.dvdrentalserver.entities.Country;
import com.example.dvdrentalserver.repositories.CityRepository;
import com.example.dvdrentalserver.repositories.CountryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 *
 * @author user01
 */
@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> findAll() {
        return cityRepository.findAll();
    }

    public List<City> findAll(Sort sort) {
        return cityRepository.findAll(sort);
    }

}
