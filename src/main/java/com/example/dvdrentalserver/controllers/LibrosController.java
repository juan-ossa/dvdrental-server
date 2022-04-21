/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dvdrentalserver.controllers;

import com.example.dvdrentalserver.entities.Book;
import com.example.dvdrentalserver.repositories.BookRepository;
import com.example.dvdrentalserver.repositories.PageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user01
 */
@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "*")
public class LibrosController {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private PageRepository pageRepository;

    @GetMapping(path = "/libros")
//    public ResponseEntity< List<Actor>> getActors() {
    public List<Book> getActors() {

        return bookRepository.findAll();
    }

//    @GetMapping(path = "/actor/{id}")
//    Optional<Actor> getActor(@PathVariable("id") Integer id) {
//
//        return actorService.getActor(id);
//    }
//
    @PostMapping(path = "/libro")
    void addActors(@RequestBody Book libro) {

        bookRepository.save(libro);
    }
//
//    @DeleteMapping(path = "/actor/{id}")
//    void deleteActors(@PathVariable("id") Integer id) {
//
//        actorService.deleteActors(id);
//    }
//
//    @PutMapping(path = "/actor/{id}")
//    void updateActor(@PathVariable("id") Integer id,
//            @RequestParam(required = false) String name
//    ) {
//
//        actorService.updateActor(id, name);
//    }
}
