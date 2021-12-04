package com.Davina.BookManager.Book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.sun.istack.internal.NotNull;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private long isbn;

	@NotNull
	private String name;

	private String genre;

	@NotNull
	private String authorFirstName;

	@NotNull
	private String authorLastName;

	// empty constructor for deserialization: https://stackoverflow.com/questions/65291296/why-spring-boot-can-deserialize-class-without-default-constructor
	public Book(){}

	public Book(long isbn, String name, String authorFirstName, String authorLastName){
		this.isbn = isbn;
		this.name = name;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
	}


	public Book(long isbn, String name, String authorFirstName, String authorLastName, String genre){
		this(isbn, name, authorFirstName, authorLastName);
		this.genre = genre;
	}

	// stretch goal: use lombok to reduce the following section

	public Integer getId() { return id; }

	public void setId(Integer id) { this.id = id; }

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}
}
