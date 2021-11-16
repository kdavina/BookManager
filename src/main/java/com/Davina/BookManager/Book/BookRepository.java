package com.Davina.BookManager.Book;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {

	List<Book> findAllByName(String name);
}
