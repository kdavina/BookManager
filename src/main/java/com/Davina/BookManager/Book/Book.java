package com.Davina.BookManager.Book;

import org.springframework.data.mongodb.core.mapping.Document;
import com.sun.istack.internal.NotNull;

@Document
public class Book {

	@NotNull
	private long isbn;

	@NotNull
	private String name;

	private String genre;

	@NotNull
	private String authorFirstName;

	@NotNull
	private String authorLastName;

	public Book(String name, String authorFirstName, String authorLastName){
		this.name = name;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
	}

	public Book(String name, String authorFirstName, String authorLastName, String genre){
		this(name, authorFirstName, authorLastName);
		this.genre = genre;
	}

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
