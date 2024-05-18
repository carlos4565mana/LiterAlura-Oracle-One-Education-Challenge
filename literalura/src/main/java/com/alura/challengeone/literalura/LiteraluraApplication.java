package com.alura.challengeone.literalura;

import com.alura.challengeone.literalura.principal.Principal;
import com.alura.challengeone.literalura.services.AuthorService;
import com.alura.challengeone.literalura.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {
	@Autowired
	private BookService bookService;
	@Autowired
	private AuthorService authorService;
	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(bookService, authorService);
		principal.exibeMenu();

	}

}












