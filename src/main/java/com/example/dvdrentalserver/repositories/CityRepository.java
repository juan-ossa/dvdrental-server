/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.dvdrentalserver.repositories;

import com.example.dvdrentalserver.entities.Address;
import com.example.dvdrentalserver.entities.City;
import com.example.dvdrentalserver.entities.Country;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Repository;

/**
 *
 * @author user01
 */
@Repository
public interface CityRepository extends JpaRepository<City,Integer>{
    
        List<City> findByCountryId(Country country);
        
}