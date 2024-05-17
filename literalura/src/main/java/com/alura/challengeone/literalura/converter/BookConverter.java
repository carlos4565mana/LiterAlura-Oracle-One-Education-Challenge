package com.alura.challengeone.literalura.converter;

import com.alura.challengeone.literalura.dtos.BookDto;
import com.alura.challengeone.literalura.entities.Author;
import com.alura.challengeone.literalura.entities.Book;
import com.alura.challengeone.literalura.services.AuthorService;

import java.util.HashSet;
import java.util.Set;

public class BookConverter {
    public static Book convertFromDto(BookDto bookDto, AuthorService service){
        Set<Author>  authors = service.saveAll(new HashSet<>(bookDto.authors()));
        return new Book(bookDto.title(),authors, new HashSet<>(bookDto.languages()),bookDto.downloadCount());

    }
}









