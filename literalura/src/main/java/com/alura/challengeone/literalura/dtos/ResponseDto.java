package com.alura.challengeone.literalura.dtos;

import java.util.List;

public record ResponseDto(
        int count,
        String next,
        String previous,
        List<BookDto> results

) {

}
