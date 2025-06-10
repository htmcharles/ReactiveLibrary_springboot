package com.example.ReactiveLibrary.services;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.example.ReactiveLibrary.model.Book;
import com.example.ReactiveLibrary.repository.BookRepository;
@Service
public class BookService {
    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public Flux<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    public Mono<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }
    public Mono<Book> createBook(Book book) {
        return bookRepository.save(book);
    }
    public Mono<Void> deleteBook(Long id) {
        return bookRepository.deleteById(id);
    }
}
