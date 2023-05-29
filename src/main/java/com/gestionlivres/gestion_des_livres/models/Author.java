package com.gestionlivres.gestion_des_livres.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Author {
  @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuthor;
    private String nameAuthor;
    private Date dateAuthor;

    public Author(){
        super();
    }
    public Author(String nameAuthor, Date dateAuthor) {
        this.nameAuthor = nameAuthor;
        this.dateAuthor = dateAuthor;
    }

    public Long getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Long idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public Date getDateAuthor() {
        return dateAuthor;
    }

    public void setDateAuthor(Date dateAuthor) {
        this.dateAuthor = dateAuthor;
    }
}
