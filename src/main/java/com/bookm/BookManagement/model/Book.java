package com.bookm.BookManagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Book")
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int book_id;
private String book_name;
private String book_genre;
private String book_author;
private String book_publishers;
public Book(int book_id, String book_name, String book_genre, String book_author, String book_publishers) {
	super();
	this.book_id = book_id;
	this.book_name = book_name;
	this.book_genre = book_genre;
	this.book_author = book_author;
	this.book_publishers = book_publishers;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public int getBook_id() {
	return book_id;
}
public void setBook_id(int book_id) {
	this.book_id = book_id;
}
public String getBook_name() {
	return book_name;
}
public void setBook_name(String book_name) {
	this.book_name = book_name;
}
public String getBook_genre() {
	return book_genre;
}
public void setBook_genre(String book_genre) {
	this.book_genre = book_genre;
}
public String getBook_author() {
	return book_author;
}
public void setBook_author(String book_author) {
	this.book_author = book_author;
}
public String getBook_publishers() {
	return book_publishers;
}
public void setBook_publishers(String book_publishers) {
	this.book_publishers = book_publishers;
}
@Override
public String toString() {
	return "Book [book_id=" + book_id + ", book_name=" + book_name + ", book_genre=" + book_genre + ", book_author="
			+ book_author + ", book_publishers=" + book_publishers + "]";
}

}