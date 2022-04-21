/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dvdrentalserver.controllers;

import com.example.dvdrentalserver.entities.Actor;
import com.example.dvdrentalserver.entities.Category;
import com.example.dvdrentalserver.services.ActorService;
import com.example.dvdrentalserver.services.CategoryService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user01
 */
@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

//    private final  ActorService actorService;
//
//    public ActorController(ActorService actorService) {
//        this.actorService = actorService;
//    }
    @GetMapping(path = "/categorias")
//    public ResponseEntity< List<Actor>> getActors() {
    public  List<Category> getActors() {

        return categoryService.getCategories();
//        var bankAccounts= actorService.getActors();
//        return new ResponseEntity<>(bankAccounts, HttpStatus.OK);
//        return actorService.actors();
    }

    @GetMapping(path = "/categoria/{id}")
    Optional<Category> getCategoria(@PathVariable("id") Integer id) {

        return categoryService.getCategory(id);
    }

    @PostMapping(path = "/categoria")
    void addActors(@RequestBody Category actor) {

        categoryService.addCategories(actor);
    }

    @DeleteMapping(path = "/categoria/{id}")
    void deleteActors(@PathVariable("id") Integer id) {

        categoryService.deleteCategories(id);
    }

    @PutMapping(path = "/categoria/{id}")
    void updateActor(@PathVariable("id") Integer id,
            @RequestParam(required = false) String name
    ) {

        categoryService.updateCategories(id, name);
    }
}
