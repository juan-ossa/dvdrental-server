/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dvdrentalserver.entities;

import java.io.Serializable;
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
//import javax.persistence.ManyToOne;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
import javax.persistence.*;

/**
 *
 * @author user01
 */
@Entity
@Table(name = "customer")
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
    @NamedQuery(name = "Customer.findByCustomerId", query = "SELECT c FROM Customer c WHERE c.customerId = :customerId"),
    @NamedQuery(name = "Customer.findByStoreId", query = "SELECT c FROM Customer c WHERE c.storeId = :storeId"),
    @NamedQuery(name = "Customer.findByFirstName", query = "SELECT c FROM Customer c WHERE c.firstName = :firstName"),
    @NamedQuery(name = "Customer.findByLastName", query = "SELECT c FROM Customer c WHERE c.lastName = :lastName"),
    @NamedQuery(name = "Customer.findByEmail", query = "SELECT c FROM Customer c WHERE c.email = :email"),
    @NamedQuery(name = "Customer.findByActivebool", query = "SELECT c FROM Customer c WHERE c.activebool = :activebool"),
    @NamedQuery(name = "Customer.findByCreateDate", query = "SELECT c FROM Customer c WHERE c.createDate = :createDate"),
    @NamedQuery(name = "Customer.findByLastUpdate", query = "SELECT c FROM Customer c WHERE c.lastUpdate = :lastUpdate"),
    @NamedQuery(name = "Customer.findByActive", query = "SELECT c FROM Customer c WHERE c.active = :active")})
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "customer_id")
    private Integer customerId;
    @Basic(optional = false)
    @Column(name = "store_id")
    private short storeId;
    @Basic(optional = false)
    @Column(name = "first_name")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "activebool")
    private boolean activebool;
    @Basic(optional = false)
    @Column(name = "create_date")
    @Temporal(TemporalType.DATE)
    private Date createDate;
    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
    @Column(name = "active")
    private Integer active;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerId")
    private List<Rental> rentalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerId")
    private List<Payment> paymentList;
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    @ManyToOne(optional = false)
    private Address addressId;

    public Customer() {
    }

    public Customer(Integer customerId) {
        this.customerId = customerId;
    }

    public Customer(Integer customerId, short storeId, String firstName, String lastName, boolean activebool, Date createDate) {
        this.customerId = customerId;
        this.storeId = storeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.activebool = activebool;
        this.createDate = createDate;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public short getStoreId() {
        return storeId;
    }

    public void setStoreId(short storeId) {
        this.storeId = storeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getActivebool() {
        return activebool;
    }

    public void setActivebool(boolean activebool) {
        this.activebool = activebool;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public List<Rental> getRentalList() {
        return rentalList;
    }

    public void setRentalList(List<Rental> rentalList) {
        this.rentalList = rentalList;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public Address getAddressId() {
        return addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerId != null ? customerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.dvdrental.entities.Customer[ customerId=" + customerId + " ]";
    }
    
}
