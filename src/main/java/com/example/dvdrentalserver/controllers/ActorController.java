/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dvdrentalserver.controllers;

import com.example.dvdrentalserver.entities.Actor;
import com.example.dvdrentalserver.services.ActorService;
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
public class ActorController {

    @Autowired
    private ActorService actorService;

//    private final  ActorService actorService;
//
//    public ActorController(ActorService actorService) {
//        this.actorService = actorService;
//    }
    @GetMapping(path = "/actor")
//    public ResponseEntity< List<Actor>> getActors() {
    public  List<Actor> getActors() {

        return actorService.getActors();
//        var bankAccounts= actorService.getActors();
//        return new ResponseEntity<>(bankAccounts, HttpStatus.OK);
//        return actorService.actors();
    }

    @GetMapping(path = "/actor/{id}")
    Optional<Actor> getActor(@PathVariable("id") Integer id) {

        return actorService.getActor(id);
    }

    @PostMapping(path = "/actor")
    void addActors(@RequestBody Actor actor) {

        actorService.addActors(actor);
    }

    @DeleteMapping(path = "/actor/{id}")
    void deleteActors(@PathVariable("id") Integer id) {

        actorService.deleteActors(id);
    }

    @PutMapping(path = "/actor/{id}")
    void updateActor(@PathVariable("id") Integer id,
            @RequestParam(required = false) String name
    ) {

        actorService.updateActor(id, name);
    }
}
