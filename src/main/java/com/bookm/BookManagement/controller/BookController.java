package com.bookm.BookManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookm.BookManagement.model.Book;
import com.bookm.BookManagement.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
	@Autowired
	BookService bookService;
	
  @PostMapping("/books")
    public ResponseEntity<Book>saveBook(@RequestBody Book book){
	Book savedBook = bookService.saveBook(book);
	return ResponseEntity.status(HttpStatus.CREATED).body(savedBook);
  
  }
  @GetMapping("/books")
  public ResponseEntity<List<Book>> getAllBooks(){
	  List<Book> books = bookService.findAll();
	  return ResponseEntity.ok(books);
	  
  }
  @GetMapping("/books/{book_id}")
  public ResponseEntity<Book> getBookByid(@PathVariable Integer book_id){
	  Book book = bookService.getById(book_id);
	  if(book == null) {
		  return ResponseEntity.notFound().build();
	  }
	 return ResponseEntity.ok(book);
  }
  @PutMapping("/books/{book_id}")
  public ResponseEntity< Book> updateBook(@PathVariable Integer book_id,@RequestBody Book book){
	 if(!bookService.existById(book_id)) {
		 return ResponseEntity.notFound().build();
	 }
	 book.setBook_id(book_id);
	 bookService.saveBook(book);
	 return ResponseEntity.ok(book);
  }
  @DeleteMapping("/books/{book_id}")
  public ResponseEntity<Void> deleteBookById(@PathVariable Integer book_id){
	  bookService.deleteBookById(book_id);
	  return ResponseEntity.noContent().build();
  }
}
 