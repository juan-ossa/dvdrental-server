/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dvdrentalserver.services;

import com.example.dvdrentalserver.entities.Actor;
import com.example.dvdrentalserver.repositories.ActorRepository;
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
public class ActorService {

    @Autowired
    private ActorRepository actorRepository;

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

    public List<Actor> getActors() {
        return actorRepository.findAll();
//        return List.of(
//                new Actor(1, "Juan", "Ossa", LocalDate.of(2021, Month.JANUARY, 5)),
//                new Actor(2, "Gloria", "Ossa", LocalDate.now())
//        );
    }

    public Optional<Actor> getActor(Integer id) {
        return actorRepository.findById(id);
//        return 
//                new Actor(1, "Juan", "Ossa", LocalDate.of(2021, Month.JANUARY, 5);
//           
//        
    }

    public void addActors(Actor a) {
        System.out.println(a);
        actorRepository.save(a);

    }

    public void deleteActors(Integer id) {

        boolean exist = actorRepository.existsById(id);
        if (!exist) {
            throw new IllegalStateException("Actor id " + id + " No existe");
        } else {
            actorRepository.deleteById(id);
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public void updateActor(Integer id, String name) {

        Actor a = actorRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Actor id " + id + " No existe"));

        a.setFirstName(name);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
