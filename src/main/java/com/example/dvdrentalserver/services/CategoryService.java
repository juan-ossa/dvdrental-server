/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dvdrentalserver.services;

import com.example.dvdrentalserver.entities.Category;
import com.example.dvdrentalserver.repositories.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user01
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

//      @Autowired
//    private FilmRepository filmRepository;
//    private final ActorRepository actorRepository;
//
//    public ActorService(ActorRepository actorRepository) {
//        this.actorRepository = actorRepository;
//    }
//    public List<Actor> actors() {
//        return actorRepository.actors();
//    }

    public List<Category> getCategories() {
        return categoryRepository.findAll();
//        return List.of(
//                new Actor(1, "Juan", "Ossa", LocalDate.of(2021, Month.JANUARY, 5)),
//                new Actor(2, "Gloria", "Ossa", LocalDate.now())
//        );
    }

    public Optional<Category> getCategory(Integer id) {
        return categoryRepository.findById(id);
//        return 
//                new Actor(1, "Juan", "Ossa", LocalDate.of(2021, Month.JANUARY, 5);
//           
//        
    }

    public void addCategories(Category a) {
        System.out.println(a);
        categoryRepository.save(a);

    }

    public void deleteCategories(Integer id) {

        boolean exist = categoryRepository.existsById(id);
        if (!exist) {
            throw new IllegalStateException("Actor id " + id + " No existe");
        } else {
            categoryRepository.deleteById(id);
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public void updateCategories(Integer id, String name) {

        Category a = categoryRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Actor id " + id + " No existe"));

        a.setName(name);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
