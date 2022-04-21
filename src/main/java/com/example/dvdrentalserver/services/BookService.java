/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dvdrentalserver.services;

import com.example.dvdrentalserver.entities.Book;
import com.example.dvdrentalserver.entities.Page;
import com.example.dvdrentalserver.repositories.BookRepository;
import java.util.List;
import java.util.Optional;
//import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user01
 */
@Service
//@Transactional
//@Transactional(readOnly = true)
public class BookService {

    @Autowired
    private BookRepository bookRepository;

//    @Transactional
    public List<Book> books() {
        return bookRepository.findAll();
    }

    public List<Book> allBooks() {
        return bookRepository.findAllBooks();
    }

    public void save(Book book) {
        bookRepository.save(book);
    }
    
     public Optional<Book> getBook(Long id) {
        return bookRepository.findById(id);
    }
}
