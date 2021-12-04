package com.Davina.BookManager.Book;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer>{

	List<Book> findAllByName(String name);
}
