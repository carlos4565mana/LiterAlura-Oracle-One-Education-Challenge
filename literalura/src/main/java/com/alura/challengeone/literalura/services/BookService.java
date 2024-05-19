package com.alura.challengeone.literalura.services;

import com.alura.challengeone.literalura.entities.Book;
import com.alura.challengeone.literalura.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public Book save(Book book){
        if(!this.get(book.getTitle()).isEmpty()) return this.get(book.getTitle()).get();
        return repository.save(book);
    }

    public Optional<Book> get(String title){
        return repository.findByTitle(title);
    }

    public List<Book> getAll(){
        return repository.findAll();
    }

    public List<Book> getTopFive(){
        return repository.findTop5ByOrderByDownloadCountDesc();
    }



}













