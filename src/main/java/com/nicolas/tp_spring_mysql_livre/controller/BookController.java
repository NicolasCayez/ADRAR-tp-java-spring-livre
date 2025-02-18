package com.nicolas.tp_spring_mysql_livre.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nicolas.tp_spring_mysql_livre.model.Book;
import com.nicolas.tp_spring_mysql_livre.service.BookService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class BookController {

  @Autowired
  private BookService bookService;

  @GetMapping("/books")
  public List<Book> getBooks() {
    return bookService.getAllBooks();
  }

  @GetMapping("/book")
  public Optional<Book> getBook(@RequestParam Long id) {
    return bookService.getBookById(id);
  }

  @PostMapping("addbook")
  public void addBook(@RequestBody Book book){
    bookService.addBook(book);
  }
  
  @PatchMapping("updatebook")
  public void updateBook(@RequestBody Book book){
    bookService.addBook(book);
  }

  @PutMapping("replacebook/{id}")
  // public void replaceBook(@PathVariable String id, @RequestBody Book book) {
  //   book.setId(Long.valueOf(id));
  //   bookService.replaceBook(book);
  }

  @DeleteMapping("removebook")
  public void removeBook(@RequestParam Long id){
    bookService.removeBook(id);
  }
}
