package com.Davina.BookManager.Book;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	private final BookRepository bookRepository;

	@Autowired
	BookService(BookRepository bookRepository){
		this.bookRepository = bookRepository;
	}

	public List<Book> findAllBooks() {
		return bookRepository.findAll();
	}

	public Optional<Book> findBookById(String id) {
		return bookRepository.findById(id);
	}

	public List<Book> findBooksByName(String name) {
		return bookRepository.findAllByName(name);
	}

	public void addBooks(List<Book> books) {
		bookRepository.saveAll(books);
	}

	public void addBook(Book book){
		bookRepository.save(book);
	}

	public void updateBook(Book book) {
		bookRepository.save(book);
	}

	public void deleteBook(String id) {
		bookRepository.deleteById(id);
	}

	public void deleteAllBooks() {
		bookRepository.deleteAll();
	}
}
