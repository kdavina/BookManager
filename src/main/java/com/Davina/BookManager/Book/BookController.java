package com.Davina.BookManager.Book;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="books")
public class BookController {

	/* Why did this work even when the constructor was not defined? Was it because it was using the default
	empty constructor inherited from object?

	Based on juniorro tutorial example controller: https://github.com/getarrays/employeemanager/blob/master/src/main/java/tech/getarrays/employeemanager/resource/EmployeeResource.java
	 */

	private final BookService bookService;

	@Autowired
	public BookController(BookService bookService){
		this.bookService = bookService;
	}

	@GetMapping
	public List<Book> getAllBooks(){
		return bookService.findAllBooks();
	}

	@GetMapping("/{id}")
	public Optional<Book> getBookById(@PathVariable("id") String id){
		return bookService.findBookById(id);
	}

	@GetMapping("/{name}")
	public List<Book> getBooksByName(@PathVariable("name") String name){
		return bookService.findBooksByName(name);
	}

}
