/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dvdrentalserver.services;

import com.example.dvdrentalserver.entities.Book;
import com.example.dvdrentalserver.entities.Page;
import com.example.dvdrentalserver.repositories.PageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 *
 * @author user01
 */
@Service
public class PageService {

    @Autowired
    private PageRepository pageRepository;

    public List<Page> pages() {
        return pageRepository.findAll();
    }

//    public List<Page> pagesxBook(Book book) {
//        return pageRepository.findByBook(book);
//    }

}
