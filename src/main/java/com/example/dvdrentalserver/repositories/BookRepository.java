/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.dvdrentalserver.repositories;

import com.example.dvdrentalserver.entities.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author user01
 */
public interface BookRepository extends JpaRepository<Book, Long> {

    Book findByIsbn(String isbn);
    
    @Query("Select DISTINCT b from Book b LEFT JOIN  fetch b.pages")
    List<Book> findAllBooks();
}
