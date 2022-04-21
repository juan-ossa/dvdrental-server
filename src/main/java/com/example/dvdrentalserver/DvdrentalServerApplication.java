package com.example.dvdrentalserver;

import com.example.dvdrentalserver.entities.Book;
import com.example.dvdrentalserver.entities.City;
import com.example.dvdrentalserver.entities.Country;
import com.example.dvdrentalserver.entities.Page;
import com.example.dvdrentalserver.repositories.CityRepository;
import com.example.dvdrentalserver.repositories.CountryRepository;
import com.example.dvdrentalserver.services.BookService;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EntityScan(basePackages = "com.example.dvdrentalserver.entities")
public class DvdrentalServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DvdrentalServerApplication.class, args);
    }

    @Bean
    public CommandLineRunner mappingDemo(BookService bookService, CountryRepository countryRepository,
            CityRepository cityRepository) {
        return args -> {

            // consulta libros
            List<Book> books;

//            books = bookService.books();
            for (Book book : bookService.allBooks()) {
                System.out.println("libros :" + book);
                List<Page> pages = book.getPages();
                System.out.println("Count pages:" + pages.size());
                for (Page page : pages) {
//                System.out.println("contenido :" +page.getId()+":" +page.getContent());
                    System.out.println("Pagina :" + page);

                }
                System.out.println("--------");

            }

            List<Country> coutries;

            coutries = countryRepository.findAll();

            for (Country country : coutries) {
                System.out.println("Pais :" + country);

                List<City> cities = cityRepository.findByCountryId(country);
                for (City ciudad : cities) {
                    System.out.println("Ciudad :" + ciudad);

                }
                System.out.println("--------");

            }

        };
    }

    // Consulta desde Repositorios
//    @Bean
//    public CommandLineRunner mappingDemo(BookRepository bookRepository,
//            PageRepository pageRepository, ActorRepository actorRepository) {
//        return args -> {
//
//            // consulta libros
//            List<Book> books;// = new Book("Java 101", "John Doe", "123456");
//
//            books = bookRepository.findAll();
//
//            for (Book book : books) {
//                System.out.println("libros :" + book);
//                List<Page> pages = book.getPages();
////                pages = pageRepository.findByBook(book);
////                System.out.println("Count pages:" + pages.size());
//                for (Page page : pages) {
////                System.out.println("contenido :" +page.getId()+":" +page.getContent());
//                    System.out.println("Pagina :" + page);
//
//                }
//                System.out.println("--------");
//
//            }
//
////            List<Actor> actors;// = new Book("Java 101", "John Doe", "123456");
////
////            actors = actorRepository.findAll();
////            for (Actor actor : actors) {
////                   System.out.println("Actores :" + actor);
////            }
//        };
//    }
//    @Bean
//    public CommandLineRunner mappingDemo(BookRepository bookRepository,
//            PageRepository pageRepository) {
//        return args -> {
//
//            //Enfoque Propietario Parent begin
//            Book book = new Book("Java 102", "John Doe", "1");
//
//            // create  new pages
//            Page p1 = new Page(1, "Introduction contents", "Introduction");
//            Page p2 = new Page(65, "Java 1.8 contents", "Java 8");
//            Page p3 = new Page(95, "Concurrency contents", "Concurrency");
//
//            List<Page> pages = new ArrayList<>();
//            pages.add(p1);
//            pages.add(p2);
//            pages.add(p3);
//
//            book.setPages(pages);
//            // save the book
//            bookRepository.save(book);
//            //Enfoque Propietario Parent end
//
//            
//            //Enfoque Propietario Child begin            
////            // create a new book
////            Book book2 = new Book("Java 102", "John Doe2", "2");
////
////            // save the book
////            bookRepository.save(book2);
////
////            // create and save new pages
//////            pageRepository.save(new Page(1, "Introduction contents2", "Introduction", book2));
//////            pageRepository.save(new Page(65, "Java 17 contents", "Java 8", book2));
//////            pageRepository.save(new Page(95, "Concurrency contents 2", "Concurrency", book2));
//            //Enfoque Propietario Child end 
//        };
//    }
}
