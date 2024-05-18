package com.alura.challengeone.literalura.repositories;

import com.alura.challengeone.literalura.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository  extends JpaRepository<Author, Long> {
    Optional<Author> findByName(String name);
}
