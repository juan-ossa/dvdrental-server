/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.dvdrentalserver.repositories;

import com.example.dvdrentalserver.entities.Category;
import com.example.dvdrentalserver.entities.Inventory;
import com.example.dvdrentalserver.entities.Rental;
import com.example.dvdrentalserver.entities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Repository;

/**
 *
 * @author user01
 */
@Repository
public interface StaffRepository extends JpaRepository<Staff,Integer>{
    
    
}