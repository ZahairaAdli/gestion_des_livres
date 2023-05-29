package com.gestionlivres.gestion_des_livres.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Book {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBook;

    private String nameBook;

    private Double prixBook;

    private Date dateBook;


    public Book()
    {
        super();
    }

    public Book(String nameBook, Double prixBook, Date dateBook) {
        this.nameBook = nameBook;
        this.prixBook = prixBook;
        this.dateBook = dateBook;
    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Double getPrixBook() {
        return prixBook;
    }

    public void setPrixBook(Double prixBook) {
        this.prixBook = prixBook;
    }

    public Date getDateBook() {
        return dateBook;
    }

    public void setDateBook(Date dateBook) {
        this.dateBook = dateBook;
    }


}