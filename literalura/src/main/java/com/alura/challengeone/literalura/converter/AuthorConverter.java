package com.alura.challengeone.literalura.converter;

import com.alura.challengeone.literalura.dtos.AuthorDto;
import com.alura.challengeone.literalura.entities.Author;

public class AuthorConverter {

    public static  Author converterFromDto(AuthorDto authorDto){

        return new Author(
                authorDto.name(),
                authorDto.birthYear(),
                authorDto.deathYear()
        );

    }
}
