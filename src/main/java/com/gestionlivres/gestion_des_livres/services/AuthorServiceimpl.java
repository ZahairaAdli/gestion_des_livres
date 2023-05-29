package com.gestionlivres.gestion_des_livres.services;

import com.gestionlivres.gestion_des_livres.models.Author;
import com.gestionlivres.gestion_des_livres.models.Member;
import com.gestionlivres.gestion_des_livres.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceimpl implements AuthorService{
    @Autowired
    AuthorRepository authorRepository;
    @Override
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author updateAuthor(Author author) {
        return authorRepository.save(author) ;
    }

    @Override
    public Author getAuthor(Long id) {
        return authorRepository.findById(id).get();
    }
    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public void deleteAuthorById(Long id) {
        authorRepository.deleteById(id);
    }

    @Override
    public void deleteAllAuthors() {
        authorRepository.deleteAll();

    }
}
