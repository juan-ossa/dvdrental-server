/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dvdrentalserver.controllers;

import com.example.dvdrentalserver.entities.Book;
import com.example.dvdrentalserver.services.BookService;
import com.example.dvdrentalserver.services.PageService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "*")
public class BookController {

    @Autowired
    private BookService bookService;
    @Autowired
    private PageService pageService;

//    private final  ActorService actorService;
//
//    public ActorController(ActorService actorService) {
//        this.actorService = actorService;
//    }
    @GetMapping(path = "/books")
//    public ResponseEntity< List<Actor>> getActors() {
    public List<Book> getActors() {

        return bookService.books();
//        var bankAccounts= actorService.getActors();
//        return new ResponseEntity<>(bankAccounts, HttpStatus.OK);
//        return actorService.actors();
    }
    
    
    @PostMapping(path = "/book")
    void addActors(@RequestBody Book libro) {

        bookService.save(libro);
    }

    @GetMapping(path = "/book/{id}")
    Optional<Book> getActor(@PathVariable("id") Long id) {

        return bookService.getBook(id);
    }
//
//    @PostMapping(path = "/actor")
//    void addActors(@RequestBody Actor actor) {
//
//        actorService.addActors(actor);
//    }
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
