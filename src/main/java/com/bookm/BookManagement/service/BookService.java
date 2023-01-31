package com.bookm.BookManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookm.BookManagement.model.Book;
import com.bookm.BookManagement.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}
	public List<Book> findAll(){
		return bookRepository.findAll();
	}
	public Book getById(Integer book_id){
		return bookRepository.findById(book_id).orElse(null);
	}
	public boolean existById(Integer book_id) {
		return bookRepository.existsById(book_id);
	}
	public void deleteBookById(Integer book_id) {
		bookRepository.deleteById(book_id);
	}
	
}
