package com.nicolas.tp_spring_mysql_livre.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nicolas.tp_spring_mysql_livre.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

}
