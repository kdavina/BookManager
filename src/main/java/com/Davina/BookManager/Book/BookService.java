package com.Davina.BookManager.Book;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	public List<Book> getBooks(){
		return Arrays.asList(new Book("Penguins can fly", "Robert", "Wilde"),
				new Book("Pigs are quite dashing", "Steve", "Funkerfield"));
	}
}
