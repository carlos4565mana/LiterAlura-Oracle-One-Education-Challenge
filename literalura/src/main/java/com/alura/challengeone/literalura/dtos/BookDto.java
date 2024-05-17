package com.alura.challengeone.literalura.dtos;

import java.util.List;
import java.util.Map;

public record BookDto(
        int id,
        String title,
        List<AuthorDto> authors,
        List<String> subjects,
        List<String> languages,
        boolean copyright,
        String mediaType,
        Map<String, String> formats,
        Integer downloadCount

) {
}
