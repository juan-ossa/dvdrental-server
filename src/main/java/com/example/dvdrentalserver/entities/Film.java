/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dvdrentalserver.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
//import javax.persistence.Basic;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.Lob;
//import javax.persistence.ManyToOne;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

import javax.persistence.*;
import org.hibernate.annotations.Type;

/**
 *
 * @author user01
 */
@Entity
@Table(name = "film")
@NamedQueries({
    @NamedQuery(name = "Film.findAll", query = "SELECT f FROM Film f"),
    @NamedQuery(name = "Film.findByFilmId", query = "SELECT f FROM Film f WHERE f.filmId = :filmId"),
    @NamedQuery(name = "Film.findByTitle", query = "SELECT f FROM Film f WHERE f.title = :title"),
    @NamedQuery(name = "Film.findByDescription", query = "SELECT f FROM Film f WHERE f.description = :description"),
    @NamedQuery(name = "Film.findByReleaseYear", query = "SELECT f FROM Film f WHERE f.releaseYear = :releaseYear"),
    @NamedQuery(name = "Film.findByRentalDuration", query = "SELECT f FROM Film f WHERE f.rentalDuration = :rentalDuration"),
    @NamedQuery(name = "Film.findByRentalRate", query = "SELECT f FROM Film f WHERE f.rentalRate = :rentalRate"),
    @NamedQuery(name = "Film.findByLength", query = "SELECT f FROM Film f WHERE f.length = :length"),
    @NamedQuery(name = "Film.findByReplacementCost", query = "SELECT f FROM Film f WHERE f.replacementCost = :replacementCost"),
    @NamedQuery(name = "Film.findByRating", query = "SELECT f FROM Film f WHERE f.rating = :rating"),
    @NamedQuery(name = "Film.findByLastUpdate", query = "SELECT f FROM Film f WHERE f.lastUpdate = :lastUpdate"),
    @NamedQuery(name = "Film.findBySpecialFeatures", query = "SELECT f FROM Film f WHERE f.specialFeatures = :specialFeatures")})
public class Film implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "film_id")
    private Integer filmId;
    @Basic(optional = false)
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "release_year")
    private Integer releaseYear;
    @Basic(optional = false)
    @Column(name = "rental_duration")
    private short rentalDuration;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "rental_rate")
    private BigDecimal rentalRate;
    @Column(name = "length")
    private Short length;
    @Basic(optional = false)
    @Column(name = "replacement_cost")
    private BigDecimal replacementCost;
    @Column(name = "rating")
    private String rating;
    @Basic(optional = false)
    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
    @Column(name = "special_features")
    private Serializable specialFeatures;
    @Basic(optional = false)
    @Lob
    @Column(name = "fulltext")
    @Type(type = "org.hibernate.type.TextType")

    private Object fulltext;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "film")
    private List<FilmCategory> filmCategoryList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "film")
    @OneToMany( mappedBy = "actor")
    private List<FilmActor> filmActorList;
    @JoinColumn(name = "language_id", referencedColumnName = "language_id")
    @ManyToOne(optional = false)
    private Language languageId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "filmId")
    private List<Inventory> inventoryList;

    public Film() {
    }

    public Film(Integer filmId) {
        this.filmId = filmId;
    }

    public Film(Integer filmId, String title, short rentalDuration, BigDecimal rentalRate, BigDecimal replacementCost, Date lastUpdate, Object fulltext) {
        this.filmId = filmId;
        this.title = title;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.replacementCost = replacementCost;
        this.lastUpdate = lastUpdate;
        this.fulltext = fulltext;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public short getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(short rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Short getLength() {
        return length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Serializable getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(Serializable specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public Object getFulltext() {
        return fulltext;
    }

    public void setFulltext(Object fulltext) {
        this.fulltext = fulltext;
    }

    public List<FilmCategory> getFilmCategoryList() {
        return filmCategoryList;
    }

    public void setFilmCategoryList(List<FilmCategory> filmCategoryList) {
        this.filmCategoryList = filmCategoryList;
    }

    public List<FilmActor> getFilmActorList() {
        return filmActorList;
    }

    public void setFilmActorList(List<FilmActor> filmActorList) {
        this.filmActorList = filmActorList;
    }

    public Language getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Language languageId) {
        this.languageId = languageId;
    }

    public List<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (filmId != null ? filmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Film)) {
            return false;
        }
        Film other = (Film) object;
        if ((this.filmId == null && other.filmId != null) || (this.filmId != null && !this.filmId.equals(other.filmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.dvdrental.entities.Film[ filmId=" + filmId + " ]";
    }

}
