package com.gestionlivres.gestion_des_livres.services;

import com.gestionlivres.gestion_des_livres.models.Book;

import java.util.List;

public interface BookService {

    Book saveBook(Book book);
    Book updateBook(Book book);
    Book getBook(Long id);
    List<Book>getAllBooks();
    void deleteBookById(Long id);
    void deleteAllBooks();

}
