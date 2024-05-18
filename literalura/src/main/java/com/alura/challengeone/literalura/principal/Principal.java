package com.alura.challengeone.literalura.principal;

import com.alura.challengeone.literalura.converter.BookConverter;
import com.alura.challengeone.literalura.dtos.BookDto;
import com.alura.challengeone.literalura.entities.Book;
import com.alura.challengeone.literalura.services.BookApi;
import com.alura.challengeone.literalura.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    private Scanner sc = new Scanner(System.in);
    @Autowired
    private BookService bookService;

    public void exibeMenu(){
        var opcao = -1;
        while(opcao != 0){
            var menu = """
                
                1- Buscar Livro Pelo Titulo
                2- Listar Livros Cadastrados
                3- Listar Autores Cadastrados
                4- Lista Autor Vivo em um determinado Ano
                5_ Listar Livro Por Idioma
                0- Sair
                """;

            System.out.println(menu);
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    searchBookByTitle();
                    break;

                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void searchBookByTitle() throws IOException, InterruptedException {

        BookDto book = BookApi.get("William Shakespeare");
        Book bookEntity = BookConverter.convertFromDto(book, bookService);
        //System.out.println(bookService.save(bookEntity));


    }

    private void getAllRegisteredBooks(){
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

    }
}













