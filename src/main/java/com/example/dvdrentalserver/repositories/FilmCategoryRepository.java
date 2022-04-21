/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.dvdrentalserver.repositories;

import com.example.dvdrentalserver.entities.FilmCategory;
import com.example.dvdrentalserver.entities.FilmCategoryPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Repository;

/**
 *
 * @author user01
 */
@Repository
public interface FilmCategoryRepository extends JpaRepository<FilmCategory, FilmCategoryPK> {

}
