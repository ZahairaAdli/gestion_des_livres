package com.gestionlivres.gestion_des_livres.services;

import com.gestionlivres.gestion_des_livres.models.Author;
import com.gestionlivres.gestion_des_livres.models.Book;

import java.util.List;

public interface AuthorService {
    Author saveAuthor(Author author);
    Author updateAuthor(Author author);
    Author getAuthor(Long id);
    List<Author> getAllAuthors();
    void deleteAuthorById(Long id);
    void deleteAllAuthors();
}
