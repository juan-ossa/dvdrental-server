/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dvdrentalserver.entities;

import java.io.Serializable;
import java.util.Date;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.EmbeddedId;
//import javax.persistence.Entity;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
import javax.persistence.*;
import java.util.Objects;

/**
 *
 * @author user01
 */
@Entity
@Table(name = "film_category")
@NamedQueries({
    @NamedQuery(name = "FilmCategory.findAll", query = "SELECT f FROM FilmCategory f"),
    @NamedQuery(name = "FilmCategory.findByFilmId", query = "SELECT f FROM FilmCategory f WHERE f.filmCategoryPK.filmId = :filmId"),
    @NamedQuery(name = "FilmCategory.findByCategoryId", query = "SELECT f FROM FilmCategory f WHERE f.filmCategoryPK.categoryId = :categoryId"),
    @NamedQuery(name = "FilmCategory.findByLastUpdate", query = "SELECT f FROM FilmCategory f WHERE f.lastUpdate = :lastUpdate")})
public class FilmCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private FilmCategoryPK filmCategoryPK;
    @Basic(optional = false)
    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
//    @JoinColumn(name = "category_id", referencedColumnName = "category_id", insertable = false, updatable = false)
//    @ManyToOne(optional = false)
    	@ManyToOne
	@MapsId("category_id")
	@JoinColumn(name="category_id")
    private Category category;
//    @JoinColumn(name = "film_id", referencedColumnName = "film_id", insertable = false, updatable = false)
//    @ManyToOne(optional = false)
        @ManyToOne
	@MapsId("film_id")
	@JoinColumn(name="film_id")
    private Film film;

    public FilmCategory() {
    }

    public FilmCategory(FilmCategoryPK filmCategoryPK) {
        this.filmCategoryPK = filmCategoryPK;
    }

    public FilmCategory(FilmCategoryPK filmCategoryPK, Date lastUpdate) {
        this.filmCategoryPK = filmCategoryPK;
        this.lastUpdate = lastUpdate;
    }

    public FilmCategory(Integer filmId, Integer categoryId) {
        this.filmCategoryPK = new FilmCategoryPK(filmId, categoryId);
    }

    public FilmCategoryPK getFilmCategoryPK() {
        return filmCategoryPK;
    }

    public void setFilmCategoryPK(FilmCategoryPK filmCategoryPK) {
        this.filmCategoryPK = filmCategoryPK;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (filmCategoryPK != null ? filmCategoryPK.hashCode() : 0);
        return hash;
    }

//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof FilmCategory)) {
//            return false;
//        }
//        FilmCategory other = (FilmCategory) object;
//        if ((this.filmCategoryPK == null && other.filmCategoryPK != null) || (this.filmCategoryPK != null && !this.filmCategoryPK.equals(other.filmCategoryPK))) {
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
        final FilmCategory other = (FilmCategory) obj;
        return Objects.equals(this.filmCategoryPK, other.filmCategoryPK);
    }

    
    
    @Override
    public String toString() {
        return "com.example.dvdrental.entities.FilmCategory[ filmCategoryPK=" + filmCategoryPK + " ]";
    }
    
}
