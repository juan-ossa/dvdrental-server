/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.dvdrentalserver.repositories;

import com.example.dvdrentalserver.entities.Account;
import com.example.dvdrentalserver.entities.AccountId;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author user01
 */
public interface AccountRepository extends JpaRepository<Account, AccountId> {

    List<Account> findByAccountType(String accountType);
}
