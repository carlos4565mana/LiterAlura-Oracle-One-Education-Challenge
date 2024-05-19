package com.alura.challengeone.literalura.repositories;

import com.alura.challengeone.literalura.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByTitle(String title);
    List<Book> findTop5ByOrderByDownloadCountDesc();
    List<Book> findBookByLanguages(String lenguage);
}
