/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dvdrentalserver.entities;

import java.io.Serializable;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Embeddable;
import javax.persistence.*;
import java.util.Objects;

/**
 *
 * @author user01
 */
@Embeddable
public class FilmCategoryPK implements Serializable {

//    @Basic(optional = false)
    @Column(name = "film_id")
    private Integer filmId;
//    @Basic(optional = false)
    @Column(name = "category_id")
    private Integer categoryId;

    public FilmCategoryPK() {
    }

    public FilmCategoryPK(Integer filmId, Integer categoryId) {
        this.filmId = filmId;
        this.categoryId = categoryId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (int) filmId;
//        hash += (int) categoryId;
//        return hash;
//    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.filmId);
        hash = 89 * hash + Objects.hashCode(this.categoryId);
        return hash;
    }

    
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof FilmCategoryPK)) {
//            return false;
//        }
//        FilmCategoryPK other = (FilmCategoryPK) object;
//        if (!Objects.equals(this.filmId, other.filmId)) {
//            return false;
//        }
//        if (this.categoryId != other.categoryId) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FilmCategoryPK other = (FilmCategoryPK) obj;
        if (!Objects.equals(this.filmId, other.filmId)) {
            return false;
        }
        return Objects.equals(this.categoryId, other.categoryId);
    }

    
    
    @Override
    public String toString() {
        return "com.example.dvdrental.entities.FilmCategoryPK[ filmId=" + filmId + ", categoryId=" + categoryId + " ]";
    }
    
}
