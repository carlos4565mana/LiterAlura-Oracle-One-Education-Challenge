package com.alura.challengeone.literalura.services;

import com.alura.challengeone.literalura.converter.AuthorConverter;
import com.alura.challengeone.literalura.dtos.AuthorDto;
import com.alura.challengeone.literalura.entities.Author;
import com.alura.challengeone.literalura.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AuthorService {

    private AuthorRepository  repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public Set<Author> saveAll(HashSet<AuthorDto> authorDtos) {
        Set<Author> authors = authorDtos
                .stream()
                .map(authorDto -> this.save(AuthorConverter.converterFromDto(authorDto)))
                .collect(Collectors.toSet());
        return authors;

    }

    public Author save(Author author) {
       if(!this.get(author.getName()).isEmpty()) return this.get(author.getName()).get();
       return repository.save((author));
    }

    public  Optional<Author> get(String name) {
       return repository.findByName(name);

    }

    public List<Author> getAll(){
        return repository.findAll();
    }

    public List<Author> getAllAuthorsAliveDuring(Integer year){
        return repository.findAuthorsAliveDuring(year);
    }
}











