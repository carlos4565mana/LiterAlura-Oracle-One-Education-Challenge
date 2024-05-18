package com.alura.challengeone.literalura.services;

import com.alura.challengeone.literalura.dtos.BookDto;
import com.alura.challengeone.literalura.dtos.ResponseDto;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class BookApi {

    static final private String BASE_URL = "https://gutendex.com/books";

    public static BookDto get(String bookName) throws IOException, InterruptedException {

        String encodedBook = URLEncoder.encode(bookName, StandardCharsets.UTF_8.toString());
        String fullURL = BASE_URL + "/?search=" + encodedBook;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(fullURL))
                .build();
        HttpResponse<String> response;
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response);

        Gson gson = new Gson();
        ResponseDto dto = gson.fromJson(response.body(), ResponseDto.class);
        return dto.results().get(0);


    }
}










