/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.dvdrentalserver.repositories;

/**
 *
 * @author user01
 */
import com.example.dvdrentalserver.entities.Page;
//import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PageRepository extends JpaRepository<Page, Long> {

//    List<Page> findByBook(Book book);

//    @Query("SELECT r.id FROM RuleVo r where r.name = :name") 
//    List<Long> findIdByName(@Param("name") String name);
//       public RuleVo findOneByName(String name);
//    public RuleVo findOneByNameOrId(String name, Long id);
//    public List<RuleVo> findAllByName(String name);
}
