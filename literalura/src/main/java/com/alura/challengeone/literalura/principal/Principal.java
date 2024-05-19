package com.alura.challengeone.literalura.principal;

import com.alura.challengeone.literalura.converter.BookConverter;
import com.alura.challengeone.literalura.dtos.BookDto;
import com.alura.challengeone.literalura.entities.Book;
import com.alura.challengeone.literalura.services.AuthorService;
import com.alura.challengeone.literalura.services.BookApi;
import com.alura.challengeone.literalura.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    private Scanner sc = new Scanner(System.in);

    private BookService bookService;

    private AuthorService authorService;

    public Principal(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    public void exibeMenu() throws IOException, InterruptedException {
        var opcao = -1;

        while(opcao != 0){
            var menu = """
                
                1- Buscar Livro Pelo Titulo
                2- Listar Livros Cadastrados
                3- Listar Autores Cadastrados
                4- Lista Autor Vivo em um determinado Ano
                5_ Listar Livro Por Idioma
                6_ Listar Os Cincos Melhors Livros Por Downloads
                0- Sair
                """;
            System.out.println(menu);

            try{
                System.out.println("Escolha uma opção de (0 - 6)");
                opcao = sc.nextInt();
                sc.nextLine();
            }catch (InputMismatchException err){
                System.err.println("Não é permitido inserir letras, informe apenas números inteiros !");
                sc.nextLine();
            }

            switch (opcao){
                case 1:
                    searchBookByTitle();
                    break;

                case 2:
                    getAllRegisteredBooks();
                    break;
                case 3:
                    listAuthorsItem();
                    break;
                case 4:
                    getAllAuthorsAliveDuring();
                    break;
                case 5:
                    listBookByLanguage();
                    break;
                case 6:
                    getTopFiveBooks();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void searchBookByTitle()  {

        System.out.print("Digite: ");
        String input = sc.nextLine();
        try{
            BookDto book = BookApi.get(input);
            Book bookEntity = BookConverter.convertFromDto(book, authorService);
            System.out.println(bookService.save(bookEntity));

        }catch (IOException | InterruptedException | IndexOutOfBoundsException e){
            System.out.println("Ocorreu um error: " + e.getMessage());
        }

    }

    private void getAllRegisteredBooks(){
        System.out.println("\n**************************");
        bookService.getAll()
                .forEach(bookFor ->{
                    System.out.println("Title: " + bookFor.getTitle());
                    System.out.print("Author: ");
                    bookFor.getAuthors().forEach(author -> System.out.print(author.getName()));
                    System.out.println();
                    System.out.println("Languagens: "+bookFor.getLanguages());
                    System.out.println("Download Count: "+bookFor.getDownloadCount());
                    System.out.println("---------------------------------");
                });
        System.out.println("\n**************************");

    }
    private void getAllAuthorsAliveDuring(){
       try{ System.out.print("Digite um ano: ");
        Integer year = sc.nextInt();
           System.out.println("\n**************************");
           authorService.getAllAuthorsAliveDuring(year)
                   .forEach(author -> {
                       System.out.println("Name: " + author.getName());
                       System.out.println("Birth Year: " + author.getBirthYear());
                       System.out.println("Death Year: " + author.getDeathYear());
                       System.out.println("---------------------------------");
                   });
           System.out.println("\n**************************");
       }catch (InputMismatchException err){
           System.err.println("Não é permitido inserir letras, informe apenas números inteiros !");
           sc.nextLine();
       }
    }

    private void listAuthorsItem(){
        System.out.println("\n**************************");
        authorService.getAll()
                        .forEach(author -> {
                            System.out.println("Name: " + author.getName());
                            System.out.println("Birth Year: " + author.getBirthYear());
                            System.out.println("Death Year: " + author.getDeathYear());
                            System.out.println("---------------------------------");
                        });
        System.out.println("\n**************************");

    }

    private void listBookByLanguage(){
        var idiomas = """
                pt- portugues
                en- inglês
                es- espanhol
                fr- frances
                """;
        System.out.println(idiomas);
        System.out.print("Digite um idioma: ");
        String input = sc.nextLine();
        System.out.println("\n**************************");
        bookService.getAll()
                .stream()
                .filter(book -> book.getLanguages().contains(input))
                .forEach(book -> {
                    System.out.println("Title: " + book.getTitle());
                    System.out.print("Authors: ");
                    book.getAuthors().forEach(author -> System.out.print(author.getName()));
                    System.out.println();
                    System.out.println("Languages: " + book.getLanguages());
                    System.out.println("Download Count: " + book.getDownloadCount());
                    System.out.println("---------------------------------");

                });
        System.out.println("\n**************************");

    }
    private void getTopFiveBooks(){

        bookService.getTopFive()
                .stream()
                .forEach(book -> {
                    System.out.println("Title: " + book.getTitle());
                    System.out.print("Authors: ");
                    book.getAuthors().forEach(author -> System.out.print(author.getName()));
                    System.out.println();
                    System.out.println("Languages: " + book.getLanguages());
                    System.out.println("Download Count: " + book.getDownloadCount());
                    System.out.println("---------------------------------");

                });
        System.out.println("\n**************************");

    }
}













