/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dvdrentalserver.entities;

import java.io.Serializable;
import javax.persistence.*;
//import javax.persistence.Column;
//import javax.persistence.Embeddable;

/**
 *
 * @author user01
 */
@Embeddable
public class FilmActorPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "actor_id")
    private Integer actorId;
    @Basic(optional = false)
    @Column(name = "film_id")
    private Integer filmId;

    public FilmActorPK() {
    }

    public FilmActorPK(Integer actorId, Integer filmId) {
        this.actorId = actorId;
        this.filmId = filmId;
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) actorId;
        hash += (int) filmId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FilmActorPK)) {
            return false;
        }
        FilmActorPK other = (FilmActorPK) object;
        if (this.actorId != other.actorId) {
            return false;
        }
        if (this.filmId != other.filmId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.dvdrental.entities.FilmActorPK[ actorId=" + actorId + ", filmId=" + filmId + " ]";
    }
    
}
