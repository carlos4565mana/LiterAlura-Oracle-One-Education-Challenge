package com.alura.challengeone.literalura.dtos;

import com.google.gson.annotations.SerializedName;

public record AuthorDto(
        String name,
        @SerializedName("birth_year") Integer birthYear,
        @SerializedName("death_year")Integer deathYear
) {
}
