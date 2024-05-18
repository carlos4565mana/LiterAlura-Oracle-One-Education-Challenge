package com.alura.challengeone.literalura;

import com.alura.challengeone.literalura.converter.BookConverter;
import com.alura.challengeone.literalura.dtos.BookDto;
import com.alura.challengeone.literalura.entities.Book;
import com.alura.challengeone.literalura.services.AuthorService;
import com.alura.challengeone.literalura.services.BookApi;
import com.alura.challengeone.literalura.services.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {


	public LiteraluraApplication(AuthorService service, BookService bookService) {
		this.service = service;
		this.bookService = bookService;
	}

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}
	private AuthorService service;
	private BookService bookService;
	@Override
	public void run(String... args) throws Exception {
		BookDto book = BookApi.get("William Shakespeare");
		Book bookEntity = BookConverter.convertFromDto(book, service);
		//System.out.println(bookService.save(bookEntity));
		System.out.println("\n**************************");
		bookService.getAll()
				.forEach(bookFor ->{
					System.out.println("Title: " + bookFor.getTitle());
					System.out.print("Author: ");
					bookFor.getAuthos().forEach(author -> System.out.print(author.getName()));
					System.out.println();
					System.out.println("Languagens: "+bookFor.getLanguages());
					System.out.println("Download Count: "+bookFor.getDownloadCount());
					System.out.println("---------------------------------");
				});
		System.out.println("\n**************************");


		System.out.println("\n**************************");

		service.getAllAuthorsAliveDuring(1851)
				.forEach(author -> {
					System.out.println("Name: "+author.getName());
					System.out.println("Birth Year: " + author.getBirthYear());
					System.out.println("Death Year: " + author.getDeathYear());
					System.out.println("---------------------------------");
				});

		System.out.println("\n**************************");

	}
}












