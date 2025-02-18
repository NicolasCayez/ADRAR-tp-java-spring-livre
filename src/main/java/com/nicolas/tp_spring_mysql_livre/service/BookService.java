package com.nicolas.tp_spring_mysql_livre.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicolas.tp_spring_mysql_livre.model.Book;
import com.nicolas.tp_spring_mysql_livre.repository.BookRepository;

import lombok.Data;

@Data
@Service
public class BookService {
  /* *********************************
  * ATTRIBUTS
  ********************************* */
  @Autowired
  private BookRepository repository;

  /* *********************************
  * METHODES
  ********************************* */
  // SELECT ALL
  public List<Book> getAllBooks(){
    return (List<Book>) repository.findAll();
  };
  // SELECT BY ID
  public Optional<Book> getBookById(Long Id){
    return repository.findById(Id);
  }
  // INSERT
  public void addBook(Book book){
    repository.save(book);
  }
  // UPDATE PATCH
  public void updateBook(Book book){
    repository.save(book);
  }
    // UPDATE PUT
    public void replaceBook(Book book){
      repository.save(book);
    }

  // DELETE
  public void removeBook(Long id){
    repository.deleteById(id);
  }
}
