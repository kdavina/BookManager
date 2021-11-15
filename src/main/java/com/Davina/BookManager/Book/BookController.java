package com.Davina.BookManager.Book;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/books")
public class BookController {

	/* Why did this work even when the constructor was not defined? Was it because it was using the default
	empty constructor inherited from object?
	 */

	private final BookService bookService;

	@Autowired
	public BookController(BookService bookService){
		this.bookService = bookService;
	}

	@GetMapping
	public List<Book> getBooks(){
		return bookService.getBooks();
	}
}
