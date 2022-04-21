/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dvdrentalserver.controllers;

import com.example.dvdrentalserver.entities.Page;
import com.example.dvdrentalserver.services.PageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user01
 */
@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "*")
public class PageController {

    @Autowired
    private PageService pageService;

//    private final  ActorService actorService;
//
//    public ActorController(ActorService actorService) {
//        this.actorService = actorService;
//    }
    @GetMapping(path = "/pages")
//    public ResponseEntity< List<Actor>> getActors() {
    public List<Page> getActors() {

        return pageService.pages();
//        var bankAccounts= actorService.getActors();
//        return new ResponseEntity<>(bankAccounts, HttpStatus.OK);
//        return actorService.actors();
    }

//    @GetMapping(path = "/actor/{id}")
//    Optional<Actor> getActor(@PathVariable("id") Integer id) {
//
//        return actorService.getActor(id);
//    }
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
