package com.example.ReactiveLibrary.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import com.example.ReactiveLibrary.model.Book;

public interface BookRepository extends ReactiveCrudRepository<Book, Long> {
}
